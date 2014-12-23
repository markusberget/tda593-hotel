package user;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.Date;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Customer;
import Classes.IHotelManager;
import Classes.IHotelManagerImpl;
import Classes.RoomStatus;
import Classes.RoomTypeName;
import Classes.impl.IFinanceImplImpl;

/**
 * This class contains unit tests for the BookingManager interface.
 *
 */
public class BookingManagerTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	// one-time initialization code
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#updateBooking()}.
	 */
	@Test
	public void testUpdateBooking() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#getBooking(int)}.
	 * 
	 * Test if correct bookings are retrieved using the corresponding bookingID.
	 */
	@Test
	public void testGetBookingInt() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		int bookingID1 = bookingManagement.createPendingBooking(new Date(), new Date(), 4);
		int bookingID2 = bookingManagement.createPendingBooking(new Date(), new Date(), 2);
		assertEquals(0, bookingID1);
		assertEquals(1, bookingID2);
		bookingManagement.confirmBooking(bookingID1);
		bookingManagement.confirmBooking(bookingID2);
		assertEquals(bookingID2, bookingManagement.getBooking(bookingID2).getBookingID());
		assertEquals(bookingID1, bookingManagement.getBooking(bookingID1).getBookingID());
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#getBooking(int, java.util.Date)}.
	 */
	@Test
	public void testGetBookingIntDate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#confirmBooking(int)}.
	 * 
	 * First two pending bookings are created, and then they are confirmed in reverse order.
	 */
	@Test
	public void testConfirmBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		Date checkIn = new Date();
		Date checkOut = new Date();
		int numberOfGuests1 = 6;
		int numberOfGuests2 = 4;
		int bookingID1 = bookingManagement.createPendingBooking(checkIn, checkOut, numberOfGuests1);
		assertEquals(0, bookingID1);
		int bookingID2 = bookingManagement.createPendingBooking(checkIn, checkOut, numberOfGuests2);
		assertEquals(1, bookingID2);
		assertEquals(2, bookingManagement.getPendingBookings().size());
		assertEquals(0, bookingManagement.getConfirmedBookings().size());
		assertTrue(bookingManagement.confirmBooking(bookingID2));
		assertEquals(1, bookingManagement.getPendingBookings().size());
		assertEquals(1, bookingManagement.getConfirmedBookings().size());
		assertTrue(bookingManagement.confirmBooking(bookingID1));
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(2, bookingManagement.getConfirmedBookings().size());
		assertEquals(numberOfGuests2, bookingManagement.getBooking(bookingID2).getNumberOfGuests());
		assertEquals(numberOfGuests1, bookingManagement.getBooking(bookingID1).getNumberOfGuests());
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#searchRoom(java.util.Date, java.util.Date, java.lang.Class, int, int, int)}.
	 */
	@Test
	public void testSearchRoom() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		Date checkIn = new Date(2016,02,10);
		Date checkOut = new Date(2015,02,15);
		int numberOfGuests = 1;
		RoomTypeName roomType = RoomTypeName.SINGLE_ROOM;
		int maximumPrice = 30000;
		EList <Integer> roomIDs = bookingManagement.searchRoom(checkIn, checkOut,numberOfGuests,roomType,maximumPrice);
		assertTrue(2<=bookingManagement.getRoomByID(roomIDs.get(0)).getRoomType().getNumberOfGuests());
		
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#cancelBooking(int)}.
	 * 
	 * Tests if a booking is cancelled by checking that the booking is removed from the
	 * booking list (pending or confirmed) and added to the history list. It is also
	 * tested what happens when a non-existing bookingID is used as an argument.
	 */
	@Test
	public void testCancelBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		int bookingID1 = bookingManagement.createPendingBooking(new Date(), new Date(), 4);
		int bookingID2 = bookingManagement.createPendingBooking(new Date(), new Date(), 2);
		int bookingID3 = bookingManagement.createPendingBooking(new Date(), new Date(), 5);
		assertEquals(0, bookingID1);
		assertEquals(1, bookingID2);
		assertEquals(2, bookingID3);
		assertFalse(bookingManagement.cancelBooking(3));
		assertEquals(3, bookingManagement.getPendingBookings().size());
		assertTrue(bookingManagement.cancelBooking(bookingID3));
		assertEquals(2, bookingManagement.getBooking(bookingID3).getBookingID());
		assertEquals(1, bookingManagement.getBookingHistory().size());
		assertEquals(2, bookingManagement.getPendingBookings().size());
		bookingManagement.confirmBooking(bookingID1);
		bookingManagement.confirmBooking(bookingID2);
		assertTrue(bookingManagement.cancelBooking(0));
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(1, bookingManagement.getConfirmedBookings().size());
		assertEquals(2, bookingManagement.getBookingHistory().size());
		assertEquals(0, bookingManagement.getBooking(bookingID1).getBookingID());
	}
	

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#addCustomerInformationToBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 * 
	 * First tests that a (existing) pending booking has its default values for the
	 * firstName, lastName. email, and ph instance variables. Thereafter the method
	 * addCustomerInformationToBooking() adds desired values for these variables, which
	 * are checked if assigned correctly.
	 */
	@Test
	public void testAddCustomerInformationToBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		int bookingID = bookingManagement.createPendingBooking(new Date(), new Date(), 3);
		assertEquals(0, bookingID);
		String firstName = "Karl", lastName = "Urban", email = "karl.urban@gmail.com", ph = "0843322";
		Customer customer = bookingManagement.getPendingBookings().get(bookingID).getCustomer();
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getEmail());
		assertNull(customer.getPhoneNumber());
		bookingManagement.addCustomerInformationToBooking(bookingID, firstName, lastName, email, ph);
		assertEquals(firstName, customer.getFirstName());
		assertEquals(lastName, customer.getLastName());
		assertEquals(email, customer.getEmail());
		assertEquals(ph, customer.getPhoneNumber());
	}
	
	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#createPendingBooking(java.util.Date, java.util.Date, int)}.
	 * 
	 * Tests so that a pending booking is created when the pendingBookings array is empty, and
	 * also when there already exists one pendingBooking.
	 * The parameters checkIn, CheckOut, bookingID, and numberOfGuests are also checked
	 * to see if they are correct.
	 */
	@Test
	public void testCreatePendingBooking() {
		Classes.impl.IBookingManagementImplImpl pendingBooking = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		assertEquals(0, pendingBooking.getPendingBookings().size());
		Date checkIn = new Date();
		Date checkOut = new Date();
		int bookingID1 = pendingBooking.createPendingBooking(checkIn, checkOut, 6);
		assertTrue(0 == bookingID1);
		assertEquals(1, pendingBooking.getPendingBookings().size());
		assertEquals(checkIn, pendingBooking.getPendingBookings().get(bookingID1).getCheckIn());
		assertEquals(checkOut, pendingBooking.getPendingBookings().get(bookingID1).getCheckOut());
		assertEquals(6, pendingBooking.getPendingBookings().get(bookingID1).getNumberOfGuests());
		int bookingID2 = pendingBooking.createPendingBooking(checkIn, checkOut, 4);
		assertTrue(1 == bookingID2);
		assertEquals(2, pendingBooking.getPendingBookings().size());
		assertEquals(checkIn, pendingBooking.getPendingBookings().get(bookingID2).getCheckIn());
		assertEquals(checkOut, pendingBooking.getPendingBookings().get(bookingID2).getCheckOut());
		assertEquals(4, pendingBooking.getPendingBookings().get(bookingID2).getNumberOfGuests());
	}

	/**
	 *  Test method for {@link Classes.impl.IFinanceImplImpl#calculatePayment(int)}.
	 */
	@Test
	public void testCalculatePayment() {
		fail("Not yet implemented");
	}
	
	/**
	 *  Test method for {@link Classes.impl.IFinanceImplImpl#payBill(int)}.
	 *  
	 *  Tests if the credit card is valid and if the payment of a bill is successful.
	 */
	@Test
	public void testPayBill() {
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

		Classes.impl.IFinanceImplImpl financeManagement = Classes.impl.IFinanceImplImpl.instantiateForTest();
		assertEquals("Payment was successful", financeManagement.payBill(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, 343.0));
		assertEquals(2000.0, bankingAdmin.getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName), 2000.0);
		assertEquals("Amount could not be withdrawn", financeManagement.payBill(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, 2343.0));
		assertEquals("Credit Card is not valid", financeManagement.payBill("00234111", ccv, expiryMonth, expiryYear, firstName, lastName, 343.0));
		
		// Remove the credit card account from the banking component
		assertTrue(bankingAdmin.removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName));
		} catch (SOAPException e) {
			System.err
			.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
	}

	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#ChangeStatusOfRoom(int, Enum)}.
	 */
	@Test
	public void testChangeStatusOfRoom() {
		
	
		Classes.impl.IBookingManagementImplImpl bm = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		IHotelManager hm = bm.getIHotelManagerImpl();
		
		assertNotNull(hm);
		
		
		assertEquals(RoomStatus.AVAILABLE, bm.getRoomByID(1).getStatus());
		
		// try to change status when admin is logged out:
		assertFalse(bm.changeStatusOfRoom(Util.adminUsername, 1, RoomStatus.CLEANING));
		// status should be unchanged.
		assertEquals(RoomStatus.AVAILABLE, bm.getRoomByID(1).getStatus());
		
		// now login and try again!
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		assertTrue(bm.changeStatusOfRoom(Util.adminUsername, 1, RoomStatus.CLEANING));
		assertEquals(RoomStatus.CLEANING, bm.getRoomByID(1).getStatus());
		
		
		// Next, make sure that a staff member that is not admin can also change status of room. 
		assertTrue(hm.addStaffMember(Util.adminUsername, "alex4", "ankeborg4444", "Alexander", "Lukas", "alex4@hotmail.com",
				"552219", "Tomtebacken 14", false));
		assertTrue(hm.login("alex4", "ankeborg4444"));
		assertTrue(bm.changeStatusOfRoom("alex4", 1, RoomStatus.AVAILABLE));
		assertEquals(RoomStatus.AVAILABLE, bm.getRoomByID(1).getStatus());
	}


}
