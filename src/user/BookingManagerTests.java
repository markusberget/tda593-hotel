package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.ChargeType;
import Classes.Customer;
import Classes.Room;
import Classes.RoomType;
import Classes.RoomTypeName;

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
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#updateBooking()}.
	 * 
	 * Test if the updated booking contain the correct information.
	 */
	@Test
	public void test_valid_UpdateBooking() {

		// Set up a booking
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int room1 = 1, room2 = 2;
		int nrOfGuests = 4;
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		int bookingID = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests);
		assertEquals(0, bookingID);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID));
		assertEquals("Room 2 was successfully added to pending booking",
				bookingManagement.addRoomPending(room2, bookingID));

		// Add customer information if this information should be modifiable in
		// the future
		bookingManagement.addCustomerInformationToBooking(bookingID, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");

		// Confirm booking
		bookingManagement.confirmBooking(bookingID);

		// Check the information of the booking before update
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(checkOut, bookingManagement.getConfirmedBookings().get(0)
				.getCheckOut());
		assertEquals(nrOfGuests, bookingManagement.getConfirmedBookings()
				.get(0).getNumberOfGuests());

		// Update check out date and nrOfGuests of the booking
		calCheckOut.set(2015, 0, 16, 10, 00);
		Date newCheckOut1 = calCheckOut.getTime();
		int newNumberOfGuests = 6;
		assertEquals("Booking was updated successfully",
				bookingManagement.updateBooking(bookingID, 0, checkIn,
						newCheckOut1, newNumberOfGuests));

		// Check if the updated booking contains the desired information
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(newCheckOut1, bookingManagement.getConfirmedBookings()
				.get(0).getCheckOut());
		assertEquals(newNumberOfGuests, bookingManagement
				.getConfirmedBookings().get(0).getNumberOfGuests());

		// Update checkOut again
		calCheckOut.set(2015, 0, 17, 10, 00);
		Date newCheckOut2 = calCheckOut.getTime();
		assertEquals("Booking was updated successfully",
				bookingManagement.updateBooking(bookingID, 0, checkIn,
						newCheckOut2, newNumberOfGuests));

		// Check that only the check-out date has been updated
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(newCheckOut2, bookingManagement.getConfirmedBookings()
				.get(0).getCheckOut());
		assertEquals(newNumberOfGuests, bookingManagement
				.getConfirmedBookings().get(0).getNumberOfGuests());

	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#updateBooking()}.
	 * 
	 * Test how method updateBooking(...) handles a negative nrOfGuests and when
	 * check-out date is earlier than the check-in date, and many other scenarios.
	 */
	@Test
	public void test_invalid_UpdateBooking() {

		// Set up a booking
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 16, 12, 00);
		calCheckOut.set(2015, 0, 18, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests4 = 4;
		int room1 = 1, room2 = 2, room3 = 3, room6 = 6, room11 = 11;
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		int bookingID = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests4);
		assertEquals(0, bookingID);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID));

		// Add customer information if this information should be modifiable in
		// the future
		bookingManagement.addCustomerInformationToBooking(bookingID, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		bookingManagement.confirmBooking(bookingID);

		// Check the information of the booking before update
		assertEquals(bookingID, bookingManagement.getConfirmedBookings().get(0)
				.getBookingID());
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(checkOut, bookingManagement.getConfirmedBookings().get(0)
				.getCheckOut());
		assertEquals(nrOfGuests4,
				bookingManagement.getConfirmedBookings().get(0)
						.getNumberOfGuests());

		// Update the booking using a negative value for newNumberOfGuests
		int newNrOfGuests = -5;
		assertEquals(
				"Could not update booking since value of nrOfGuests is less than 0",
				bookingManagement.updateBooking(bookingID, 0, checkIn,
						checkOut, newNrOfGuests));

		// Check if the "updated" booking contains the desired (old) information
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(checkOut, bookingManagement.getConfirmedBookings().get(0)
				.getCheckOut());
		assertEquals(nrOfGuests4,
				bookingManagement.getConfirmedBookings().get(0)
						.getNumberOfGuests());

		// Update the booking using a check-in date that is later than the
		// check-out date
		calCheckOut.set(2015, 0, 19, 10, 00);
		Date newCheckIn = calCheckOut.getTime();
		assertEquals(
				"Could not update booking, check-in date is later than check-out date",
				bookingManagement.updateBooking(bookingID, 0, newCheckIn,
						checkOut, nrOfGuests4));

		// Check if the "updated" booking contains the desired (old) information
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(checkOut, bookingManagement.getConfirmedBookings().get(0)
				.getCheckOut());
		assertEquals(nrOfGuests4,
				bookingManagement.getConfirmedBookings().get(0)
						.getNumberOfGuests());

		// Check what happens when trying to update with a room number that does
		// not exist
		assertEquals("room was not found, check if roomID is correct",
				bookingManagement.updateBooking(bookingID, room11, null, null,
						nrOfGuests4));

		// Check what happens when using a room number less than 0
		assertEquals(
				"Could not update booking since value of roomID is less than 0",
				bookingManagement.updateBooking(bookingID, -1, checkIn,
						checkOut, nrOfGuests4));

		// Test to add a new room during same dates (room should be available)
		assertEquals(1, bookingManagement.getConfirmedBookings().get(0).getRooms().size());
		assertEquals(2, bookingManagement.getConfirmedBookings().get(0).getBill().getCharge().size());
		assertEquals(200,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
		assertEquals("Booking was updated successfully",
				bookingManagement.updateBooking(bookingID, room2, null, null,
						nrOfGuests4));
		assertEquals(2, bookingManagement.getConfirmedBookings().get(0).getRooms().size());
		assertEquals(4, bookingManagement.getConfirmedBookings().get(0).getBill().getCharge().size());
		assertEquals(400,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID));

		// Test to add a new room during same dates (room should not be
		// available)
		assertEquals("Room could not be added since already booked",
				bookingManagement.updateBooking(bookingID, room2, null, null,
						nrOfGuests4));

		// Test if the two booked rooms can be booked during new dates
		assertEquals("Booking was updated successfully",
				bookingManagement.updateBooking(bookingID, 0, checkIn,
						checkOut, nrOfGuests4));
		assertEquals(checkIn, bookingManagement.getRoom().get(1).getBookings().get(0).getCheckIn());

		// Test if only one room in the booking can be updated with new dates
		assertEquals(
				"Cannot update check-in and check-out dates for a single room only",
				bookingManagement.updateBooking(bookingID, room1, checkIn,
						checkOut, nrOfGuests4));

		calCheckIn.set(2015, 0, 16, 12, 00);
		calCheckOut.set(2015, 0, 18, 10, 00);
		newCheckIn = calCheckIn.getTime();
		Date newCheckOut = calCheckOut.getTime();

		// Update booking with new dates when rooms are available
		assertEquals("Booking was updated successfully",
				bookingManagement.updateBooking(bookingID, 0, newCheckIn,
						newCheckOut, nrOfGuests4));
		assertEquals(newCheckIn, bookingManagement.getConfirmedBookings()
				.get(0).getCheckIn());
		assertEquals(newCheckOut,
				bookingManagement.getConfirmedBookings().get(0).getCheckOut());

		// Create a booking that has booked room1 during some nights
		calCheckIn.set(2015, 0, 20, 12, 00);
		calCheckOut.set(2015, 0, 24, 10, 00);
		newCheckIn = calCheckIn.getTime();
		newCheckOut = calCheckOut.getTime();
		int bookingID2 = bookingManagement.createPendingBooking(newCheckIn,
				newCheckOut, nrOfGuests4);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID2));
		assertEquals("Room 6 was successfully added to pending booking",
				bookingManagement.addRoomPending(room6, bookingID2));
		assertEquals("Room 3 was successfully added to pending booking",
				bookingManagement.addRoomPending(room3, bookingID2));
		bookingManagement.addCustomerInformationToBooking(bookingID2, "kol",
				"beck", "kol.beck@gmail.com", "0444321234");
		bookingManagement.confirmBooking(bookingID2);
		
		// Test if new booking can add room2 (already booked during other dates)
		// and that right amount of charges are added.
		assertEquals(3, bookingManagement.getConfirmedBookings().get(1).getRooms().size());
		assertEquals(12, bookingManagement.getConfirmedBookings().get(1).getBill().getCharge().size());
		assertEquals(1800,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID2));
		assertEquals("Booking was updated successfully",
				bookingManagement.updateBooking(bookingID2, room2, null, null,
						nrOfGuests4));
		assertEquals(4, bookingManagement.getConfirmedBookings().get(1).getRooms().size());
		assertEquals(16, bookingManagement.getConfirmedBookings().get(1).getBill().getCharge().size());
		assertEquals(2200,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID2));
		
		// Test if check-out date can be extended for a booking when one of the
		// rooms in the booking will clash with some dates that it is booked
		// for another customer (room 1 already booked during the last nights
		// before the new check-out date)
		calCheckOut.set(2015, 0, 22, 10, 00);
		newCheckOut = calCheckOut.getTime();
		assertEquals(
				"Could not update booking because date(s) for room(s) already booked",
				bookingManagement.updateBooking(bookingID, 0, checkIn,
						newCheckOut, nrOfGuests4));

		// Test if by extending the stay of a booking, the charges of the room(s)
		// increases accordingly
		calCheckOut.set(2015, 0, 19, 10, 00);
		newCheckOut = calCheckOut.getTime();
		calCheckIn.set(2015, 0, 16, 12, 00);
		newCheckIn = calCheckIn.getTime();
		assertEquals(newCheckIn, bookingManagement.getConfirmedBookings().get(0).getCheckIn());
		assertEquals(2, bookingManagement.getConfirmedBookings().get(0).getRooms().size());
		assertEquals(4, bookingManagement.getConfirmedBookings().get(0).getBill().getCharge().size());
		assertEquals(400,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
		assertEquals("Booking was updated successfully",
				bookingManagement.updateBooking(bookingID, 0, null, newCheckOut,
						nrOfGuests4));
		assertEquals(newCheckIn, bookingManagement.getConfirmedBookings().get(0).getCheckIn());
		assertEquals(2, bookingManagement.getConfirmedBookings().get(0).getRooms().size());
		assertEquals(6, bookingManagement.getConfirmedBookings().get(0).getBill().getCharge().size());
		assertEquals(600,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#getBooking(int, java.util.Date)}
	 * . Tests if cancellation fee is added to a booking if canceled in less
	 * than 24 hours, and also if cancellation fee is not added when a booking
	 * is canceled earlier than 24 hours before check-in time.
	 * 
	 */
	@Test
	public void test_cancelBooking_CancellationFee() {

		// Set up a booking that can be canceled
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		Calendar checkIn = Calendar.getInstance();
		Calendar checkOut = Calendar.getInstance();
		checkIn.set(2015, 06, 02, 12, 00);
		checkOut.set(2015, 06, 04, 10, 00);
		Date checkInDate = checkIn.getTime();
		Date checkOutDate = checkOut.getTime();
		int nrOfGuests = 4;
		int room1 = 1, room2 = 2, room3 = 3, room6 = 6;
		int bookingID0 = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, nrOfGuests);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID0));
		assertEquals("Room 2 was successfully added to pending booking",
				bookingManagement.addRoomPending(room2, bookingID0));
		bookingManagement.addCustomerInformationToBooking(bookingID0, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		bookingManagement.confirmBooking(bookingID0);

		// Check that no cancellation fee is added since >24 hours left to
		// check-in
		assertEquals("Confirmed booking was successfully cancelled",
				bookingManagement.cancelBooking(bookingID0));
		assertEquals(0, bookingManagement.getRoomByID(room1).getBookings()
				.size());
		assertEquals(0, bookingManagement.getRoomByID(room2).getBookings()
				.size());

		// Create a new booking
		int bookingID1 = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, nrOfGuests);
		// These rooms should be available during same dates since last booking
		// cancelled
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID1));
		assertEquals("Room 2 was successfully added to pending booking",
				bookingManagement.addRoomPending(room2, bookingID1));
		bookingManagement.addCustomerInformationToBooking(bookingID1, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		bookingManagement.confirmBooking(bookingID1);

		// Increase current second by 1 to force cancellation fee to be added
		Calendar newCheckIn = Calendar.getInstance();
		newCheckIn.set(Calendar.SECOND, newCheckIn.get(Calendar.SECOND) + 1);
		Date newCheckInDate = newCheckIn.getTime();

		// Increase current day by 1 of check-out date so that cancellation fee
		// will be same
		Calendar newCheckOut = Calendar.getInstance();
		newCheckOut.set(Calendar.DAY_OF_MONTH,
				newCheckOut.get(Calendar.DAY_OF_MONTH) + 2);
		Date newCheckOutDate = newCheckOut.getTime();

		// Create new booking to cancel
		int bookingID2 = bookingManagement.createPendingBooking(newCheckInDate,
				newCheckOutDate, nrOfGuests);
		assertEquals("Room 3 was successfully added to pending booking",
				bookingManagement.addRoomPending(room3, bookingID2));
		assertEquals("Room 6 was successfully added to pending booking",
				bookingManagement.addRoomPending(room6, bookingID2));
		bookingManagement.addCustomerInformationToBooking(bookingID2, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		bookingManagement.confirmBooking(bookingID2);
		assertEquals(2, bookingManagement.getConfirmedBookings().get(1)
				.getRooms().size());

		// Check that cancellation fee is added (and created) since 2 hours left
		// to check-in
		// Expected cost 700 since bill is for two nights per room
		assertEquals(700,
				bookingManagement.getIFinanceImpl()
						.calculatePayment(bookingID2));
		assertEquals("Late cancel, please pay the added cancellation fee",
				bookingManagement.cancelBooking(bookingID2));
		assertEquals(ChargeType.CANCELLATION_FEE, bookingManagement
				.getConfirmedBookings().get(1).getBill().getCharge().get(4)
				.getChargeType());
		assertEquals(700, bookingManagement.getConfirmedBookings().get(1)
				.getBill().getCharge().get(4).getAmount());

		// Try to cancel booking again without paying the cancellation fee first
		assertEquals(
				"Booking could not be cancelled since cancellation fee has not been paid",
				bookingManagement.cancelBooking(bookingID2));

		// Set fee to zero to be able to cancel the booking
		bookingManagement.getConfirmedBookings().get(1).getBill().getCharge()
				.get(4).setAmount(0);
		assertEquals(0, bookingManagement.getConfirmedBookings().get(1)
				.getBill().getCharge().get(4).getAmount());
		assertEquals(2, bookingManagement.getConfirmedBookings().size());
		assertEquals("Confirmed booking was successfully cancelled",
				bookingManagement.cancelBooking(bookingID2));
		assertEquals(1, bookingManagement.getConfirmedBookings().size());
		assertEquals(2, bookingManagement.getBookingHistory().size());
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#cancelBooking(int)}.
	 * 
	 * Tests if a booking is cancelled by checking that the booking is removed
	 * from the booking list (pending or confirmed) and added to the history
	 * list. It is also tested what happens when a non-existing bookingID is
	 * used as an argument. When a booking is canceled all booked dates of all
	 * associated rooms is removed. This expected behavior is also tested.
	 */
	@Test
	public void testCancelBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 24, 12, 00);
		calCheckOut.set(2015, 0, 26, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests4 = 4, nrOfGuests2 = 2, nrOfGuests5 = 5;
		int room1 = 1, room2 = 2, room3 = 3, room6 = 6, room7 = 7;
		int bookingID1 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests4);
		int bookingID2 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests2);
		int bookingID3 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests5);
		bookingManagement.addCustomerInformationToBooking(bookingID1, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		assertEquals(0, bookingID1);
		assertEquals(1, bookingID2);
		assertEquals(2, bookingID3);
		assertEquals("Booking could not be cancelled since it was not found",
				bookingManagement.cancelBooking(3));
		assertEquals(3, bookingManagement.getPendingBookings().size());

		// Add rooms to the bookings so it can be tested that the rooms are made
		// available again when bookings are canceled
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID1));
		assertEquals("Room 2 was successfully added to pending booking",
				bookingManagement.addRoomPending(room2, bookingID2));
		assertEquals("Room 6 was successfully added to pending booking",
				bookingManagement.addRoomPending(room6, bookingID3));
		assertEquals("Room 3 was successfully added to pending booking",
				bookingManagement.addRoomPending(room3, bookingID3));
		assertEquals("Room 7 was successfully added to pending booking",
				bookingManagement.addRoomPending(room7, bookingID3));

		// Add another booking for room3 to check that it is not also removed
		// when
		// canceling bookingID3
		calCheckIn.set(2015, 2, 24, 12, 00);
		calCheckOut.set(2015, 2, 26, 10, 00);
		checkIn = calCheckIn.getTime();
		checkOut = calCheckOut.getTime();
		int bookingID4 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests4);
		assertEquals("Room 3 was successfully added to pending booking",
				bookingManagement.addRoomPending(room3, bookingID4));

		// Cancel a booking and assert that the booking is removed from the
		// rooms
		assertEquals(1, bookingManagement.getRoomByID(room6).getBookings()
				.size());
		assertEquals(2, bookingManagement.getRoomByID(room3).getBookings()
				.size());
		assertEquals(bookingID3, bookingManagement.getRoomByID(room3)
				.getBookings().get(0).getBookingID());
		assertEquals(bookingID4, bookingManagement.getRoomByID(room3)
				.getBookings().get(1).getBookingID());
		assertEquals(3, bookingManagement.getPendingBookings().get(bookingID3)
				.getRooms().size());
		assertEquals("Pending booking was successfully cancelled",
				bookingManagement.cancelBooking(bookingID3));
		assertEquals(1, bookingManagement.getRoomByID(room3).getBookings()
				.size());
		assertEquals(0, bookingManagement.getRoomByID(room6).getBookings()
				.size());

		assertEquals(bookingID3, bookingManagement.getBookingHistory().get(0)
				.getBookingID());
		assertEquals(1, bookingManagement.getBookingHistory().size());
		assertEquals(3, bookingManagement.getPendingBookings().size());
		bookingManagement.addCustomerInformationToBooking(bookingID2, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		bookingManagement.confirmBooking(bookingID1);
		bookingManagement.confirmBooking(bookingID2);

		// Cancel another booking and check if the booking is removed from the
		// room
		assertEquals("Confirmed booking was successfully cancelled",
				bookingManagement.cancelBooking(bookingID1));
		assertEquals(0, bookingManagement.getRoomByID(room1).getBookings()
				.size());
		assertEquals(1, bookingManagement.getPendingBookings().size());
		assertEquals(1, bookingManagement.getConfirmedBookings().size());
		assertEquals(2, bookingManagement.getBookingHistory().size());
		assertEquals(0, bookingManagement.getBookingHistory().get(1)
				.getBookingID());

		// Test to cancel a booking that has its check-in date older than
		// current date
		calCheckIn.set(2014, 2, 24, 12, 00);
		checkIn = calCheckIn.getTime();
		int bookingID5 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests4);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID5));
		bookingManagement.addCustomerInformationToBooking(bookingID5, "Nelly",
				"Nansen", "nelly.nansen@gmail.com", "0734371234");
		assertEquals("Cannot cancel a booking after its check-in time",
				bookingManagement.cancelBooking(bookingID5));
		bookingManagement.confirmBooking(bookingID5);
		assertEquals("Cannot cancel a booking after its check-in time",
				bookingManagement.cancelBooking(bookingID5));
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#confirmBooking(int)}.
	 * 
	 * Two pending bookings are created, and then they are confirmed in reverse
	 * order. Some specific information must have been added to a pending
	 * booking for it to be able to become a confirmed booking, and it is
	 * checked what happens when some of these required information are left
	 * out.
	 */
	@Test
	public void testConfirmBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int numberOfGuests6 = 6;
		int numberOfGuests4 = 4;
		int bookingID1 = bookingManagement.createPendingBooking(checkIn,
				checkOut, numberOfGuests6);
		assertEquals(0, bookingID1);
		int bookingID2 = bookingManagement.createPendingBooking(checkIn,
				checkOut, numberOfGuests4);
		bookingManagement.addCustomerInformationToBooking(bookingID1, "Helly",
				null, null, null);
		// Check what happens when trying to confirm a pending booking that is
		// missing
		// required information
		assertEquals("Must fill in First Name",
				bookingManagement.confirmBooking(bookingID2));
		assertEquals("Must fill in Last Name",
				bookingManagement.confirmBooking(bookingID1));
		bookingManagement.addCustomerInformationToBooking(bookingID1, "Helly",
				"Hansen", null, null);
		assertEquals("Must fill in at least an E-mail or a Phone number",
				bookingManagement.confirmBooking(bookingID1));
		bookingManagement.addCustomerInformationToBooking(bookingID1, "Helly",
				"Hansen", null, "0734321234");

		// Booking should be confirmed since only either the email or the phone
		// number
		// is required to be able to confirm a booking
		assertEquals("Booking has been confirmed",
				bookingManagement.confirmBooking(bookingID1));
		bookingManagement.addCustomerInformationToBooking(bookingID2, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		assertEquals(1, bookingID2);
		assertEquals(1, bookingManagement.getPendingBookings().size());
		assertEquals(1, bookingManagement.getConfirmedBookings().size());
		assertEquals("Booking has been confirmed",
				bookingManagement.confirmBooking(bookingID2));
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(2, bookingManagement.getConfirmedBookings().size());

		// try to confirm an already confirmed booking
		assertEquals(
				"Booking could not be found, please try another bookingID",
				bookingManagement.confirmBooking(bookingID1));
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(2, bookingManagement.getConfirmedBookings().size());
		assertEquals(numberOfGuests6, bookingManagement.getConfirmedBookings()
				.get(0).getNumberOfGuests());
		assertEquals(numberOfGuests4, bookingManagement.getConfirmedBookings()
				.get(1).getNumberOfGuests());
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#searchRoom(java.util.Date, java.util.Date, java.lang.Class, int, int, int)}
	 * 
	 * Tests if the rooms that are returned from the searchRoom method matches
	 * the parameters that are sent in and tests if exceptions are thrown
	 * correctly when faulty parameters are sent in.
	 * 
	 * 
	 */

	@Test
	public void testSearchRoom() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();

		// Tests if returned list is correct if all parameters are entered
		// correctly.

		Calendar checkIn = Calendar.getInstance();
		Calendar checkOut = Calendar.getInstance();
		checkIn.set(2015, 02, 12);
		checkOut.set(2015, 02, 13);
		Date checkInDate = checkIn.getTime();
		Date checkOutDate = checkOut.getTime();

		int numberOfGuests = 1;
		String roomType = RoomTypeName.SINGLE_ROOM.toString();
		int maximumPrice = 30000;
		EList<Integer> roomIDs = bookingManagement.searchRoom(checkInDate,
				checkOutDate, numberOfGuests, roomType, maximumPrice);

		for (Iterator it = roomIDs.listIterator(); it.hasNext();) {
			Integer roomID = (Integer) it.next();
			RoomType typeOfRoom = bookingManagement.getRoomByID(roomID)
					.getRoomType();
			assertTrue(numberOfGuests <= typeOfRoom.getNumberOfGuests()
					&& maximumPrice >= typeOfRoom.getPrice()
					&& roomType == typeOfRoom.getRoomTypeName().toString());
		}

		// Adds a booking with the same dates as the search is called with
		// and makes sure that that room isn't returned.

		int bookedRoom = roomIDs.get(0);		
		int bookingID = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, numberOfGuests);
		bookingManagement.addRoomPending(bookedRoom, bookingID);
		bookingManagement.addCustomerInformationToBooking(bookingID, "Hans",
				"Hansson", "hanshansson@gmail.com", "0735123151");
		bookingManagement.confirmBooking(bookingID);
		
		roomIDs = bookingManagement.searchRoom(checkInDate,
				checkOutDate, numberOfGuests, roomType, maximumPrice);
		
		for (Iterator it = roomIDs.listIterator(); it.hasNext();) {
			Integer roomID = (Integer) it.next();
			assertTrue(bookedRoom != roomID);
			RoomType typeOfRoom = bookingManagement.getRoomByID(roomID)
					.getRoomType();
			assertTrue(numberOfGuests <= typeOfRoom.getNumberOfGuests()
					&& maximumPrice >= typeOfRoom.getPrice()
					&& roomType == typeOfRoom.getRoomTypeName().toString());
		}

		// Tests if returned list is correct if not all parameters are
		// specified but those who are, are given correctly.

		roomType = null;
		maximumPrice = 0;
		roomIDs = bookingManagement.searchRoom(checkInDate, checkOutDate,
				numberOfGuests, roomType, maximumPrice);
		for (Iterator it = roomIDs.listIterator(); it.hasNext();) {
			Integer roomID = (Integer) it.next();
			Room room = bookingManagement.getRoomByID(roomID);
			assertTrue(numberOfGuests <= room.getRoomType().getNumberOfGuests());
		}

		// Tests if returned list is correct if not all parameters are
		// specified but those who are, are given correctly.

		roomType = null;
		maximumPrice = 0;
		roomIDs = bookingManagement.searchRoom(checkInDate, checkOutDate,
				numberOfGuests, roomType, maximumPrice);
		for (Iterator it = roomIDs.listIterator(); it.hasNext();) {
			Integer roomID = (Integer) it.next();
			Room room = bookingManagement.getRoomByID(roomID);
			assertTrue(numberOfGuests <= room.getRoomType().getNumberOfGuests());
		}

		// Tests if exception is thrown as it should if date is invalid or
		// checkIn is after checkOut or vice versa

		checkIn.set(2011, 02, 12);
		checkOut.set(2011, 02, 13);
		checkInDate = checkIn.getTime();
		checkOutDate = checkOut.getTime();
		try {
			roomIDs = bookingManagement.searchRoom(checkInDate, checkOutDate,
					numberOfGuests, roomType, maximumPrice);
		} catch (Throwable exception) {
			assertTrue(exception instanceof IllegalArgumentException);
		}

		checkIn.set(2011, 02, 12);
		checkOut.set(2011, 01, 13);
		checkInDate = checkIn.getTime();
		checkOutDate = checkOut.getTime();
		try {
			roomIDs = bookingManagement.searchRoom(checkInDate, checkOutDate,
					numberOfGuests, roomType, maximumPrice);
		} catch (Throwable exception) {
			assertTrue(exception instanceof IllegalArgumentException);
		}

		// Sets the dates to be valid again but enters an invalid room type name
		// and tests so that the exception is thrown correctly

		checkIn.set(2015, 02, 12);
		checkOut.set(2015, 02, 14);
		checkInDate = checkIn.getTime();
		checkOutDate = checkOut.getTime();
		roomType = "TrippleRoom";

		try {
			roomIDs = bookingManagement.searchRoom(checkInDate, checkOutDate,
					numberOfGuests, roomType, maximumPrice);
		} catch (Throwable exception) {
			assertTrue(exception instanceof IllegalArgumentException);
		}

	}

	/**
	 * Tests both valid and invalid use of addPendingRooms(roomID, bookingID).
	 */
	@Test
	public void testAddRoomPending() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests4 = 4, nrOfGuests2 = 2;
		int room1 = 1, room2 = 2, room3 = 3;
		int bookingID1 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests4);
		int bookingID2 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests2);

		// Test when one customer adds a room
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID1));
		assertEquals(room1, bookingManagement.getPendingBookings().get(0)
				.getRooms().get(0).getRoomNumber());
		assertEquals("Room 2 was successfully added to pending booking",
				bookingManagement.addRoomPending(room2, bookingID1));
		assertEquals(room2, bookingManagement.getPendingBookings().get(0)
				.getRooms().get(1).getRoomNumber());
		assertEquals(2, bookingManagement.getPendingBookings().get(0)
				.getRooms().size());

		// Test when a second customer tries to book same room during same dates
		assertEquals("Room 2 could not be added since already booked",
				bookingManagement.addRoomPending(room2, bookingID2));
		assertEquals("Room 1 could not be added since already booked",
				bookingManagement.addRoomPending(room1, bookingID2));
		assertEquals(0, bookingManagement.getPendingBookings().get(1)
				.getRooms().size());

		// Let second customer book available room
		assertEquals("Room 3 was successfully added to pending booking",
				bookingManagement.addRoomPending(room3, bookingID2));
		assertEquals(room3, bookingManagement.getPendingBookings().get(1)
				.getRooms().get(0).getRoomNumber());

		// Let second customer book room1 in a new booking after first customers
		// check-out date
		calCheckIn.set(2015, 10, 12, 12, 00);
		calCheckOut.set(2015, 10, 14, 10, 00);
		checkIn = calCheckIn.getTime();
		checkOut = calCheckOut.getTime();
		int bookingID3 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests2);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID3));
		assertEquals(1, bookingManagement.getPendingBookings().get(2)
				.getRooms().size());
		assertEquals(room1, bookingManagement.getPendingBookings().get(2)
				.getRooms().get(0).getRoomNumber());

		// Let a third customer book room1 in a new booking between other
		// customers dates
		calCheckIn.set(2015, 06, 10, 12, 00);
		calCheckOut.set(2015, 07, 17, 10, 00);
		checkIn = calCheckIn.getTime();
		checkOut = calCheckOut.getTime();
		int bookingID4 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests2);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID4));
		assertEquals(1, bookingManagement.getPendingBookings().get(3)
				.getRooms().size());
		assertEquals(room1, bookingManagement.getPendingBookings().get(3)
				.getRooms().get(0).getRoomNumber());
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#addCustomerInformationToBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 * 
	 * First tests that a (existing) pending booking has its default values for
	 * the firstName, lastName. email, and ph instance variables. Thereafter the
	 * method addCustomerInformationToBooking() adds desired values for these
	 * variables, which are checked if assigned correctly.
	 */
	@Test
	public void testAddCustomerInformationToBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests = 3;
		int bookingID = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests);
		assertEquals(0, bookingID);
		String firstName = "Karl", lastName = "Urban", email = "karl.urban@gmail.com", ph = "0843322";
		Customer customer = bookingManagement.getPendingBookings()
				.get(bookingID).getCustomer();

		// Check that fields are null by default
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getEmail());
		assertNull(customer.getPhoneNumber());

		// Add a non-null value for all fields except lastName
		bookingManagement.addCustomerInformationToBooking(bookingID, firstName,
				null, email, ph);
		assertEquals(firstName, customer.getFirstName());
		assertNull(customer.getLastName());
		assertEquals(email, customer.getEmail());
		assertEquals(ph, customer.getPhoneNumber());

		// Add a null value for all fields except lastName and check if all
		// fields
		// contain the old values (since null should not change old values)
		bookingManagement.addCustomerInformationToBooking(bookingID, null,
				lastName, null, null);
		assertEquals(firstName, customer.getFirstName());
		assertEquals(lastName, customer.getLastName());
		assertEquals(email, customer.getEmail());
		assertEquals(ph, customer.getPhoneNumber());

	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#createPendingBooking(java.util.Date, java.util.Date, int)}
	 * .
	 * 
	 * Tests so that a pending booking is created when the pendingBookings array
	 * is empty, and also when there already exists one pendingBooking. The
	 * parameters checkIn, CheckOut, bookingID, and numberOfGuests are also
	 * checked to see if they are correct.
	 */
	@Test
	public void testCreatePendingBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		assertEquals(0, bookingManagement.getPendingBookings().size());
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests6 = 6, nrOfGuests0 = 0;

		// Try to create a pending booking using a check-in date that is later
		// than the check-out date
		assertEquals(-1, bookingManagement.createPendingBooking(checkOut,
				checkIn, nrOfGuests6));

		// Try using 0 guests as an argument
		assertEquals(-1, bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests0));

		// Test method using valid arguments
		int bookingID1 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests6);
		assertEquals(0, bookingID1);
		assertEquals(1, bookingManagement.getPendingBookings().size());
		assertEquals(checkIn,
				bookingManagement.getPendingBookings().get(bookingID1)
						.getCheckIn());
		assertEquals(checkOut,
				bookingManagement.getPendingBookings().get(bookingID1)
						.getCheckOut());
		assertEquals(nrOfGuests6,
				bookingManagement.getPendingBookings().get(bookingID1)
						.getNumberOfGuests());
		int nrOfGuests4 = 4;
		int bookingID2 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests4);
		assertEquals(1, bookingID2);
		assertEquals(2, bookingManagement.getPendingBookings().size());
		assertEquals(checkIn,
				bookingManagement.getPendingBookings().get(bookingID2)
						.getCheckIn());
		assertEquals(checkOut,
				bookingManagement.getPendingBookings().get(bookingID2)
						.getCheckOut());
		assertEquals(nrOfGuests4,
				bookingManagement.getPendingBookings().get(bookingID2)
						.getNumberOfGuests());
	}

	/**
	 * Tests both valid and invalid arguments of method addExtraCharge(int
	 * bookingID, String charge, int quantity).
	 */
	@Test
	public void testAddExtraCharge() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests = 3;
		int bookingID = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests);
		bookingManagement.addCustomerInformationToBooking(bookingID, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");

		// Test some invalid arguments
		assertEquals("The quantity of the charge must be at least 1",
				bookingManagement.addExtraCharge(bookingID, "Breakfast", 0));
		assertEquals("Invalid charge",
				bookingManagement.addExtraCharge(bookingID, "Bedfast", 1));
		assertEquals("A charge must be chosen to be added",
				bookingManagement.addExtraCharge(bookingID, null, 1));
		assertEquals("Booking could not be found, try another bookingID",
				bookingManagement.addExtraCharge(3, "Breakfast", 1));
		assertEquals(-1,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID)); // Cannot
																					// calculate
																					// pending
																					// booking

		// Test some valid arguments
		assertEquals("Successfully added 1 breakfast charges to bill",
				bookingManagement.addExtraCharge(bookingID, "Breakfast", 1));
		assertEquals("Breakfast", bookingManagement.getPendingBookings().get(0)
				.getBill().getCharge().get(0).getChargeType().toString());
		assertEquals("Successfully added 4 breakfast charges to bill",
				bookingManagement.addExtraCharge(bookingID, "Breakfast", 4));
		assertEquals(5, bookingManagement.getPendingBookings().get(0).getBill()
				.getCharge().size());
		assertEquals("Booking has been confirmed",
				bookingManagement.confirmBooking(bookingID));
		assertEquals(250,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
	}

}
