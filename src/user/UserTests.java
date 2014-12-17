package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.Date;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Booking;
import Classes.Room;
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
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#checkIn(java.lang.Class)}.
	 */
	@Test
	public void test_CheckIn() {
		fail("Not yet implemented");
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
	 * room(s) for which payment is to be done.
	 */
	@Test
	public void test_valid_CheckOut() {
		// Set up of a credit card account for use when paying for the booking/room(s).
		se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin;
		se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires bankingCustomer;
		String ccNumber = "1_12345678", ccv = "123", firstName = "Karl", lastName = "urban";
		int expiryMonth = 10, expiryYear = 17;
		try {
			bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
			bankingCustomer = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
					.instance();
		bankingAdmin.removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
		assertTrue(bankingAdmin.addCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName));
		assertEquals(0.0, bankingAdmin.getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName), 0.0);
		assertEquals(2343.0, bankingAdmin.makeDeposit(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, 2343.0), 2343.0);
		
		// Set up an existing booking first and check in, before being able to check out. It's a precondition.
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		int bookingID = bookingManagement.createPendingBooking(new Date(), new Date(), 3);
		String email = "karl.urban@gmail.com", ph = "0843322";
		bookingManagement.addCustomerInformationToBooking(bookingID, firstName, lastName, email, ph);
		bookingManagement.confirmBooking(bookingID);
		
		assertEquals(2, bookingManagement.getRoom().size());
		
		// 1) Retrieve booking information using getBooking(bookingID).
		Booking booking = bookingManagement.getBooking(bookingID);
		// 2) Choose room(s) to checkout from.
		// 2a) A precondition for doing a checkout is that a checkin has been done, this must be checked first.

		//bookingManagement.checkOut(rooms);
		// 3) Perform the payment part (see the payment use case/sequence diagram for flow).
		double checkOutSum = 555.5;		// Set to 555 until summation of bill's charges is implemented.
		//validateWithBank();		// Performs the 2 method invocations below?
		assertTrue(bankingCustomer.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName));
		assertTrue(bankingCustomer.makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, checkOutSum));
		// 4) Change status of room(s) to CLEANING/AVAILABLE? (which is done when payment is a success).
		
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
		
		assertTrue(bookingManagement.confirmBooking(bookingID));
	}
	
	/**
	 * Tests if two users (having a processor with only two cores in mind) can book at
	 * the same time without experiencing race conditions etc. Uncomment user3 and user4
	 * to let 4 users book at the same time. The single bookingManagement object represents
	 * the system, and each user interacts with the same object (system).
	 */
	@Test
	public void test_valid_FourUsersBookingConcurrently() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		Thread user1 = new Thread(new User(bookingManagement, "Karl", "Urban", "karl.urban@gmail.com", "047663", new Date(), new Date(), 4));
		Thread user2 = new Thread(new User(bookingManagement, "Didrik", "Didier", "didrik.didier@gmail.com", "34466", new Date(), new Date(), 2));
		Thread user3 = new Thread(new User(bookingManagement, "Henn", "Venn", "henn.venn@gmail.com", "123456", new Date(), new Date(), 3));
		Thread user4 = new Thread(new User(bookingManagement, "Lauder", "Dale", "lauder.dale@gmail.com", "056232", new Date(), new Date(), 1));
		
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
		
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(4, bookingManagement.getConfirmedBookings().size());
		int testBookingID1 = bookingManagement.getBooking(0).getBookingID();
		int testBookingID2 = bookingManagement.getBooking(1).getBookingID();
		assertTrue(testBookingID1 != testBookingID2);
		
	}
	
	/**
	 * This inner class is used for simulating users that perform bookings
	 * at the same time.
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
			int bookingID = bookingManagement.createPendingBooking(checkIn, checkOut, numberOfGuests);
			assertTrue(bookingManagement.addCustomerInformationToBooking(bookingID, firstName, lastName, email, ph));
			assertTrue(bookingManagement.confirmBooking(bookingID));
			
			// Check after confirming a booking that the data is correct
			assertEquals(numberOfGuests, bookingManagement.getBooking(bookingID).getNumberOfGuests());
			assertEquals(bookingID, bookingManagement.getBooking(bookingID).getBookingID());
			assertEquals(firstName, bookingManagement.getBooking(bookingID).getFirstName());
			assertEquals(lastName, bookingManagement.getBooking(bookingID).getLastName());
			assertEquals(email, bookingManagement.getBooking(bookingID).getEmail());
			assertEquals(ph, bookingManagement.getBooking(bookingID).getPhoneNumber());
		}
	} // end inner class User


} // end class UserTests
