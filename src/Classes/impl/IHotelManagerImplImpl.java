/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.IBookingManagementImpl;
import Classes.IHotelManagerImpl;
import Classes.StaffMember;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IHotel Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.IHotelManagerImplImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link Classes.impl.IHotelManagerImplImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IHotelManagerImplImpl extends MinimalEObjectImpl.Container implements IHotelManagerImpl {

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffMember> staff;
	/**
	 * The cached value of the '{@link #getIBookingManagementImpl() <em>IBooking Management Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBookingManagementImpl()
	 * @generated
	 * @ordered
	 */
	protected IBookingManagementImpl iBookingManagementImpl;
	//private Map<String, StaffMember> staffMembers;
	
	
	/**
	 * If you don't know what you're doing, don't FUCKING change these methods. 
	 */
	private void internal_addStaffMember(StaffMember newStaff) {
		staff.add(newStaff);
	}
	private StaffMember internal_lookupStaffMember(String username) {
		for(StaffMember s : staff) {
			if(s.getUsername().equals(username)) {
				return s;
			}
		}
		
		return null;
	}
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IHotelManagerImplImpl() {
		super();
		
		//this.staffMembers = new HashMap<String, StaffMember>();	
		this.staff = new BasicEList<StaffMember>();
		
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
		
		this.internal_addStaffMember(newStaffMember);
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
	public EList<StaffMember> getStaff() {
		if (staff == null) {
			staff = new EObjectResolvingEList<StaffMember>(StaffMember.class, this, ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManagementImpl getIBookingManagementImpl() {
		if (iBookingManagementImpl != null && iBookingManagementImpl.eIsProxy()) {
			InternalEObject oldIBookingManagementImpl = (InternalEObject)iBookingManagementImpl;
			iBookingManagementImpl = (IBookingManagementImpl)eResolveProxy(oldIBookingManagementImpl);
			if (iBookingManagementImpl != oldIBookingManagementImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, iBookingManagementImpl));
			}
		}
		return iBookingManagementImpl;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManagementImpl basicGetIBookingManagementImpl() {
		return iBookingManagementImpl;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBookingManagementImpl(IBookingManagementImpl newIBookingManagementImpl) {
		IBookingManagementImpl oldIBookingManagementImpl = iBookingManagementImpl;
		iBookingManagementImpl = newIBookingManagementImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, iBookingManagementImpl));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean login(String username, String password) {
		StaffMember s = this.internal_lookupStaffMember(username);
			
		if(s == null) return false;
		
		if(s.isLoggedIn()) {
			// can't login twice! 
			return false;
		}
		
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
		
		this.internal_addStaffMember(newStaffMember);
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
		
		for(StaffMember s: this.staff) {
		
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
		StaffMember s = this.internal_lookupStaffMember(username);
		return s == null ? false : s.isLoggedIn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public boolean isStaffMemberAdmin(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return s == null ? false : s.isAdmin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberPassword(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getPassword();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberFirstName(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getFirstName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberLastName(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getLastName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberEmail(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getEmail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberPhoneNumber(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getPhoneNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberAddress(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getAddress();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean logout(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		
		if(s == null) return false;
		
		if(s.isLoggedIn()) {
			s.setIsLoggedIn(false);
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
	public boolean isExistingStaffMember(String username) {
		return this.internal_lookupStaffMember(username) != null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				return getStaff();
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				if (resolve) return getIBookingManagementImpl();
				return basicGetIBookingManagementImpl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends StaffMember>)newValue);
				return;
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				getStaff().clear();
				return;
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				return staff != null && !staff.isEmpty();
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				return iBookingManagementImpl != null;
		}
		return super.eIsSet(featureID);
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
			case ClassesPackage.IHOTEL_MANAGER_IMPL___FIND_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING:
				return findStaffMember((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_LOGGED_IN__STRING:
				return isStaffMemberLoggedIn((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_ADMIN__STRING:
				return isStaffMemberAdmin((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_PASSWORD__STRING:
				return getStaffMemberPassword((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_FIRST_NAME__STRING:
				return getStaffMemberFirstName((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_LAST_NAME__STRING:
				return getStaffMemberLastName((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_EMAIL__STRING:
				return getStaffMemberEmail((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_PHONE_NUMBER__STRING:
				return getStaffMemberPhoneNumber((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_ADDRESS__STRING:
				return getStaffMemberAddress((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___LOGOUT__STRING:
				return logout((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_EXISTING_STAFF_MEMBER__STRING:
				return isExistingStaffMember((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IHotelManagerImplImpl
