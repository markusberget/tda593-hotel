/**
 */
package Classes.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Classes.Booking;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.IBookingManagementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.CustomerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Classes.impl.CustomerImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Classes.impl.CustomerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link Classes.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.impl.CustomerImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link Classes.impl.CustomerImpl#getPersonalInfo <em>Personal Info</em>}</li>
 *   <li>{@link Classes.impl.CustomerImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 *   <li>{@link Classes.impl.CustomerImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
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
	 * The default value of the '{@link #getPersonalInfo() <em>Personal Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONAL_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonalInfo() <em>Personal Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalInfo()
	 * @generated
	 * @ordered
	 */
	protected String personalInfo = PERSONAL_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIBookingManagementImpl() <em>IBooking Management Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBookingManagementImpl()
	 * @generated
	 * @ordered
	 */
	protected IBookingManagementImpl iBookingManagementImpl;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> booking;
	
	// For testing purposes because I do not know yet how to use these ELists...
	protected ArrayList<Booking> testBookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}
	
	protected CustomerImpl(Booking booking) {
		super();
		testBookings = new ArrayList<Booking>();
		testBookings.add(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.CUSTOMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__FIRST_NAME, oldFirstName, firstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__LAST_NAME, oldLastName, lastName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__ADDRESS, oldAddress, address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonalInfo() {
		return personalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalInfo(String newPersonalInfo) {
		String oldPersonalInfo = personalInfo;
		personalInfo = newPersonalInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__PERSONAL_INFO, oldPersonalInfo, personalInfo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, iBookingManagementImpl));
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
	public NotificationChain basicSetIBookingManagementImpl(IBookingManagementImpl newIBookingManagementImpl, NotificationChain msgs) {
		IBookingManagementImpl oldIBookingManagementImpl = iBookingManagementImpl;
		iBookingManagementImpl = newIBookingManagementImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, newIBookingManagementImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBookingManagementImpl(IBookingManagementImpl newIBookingManagementImpl) {
		if (newIBookingManagementImpl != iBookingManagementImpl) {
			NotificationChain msgs = null;
			if (iBookingManagementImpl != null)
				msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER, IBookingManagementImpl.class, msgs);
			if (newIBookingManagementImpl != null)
				msgs = ((InternalEObject)newIBookingManagementImpl).eInverseAdd(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER, IBookingManagementImpl.class, msgs);
			msgs = basicSetIBookingManagementImpl(newIBookingManagementImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL, newIBookingManagementImpl, newIBookingManagementImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBooking() {
		if (booking == null) {
			booking = new EObjectWithInverseResolvingEList<Booking>(Booking.class, this, ClassesPackage.CUSTOMER__BOOKING, ClassesPackage.BOOKING__CUSTOMER);
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL:
				if (iBookingManagementImpl != null)
					msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER, IBookingManagementImpl.class, msgs);
				return basicSetIBookingManagementImpl((IBookingManagementImpl)otherEnd, msgs);
			case ClassesPackage.CUSTOMER__BOOKING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooking()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL:
				return basicSetIBookingManagementImpl(null, msgs);
			case ClassesPackage.CUSTOMER__BOOKING:
				return ((InternalEList<?>)getBooking()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.CUSTOMER__FIRST_NAME:
				return getFirstName();
			case ClassesPackage.CUSTOMER__LAST_NAME:
				return getLastName();
			case ClassesPackage.CUSTOMER__ADDRESS:
				return getAddress();
			case ClassesPackage.CUSTOMER__EMAIL:
				return getEmail();
			case ClassesPackage.CUSTOMER__PHONE_NUMBER:
				return getPhoneNumber();
			case ClassesPackage.CUSTOMER__PERSONAL_INFO:
				return getPersonalInfo();
			case ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL:
				if (resolve) return getIBookingManagementImpl();
				return basicGetIBookingManagementImpl();
			case ClassesPackage.CUSTOMER__BOOKING:
				return getBooking();
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
			case ClassesPackage.CUSTOMER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ClassesPackage.CUSTOMER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ClassesPackage.CUSTOMER__ADDRESS:
				setAddress((String)newValue);
				return;
			case ClassesPackage.CUSTOMER__EMAIL:
				setEmail((String)newValue);
				return;
			case ClassesPackage.CUSTOMER__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case ClassesPackage.CUSTOMER__PERSONAL_INFO:
				setPersonalInfo((String)newValue);
				return;
			case ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)newValue);
				return;
			case ClassesPackage.CUSTOMER__BOOKING:
				getBooking().clear();
				getBooking().addAll((Collection<? extends Booking>)newValue);
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
			case ClassesPackage.CUSTOMER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ClassesPackage.CUSTOMER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ClassesPackage.CUSTOMER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ClassesPackage.CUSTOMER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ClassesPackage.CUSTOMER__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case ClassesPackage.CUSTOMER__PERSONAL_INFO:
				setPersonalInfo(PERSONAL_INFO_EDEFAULT);
				return;
			case ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)null);
				return;
			case ClassesPackage.CUSTOMER__BOOKING:
				getBooking().clear();
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
			case ClassesPackage.CUSTOMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ClassesPackage.CUSTOMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ClassesPackage.CUSTOMER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ClassesPackage.CUSTOMER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ClassesPackage.CUSTOMER__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case ClassesPackage.CUSTOMER__PERSONAL_INFO:
				return PERSONAL_INFO_EDEFAULT == null ? personalInfo != null : !PERSONAL_INFO_EDEFAULT.equals(personalInfo);
			case ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL:
				return iBookingManagementImpl != null;
			case ClassesPackage.CUSTOMER__BOOKING:
				return booking != null && !booking.isEmpty();
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
		result.append(", personalInfo: ");
		result.append(personalInfo);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
