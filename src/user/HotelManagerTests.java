package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Classes.IHotelManager;
import Classes.RoomStatus;
import Classes.impl.ClassesFactoryImpl;
import Classes.impl.IHotelManagerImplImpl;

public class HotelManagerTests {

	@Test
	public void testLogin() {
		
		IHotelManager hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		
		assertTrue(hm.isStaffMemberLoggedIn(Util.adminUsername));
		
		// you can't login twice!
		assertFalse(hm.login(Util.adminUsername, Util.adminPassword));
		
		
		// now add a new staff member, and try to login.
		
		assertTrue(hm.addStaffMember(Util.adminUsername, "alex4", "ankeborg4444", null, null,null,
				null, null, false));
		
		assertTrue(hm.login("alex4", "ankeborg4444"));
		assertTrue(hm.isStaffMemberLoggedIn("alex4"));	
	}
	
	@Test
	public void testLogout() {
		
		IHotelManager hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		// logout before being log in.
		assertFalse(hm.logout(Util.adminUsername));
		
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		assertTrue(hm.logout(Util.adminUsername));
		
		// successfully logged out?
		assertFalse(hm.isStaffMemberLoggedIn(Util.adminUsername));	
	}
	

	private boolean testCreateUser(String username, String password) {
		IHotelManager hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		
		return hm.addStaffMember(Util.adminUsername, username, password, null,null, null, null,
				null, false);
	}
	
	private boolean validatePassword(String password) {
		return testCreateUser("johan333", password);
	}
	
	private boolean validateUsername(String username) {
		return testCreateUser(username, "wert1234");
	}
		
	
	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#isPasswordSecure(java.lang.String)}.
	 */
	@Test
	public void testIsPasswordSecure() {
		
		//IHotelManager hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		// TEST 1:unprintable characters, and spaces, are not allowed. 
		
		for(int i = 0; i <= 32; ++i) {
			
			// The password has to be long enough, otherwise isPasswordSecure() will simply do an early exit, 
			// doing no further processing. Since we want to test whether it accepts unprintable characters or not, 
			// we need the password to be long enough.
			
			
			assertFalse(validatePassword(Util.toChar(i) + Util.repeatChar('A', 10)));
		}
		// ASCII character number 127 is DEL. 
		assertFalse(validatePassword(Util.toChar(127) + Util.repeatChar('A', 10)));
		
		////////////////////////////////////////////////////////////////////////
		
		
		// TEST 2:also, non-ascii passwords will not be allowed.
		
		assertFalse(validatePassword(Util.NON_ASCII_STRING1));
		assertFalse(validatePassword(Util.NON_ASCII_STRING2));
		
		////////////////////////////////////////////////////////////////////////
		
		
		// TEST 3: furthermore, a password must be at least 6 characters long, and must
		// have at least 2 digits and 3 letters. 
		
		// too short
		assertFalse(validatePassword( Util.repeatChar('c', 3)+  Util.repeatChar('1', 2) ));
		// correct length, enough letters and digits.
		assertTrue(validatePassword( Util.repeatChar('c', 3)+  Util.repeatChar('1', 3)));
		assertTrue(validatePassword( Util.repeatChar('c', 4)+  Util.repeatChar('1', 2)));
		//  not enough letters, but enough digits
		assertFalse(validatePassword( Util.repeatChar('c', 2)+  Util.repeatChar('1', 4)));
		// enough letters, but not enough digits.
		assertFalse(validatePassword( Util.repeatChar('c', 5)+  Util.repeatChar('1', 1)));
	}
	
	/**
	 *  Test method for {@link Classes.impl.HotelManager_IHotelManagerImplImpl#isValidUsername(java.lang.String)}.
	 */
	@Test
	public void testIsValidUsername() {
	
		
		
		// Only ASCII letters and digits are allowed in user names.
		
		assertFalse(validateUsername(Util.NON_ASCII_STRING1));
		assertFalse(validateUsername(Util.NON_ASCII_STRING2));
		
		// Unprintable ASCII characters are not allowed.
		for(int i = 0; i <= 32; ++i) {
			
			// The password has to be long enough, otherwise isPasswordSecure() will simply do an early exit, 
			// doing no further processing. Since we want to test whether it accepts unprintable characters or not, 
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
		
		// By overriding isPasswordSecure, you provide use a custom implementation for the password security validation. 
		// in this test, we tests whether the hotel manager will actually use this implementation.
	
		IHotelManager hm =  new IHotelManagerImplImpl(){
			
			public boolean isPasswordSecure(String password) {
				// only this password will be accepted :D 
				return "hunter2".equals(password);
			}
		
		};
		
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		
		
		assertFalse(hm.addStaffMember(Util.adminUsername, "pelle4", "wert1234", null,null, null, null,
				null, false));
	
		assertTrue(hm.addStaffMember(Util.adminUsername, "pelle4", "hunter2", null,null, null, null,
				null, false));	
	}
	
	@Test
	public void testIsUsernameValidCustom() {
		
		// By overriding isUsernameSecure, you can provide a custom implementation for the username validation. 
		// in this test, we tests whether the hotel manager will actually use this implementation.
	
		IHotelManager hm =  new IHotelManagerImplImpl(){
			
			public boolean isValidUsername(String password) {
				// only this username will be accepted :D 
				return "pelle78".equals(password);
			}
		
		};
		
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		
		assertFalse(hm.addStaffMember(Util.adminUsername, "pelle79", "wert1234", null,null, null, null,
				null, false));
	
		assertTrue(hm.addStaffMember(Util.adminUsername, "pelle78", "wert1234", null,null, null, null,
				null, false));	
	}

	/**
	 * Test method for
	 * {@link Classes.impl.HotelManager_IHotelManagerImplImpl#ChangeStatusOfRoom(int, Enum)}
	 * .
	 */
	@Test
	public void testChangeStatusOfRoom() {

		Classes.impl.IBookingManagementImplImpl bm = Classes.impl.IBookingManagementImplImpl
				.instantiateForTest();
		IHotelManager hm = bm.getIHotelManagerImpl();

		assertNotNull(hm);

		assertEquals(RoomStatus.AVAILABLE, bm.getRoomByID(1).getStatus());

		// try to change status when admin is logged out:
		//assertFalse(bm.changeStatusOfRoom(Util.adminUsername, 1,
		//		RoomStatus.CLEANING));
		// status should be unchanged.
		assertEquals(RoomStatus.AVAILABLE, bm.getRoomByID(1).getStatus());

		// now login and try again!
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		//assertTrue(bm.changeStatusOfRoom(Util.adminUsername, 1,
		//		RoomStatus.CLEANING));
		assertEquals(RoomStatus.CLEANING, bm.getRoomByID(1).getStatus());

		// Next, make sure that a staff member that is not admin can also change
		// status of room.
		assertTrue(hm.addStaffMember(Util.adminUsername, "alex4",
				"ankeborg4444", "Alexander", "Lukas", "alex4@hotmail.com",
				"552219", "Tomtebacken 14", false));
		assertTrue(hm.login("alex4", "ankeborg4444"));
		//assertTrue(bm.changeStatusOfRoom("alex4", 1, RoomStatus.AVAILABLE));
		assertEquals(RoomStatus.AVAILABLE, bm.getRoomByID(1).getStatus());
	}
	
}
