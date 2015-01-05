package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import javax.xml.soap.SOAPException;

import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Booking;
import Classes.RoomTypeName;

public class FinanceTests {
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// one-time initialization code
	}
	
	/**
	 * Test method for
	 * {@link Classes.impl.IFinanceImplImpl#calculatePayment(int)}.
	 * 
	 * Calculates the sum of the bill of a booking containing three rooms. Two
	 * of the rooms in this test are single rooms, and one is a double room.
	 * Each single room costs 100 (at the moment) and a double room cost 250 (at
	 * the moment). The expected sum of the bill (since no other charges are
	 * added yet) is 450.
	 */
	@Test
	public void testCalculatePayment() {

		// Set up a pending booking and add three nights stay in a room for it
		Booking pendingBooking;
		int nrOfGuests = 6;
		int room1 = 1;
		Calendar checkIn = Calendar.getInstance();
		Calendar checkOut = Calendar.getInstance();
		checkIn.set(2015, 0, 12, 12, 00);
		checkOut.set(2015, 0, 14, 10, 00);
		Date checkInDate = checkIn.getTime();
		Date checkOutDate = checkOut.getTime();
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		int bookingID = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, nrOfGuests);
		pendingBooking = bookingManagement.getPendingBookings().get(0);
		assertEquals("Room 1 was successfully added to pending booking", bookingManagement.addRoomPending(room1, bookingID));
		bookingManagement.addCustomerInformationToBooking(bookingID, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");

		// Check that correct rooms were added to booking so expected sum of
		// bill is correct
		assertEquals(RoomTypeName.SINGLE_ROOM, pendingBooking.getRooms().get(0)
				.getRoomType().getRoomTypeName());

		// Confirm the booking
		assertEquals("Booking has been confirmed", bookingManagement.confirmBooking(bookingID));

		// Check what happens if trying to calculate the payment of a non-existing booking
		assertEquals(-1, bookingManagement.getIFinanceImpl().calculatePayment(5));
		
		// Calculate the sum of the bill, 200 is expected since 2 nights are booked
		assertEquals(200, bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
	}

	/**
	 * Test method for {@link Classes.impl.IFinanceImplImpl#payBill(int)}.
	 * 
	 * First a credit card account is created which contains enough money for
	 * paying the bill. Then the three scenarios of too low balance on account,
	 * invalid card, and valid card connected to an account with a large enough
	 * balance is tested for the method payBill(...). Method payBill is expected
	 * to handle these scenarios by returning appropriate strings.
	 */
	@Test
	public void testPayBill() {
		int bookingID = 0;
		// Set up of a credit card account for use when paying for the
		// booking/room(s)
		se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin;
		String ccNumber = "01234567", ccv = "123", firstName = "Karl", lastName = "urban";
		int expiryMonth = 10, expiryYear = 17;
		try {
			bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
					.instance();
			bankingAdmin.removeCreditCard(ccNumber, ccv, expiryMonth,
					expiryYear, firstName, lastName);
			assertTrue(bankingAdmin.addCreditCard(ccNumber, ccv, expiryMonth,
					expiryYear, firstName, lastName));
			assertEquals(0.0, bankingAdmin.getBalance(ccNumber, ccv,
					expiryMonth, expiryYear, firstName, lastName), 0.0);
			assertEquals(2343.0, bankingAdmin.makeDeposit(ccNumber, ccv,
					expiryMonth, expiryYear, firstName, lastName, 2343.0),
					2343.0);

			Classes.impl.IFinanceImplImpl financeManagement = Classes.impl.IFinanceImplImpl
					.instantiateForTest();

			// Pay the bill using a credit card account with a balance greater
			// than the bill cost
			assertEquals("Payment was successful", financeManagement.payBill(
					bookingID, ccNumber, ccv, expiryMonth, expiryYear,
					firstName, lastName, 343.0));

			// Check the balance of the credit card account to see if correct
			// amount was withdrawn
			assertEquals(2000.0, bankingAdmin.getBalance(ccNumber, ccv,
					expiryMonth, expiryYear, firstName, lastName), 2000.0);

			// Check if payBill returns correct String if balance on account is
			// lower than the cost of the bill
			assertEquals("Amount could not be withdrawn",
					financeManagement.payBill(bookingID, ccNumber, ccv,
							expiryMonth, expiryYear, firstName, lastName,
							2343.0));

			// Check if payBill returns correct String if credit card is not
			// valid
			assertEquals("Credit Card is not valid", financeManagement.payBill(
					bookingID, "00234111", ccv, expiryMonth, expiryYear,
					firstName, lastName, 343.0));

			// Remove the credit card account from the banking component
			assertTrue(bankingAdmin.removeCreditCard(ccNumber, ccv,
					expiryMonth, expiryYear, firstName, lastName));
		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
	}

}
