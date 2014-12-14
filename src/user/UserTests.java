package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;

import javax.xml.soap.SOAPException;

import org.junit.BeforeClass;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import Classes.Booking;
import Classes.Customer;


/**
 * This class simulates a user and contains
 * both valid and invalid uses of the system (based
 * on our use cases, among other things). At the moment
 * the class only contains test stubs for methods a user
 * of the system is allowed to invoke (some of which only
 * a staff member is allowed to invoke). 
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
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#updateBooking()}.
	 */
	@Test
	public void testUpdateBooking() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#getBooking(int)}.
	 */
	@Test
	public void testGetBookingInt() {
		fail("Not yet implemented");
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
		assertEquals(2, bookingManagement.testPendingBookings.size());
		assertEquals(0, bookingManagement.testConfirmedBookings.size());
		assertTrue(bookingManagement.confirmBooking(bookingID2));
		assertEquals(1, bookingManagement.testPendingBookings.size());
		assertEquals(1, bookingManagement.testConfirmedBookings.size());
		assertTrue(bookingManagement.confirmBooking(bookingID1));
		assertEquals(0, bookingManagement.testPendingBookings.size());
		assertEquals(2, bookingManagement.testConfirmedBookings.size());
		assertEquals(numberOfGuests2, bookingManagement.testConfirmedBookings.get(bookingID2).getNumberOfGuests());
		assertEquals(numberOfGuests1, bookingManagement.testConfirmedBookings.get(bookingID1).getNumberOfGuests());
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#searchRoom(java.util.Date, java.util.Date, java.lang.Class, int, int, int)}.
	 */
	@Test
	public void testSearchRoom() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#cancelBooking(int)}.
	 */
	@Test
	public void testCancelBooking() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#checkIn(java.lang.Class)}.
	 */
	@Test
	public void testCheckIn() {
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
	public void testCheckOut() {
		// Set up a credit card account for use when paying for the booking/rooms.
		se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin;
		String ccNumber = "12345678", ccv = "123", firstName = "Karl", lastName = "urban";
		int expiryMonth = 10, expiryYear = 17;
		try {
			bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
		assertTrue(bankingAdmin.addCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName));
		assertEquals(0.0, bankingAdmin.getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName), 0.0);
		assertEquals(2343.0, bankingAdmin.makeDeposit(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, 2343.0), 2343.0);
		
		// Set up an existing booking first and check in, before being able to check out. It's a precondition.
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		int bookingID = bookingManagement.createPendingBooking(new Date(), new Date(), 3);
		String email = "karl.urban@gmail.com", ph = "0843322";
		bookingManagement.addCustomerInformationToBooking(bookingID, firstName, lastName, email, ph);
		bookingManagement.confirmBooking(bookingID);
		
		
		// 0) Need to add a couple of rooms to the booking in order to be able to calculate payment and such.
		
		
		// 1) Retrieve booking information using getBooking(bookingID).
		Booking booking = bookingManagement.getBooking(bookingID);
		// 2) Choose room(s) to checkout from.
		// 2a) A precondition for doing a checkout is that a checkin has been done, this must be checked first.
		
		// 3) Perform the payment part (see the payment use case/sequence diagram for flow).
		
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
		Customer customer = bookingManagement.testPendingBookings.get(bookingID).getCustomer();
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
		assertEquals(0, pendingBooking.testPendingBookings.size());
		Date checkIn = new Date();
		Date checkOut = new Date();
		int bookingID1 = pendingBooking.createPendingBooking(checkIn, checkOut, 6);
		assertTrue(0 == bookingID1);
		assertEquals(1, pendingBooking.testPendingBookings.size());
		assertEquals(checkIn, pendingBooking.testPendingBookings.get(bookingID1).getCheckIn());
		assertEquals(checkOut, pendingBooking.testPendingBookings.get(bookingID1).getCheckOut());
		assertEquals(6, pendingBooking.testPendingBookings.get(bookingID1).getNumberOfGuests());
		int bookingID2 = pendingBooking.createPendingBooking(checkIn, checkOut, 4);
		assertTrue(1 == bookingID2);
		assertEquals(2, pendingBooking.testPendingBookings.size());
		assertEquals(checkIn, pendingBooking.testPendingBookings.get(bookingID2).getCheckIn());
		assertEquals(checkOut, pendingBooking.testPendingBookings.get(bookingID2).getCheckOut());
		assertEquals(4, pendingBooking.testPendingBookings.get(bookingID2).getNumberOfGuests());
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
	 */
	@Test
	public void testPayBill() {
		fail("Not yet implemented");
	}
	
	/**
	 *  Test method for {@link Classes.impl.IFinanceImplImpl#validateWithBank(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateWithBank() {
		fail("Not yet implemented");
	}
	
	/**
	 *  Test method for {@link Classes.impl.IFinanceImplImpl#bankTransfer(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testBankTransfer() {
		fail("Not yet implemented");
	}
	
	/**
	 *  Test method for {@link Classes.impl.IFinanceImplImpl#bankSendInvoice()}.
	 */
	@Test
	public void testBankSendInvoice() {
		fail("Not yet implemented");
	}
	
	

	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#ChangeStatusOfRoom(int, Enum)}.
	 */
	@Test
	public void testChangeStatusOfRoom() {
		fail("Not yet implemented");
	}
	
	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#getPossibleRoomStatuses()}.
	 */
	@Test
	public void testgetPossibleRoomStatuses() {
		fail("Not yet implemented");
	}

}
