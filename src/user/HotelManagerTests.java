package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Classes.IHotelManagerImpl;
import Classes.impl.ClassesFactoryImpl;

public class HotelManagerTests {

	@Test
	public void testLogin() {
		
		IHotelManagerImpl hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		
		assertTrue(hm.isStaffMemberLoggedIn(Util.adminUsername));
		
		// TODO: next,  add a new user, and test whether you can login with this new user.
		
		assertTrue(hm.addStaffMember(Util.adminUsername, "alex4", "ankeborg4444", null, null,null,
				null, null, false));
		
		assertTrue(hm.login("alex4", "ankeborg4444"));
		assertTrue(hm.isStaffMemberLoggedIn("alex4"));
		
	}
	
	@Test
	public void testAddStaffMember() {
		IHotelManagerImpl hm = ClassesFactoryImpl.eINSTANCE.createIHotelManagerImpl();
		
		// first the admin logs in. 
		assertTrue(hm.login(Util.adminUsername, Util.adminPassword));
		
		assertTrue(hm.addStaffMember(Util.adminUsername, "alex4", "ankeborg4444", "Alexander", "Lukas", "alex4@hotmail.com",
				"552219", "Tomtebacken 14", false));
		
		assertEquals( "ankeborg4444", hm.getStaffMemberPassword("alex4"));
		assertEquals( "Alexander", hm.getStaffMemberFirstName("alex4"));
		assertEquals( "Lukas", hm.getStaffMemberLastName("alex4"));
		assertEquals( "alex4@hotmail.com", hm.getStaffMemberEmail("alex4"));
		assertEquals( "552219", hm.getStaffMemberPhoneNumber("alex4"));
		assertEquals( "Tomtebacken 14", hm.getStaffMemberAddress("alex4"));
		assertEquals( false, hm.isStaffMemberAdmin("alex4"));
		
		
		// Next, make sure that it fails when alex4 tries to add a new staff member, since he's not an admin. 	
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
	
	
}
