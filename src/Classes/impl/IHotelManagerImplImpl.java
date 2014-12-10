/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.IHotelManagerImpl;
import Classes.Staff;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

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

	private ArrayList<Staff> staffMembers;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IHotelManagerImplImpl() {
		super();
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
	 * @generated
	 */
	public boolean login(String username, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addStaffMember(String adminUsername, String username, String password, String firstName, String secondName, String email, String phoneNumber) {
		
		// TODO: lookup adminUsername and check admin privileges (findStaff is not implemented or defined anywhere)
		StaffImpl adminStaffMember = null; /*findStaff(adminUsername)*/;
		
		if ( adminStaffMember == null ) {
			return false;
		} else if ( adminStaffMember.isAdmin() ) {
			return false;
		} else {
			
			if(isPasswordSecure(password) || isValidUsername(username)) {
				return false;
			}
			
			// TODO: persist object within runtime somewhere!		
			Staff newStaffMember = ClassesFactoryImpl.eINSTANCE.createStaff();
			
			newStaffMember.setUserId(username);
			newStaffMember.setPassword(password);
			// TODO: set firstName, secondName, email, phoneNumber
			
			return true;
			
		}

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList findStaffMember(String username, String firstName, String secondName, String email, String phoneNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<Staff> searchResult = new BasicEList<Staff>();
		
		for(int i = 0; i  < this.staffMembers.size(); ++i) {
			Staff s = this.staffMembers.get(i);
			
		}
		
		return searchResult;
		
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
			case ClassesPackage.IHOTEL_MANAGER_IMPL___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING:
				return addStaffMember((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //IHotelManagerImplImpl
