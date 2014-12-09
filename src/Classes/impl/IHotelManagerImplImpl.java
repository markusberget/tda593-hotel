/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.IHotelManagerImpl;

import java.lang.reflect.InvocationTargetException;

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
	 * @generated
	 */
	public boolean addStaffMember(String adminUsername, String username, String password, String firstName, String secondName, String email, String phoneNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public boolean changeStatusOfRoom(int roomId, Enumerator status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //IHotelManagerImplImpl
