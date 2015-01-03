package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EList;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Booking;
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
		assertTrue(bookingManagement.addRoomPending(room1, bookingID));
		assertTrue(bookingManagement.addRoomPending(room2, bookingID));

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

		// Update checkOut and nrOfGuests of the booking
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
		
		// Check that the concerned room(s) is booked during check-in and check-out dates
		//assertEquals(4, bookingManagement.getConfirmedBookings().get(0).getRooms().get(0).getBookedDates().size());
		//assertEquals(4, bookingManagement.getConfirmedBookings().get(0).getRooms().get(1).getBookedDates().size());
		//assertEquals(0, checkIn.compareTo(bookingManagement.getConfirmedBookings().get(0).getRooms().get(1).getBookedDates().get(0)));

	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#updateBooking()}.
	 * 
	 * Test how method updateBooking(...) handles a negative nrOfGuests and when
	 * check-out date is earlier than the check-in date.
	 */
	@Test
	public void test_invalid_UpdateBooking() {

		// Set up a booking
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests = 4;
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		int bookingID = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests);
		assertEquals(0, bookingID);
		bookingManagement.confirmBooking(bookingID);

		// Add customer information if this information should be modifiable in
		// the future
		bookingManagement.addCustomerInformationToBooking(bookingID, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");

		// Check the information of the booking before update
		assertEquals(bookingID, bookingManagement.getConfirmedBookings().get(0)
				.getBookingID());
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(checkOut, bookingManagement.getConfirmedBookings().get(0)
				.getCheckOut());
		assertEquals(nrOfGuests, bookingManagement.getConfirmedBookings()
				.get(0).getNumberOfGuests());

		// Update the booking using a negative value for newNumberOfGuests
		int newNrOfGuests = -5;
		assertEquals("Could not update booking since value of nrOfGuests is less than 0",
				bookingManagement.updateBooking(bookingID, 0, checkIn, checkOut,
						newNrOfGuests));

		// Check if the "updated" booking contains the desired (old) information
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(checkOut, bookingManagement.getConfirmedBookings().get(0)
				.getCheckOut());
		assertEquals(nrOfGuests, bookingManagement.getConfirmedBookings()
				.get(0).getNumberOfGuests());

		// Update the booking using a check-in date that is later than the
		// check-out date
		calCheckOut.set(2015, 0, 19, 10, 00);
		Date newCheckIn = calCheckOut.getTime();
		assertEquals(
				"Could not update booking, check-in date is later than check-out date",
				bookingManagement.updateBooking(bookingID, 0, newCheckIn,
						checkOut, nrOfGuests));

		// Check if the "updated" booking contains the desired (old) information
		assertEquals(checkIn, bookingManagement.getConfirmedBookings().get(0)
				.getCheckIn());
		assertEquals(checkOut, bookingManagement.getConfirmedBookings().get(0)
				.getCheckOut());
		assertEquals(nrOfGuests, bookingManagement.getConfirmedBookings()
				.get(0).getNumberOfGuests());
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
	public void test_valid_AddCancellationFee() {

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
		int bookingID1 = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, nrOfGuests);
		assertTrue(bookingManagement.addRoomPending(room1, bookingID1));
		assertTrue(bookingManagement.addRoomPending(room2, bookingID1));
		bookingManagement.confirmBooking(bookingID1);

		// Check that no cancellation fee as added since >24 hours left to check-in
		assertEquals(0, bookingManagement.addCancellationFee(bookingID1));

		// Increase current second by 1 to force cancellation fee to be added
		Calendar newCheckIn = Calendar.getInstance();
		newCheckIn.set(Calendar.SECOND, newCheckIn.get(Calendar.SECOND) + 1);
		Date newCheckInDate = newCheckIn.getTime();
		
		// Increase current day by 1 of check-out date so that cancellation fee will be same
		Calendar newCheckOut = Calendar.getInstance();
		newCheckOut.set(Calendar.DAY_OF_MONTH, newCheckOut.get(Calendar.DAY_OF_MONTH) + 2);
		Date newCheckOutDate = newCheckOut.getTime();

		// Create new booking to cancel
		int bookingID2 = bookingManagement.createPendingBooking(newCheckInDate,
				newCheckOutDate, nrOfGuests);
		assertTrue(bookingManagement.addRoomPending(room3, bookingID2));
		assertTrue(bookingManagement.addRoomPending(room6, bookingID2));
		bookingManagement.confirmBooking(bookingID2);
		assertEquals(2, bookingManagement.getConfirmedBookings().get(1).getRooms().size());

		// Check that cancellation fee is added since 2 hours left to check-in
		// Expected cost 700 since bill is for two nights per room
		assertEquals(700, bookingManagement.getIFinanceImpl().calculatePayment(bookingID2));
		assertEquals(700, bookingManagement.addCancellationFee(bookingID2));
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#confirmBooking(int)}.
	 * 
	 * Two pending bookings are created, and then they are confirmed in reverse
	 * order.
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
		assertEquals(1, bookingID2);
		assertEquals(2, bookingManagement.getPendingBookings().size());
		assertEquals(0, bookingManagement.getConfirmedBookings().size());
		assertEquals("Booking has been confirmed", bookingManagement.confirmBooking(bookingID2));
		assertEquals(1, bookingManagement.getPendingBookings().size());
		assertEquals(1, bookingManagement.getConfirmedBookings().size());
		assertEquals("Booking has been confirmed", bookingManagement.confirmBooking(bookingID1));
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(2, bookingManagement.getConfirmedBookings().size());
		assertEquals(numberOfGuests4, bookingManagement.getConfirmedBookings()
				.get(0).getNumberOfGuests());
		assertEquals(numberOfGuests6, bookingManagement.getConfirmedBookings()
				.get(1).getNumberOfGuests());
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#searchRoom(java.util.Date, java.util.Date, java.lang.Class, int, int, int)}
	 * 
	 * Tests if the rooms that are returned from the searchRoom method matches
	 * the parameters that are sent in.
	 * 
	 * No test to check if valid Dates are free yet.
	 * 
	 */

	@Test
	public void testSearchRoom() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();

		// Tests if returned list is correct if all parameters are entered
		// correctly

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
			RoomType typeOfRoom = bookingManagement.getRoomByID(roomID).getRoomType();
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
	 * Test method for
	 * {@link Classes.impl.IBookingManagementImplImpl#cancelBooking(int)}.
	 * 
	 * Tests if a booking is cancelled by checking that the booking is removed
	 * from the booking list (pending or confirmed) and added to the history
	 * list. It is also tested what happens when a non-existing bookingID is
	 * used as an argument. When a booking is canceled all booked dates of
	 * all associated rooms is removed. This expected behavior is also tested.
	 */
	@Test
	public void testCancelBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests4 = 4, nrOfGuests2 = 2, nrOfGuests5 = 5;
		int room1 = 1, room2 = 2, room3 = 3;
		int bookingID1 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests4);
		int bookingID2 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests2);
		int bookingID3 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests5);
		assertEquals(0, bookingID1);
		assertEquals(1, bookingID2);
		assertEquals(2, bookingID3);
		assertEquals("Booking could not be cancelled", bookingManagement.cancelBooking(3));
		assertEquals(3, bookingManagement.getPendingBookings().size());
		
		// Add rooms to the bookings so it can be tested that the rooms are made available again when bookings are canceled
		assertTrue(bookingManagement.addRoomPending(room1, bookingID1));
		assertTrue(bookingManagement.addRoomPending(room2, bookingID2));
		assertTrue(bookingManagement.addRoomPending(room3, bookingID3));
		
		// Check so that correct dates are booked for the rooms, and correct number of dates booked
		//assertEquals(2, bookingManagement.getPendingBookings().get(0).getRooms().get(0).getBookedDates().size());
		//assertEquals(0, checkIn.compareTo(bookingManagement.getPendingBookings().get(0).getRooms().get(0).getBookedDates().get(0)));
		//assertEquals(2, bookingManagement.getPendingBookings().get(2).getRooms().get(0).getBookedDates().size());
		calCheckIn.set(2015, 0, 13, 12, 00);
		checkIn = calCheckIn.getTime();
		//assertEquals(0, checkIn.compareTo(bookingManagement.getPendingBookings().get(2).getRooms().get(0).getBookedDates().get(1)));
		
		// Cancel a booking
		assertEquals("Pending booking was successfully cancelled", bookingManagement.cancelBooking(bookingID3));
		
		// Check that the room associated with the above booking contains no booked dates
		//assertEquals(0, bookingManagement.getRoom().get(2).getBookedDates().size());
		
		assertEquals(2, bookingManagement.getBookingHistory().get(0)
				.getBookingID());
		assertEquals(1, bookingManagement.getBookingHistory().size());
		assertEquals(2, bookingManagement.getPendingBookings().size());
		bookingManagement.confirmBooking(bookingID1);
		bookingManagement.confirmBooking(bookingID2);
		assertEquals("Confirmed booking was successfully cancelled", bookingManagement.cancelBooking(0));
		assertEquals(0, bookingManagement.getPendingBookings().size());
		assertEquals(1, bookingManagement.getConfirmedBookings().size());
		assertEquals(2, bookingManagement.getBookingHistory().size());
		assertEquals(0, bookingManagement.getBookingHistory().get(1)
				.getBookingID());
	}
	
	/**
	 * Tests addPendingRooms(roomID, bookingID).
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
		assertTrue(bookingManagement.addRoomPending(room1, bookingID1));
		assertEquals(room1, bookingManagement.getPendingBookings().get(0).getRooms().get(0).getRoomNumber());
		assertTrue(bookingManagement.addRoomPending(room2, bookingID1));
		assertEquals(room2, bookingManagement.getPendingBookings().get(0).getRooms().get(1).getRoomNumber());
		assertEquals(2, bookingManagement.getPendingBookings().get(0).getRooms().size());
		
		// Test when a second customer tries to book same room during same dates
		assertFalse(bookingManagement.addRoomPending(room2, bookingID2));
		assertFalse(bookingManagement.addRoomPending(room1, bookingID2));
		assertEquals(0, bookingManagement.getPendingBookings().get(1).getRooms().size());
		
		// Let second customer book available room
		assertTrue(bookingManagement.addRoomPending(room3, bookingID2));
		assertEquals(room3, bookingManagement.getPendingBookings().get(1).getRooms().get(0).getRoomNumber());
		
		// Let second customer book room1 in a new booking after first customers check-out date
		calCheckIn.set(2015, 10, 12, 12, 00);
		calCheckOut.set(2015, 10, 14, 10, 00);
		checkIn = calCheckIn.getTime();
		checkOut = calCheckOut.getTime();
		int bookingID3 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests2);
		assertTrue(bookingManagement.addRoomPending(room1, bookingID3));
		assertEquals(1, bookingManagement.getPendingBookings().get(2).getRooms().size());
		assertEquals(room1, bookingManagement.getPendingBookings().get(2).getRooms().get(0).getRoomNumber());
		
		// Let a third customer book room1 in a new booking between other customers dates
		calCheckIn.set(2015, 06, 10, 12, 00);
		calCheckOut.set(2015, 07, 17, 10, 00);
		checkIn = calCheckIn.getTime();
		checkOut = calCheckOut.getTime();
		int bookingID4 = bookingManagement.createPendingBooking(checkIn,
				checkOut, nrOfGuests2);
		assertTrue(bookingManagement.addRoomPending(room1, bookingID4));
		assertEquals(1, bookingManagement.getPendingBookings().get(3).getRooms().size());
		assertEquals(room1, bookingManagement.getPendingBookings().get(3).getRooms().get(0).getRoomNumber());
		
		
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
		assertNull(customer.getFirstName());
		assertNull(customer.getLastName());
		assertNull(customer.getEmail());
		assertNull(customer.getPhoneNumber());
		bookingManagement.addCustomerInformationToBooking(bookingID, firstName,
				lastName, email, ph);
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
		Classes.impl.IBookingManagementImplImpl pendingBooking = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		assertEquals(0, pendingBooking.getPendingBookings().size());
		Calendar calCheckIn = Calendar.getInstance();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckIn.set(2015, 0, 12, 12, 00);
		calCheckOut.set(2015, 0, 14, 10, 00);
		Date checkIn = calCheckIn.getTime();
		Date checkOut = calCheckOut.getTime();
		int nrOfGuests6 = 6;
		int bookingID1 = pendingBooking.createPendingBooking(checkIn, checkOut,
				nrOfGuests6);
		assertTrue(0 == bookingID1);
		assertEquals(1, pendingBooking.getPendingBookings().size());
		assertEquals(checkIn,
				pendingBooking.getPendingBookings().get(bookingID1)
						.getCheckIn());
		assertEquals(checkOut,
				pendingBooking.getPendingBookings().get(bookingID1)
						.getCheckOut());
		assertEquals(nrOfGuests6,
				pendingBooking.getPendingBookings().get(bookingID1)
						.getNumberOfGuests());
		int nrOfGuests4 = 4;
		int bookingID2 = pendingBooking.createPendingBooking(checkIn, checkOut,
				nrOfGuests4);
		assertTrue(1 == bookingID2);
		assertEquals(2, pendingBooking.getPendingBookings().size());
		assertEquals(checkIn,
				pendingBooking.getPendingBookings().get(bookingID2)
						.getCheckIn());
		assertEquals(checkOut,
				pendingBooking.getPendingBookings().get(bookingID2)
						.getCheckOut());
		assertEquals(nrOfGuests4,
				pendingBooking.getPendingBookings().get(bookingID2)
						.getNumberOfGuests());
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
		int room = 1;
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
		assertTrue(bookingManagement.addRoomPending(room, bookingID));

		// Check that correct rooms were added to booking so expected sum of
		// bill is correct
		assertEquals(RoomTypeName.SINGLE_ROOM, pendingBooking.getRooms().get(0)
				.getRoomType().getRoomTypeName());

		// Confirm the booking
		assertEquals("Booking has been confirmed", bookingManagement.confirmBooking(bookingID));

		// Calculate the sum of the bill, 200 is expected since 2 nights are
		// booked
		assertEquals(200,
				bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
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
	
	/**
	 * Tests both valid and invalid arguments of method
	 * addExtraCharge(int bookingID, String charge, int quantity).
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
		
		// Test some invalid arguments
		assertEquals("The quantity of the charge must be at least 1", bookingManagement.addExtraCharge(bookingID, "Breakfast", 0));
		assertEquals("Invalid charge", bookingManagement.addExtraCharge(bookingID, "Bedfast", 1));
		assertEquals("A charge must be chosen to be added", bookingManagement.addExtraCharge(bookingID, null, 1));
		assertEquals("Booking could not be found, try another bookingID", bookingManagement.addExtraCharge(3, "Breakfast", 1));
		
		// Test some valid arguments
		assertEquals("Successfully added 1 breakfast charges to bill", bookingManagement.addExtraCharge(bookingID, "Breakfast", 1));
		assertEquals("Breakfast", bookingManagement.getPendingBookings().get(0).getBill().getCharge().get(0).getChargeType().toString());
		bookingManagement.confirmBooking(bookingID);
		assertEquals(50, bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
		assertEquals("Successfully added 4 breakfast charges to bill", bookingManagement.addExtraCharge(bookingID, "Breakfast", 4));
		assertEquals(5, bookingManagement.getConfirmedBookings().get(0).getBill().getCharge().size());
		assertEquals(250, bookingManagement.getIFinanceImpl().calculatePayment(bookingID));
	}

}
