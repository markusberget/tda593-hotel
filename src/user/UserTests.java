package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import javax.xml.soap.SOAPException;

import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Booking;
import Classes.IHotelManager;
import Classes.RoomTypeName;
import Classes.impl.ClassesFactoryImpl;
import Classes.impl.IBookingManagementImplImpl;


/**
 * This class simulates a user and contains
 * both valid and invalid uses of the system (based
 * on our use cases, among other things).
 *
 */
public class UserTests {

	/**
	 * Used to set up the system for use throughout all test cases.
	 */
	 @BeforeClass
	 public static void oneTimeSetUp() {
	 // one-time initialization code
	 }
	 
	 /**
	  * Test method for checkin		TODO:// This method does not really test the checkIn method
	  */
	 @Test
	 public void test_checkIn(){
		IBookingManagementImplImpl bookingManagement = IBookingManagementImplImpl.instantiateForTest();
		
		assertTrue(bookingManagement.getIHotelManagerImpl().login(Util.adminUsername, Util.adminPassword));
		//Create booking to check in for
		Calendar cal = Calendar.getInstance();	
		cal.set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH, 12, 00);
		Date checkIn = cal.getTime();
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 1);
		Date checkOut = cal.getTime();
		int guestCount = 1;
		int bookingID = bookingManagement.createPendingBooking(checkIn, checkOut, guestCount);
		int room = bookingManagement.getRoom().get(0).getRoomNumber();
		bookingManagement.addRoomPending(room, bookingID);
		bookingManagement.addCustomerInformationToBooking(bookingID, "John", "Doe", "john@doe.se", "0123-2131312");
		assertEquals("Booking has been confirmed", bookingManagement.confirmBooking(bookingID));
		//End create booking
		
		
		//Check in
		System.out.println(bookingManagement.getIHotelManagerImpl().checkInBooking(bookingID, Util.adminUsername));

		
		//Making sure all rooms are occupied
		assertEquals("Occupied", bookingManagement.getRoomByID(room).getStatus().toString());

	 }

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#checkOut(java.lang.Class)}.
	 * 
	 * Test for the check out process when considering valid behavior, which includes
	 * retrieving the booking information, choosing which room(s) to check out, pay for them
	 * and change the status of the room(s) to CLEANING. This is the flow according to the
	 * check out use case and sequence diagram.
	 * 
	 * Firstly, a credit card account is set up and tested. This account is to be used when paying
	 * for the booking/room(s) during the check out process. Then a booking is created that contain
	 * room(s). Then a check in must be performed for the booking before a check out
	 * can be performed (check in is a precondition to check out). After checking in,
	 * payment of the bookings bill is done. Change of room(s) status is performed when payment of
	 * the bill is successful.
	 */
	@Test
	public void test_valid_checkOut() {

		// Set up of a credit card account for use when paying for the booking/room(s).
		se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin;
		String ccNumber = "01234567", ccv = "123", firstName = "Karl", lastName = "urban";
		int expiryMonth = 10, expiryYear = 17;
		try {
			bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
		bankingAdmin.removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
		assertTrue(bankingAdmin.addCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName));
		assertEquals(0.0, bankingAdmin.getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName), 0.0);
		assertEquals(2343.0, bankingAdmin.makeDeposit(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, 2343.0), 2343.0);
		
		// Set up a pending booking
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		IHotelManager hotelManagement = bookingManagement.getIHotelManagerImpl();
		assertTrue(hotelManagement.login(Util.adminUsername, Util.adminPassword));
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH-1, 12, 00);
		calCheckOut.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH+1, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests3 = 3;
		int bookingID = bookingManagement.createPendingBooking(checkIn, checkOut, nrOfGuests3);
		String email = "karl.urban@gmail.com", ph = "0843322";
		bookingManagement.addCustomerInformationToBooking(bookingID, firstName, lastName, email, ph);
		
		// Add three rooms to the pending booking
		Booking pendingBooking = bookingManagement.getPendingBookings().get(0);
		pendingBooking.getRooms().add(bookingManagement.getRoom().get(0));
		pendingBooking.getRooms().add(bookingManagement.getRoom().get(1));
		pendingBooking.getRooms().add(bookingManagement.getRoom().get(4));
		
		// Confirm the pending booking
		assertEquals("Booking has been confirmed", bookingManagement.confirmBooking(bookingID));
		bookingManagement.getIHotelManagerImpl().checkInBooking(bookingID, Util.adminUsername);
		
		// Calculate the sum of the bill
		double checkOutSum = bookingManagement.getIFinanceImpl().calculatePayment(bookingID);
		assertEquals(450.0, checkOutSum, 450.0);

		// 3) Perform the payment part (see the payment use case/sequence diagram for flow)
		assertEquals("Payment was successful", bookingManagement.getIFinanceImpl().payBill(bookingID, ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, 450.0));
		assertEquals(1893.0, bankingAdmin.getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName), 1893.0);
		
		// Check out
		assertEquals("Check-out was successful", hotelManagement.checkOut(bookingID, Util.adminUsername));
		
		// Remove the credit card account from the banking component
		assertTrue(bankingAdmin.removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName));
		} catch (SOAPException e) {
			System.err
			.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
	}
	
	/**
	 * Test a valid booking case
	 */
	@Test
	public void test_valid_booking(){
		IBookingManagementImplImpl bookingManagement = IBookingManagementImplImpl.instantiateForTest();
		
		Calendar cal = Calendar.getInstance();
	
		Date checkIn = cal.getTime();
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 1);
		Date checkOut = cal.getTime();
	
		int guestCount = 1;

		int bookingID = bookingManagement.createPendingBooking(checkIn, checkOut, guestCount);
		//Should search here but needs to be implemented so for now just return the first room		
		int room = bookingManagement.getRoom().get(0).getRoomNumber();
		
		bookingManagement.addRoomPending(room, bookingID);
		
		bookingManagement.addCustomerInformationToBooking(bookingID, "John", "Doe", "john@doe.se", "0123-2131312");
		
		assertEquals("Booking has been confirmed", bookingManagement.confirmBooking(bookingID));
	}
	
	/**
	 * Test of invalid booking case
	 */
	
	@Test
	public void test_invalid_booking(){
		IBookingManagementImplImpl bookingManagement = IBookingManagementImplImpl.instantiateForTest();
		
		Calendar cal = Calendar.getInstance();
	
		Date checkIn = cal.getTime();
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 2);
		Date checkOut = cal.getTime();
	
		int guestCount = 1;

		int bookingID = bookingManagement.createPendingBooking(checkIn, checkOut, guestCount);
		
		assertEquals(-1, bookingID);
	}
	
	/**
	 * Tests if four users can book at the same time without experiencing race
	 * conditions etc. (Depends on how many processors and cores are used on the
	 * testing system, but it is common that processors have at least two cores
	 * these days so at least two threads will run concurrently at any instance
	 * of time). The single bookingManagement object represents the system, and
	 * each user interacts with the same object (system).
	 */
	@Test
	public void test_valid_FourUsersBookingConcurrently() {
		String testName;
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, 12, 00);
		calCheckOut.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH+2, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests1 = 1, nrOfGuests2 = 2, nrOfGuests3 = 3, nrOfGuests6 = 6;
		Thread user1 = new Thread(new User(bookingManagement, "Karl", "Urban", "karl.urban@gmail.com", "047663", checkIn, checkOut, nrOfGuests6));
		Thread user2 = new Thread(new User(bookingManagement, "Didrik", "Didier", "didrik.didier@gmail.com", "34466", checkIn, checkOut, nrOfGuests2));
		Thread user3 = new Thread(new User(bookingManagement, "Henn", "Venn", "henn.venn@gmail.com", "123456", checkIn, checkOut, nrOfGuests3));
		Thread user4 = new Thread(new User(bookingManagement, "Lauder", "Dale", "lauder.dale@gmail.com", "056232", checkIn, checkOut, nrOfGuests1));
		
		// Perform booking
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		
		// Wait for threads to finish
		try {
			user1.join();
			user2.join();
			user3.join();
			user4.join();
		} catch (InterruptedException e) {
			System.err
			.println("Thread was interrupted while executing");
			e.printStackTrace();
		}
		
		// Let threads sleep for 500ms so that the size of arrays can be tested properly
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.err
			.println("Thread was interrupted while sleeping");
			e.printStackTrace();
		}
		
		// Check if the bookings ended up in the right location
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(4, bookingManagement.getConfirmedBookings().size());
		
		// Check that the bookingIDs are unique
		int testBookingID1 = bookingManagement.getConfirmedBookings().get(0).getBookingID();
		int testBookingID2 = bookingManagement.getConfirmedBookings().get(1).getBookingID();
		int testBookingID3 = bookingManagement.getConfirmedBookings().get(2).getBookingID();
		int testBookingID4 = bookingManagement.getConfirmedBookings().get(3).getBookingID();
		assertTrue((testBookingID1 != testBookingID2) && (testBookingID1 != testBookingID3));
		assertTrue((testBookingID3 != testBookingID4) && (testBookingID1 != testBookingID4));
		assertTrue((testBookingID2 != testBookingID3) && (testBookingID2 != testBookingID4));
		
		// Check that the data is correct after confirmed bookings
		for (int i = 0; i < bookingManagement.getConfirmedBookings().size(); i++) {
			testName = bookingManagement.getConfirmedBookings().get(i).getCustomer().getFirstName();
			switch (testName) {
				case "Karl":		assertEquals(6, bookingManagement.getConfirmedBookings().get(i).getNumberOfGuests());
												assertEquals("Urban", bookingManagement.getConfirmedBookings().get(i).getCustomer().getLastName());
												assertEquals("karl.urban@gmail.com", bookingManagement.getConfirmedBookings().get(i).getCustomer().getEmail());
												assertEquals("047663", bookingManagement.getConfirmedBookings().get(i).getCustomer().getPhoneNumber());
												assertEquals(RoomTypeName.DOUBLE_ROOM, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomType().getRoomTypeName());
												assertEquals(1, bookingManagement.getConfirmedBookings().get(i).getRooms().size());
												assertEquals(6, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomNumber());
												break;
				case "Didrik":	assertEquals(2, bookingManagement.getConfirmedBookings().get(i).getNumberOfGuests());
												assertEquals("Didier", bookingManagement.getConfirmedBookings().get(i).getCustomer().getLastName());
												assertEquals("didrik.didier@gmail.com", bookingManagement.getConfirmedBookings().get(i).getCustomer().getEmail());
												assertEquals("34466", bookingManagement.getConfirmedBookings().get(i).getCustomer().getPhoneNumber());
												assertEquals(RoomTypeName.SINGLE_ROOM, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomType().getRoomTypeName());
												assertEquals(1, bookingManagement.getConfirmedBookings().get(i).getRooms().size());
												assertEquals(2, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomNumber());
												break;
				case "Henn":		assertEquals(3, bookingManagement.getConfirmedBookings().get(i).getNumberOfGuests());
												assertEquals("Venn", bookingManagement.getConfirmedBookings().get(i).getCustomer().getLastName());
												assertEquals("henn.venn@gmail.com", bookingManagement.getConfirmedBookings().get(i).getCustomer().getEmail());
												assertEquals("123456", bookingManagement.getConfirmedBookings().get(i).getCustomer().getPhoneNumber());
												assertEquals(RoomTypeName.SINGLE_ROOM, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomType().getRoomTypeName());
												assertEquals(1, bookingManagement.getConfirmedBookings().get(i).getRooms().size());
												assertEquals(3, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomNumber());
												break;
				case "Lauder":	assertEquals(1, bookingManagement.getConfirmedBookings().get(i).getNumberOfGuests());
												assertEquals("Dale", bookingManagement.getConfirmedBookings().get(i).getCustomer().getLastName());
												assertEquals("lauder.dale@gmail.com", bookingManagement.getConfirmedBookings().get(i).getCustomer().getEmail());
												assertEquals("056232", bookingManagement.getConfirmedBookings().get(i).getCustomer().getPhoneNumber());
												assertEquals(RoomTypeName.SINGLE_ROOM, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomType().getRoomTypeName());
												assertEquals(1, bookingManagement.getConfirmedBookings().get(i).getRooms().size());
												assertEquals(1, bookingManagement.getConfirmedBookings().get(i).getRooms().get(0).getRoomNumber());
												break;
			}
		}
	}
	
	/**
	 * This inner class is used for simulating users that perform bookings
	 * concurrently.
	 *
	 */
	class User implements Runnable {
		
		Classes.impl.IBookingManagementImplImpl bookingManagement;		// Represents the system
		String firstName, lastName, email, ph;
		Date checkIn, checkOut;
		int bookingID, numberOfGuests;
		
		public User(Classes.impl.IBookingManagementImplImpl bookingManagement, String firstName, String lastName, String email, String ph, Date checkIn, Date checkOut, int numberOfGuests) {
			this.bookingManagement = bookingManagement;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.ph = ph;
			this.checkIn = checkIn;
			this.checkOut = checkOut;
			this.numberOfGuests = numberOfGuests;
		}

		@Override
		public void run() {
			// Perform the booking procedure (the currently implemented parts)
			bookingID = bookingManagement.createPendingBooking(checkIn, checkOut, numberOfGuests);
			// Search room
			// Here the variable numberOfGuests also resembles which room is chosen
			bookingManagement.addRoomPending(numberOfGuests, bookingID);
			bookingManagement.addCustomerInformationToBooking(bookingID, firstName, lastName, email, ph);
			bookingManagement.confirmBooking(bookingID);
		}
	} // end inner class User

	@Test
	public void testAddStaffMember() {
		IHotelManager hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
	
		// first the admin logs in. 
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		
		assertTrue(hm.addStaffMember(Util.adminUsername, "alex4", "ankeborg4444", "Alexander", "Lukas", "alex4@hotmail.com",
				"552219", "Tomtebacken 14", false));
		
		assertEquals( "ankeborg4444", hm.getStaffMemberPassword("alex4"));
		assertEquals( "Alexander", hm.getStaffMemberFirstName("alex4"));
		assertEquals( "Lukas", hm.getStaffMemberLastName("alex4"));
		assertEquals( "alex4@hotmail.com", hm.getStaffMemberEmail("alex4"));
		assertEquals( "552219", hm.getStaffMemberPhoneNumber("alex4"));
		assertEquals( "Tomtebacken 14", hm.getStaffMemberAddress("alex4"));
		assertEquals( false, hm.isStaffMemberAdmin("alex4"));
		
		// if you try to add a staff member with the same username, it should fail.
		
		assertFalse(hm.addStaffMember(Util.adminUsername, "alex4", "ankeborg4444", "Alexander ", "Lukasson", "alex4@hotmail.com",
				"552219", "Tomtebacken 14", false));
		
		// make sure that the old user is unchagned:
		assertEquals( "ankeborg4444", hm.getStaffMemberPassword("alex4"));
		assertEquals( "Alexander", hm.getStaffMemberFirstName("alex4"));
		assertEquals( "Lukas", hm.getStaffMemberLastName("alex4"));
		assertEquals( "alex4@hotmail.com", hm.getStaffMemberEmail("alex4"));
		assertEquals( "552219", hm.getStaffMemberPhoneNumber("alex4"));
		assertEquals( "Tomtebacken 14", hm.getStaffMemberAddress("alex4"));
		assertEquals( false, hm.isStaffMemberAdmin("alex4"));
		
		
		// Next, make sure that it fails if the admin tries to add a new staff member while being logged out. 
		assertTrue(hm.logout(Util.adminUsername));
		
		assertFalse(hm.addStaffMember(Util.adminUsername, "alex5", "ankeborg4444", "Alexander", "Lukas", "alex4@hotmail.com",
				"552219", "Tomtebacken 14", false));
		// assert that "alex5" does not exist in the system. 
		assertEquals(null, hm.getStaffMemberFirstName("alex5"));
		
		// Next, make sure that it fails when alex4 tries to add a new staff member, since he's not an admin. 	
		assertTrue(hm.login("alex4", "ankeborg4444"));
		
		assertFalse(hm.addStaffMember("alex4", "alex5", "ankeborg4444", "Alexander", "Lukas", "alex4@hotmail.com",
				"552219", "Tomtebacken 14", false));
		assertEquals(null, hm.getStaffMemberFirstName("alex5"));	
	}
	

} // end class UserTests
