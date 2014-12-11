/**
 */
package Classes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Booking;
import Classes.ClassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.BookingImpl#getCheckIn <em>Check In</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getCheckOut <em>Check Out</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#isFullyPayed <em>Fully Payed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getCheckIn() <em>Check In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckIn()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECK_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckIn() <em>Check In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckIn()
	 * @generated
	 * @ordered
	 */
	protected Date checkIn = CHECK_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOut() <em>Check Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOut()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECK_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckOut() <em>Check Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOut()
	 * @generated
	 * @ordered
	 */
	protected Date checkOut = CHECK_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected int bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGuests = NUMBER_OF_GUESTS_EDEFAULT;

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
	 * The default value of the '{@link #isFullyPayed() <em>Fully Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullyPayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULLY_PAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFullyPayed() <em>Fully Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullyPayed()
	 * @generated
	 * @ordered
	 */
	protected boolean fullyPayed = FULLY_PAYED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckIn() {
		return checkIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckIn(Date newCheckIn) {
		Date oldCheckIn = checkIn;
		checkIn = newCheckIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__CHECK_IN, oldCheckIn, checkIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckOut() {
		return checkOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOut(Date newCheckOut) {
		Date oldCheckOut = checkOut;
		checkOut = newCheckOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__CHECK_OUT, oldCheckOut, checkOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(int newBookingID) {
		int oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__BOOKING_ID, oldBookingID, bookingID));
	}
	
	/**
	 * The bookingID is incremented for each created pending booking.
	 * 
	 * @generated NOT
	 */
	public void setBookingID() {
		int oldBookingID = bookingID;
		bookingID = oldBookingID++;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfGuests(int newNumberOfGuests) {
		int oldNumberOfGuests = numberOfGuests;
		numberOfGuests = newNumberOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__NUMBER_OF_GUESTS, oldNumberOfGuests, numberOfGuests));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__FIRST_NAME, oldFirstName, firstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__LAST_NAME, oldLastName, lastName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFullyPayed() {
		return fullyPayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyPayed(boolean newFullyPayed) {
		boolean oldFullyPayed = fullyPayed;
		fullyPayed = newFullyPayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__FULLY_PAYED, oldFullyPayed, fullyPayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.BOOKING__CHECK_IN:
				return getCheckIn();
			case ClassesPackage.BOOKING__CHECK_OUT:
				return getCheckOut();
			case ClassesPackage.BOOKING__BOOKING_ID:
				return getBookingID();
			case ClassesPackage.BOOKING__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
			case ClassesPackage.BOOKING__FIRST_NAME:
				return getFirstName();
			case ClassesPackage.BOOKING__LAST_NAME:
				return getLastName();
			case ClassesPackage.BOOKING__EMAIL:
				return getEmail();
			case ClassesPackage.BOOKING__PHONE_NUMBER:
				return getPhoneNumber();
			case ClassesPackage.BOOKING__FULLY_PAYED:
				return isFullyPayed();
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
			case ClassesPackage.BOOKING__CHECK_IN:
				setCheckIn((Date)newValue);
				return;
			case ClassesPackage.BOOKING__CHECK_OUT:
				setCheckOut((Date)newValue);
				return;
			case ClassesPackage.BOOKING__BOOKING_ID:
				setBookingID((Integer)newValue);
				return;
			case ClassesPackage.BOOKING__NUMBER_OF_GUESTS:
				setNumberOfGuests((Integer)newValue);
				return;
			case ClassesPackage.BOOKING__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ClassesPackage.BOOKING__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ClassesPackage.BOOKING__EMAIL:
				setEmail((String)newValue);
				return;
			case ClassesPackage.BOOKING__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case ClassesPackage.BOOKING__FULLY_PAYED:
				setFullyPayed((Boolean)newValue);
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
			case ClassesPackage.BOOKING__CHECK_IN:
				setCheckIn(CHECK_IN_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__CHECK_OUT:
				setCheckOut(CHECK_OUT_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__BOOKING_ID:
				setBookingID(BOOKING_ID_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__NUMBER_OF_GUESTS:
				setNumberOfGuests(NUMBER_OF_GUESTS_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__FULLY_PAYED:
				setFullyPayed(FULLY_PAYED_EDEFAULT);
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
			case ClassesPackage.BOOKING__CHECK_IN:
				return CHECK_IN_EDEFAULT == null ? checkIn != null : !CHECK_IN_EDEFAULT.equals(checkIn);
			case ClassesPackage.BOOKING__CHECK_OUT:
				return CHECK_OUT_EDEFAULT == null ? checkOut != null : !CHECK_OUT_EDEFAULT.equals(checkOut);
			case ClassesPackage.BOOKING__BOOKING_ID:
				return bookingID != BOOKING_ID_EDEFAULT;
			case ClassesPackage.BOOKING__NUMBER_OF_GUESTS:
				return numberOfGuests != NUMBER_OF_GUESTS_EDEFAULT;
			case ClassesPackage.BOOKING__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ClassesPackage.BOOKING__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ClassesPackage.BOOKING__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ClassesPackage.BOOKING__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case ClassesPackage.BOOKING__FULLY_PAYED:
				return fullyPayed != FULLY_PAYED_EDEFAULT;
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
		result.append(" (checkIn: ");
		result.append(checkIn);
		result.append(", checkOut: ");
		result.append(checkOut);
		result.append(", bookingID: ");
		result.append(bookingID);
		result.append(", numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", email: ");
		result.append(email);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", fullyPayed: ");
		result.append(fullyPayed);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
