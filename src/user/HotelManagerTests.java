package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.ListIterator;

import org.junit.Test;

import Classes.ChargeType;
import Classes.IHotelManager;
import Classes.Room;
import Classes.RoomStatus;
import Classes.RoomTypeName;
import Classes.impl.ClassesFactoryImpl;
import Classes.impl.IHotelManagerImplImpl;

public class HotelManagerTests {

	@Test
	public void testLogin() {

		IHotelManager hm = ClassesFactoryImpl.eINSTANCE
				.createIHotelManagerImpl();

		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));

		assertTrue(hm.isStaffMemberLoggedIn(Util.adminUsername));

		// you can't login twice!
		assertFalse(hm.login(Util.adminUsername, Util.adminPassword));

		// now add a new staff member, and try to login.

		assertTrue(hm.addStaffMember(Util.adminUsername, "alex4",
				"ankeborg4444", null, null, null, null, null, false));

		assertTrue(hm.login("alex4", "ankeborg4444"));
		assertTrue(hm.isStaffMemberLoggedIn("alex4"));
	}

	@Test
	public void testLogout() {

		IHotelManager hm = ClassesFactoryImpl.eINSTANCE
				.createIHotelManagerImpl();

		// logout before being log in.
		assertFalse(hm.logout(Util.adminUsername));

		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		assertTrue(hm.logout(Util.adminUsername));

		// successfully logged out?
		assertFalse(hm.isStaffMemberLoggedIn(Util.adminUsername));
	}

	private boolean testCreateUser(String username, String password) {
		IHotelManager hm = ClassesFactoryImpl.eINSTANCE
				.createIHotelManagerImpl();

		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));

		return hm.addStaffMember(Util.adminUsername, username, password, null,
				null, null, null, null, false);
	}

	private boolean validatePassword(String password) {
		return testCreateUser("johan333", password);
	}

	private boolean validateUsername(String username) {
		return testCreateUser(username, "wert1234");
	}

	/**
	 * Test method for
	 * {@link Classes.impl.HotelManager_IHotelManagerImplImpl#isPasswordSecure(java.lang.String)}
	 * .
	 */
	@Test
	public void testIsPasswordSecure() {

		// IHotelManager hm =
		// ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();

		// TEST 1:unprintable characters, and spaces, are not allowed.

		for (int i = 0; i <= 32; ++i) {

			// The password has to be long enough, otherwise isPasswordSecure()
			// will simply do an early exit,
			// doing no further processing. Since we want to test whether it
			// accepts unprintable characters or not,
			// we need the password to be long enough.

			assertFalse(validatePassword(Util.toChar(i)
					+ Util.repeatChar('A', 10)));
		}
		// ASCII character number 127 is DEL.
		assertFalse(validatePassword(Util.toChar(127)
				+ Util.repeatChar('A', 10)));

		// //////////////////////////////////////////////////////////////////////

		// TEST 2:also, non-ascii passwords will not be allowed.

		assertFalse(validatePassword(Util.NON_ASCII_STRING1));
		assertFalse(validatePassword(Util.NON_ASCII_STRING2));

		// //////////////////////////////////////////////////////////////////////

		// TEST 3: furthermore, a password must be at least 6 characters long,
		// and must
		// have at least 2 digits and 3 letters.

		// too short
		assertFalse(validatePassword(Util.repeatChar('c', 3)
				+ Util.repeatChar('1', 2)));
		// correct length, enough letters and digits.
		assertTrue(validatePassword(Util.repeatChar('c', 3)
				+ Util.repeatChar('1', 3)));
		assertTrue(validatePassword(Util.repeatChar('c', 4)
				+ Util.repeatChar('1', 2)));
		// not enough letters, but enough digits
		assertFalse(validatePassword(Util.repeatChar('c', 2)
				+ Util.repeatChar('1', 4)));
		// enough letters, but not enough digits.
		assertFalse(validatePassword(Util.repeatChar('c', 5)
				+ Util.repeatChar('1', 1)));
	}

	/**
	 * Test method for
	 * {@link Classes.impl.HotelManager_IHotelManagerImplImpl#isValidUsername(java.lang.String)}
	 * .
	 */
	@Test
	public void testIsValidUsername() {

		// Only ASCII letters and digits are allowed in user names.

		assertFalse(validateUsername(Util.NON_ASCII_STRING1));
		assertFalse(validateUsername(Util.NON_ASCII_STRING2));

		// Unprintable ASCII characters are not allowed.
		for (int i = 0; i <= 32; ++i) {

			// The password has to be long enough, otherwise isPasswordSecure()
			// will simply do an early exit,
			// doing no further processing. Since we want to test whether it
			// accepts unprintable characters or not,
			// we need the password to be long enough.
			assertFalse(validateUsername(Util.toChar(i)));
		}
		// ASCII character number 127 is DEL.
		assertFalse(validateUsername(Util.toChar(127)));

		assertTrue(validateUsername("eric44"));
		assertTrue(validateUsername("hunter2"));
		assertTrue(validateUsername("name23242"));
	}

	@Test
	public void testIsPasswordSecureCustom() {

		// By overriding isPasswordSecure, you provide use a custom
		// implementation for the password security validation.
		// in this test, we tests whether the hotel manager will actually use
		// this implementation.

		IHotelManager hm = new IHotelManagerImplImpl() {

			public boolean isPasswordSecure(String password) {
				// only this password will be accepted :D
				return "hunter2".equals(password);
			}

		};

		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));

		assertFalse(hm.addStaffMember(Util.adminUsername, "pelle4", "wert1234",
				null, null, null, null, null, false));

		assertTrue(hm.addStaffMember(Util.adminUsername, "pelle4", "hunter2",
				null, null, null, null, null, false));
	}

	@Test
	public void testIsUsernameValidCustom() {

		// By overriding isUsernameSecure, you can provide a custom
		// implementation for the username validation.
		// in this test, we tests whether the hotel manager will actually use
		// this implementation.

		IHotelManager hm = new IHotelManagerImplImpl() {

			public boolean isValidUsername(String password) {
				// only this username will be accepted :D
				return "pelle78".equals(password);
			}

		};

		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));

		assertFalse(hm.addStaffMember(Util.adminUsername, "pelle79",
				"wert1234", null, null, null, null, null, false));

		assertTrue(hm.addStaffMember(Util.adminUsername, "pelle78", "wert1234",
				null, null, null, null, null, false));
	}

	/**
	 * Test method for
	 * {@link Classes.impl.HotelManager_IHotelManagerImplImpl#ChangeStatusOfRoom(int, Enum)}
	 * .
	 */
	@Test
	public void testChangeStatusOfRoom() {

		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		IHotelManager hotelManagement = bookingManagement
				.getIHotelManagerImpl();
		int room1 = 1;

		assertNotNull(hotelManagement);
		assertTrue(hotelManagement
				.login(Util.adminUsername, Util.adminPassword));

		// Check that the room has its default status
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room1)
				.getStatus());

		// Change status of room to the different types that are available for
		// choosing
		assertEquals("Changed status of room 1 to Cleaning",
				hotelManagement.changeStatusOfRoom(room1, "Cleaning",
						Util.adminUsername));
		assertEquals(RoomStatus.CLEANING, bookingManagement.getRoomByID(room1)
				.getStatus());
		assertEquals("Changed status of room 1 to Available",
				hotelManagement.changeStatusOfRoom(room1, "Available",
						Util.adminUsername));
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room1)
				.getStatus());
		assertEquals("Changed status of room 1 to Occupied",
				hotelManagement.changeStatusOfRoom(room1, "Occupied",
						Util.adminUsername));
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room1)
				.getStatus());

		// Test what happens if a non-existing room status is entered
		assertEquals("Status of room could not be changed",
				hotelManagement.changeStatusOfRoom(room1, "NONEXISTENT",
						Util.adminUsername));
		// Check that the room's status is still the same as before
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room1)
				.getStatus());
	}

	/**
	 * Test method for
	 * {@link Classes.impl.IHotelManagerImplImpl#checkIn(java.lang.Class)}.
	 * 
	 * Tests both valid and invalid uses of getBooking(roomID) and
	 * getBooking(bookingID)
	 */
	@Test
	public void test_CheckInBooking() {
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		IHotelManager hotelManagement = bookingManagement
				.getIHotelManagerImpl();
		int room1 = 1, room2 = 2, room3 = 3;
		Calendar checkIn = Calendar.getInstance();
		Calendar checkOut = Calendar.getInstance();

		assertNotNull(hotelManagement);
		assertTrue(hotelManagement
				.login(Util.adminUsername, Util.adminPassword));

		// Set room to Occupied and check that it is not possible to check-in
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room1)
				.getStatus());
		assertEquals("Changed status of room 1 to Occupied",
				hotelManagement.changeStatusOfRoom(room1, "Occupied",
						Util.adminUsername));
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room1)
				.getStatus());

		// Check in to a room (the room must have been booked for that date)
		checkIn.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, 12,
				00);
		checkOut.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH + 1,
				10, 00);
		Date checkInDate = checkIn.getTime();
		Date checkOutDate = checkOut.getTime();
		int nrOfGuests1 = 1;

		// Set room status to Available to make it possible to check-in
		assertEquals("Changed status of room 1 to Available",
				hotelManagement.changeStatusOfRoom(room1, "Available",
						Util.adminUsername));
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room1)
				.getStatus());

		// Create a booking
		int bookingID1 = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, nrOfGuests1);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID1));
		bookingManagement.addCustomerInformationToBooking(bookingID1, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		assertEquals("Booking has been confirmed",
				bookingManagement.confirmBooking(bookingID1));
		assertTrue(checkInDate.compareTo(bookingManagement.getRoomByID(room1)
				.getBookings().get(0).getCheckIn()) == 0);

		// Check that booking is associated with room
		assertEquals(1, bookingManagement.getRoomByID(room1).getBookings()
				.size());

		assertEquals("Changed status of room 1 to Occupied",
				hotelManagement.changeStatusOfRoom(room1, "Occupied",
						Util.adminUsername));

		// Make new booking containing several rooms
		int nrOfGuests2 = 2;
		int bookingID2 = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, nrOfGuests2);
		// Add room1 for this booking also, and during same dates as first
		// booking
		assertEquals("Room 1 could not be added since already booked",
				bookingManagement.addRoomPending(room1, bookingID2));
		assertEquals("Room 2 was successfully added to pending booking",
				bookingManagement.addRoomPending(room2, bookingID2));
		assertEquals("Room 3 was successfully added to pending booking",
				bookingManagement.addRoomPending(room3, bookingID2));
		bookingManagement.addCustomerInformationToBooking(bookingID2, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		bookingManagement.confirmBooking(bookingID2);

		// Check that room1 was not added to bookingID2 since that date is
		// already booked
		assertEquals(1, bookingManagement.getRoomByID(room1).getBookings()
				.size());
		assertTrue(checkInDate.compareTo(bookingManagement.getRoomByID(room2)
				.getBookings().get(0).getCheckIn()) == 0);

		// Check in
		assertEquals("Checked in successfully to rooms [2, 3]",
				hotelManagement.checkInBooking(bookingID2, Util.adminUsername));
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room1)
				.getStatus());
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room2)
				.getStatus());
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room3)
				.getStatus());

		// Staff changes status of all three rooms to Available so all can be
		// checked in
		assertEquals("Changed status of room 1 to Available",
				hotelManagement.changeStatusOfRoom(room1, "Available",
						Util.adminUsername));
		assertEquals("Changed status of room 2 to Available",
				hotelManagement.changeStatusOfRoom(room2, "Available",
						Util.adminUsername));
		assertEquals("Changed status of room 3 to Available",
				hotelManagement.changeStatusOfRoom(room3, "Available",
						Util.adminUsername));

		// Set status of room3 to cleaning so customer cannot be checked in to
		// that room
		assertEquals("Changed status of room 3 to Cleaning",
				hotelManagement.changeStatusOfRoom(room3, "Cleaning",
						Util.adminUsername));

		// Check in bookingID2 again
		assertEquals("Failed to check in to rooms [3]",
				hotelManagement.checkInBooking(bookingID2, Util.adminUsername));
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room1)
				.getStatus());
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room2)
				.getStatus());
		assertEquals(RoomStatus.CLEANING, bookingManagement.getRoomByID(room3)
				.getStatus());

		// Try to check in using a non-existing bookingID
		int bookingID3 = 3;
		assertEquals("Booking was not found, please try another bookingID",
				hotelManagement.checkInBooking(bookingID3, Util.adminUsername));
	}

	/**
	 * Test valid and invalid use of checkOut(bookingID).
	 */
	@Test
	public void testCheckOut() {

		// Set up a booking and check in first
		Classes.impl.IBookingManagementImplImpl bookingManagement = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		IHotelManager hotelManagement = bookingManagement
				.getIHotelManagerImpl();
		assertTrue(hotelManagement
				.login(Util.adminUsername, Util.adminPassword));
		int room1 = 1, room2 = 2, room3 = 3;
		assertEquals(6, bookingManagement.getRoom().size());
		Calendar checkIn = Calendar.getInstance();
		Calendar checkOut = Calendar.getInstance();
		checkIn.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, 12,
				00);
		checkOut.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH + 2,
				10, 00);
		Date checkInDate = checkIn.getTime();
		Date checkOutDate = checkOut.getTime();
		int nrOfGuests1 = 1;
		int bookingID1 = bookingManagement.createPendingBooking(checkInDate,
				checkOutDate, nrOfGuests1);
		assertEquals("Room 1 was successfully added to pending booking",
				bookingManagement.addRoomPending(room1, bookingID1));
		assertEquals("Room 2 was successfully added to pending booking",
				bookingManagement.addRoomPending(room2, bookingID1));
		assertEquals("Room 3 was successfully added to pending booking",
				bookingManagement.addRoomPending(room3, bookingID1));
		bookingManagement.addCustomerInformationToBooking(bookingID1, "Helly",
				"Hansen", "helly.hansen@gmail.com", "0734321234");
		assertEquals("Booking has been confirmed",
				bookingManagement.confirmBooking(bookingID1));

		// Check in
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room1)
				.getStatus());
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room2)
				.getStatus());
		assertEquals(RoomStatus.AVAILABLE, bookingManagement.getRoomByID(room3)
				.getStatus());
		assertEquals("Checked in successfully to rooms [1, 2, 3]",
				hotelManagement.checkInBooking(bookingID1, Util.adminUsername));
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room1)
				.getStatus());
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room2)
				.getStatus());
		assertEquals(RoomStatus.OCCUPIED, bookingManagement.getRoomByID(room3)
				.getStatus());

		// Try to check out using a non-existing bookingID
		assertEquals("Check-out failed, booking could not be found",
				hotelManagement.checkOut(5, Util.adminUsername));

		// Try to check out before the check in date of the booking
		checkIn.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH + 1,
				12, 00);
		checkInDate = checkIn.getTime();
		bookingManagement.getConfirmedBookings().get(0).setCheckIn(checkInDate);
		assertEquals(
				"Cannot perform check-out before the booking's check-in date",
				hotelManagement.checkOut(bookingID1, Util.adminUsername));

		// Try to check out without having paid the bill
		checkIn.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH - 1,
				12, 00);
		checkInDate = checkIn.getTime();
		bookingManagement.getConfirmedBookings().get(0).setCheckIn(checkInDate);
		assertEquals("Check-out failed, bill has not been fully paid yet",
				hotelManagement.checkOut(bookingID1, Util.adminUsername));

		// try to check out from a room (booking) that has not yet been checked
		// in.
		assertEquals("Changed status of room 1 to Available",
				hotelManagement.changeStatusOfRoom(room1, "Available",
						Util.adminUsername));
		assertEquals("Changed status of room 2 to Available",
				hotelManagement.changeStatusOfRoom(room2, "Available",
						Util.adminUsername));
		assertEquals("Changed status of room 3 to Available",
				hotelManagement.changeStatusOfRoom(room3, "Available",
						Util.adminUsername));
		assertEquals("Cannot check out from a room that is not checked in",
				hotelManagement.checkOut(bookingID1, Util.adminUsername));
		assertEquals("Changed status of room 1 to Occupied",
				hotelManagement.changeStatusOfRoom(room1, "Occupied",
						Util.adminUsername));
		assertEquals("Changed status of room 2 to Occupied",
				hotelManagement.changeStatusOfRoom(room2, "Occupied",
						Util.adminUsername));
		assertEquals("Changed status of room 3 to Occupied",
				hotelManagement.changeStatusOfRoom(room3, "Occupied",
						Util.adminUsername));

		// Try to check out after the check-out time (for the first time)
		checkIn.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH - 2,
				12, 00);
		checkInDate = checkIn.getTime();
		checkOut.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH - 1,
				12, 00);
		checkOutDate = checkIn.getTime();
		bookingManagement.getConfirmedBookings().get(0).setCheckIn(checkInDate);
		bookingManagement.getConfirmedBookings().get(0)
				.setCheckOut(checkOutDate);
		assertEquals(6, bookingManagement.getConfirmedBookings().get(0)
				.getBill().getCharge().size());
		assertEquals(
				"Check-out performed after check-out time, Late check-out fee added to bill",
				hotelManagement.checkOut(bookingID1, Util.adminUsername));
		assertEquals(7, bookingManagement.getConfirmedBookings().get(0)
				.getBill().getCharge().size());

		// Try to check out after the check-out time (for the second time)
		assertEquals("Check out failed, Late-check-out fee has not been paid",
				hotelManagement.checkOut(bookingID1, Util.adminUsername));
		assertEquals(ChargeType.LATE_CHECK_OUT_FEE, bookingManagement
				.getConfirmedBookings().get(0).getBill().getCharge().get(6)
				.getChargeType());
		assertEquals(100, bookingManagement.getConfirmedBookings().get(0)
				.getBill().getCharge().get(6).getAmount());

		// Try to check out after the bill has been paid
		int nrOfCharges = 7;
		for (int i = 0; i < nrOfCharges; i++) {
			bookingManagement.getConfirmedBookings().get(0).getBill()
					.getCharge().get(i).setAmount(0);
		}
		assertEquals(0, bookingManagement.getConfirmedBookings().get(0)
				.getBill().getCharge().get(6).getAmount());
		assertEquals("Check-out was successful",
				hotelManagement.checkOut(bookingID1, Util.adminUsername));
	}

	

}
