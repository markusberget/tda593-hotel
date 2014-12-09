package user;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Classes.IHotelManagerImpl;
import Classes.impl.ClassesFactoryImpl;

/**
 * This class simulates a user and contains
 * both valid and invalid uses of the system (based
 * on our use cases, among other things). At the moment
 * the class only contains test stubs for methods a user
 * of the system is allowed to invoke (some of which only
 * a staff member are allowed to invoke). 
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
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Classes.impl.IBookingManagementImplImpl#createPendingBooking(java.util.Date, java.util.Date, int)}.
	 */
	@Test
	public void testCreatePendingBooking() {
		fail("Not yet implemented");
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
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#login(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}
	
	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#addStaffMember(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddStaffMember() {
		fail("Not yet implemented");
	}
	

	
	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#isPasswordSecure(java.lang.String)}.
	 */
	@Test
	public void testIsPasswordSecure() {
		
		IHotelManagerImpl hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		// TEST 1:unprintable characters, and spaces, are not allowed. 
		
		for(int i = 0; i <= 32; ++i) {
			
			// The password has to be long enough, otherwise isPasswordSecure() will simply do an early exit, 
			// doing no further processing. Since we want to test whether it accepts unprintable characters or not, 
			// we need the password to be long enough.
			assertFalse(hm.isPasswordSecure(Util.toChar(i) + Util.repeatChar('A', 10)));
		}
		// ASCII character number 127 is DEL. 
		assertFalse(hm.isPasswordSecure(Util.toChar(127) + Util.repeatChar('A', 10)));
		
		////////////////////////////////////////////////////////////////////////
		
		
		// TEST 2:also, non-ascii passwords will not be allowed.
		
		assertFalse(hm.isPasswordSecure(Util.NON_ASCII_STRING1));
		assertFalse(hm.isPasswordSecure(Util.NON_ASCII_STRING2));
		
		////////////////////////////////////////////////////////////////////////
		
		
		// TEST 3: furthermore, a password must be at least 6 characters long, and must
		// have at least 2 digits and 3 letters. 
		
		// too short
		assertFalse(hm.isPasswordSecure( Util.repeatChar('c', 3)+  Util.repeatChar('1', 2) ));
		// correct length, enough letters and digits.
		assertTrue(hm.isPasswordSecure( Util.repeatChar('c', 3)+  Util.repeatChar('1', 3)));
		assertTrue(hm.isPasswordSecure( Util.repeatChar('c', 4)+  Util.repeatChar('1', 2)));
		//  not enough letters, but enough digits
		assertFalse(hm.isPasswordSecure( Util.repeatChar('c', 2)+  Util.repeatChar('1', 4)));
		// enough letters, but not enough digits.
		assertFalse(hm.isPasswordSecure( Util.repeatChar('c', 5)+  Util.repeatChar('1', 1)));
	}
	
	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#isValidUsername(java.lang.String)}.
	 */
	@Test
	public void testIsValidUsername() {
	
		IHotelManagerImpl hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		
		// Only ASCII letters and digits are allowed in user names.
		
		assertFalse(hm.isValidUsername(Util.NON_ASCII_STRING1));
		assertFalse(hm.isValidUsername(Util.NON_ASCII_STRING2));
		
		// Unprintable ASCII characters are not allowed.
		for(int i = 0; i <= 32; ++i) {
			
			// The password has to be long enough, otherwise isPasswordSecure() will simply do an early exit, 
			// doing no further processing. Since we want to test whether it accepts unprintable characters or not, 
			// we need the password to be long enough.
			assertFalse(hm.isValidUsername(Util.toChar(i)));
		}
		// ASCII character number 127 is DEL. 
		assertFalse(hm.isValidUsername(Util.toChar(127)));
		
		assertTrue(hm.isValidUsername("eric44"));
		assertTrue(hm.isValidUsername("hunter2"));
		assertTrue(hm.isValidUsername("name23242"));
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
