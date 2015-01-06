/**
 */
package Classes.impl;

import Classes.Bill;
import java.util.Date;
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
import Classes.Room;
import java.util.Collection;

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
 *   <li>{@link Classes.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getRooms <em>Rooms</em>}</li>
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
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

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
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected Bill bill;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

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
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, ClassesPackage.CUSTOMER__BOOKING, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, ClassesPackage.CUSTOMER__BOOKING, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__CUSTOMER, newCustomer, newCustomer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, iBookingManagementImpl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, newIBookingManagementImpl);
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
				msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS, IBookingManagementImpl.class, msgs);
			if (newIBookingManagementImpl != null)
				msgs = ((InternalEObject)newIBookingManagementImpl).eInverseAdd(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS, IBookingManagementImpl.class, msgs);
			msgs = basicSetIBookingManagementImpl(newIBookingManagementImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL, newIBookingManagementImpl, newIBookingManagementImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill getBill() {
		if (bill != null && bill.eIsProxy()) {
			InternalEObject oldBill = (InternalEObject)bill;
			bill = (Bill)eResolveProxy(oldBill);
			if (bill != oldBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BOOKING__BILL, oldBill, bill));
			}
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill basicGetBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill(Bill newBill) {
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__BILL, oldBill, bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetBill(Bill newBill, NotificationChain msgs) {
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__BILL, oldBill, newBill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectWithInverseResolvingEList.ManyInverse<Room>(Room.class, this, ClassesPackage.BOOKING__ROOMS, ClassesPackage.ROOM__BOOKINGS);
		}
		return rooms;
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
			case ClassesPackage.BOOKING__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, ClassesPackage.CUSTOMER__BOOKING, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				if (iBookingManagementImpl != null)
					msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS, IBookingManagementImpl.class, msgs);
				return basicSetIBookingManagementImpl((IBookingManagementImpl)otherEnd, msgs);
			case ClassesPackage.BOOKING__ROOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRooms()).basicAdd(otherEnd, msgs);
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
			case ClassesPackage.BOOKING__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				return basicSetIBookingManagementImpl(null, msgs);
			case ClassesPackage.BOOKING__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
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
			case ClassesPackage.BOOKING__CHECK_IN:
				return getCheckIn();
			case ClassesPackage.BOOKING__CHECK_OUT:
				return getCheckOut();
			case ClassesPackage.BOOKING__BOOKING_ID:
				return getBookingID();
			case ClassesPackage.BOOKING__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
			case ClassesPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				if (resolve) return getIBookingManagementImpl();
				return basicGetIBookingManagementImpl();
			case ClassesPackage.BOOKING__BILL:
				if (resolve) return getBill();
				return basicGetBill();
			case ClassesPackage.BOOKING__ROOMS:
				return getRooms();
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
			case ClassesPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)newValue);
				return;
			case ClassesPackage.BOOKING__BILL:
				setBill((Bill)newValue);
				return;
			case ClassesPackage.BOOKING__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
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
			case ClassesPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)null);
				return;
			case ClassesPackage.BOOKING__BILL:
				setBill((Bill)null);
				return;
			case ClassesPackage.BOOKING__ROOMS:
				getRooms().clear();
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
			case ClassesPackage.BOOKING__CUSTOMER:
				return customer != null;
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				return iBookingManagementImpl != null;
			case ClassesPackage.BOOKING__BILL:
				return bill != null;
			case ClassesPackage.BOOKING__ROOMS:
				return rooms != null && !rooms.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //BookingImpl
