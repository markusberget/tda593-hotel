/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.IHotelManagerImpl;
import Classes.StaffMember;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IHotel Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IHotelManagerImplImpl extends MinimalEObjectImpl.Container implements IHotelManagerImpl {

	private Map<String, StaffMember> staffMembers;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IHotelManagerImplImpl() {
		super();
		
		this.staffMembers = new HashMap<String, StaffMember>();	
		
		// add an admin for testing purposes. 
		StaffMember newStaffMember = ClassesFactoryImpl.eINSTANCE.createStaffMember();
		newStaffMember.setUsername("pelle");
		newStaffMember.setPassword("hunter2");
		newStaffMember.setFirstName("Pelle");
		newStaffMember.setLastName("Svantesson");
		newStaffMember.setEmail("pelle2@hotmail.com");
		newStaffMember.setPhoneNumber("33449");
		newStaffMember.setAddress("Aprilvägen 12");
		newStaffMember.setAdmin(true);
		
		this.staffMembers.put(newStaffMember.getUsername(), newStaffMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.IHOTEL_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean login(String username, String password) {
		StaffMember s = this.staffMembers.get(username);
		
		if(s == null) return false;
		
		if(s.getPassword().equals(password)) {
			s.setIsLoggedIn(true);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public boolean addStaffMember(String adminUsername, String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, boolean admin) {
			
		// is the adding user logged in?
		if(!isStaffMemberLoggedIn(adminUsername)) {
			return false;
		}
		
		// is the adding user actually an admin?
		if(!isStaffMemberAdmin(adminUsername)) {
			return false;
		}
		
		if(!isPasswordSecure(password) || !isValidUsername(username)) {
			return false;
		
		}
		
		// Both the new username and password are fine! Create the new user:
		

		StaffMember newStaffMember = ClassesFactoryImpl.eINSTANCE.createStaffMember();

		newStaffMember.setUsername(username);
		newStaffMember.setPassword(password);
		newStaffMember.setFirstName(firstName);
		newStaffMember.setLastName(lastName);
		newStaffMember.setEmail(email);
		newStaffMember.setPhoneNumber(phoneNumber);
		newStaffMember.setAddress(address);
		newStaffMember.setAdmin(admin);
		
		staffMembers.put(newStaffMember.getUsername(), newStaffMember);
		return true;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPasswordSecure(String password) {
		
		int numDigits = 0;
		int numLetters = 0;
		
		if(password.length() < 6) {
			// password is not long enough, so early exit. 
			return false;
		}
		
		for(char ch : password.toCharArray()) {
			if(!(ch > 32 && ch < 127)) {
				
				// we won't allow unprintable ascii characters nor spaces.
				// For more information: http://www.asciitable.com/
				return false;
			} 
			
			// if digit.
			if(ch >= 48 && ch <= 57) {
				++numDigits;
			} else if(( 65 <= ch && ch <= 90) || ( 97 <= ch && ch <= 122)) {
				++numLetters;
			}
			
		}
		
		// does the string fulfill the requirements?
		return (numDigits >= 2) && (numLetters >= 3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isValidUsername(String username) {
		for(char ch : username.toCharArray()) {
			if(!( 
					(48 <= ch && ch <= 57) ||
					( 65 <= ch && ch <= 90) || 
					( 97 <= ch && ch <= 122))) {
				
				// characters that are not ASCII letters nor digits are not allowed:			
				return false;
			} 
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean changeStatusOfRoom(int roomId, Enumerator status) {
		// TODO: lookup roomId (findRoom is not implemented or defined anywhere)
		RoomImpl room = null;/*findRoom( roomId )*/;
		
		if ( room != null ) {
			
			// TODO: setStatusoccupiedreadypending takes a boolean that specifies whether
			// the status of the room is pending.
			// However, changeStatusOfRoom is supposed to set whether the room is occupied, under maintenance, and so on.
			// So the method setStatusoccupiedreadypending should probably not be used here.
			
			//room.setStatusoccupiedreadypending(status);
			return true;
			
		} else {
			return false;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPossibleRoomStatuses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	/**
	 * If substr can be found in s, return true. The comparison is case insensitive. 
	 */
	private static boolean contains(String s, String substr) {
		return s.toLowerCase().contains(substr.toLowerCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * The search works as following: If a parameter is null, that parameter ignored. If a parameter is non-null,
	 * then the search will match all staff members whose corresponding attribute contains a substring of that parameter.
	 * If several parameters are non-null, then all the non-null parameters must match. Only staff members for which
	 * all the non-null parameters match will be returned by this function.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList findStaffMember(String username, String firstName, String secondName, String email, String phoneNumber) {
		EList<StaffMember> searchResult = new BasicEList<StaffMember>();
		
		for(StaffMember s: this.staffMembers.values()) {
		
			if(username != null) {
				if(!contains(s.getUsername(), username)) {
					// this parameter didn't match, so this staff member won't be returned.
					// try for the next staff member in the list!
					continue;
				}
			}
			
			if(firstName != null) {
				if(!contains(s.getFirstName(), firstName)) {
					continue;
				}
			}
			
			if(secondName != null) {
				if(!contains(s.getLastName(), secondName)) {
					continue;
				}
			}
			
			if(email != null) {
				if(!contains(s.getEmail(), email)) {
					continue;
				}
			}
			
			if(phoneNumber != null) {
				if(!contains(s.getPhoneNumber(), phoneNumber)) {
					continue;
				}
			}
			
			// Passed all the tests, so add
			searchResult.add(s);
		}
		
		return searchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isStaffMemberLoggedIn(String username) {
		StaffMember s = this.staffMembers.get(username);
		return s == null ? false : s.isLoggedIn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public boolean isStaffMemberAdmin(String username) {
		StaffMember s = this.staffMembers.get(username);
		return s == null ? false : s.isAdmin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberPassword(String username) {
		StaffMember s = this.staffMembers.get(username);
		return  s == null ? null : s.getPassword();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassesPackage.IHOTEL_MANAGER_IMPL___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_BOOLEAN:
				return addStaffMember((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (Boolean)arguments.get(8));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_PASSWORD_SECURE__STRING:
				return isPasswordSecure((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_VALID_USERNAME__STRING:
				return isValidUsername((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR:
				return changeStatusOfRoom((Integer)arguments.get(0), (Enumerator)arguments.get(1));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_POSSIBLE_ROOM_STATUSES:
				return getPossibleRoomStatuses();
			case ClassesPackage.IHOTEL_MANAGER_IMPL___FIND_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING:
				return findStaffMember((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_LOGGED_IN__STRING:
				return isStaffMemberLoggedIn((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_ADMIN__STRING:
				return isStaffMemberAdmin((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_PASSWORD__STRING:
				return getStaffMemberPassword((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IHotelManagerImplImpl
