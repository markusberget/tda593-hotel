package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

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
	 */
	@Test
	public void testConfirmBooking() {
		fail("Not yet implemented");
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
	 */
	@Test
	public void testCheckOut() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#addCustomerInformationToBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddCustomerInformationToBooking() {
		int bookingID = 5;
		String firstName = "Karl", lastName = "Urban", email = "karl.urban@gmail.com", ph = "0843322";
		Classes.impl.IBookingManagementImplImpl pendingBooking = Classes.impl.IBookingManagementImplImpl.instantiateForTest();
		Customer customer = pendingBooking.pendingBookings.get(bookingID).getCustomer();
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getEmail());
		assertNull(customer.getPhoneNumber());
		pendingBooking.addCustomerInformationToBooking(bookingID, firstName, lastName, email, ph);
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
		assertEquals(0, pendingBooking.pendingBookings.size());
		Date checkIn = new Date();
		Date checkOut = new Date();
		int bookingID1 = pendingBooking.createPendingBooking(checkIn, checkOut, 6);
		assertTrue(1 == bookingID1);
		assertEquals(1, pendingBooking.pendingBookings.size());
		assertEquals(checkIn, pendingBooking.pendingBookings.get(bookingID1).getCheckIn());
		assertEquals(checkOut, pendingBooking.pendingBookings.get(bookingID1).getCheckOut());
		assertEquals(6, pendingBooking.pendingBookings.get(bookingID1).getNumberOfGuests());
		int bookingID2 = pendingBooking.createPendingBooking(checkIn, checkOut, 4);
		assertTrue(2 == bookingID2);
		assertEquals(2, pendingBooking.pendingBookings.size());
		assertEquals(checkIn, pendingBooking.pendingBookings.get(bookingID2).getCheckIn());
		assertEquals(checkOut, pendingBooking.pendingBookings.get(bookingID2).getCheckOut());
		assertEquals(4, pendingBooking.pendingBookings.get(bookingID2).getNumberOfGuests());
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
