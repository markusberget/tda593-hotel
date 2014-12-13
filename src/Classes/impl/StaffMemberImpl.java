/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.StaffMember;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.StaffMemberImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#isAdmin <em>Admin</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link Classes.impl.StaffMemberImpl#isLoggedIn <em>Is Logged In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffMemberImpl extends MinimalEObjectImpl.Container implements StaffMember {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdmin() <em>Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADMIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdmin() <em>Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdmin()
	 * @generated
	 * @ordered
	 */
	protected boolean admin = ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoggedIn() <em>Is Logged In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoggedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOGGED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoggedIn() <em>Is Logged In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoggedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean isLoggedIn = IS_LOGGED_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.STAFF_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdmin() {
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmin(boolean newAdmin) {
		boolean oldAdmin = admin;
		admin = newAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__ADMIN, oldAdmin, admin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLoggedIn(boolean newIsLoggedIn) {
		boolean oldIsLoggedIn = isLoggedIn;
		isLoggedIn = newIsLoggedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.STAFF_MEMBER__IS_LOGGED_IN, oldIsLoggedIn, isLoggedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.STAFF_MEMBER__FIRST_NAME:
				return getFirstName();
			case ClassesPackage.STAFF_MEMBER__LAST_NAME:
				return getLastName();
			case ClassesPackage.STAFF_MEMBER__ADDRESS:
				return getAddress();
			case ClassesPackage.STAFF_MEMBER__EMAIL:
				return getEmail();
			case ClassesPackage.STAFF_MEMBER__PHONE_NUMBER:
				return getPhoneNumber();
			case ClassesPackage.STAFF_MEMBER__ADMIN:
				return isAdmin();
			case ClassesPackage.STAFF_MEMBER__USERNAME:
				return getUsername();
			case ClassesPackage.STAFF_MEMBER__PASSWORD:
				return getPassword();
			case ClassesPackage.STAFF_MEMBER__IS_LOGGED_IN:
				return isLoggedIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassesPackage.STAFF_MEMBER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__ADDRESS:
				setAddress((String)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__EMAIL:
				setEmail((String)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__ADMIN:
				setAdmin((Boolean)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__USERNAME:
				setUsername((String)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__PASSWORD:
				setPassword((String)newValue);
				return;
			case ClassesPackage.STAFF_MEMBER__IS_LOGGED_IN:
				setIsLoggedIn((Boolean)newValue);
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
			case ClassesPackage.STAFF_MEMBER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__ADMIN:
				setAdmin(ADMIN_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ClassesPackage.STAFF_MEMBER__IS_LOGGED_IN:
				setIsLoggedIn(IS_LOGGED_IN_EDEFAULT);
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
			case ClassesPackage.STAFF_MEMBER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ClassesPackage.STAFF_MEMBER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ClassesPackage.STAFF_MEMBER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ClassesPackage.STAFF_MEMBER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ClassesPackage.STAFF_MEMBER__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case ClassesPackage.STAFF_MEMBER__ADMIN:
				return admin != ADMIN_EDEFAULT;
			case ClassesPackage.STAFF_MEMBER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ClassesPackage.STAFF_MEMBER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ClassesPackage.STAFF_MEMBER__IS_LOGGED_IN:
				return isLoggedIn != IS_LOGGED_IN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", address: ");
		result.append(address);
		result.append(", email: ");
		result.append(email);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", admin: ");
		result.append(admin);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", isLoggedIn: ");
		result.append(isLoggedIn);
		result.append(')');
		return result.toString();
	}

} //StaffMemberImpl
