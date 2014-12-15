package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Booking;
import Classes.Customer;
import Classes.Room;


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
		// Set up of a credit card account for use when paying for the booking/room(s).
		se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin;
		String ccNumber = "1_12345678", ccv = "123", firstName = "Karl", lastName = "urban";
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
		EList<Room> rooms = new BasicEList<Room>();
		//rooms = bookingManagement.getBooking(bookingID).getRoom();
		//rooms.add(new Room());
		
		// 1) Retrieve booking information using getBooking(bookingID).
		Booking booking = bookingManagement.getBooking(bookingID);
		// 2) Choose room(s) to checkout from.
		// 2a) A precondition for doing a checkout is that a checkin has been done, this must be checked first.

		//bookingManagement.checkOut(rooms);
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


}
