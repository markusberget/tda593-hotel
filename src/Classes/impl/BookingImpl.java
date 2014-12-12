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
import Classes.IFinanceImpl;
import Classes.IHotelManagerImpl;
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
 *   <li>{@link Classes.impl.BookingImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#isFullyPaid <em>Fully Paid</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getIFinanceImpl <em>IFinance Impl</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link Classes.impl.BookingImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}</li>
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
	 * The default value of the '{@link #isFullyPaid() <em>Fully Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullyPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULLY_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFullyPaid() <em>Fully Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullyPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean fullyPaid = FULLY_PAID_EDEFAULT;

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
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * The cached value of the '{@link #getIFinanceImpl() <em>IFinance Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIFinanceImpl()
	 * @generated
	 * @ordered
	 */
	protected IFinanceImpl iFinanceImpl;

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
	 * The cached value of the '{@link #getIHotelManagerImpl() <em>IHotel Manager Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHotelManagerImpl()
	 * @generated
	 * @ordered
	 */
	protected IHotelManagerImpl iHotelManagerImpl;

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
	public boolean isFullyPaid() {
		return fullyPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyPaid(boolean newFullyPaid) {
		boolean oldFullyPaid = fullyPaid;
		fullyPaid = newFullyPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__FULLY_PAID, oldFullyPaid, fullyPaid));
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
				msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING, IBookingManagementImpl.class, msgs);
			if (newIBookingManagementImpl != null)
				msgs = ((InternalEObject)newIBookingManagementImpl).eInverseAdd(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING, IBookingManagementImpl.class, msgs);
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
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectWithInverseResolvingEList.ManyInverse<Room>(Room.class, this, ClassesPackage.BOOKING__ROOM, ClassesPackage.ROOM__BOOKING);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFinanceImpl getIFinanceImpl() {
		if (iFinanceImpl != null && iFinanceImpl.eIsProxy()) {
			InternalEObject oldIFinanceImpl = (InternalEObject)iFinanceImpl;
			iFinanceImpl = (IFinanceImpl)eResolveProxy(oldIFinanceImpl);
			if (iFinanceImpl != oldIFinanceImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BOOKING__IFINANCE_IMPL, oldIFinanceImpl, iFinanceImpl));
			}
		}
		return iFinanceImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFinanceImpl basicGetIFinanceImpl() {
		return iFinanceImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIFinanceImpl(IFinanceImpl newIFinanceImpl, NotificationChain msgs) {
		IFinanceImpl oldIFinanceImpl = iFinanceImpl;
		iFinanceImpl = newIFinanceImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__IFINANCE_IMPL, oldIFinanceImpl, newIFinanceImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIFinanceImpl(IFinanceImpl newIFinanceImpl) {
		if (newIFinanceImpl != iFinanceImpl) {
			NotificationChain msgs = null;
			if (iFinanceImpl != null)
				msgs = ((InternalEObject)iFinanceImpl).eInverseRemove(this, ClassesPackage.IFINANCE_IMPL__BOOKING, IFinanceImpl.class, msgs);
			if (newIFinanceImpl != null)
				msgs = ((InternalEObject)newIFinanceImpl).eInverseAdd(this, ClassesPackage.IFINANCE_IMPL__BOOKING, IFinanceImpl.class, msgs);
			msgs = basicSetIFinanceImpl(newIFinanceImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__IFINANCE_IMPL, newIFinanceImpl, newIFinanceImpl));
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
	 * @generated
	 */
	public Bill basicGetBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	public void setBill(Bill newBill) {
		if (newBill != bill) {
			NotificationChain msgs = null;
			if (bill != null)
				msgs = ((InternalEObject)bill).eInverseRemove(this, ClassesPackage.BILL__BOOKING, Bill.class, msgs);
			if (newBill != null)
				msgs = ((InternalEObject)newBill).eInverseAdd(this, ClassesPackage.BILL__BOOKING, Bill.class, msgs);
			msgs = basicSetBill(newBill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__BILL, newBill, newBill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelManagerImpl getIHotelManagerImpl() {
		if (iHotelManagerImpl != null && iHotelManagerImpl.eIsProxy()) {
			InternalEObject oldIHotelManagerImpl = (InternalEObject)iHotelManagerImpl;
			iHotelManagerImpl = (IHotelManagerImpl)eResolveProxy(oldIHotelManagerImpl);
			if (iHotelManagerImpl != oldIHotelManagerImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL, oldIHotelManagerImpl, iHotelManagerImpl));
			}
		}
		return iHotelManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelManagerImpl basicGetIHotelManagerImpl() {
		return iHotelManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIHotelManagerImpl(IHotelManagerImpl newIHotelManagerImpl, NotificationChain msgs) {
		IHotelManagerImpl oldIHotelManagerImpl = iHotelManagerImpl;
		iHotelManagerImpl = newIHotelManagerImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL, oldIHotelManagerImpl, newIHotelManagerImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIHotelManagerImpl(IHotelManagerImpl newIHotelManagerImpl) {
		if (newIHotelManagerImpl != iHotelManagerImpl) {
			NotificationChain msgs = null;
			if (iHotelManagerImpl != null)
				msgs = ((InternalEObject)iHotelManagerImpl).eInverseRemove(this, ClassesPackage.IHOTEL_MANAGER_IMPL__BOOKING, IHotelManagerImpl.class, msgs);
			if (newIHotelManagerImpl != null)
				msgs = ((InternalEObject)newIHotelManagerImpl).eInverseAdd(this, ClassesPackage.IHOTEL_MANAGER_IMPL__BOOKING, IHotelManagerImpl.class, msgs);
			msgs = basicSetIHotelManagerImpl(newIHotelManagerImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL, newIHotelManagerImpl, newIHotelManagerImpl));
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
					msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING, IBookingManagementImpl.class, msgs);
				return basicSetIBookingManagementImpl((IBookingManagementImpl)otherEnd, msgs);
			case ClassesPackage.BOOKING__ROOM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoom()).basicAdd(otherEnd, msgs);
			case ClassesPackage.BOOKING__IFINANCE_IMPL:
				if (iFinanceImpl != null)
					msgs = ((InternalEObject)iFinanceImpl).eInverseRemove(this, ClassesPackage.IFINANCE_IMPL__BOOKING, IFinanceImpl.class, msgs);
				return basicSetIFinanceImpl((IFinanceImpl)otherEnd, msgs);
			case ClassesPackage.BOOKING__BILL:
				if (bill != null)
					msgs = ((InternalEObject)bill).eInverseRemove(this, ClassesPackage.BILL__BOOKING, Bill.class, msgs);
				return basicSetBill((Bill)otherEnd, msgs);
			case ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL:
				if (iHotelManagerImpl != null)
					msgs = ((InternalEObject)iHotelManagerImpl).eInverseRemove(this, ClassesPackage.IHOTEL_MANAGER_IMPL__BOOKING, IHotelManagerImpl.class, msgs);
				return basicSetIHotelManagerImpl((IHotelManagerImpl)otherEnd, msgs);
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
			case ClassesPackage.BOOKING__ROOM:
				return ((InternalEList<?>)getRoom()).basicRemove(otherEnd, msgs);
			case ClassesPackage.BOOKING__IFINANCE_IMPL:
				return basicSetIFinanceImpl(null, msgs);
			case ClassesPackage.BOOKING__BILL:
				return basicSetBill(null, msgs);
			case ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL:
				return basicSetIHotelManagerImpl(null, msgs);
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
			case ClassesPackage.BOOKING__FIRST_NAME:
				return getFirstName();
			case ClassesPackage.BOOKING__LAST_NAME:
				return getLastName();
			case ClassesPackage.BOOKING__EMAIL:
				return getEmail();
			case ClassesPackage.BOOKING__PHONE_NUMBER:
				return getPhoneNumber();
			case ClassesPackage.BOOKING__FULLY_PAID:
				return isFullyPaid();
			case ClassesPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				if (resolve) return getIBookingManagementImpl();
				return basicGetIBookingManagementImpl();
			case ClassesPackage.BOOKING__ROOM:
				return getRoom();
			case ClassesPackage.BOOKING__IFINANCE_IMPL:
				if (resolve) return getIFinanceImpl();
				return basicGetIFinanceImpl();
			case ClassesPackage.BOOKING__BILL:
				if (resolve) return getBill();
				return basicGetBill();
			case ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL:
				if (resolve) return getIHotelManagerImpl();
				return basicGetIHotelManagerImpl();
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
			case ClassesPackage.BOOKING__FULLY_PAID:
				setFullyPaid((Boolean)newValue);
				return;
			case ClassesPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)newValue);
				return;
			case ClassesPackage.BOOKING__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case ClassesPackage.BOOKING__IFINANCE_IMPL:
				setIFinanceImpl((IFinanceImpl)newValue);
				return;
			case ClassesPackage.BOOKING__BILL:
				setBill((Bill)newValue);
				return;
			case ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL:
				setIHotelManagerImpl((IHotelManagerImpl)newValue);
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
			case ClassesPackage.BOOKING__FULLY_PAID:
				setFullyPaid(FULLY_PAID_EDEFAULT);
				return;
			case ClassesPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)null);
				return;
			case ClassesPackage.BOOKING__ROOM:
				getRoom().clear();
				return;
			case ClassesPackage.BOOKING__IFINANCE_IMPL:
				setIFinanceImpl((IFinanceImpl)null);
				return;
			case ClassesPackage.BOOKING__BILL:
				setBill((Bill)null);
				return;
			case ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL:
				setIHotelManagerImpl((IHotelManagerImpl)null);
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
			case ClassesPackage.BOOKING__FULLY_PAID:
				return fullyPaid != FULLY_PAID_EDEFAULT;
			case ClassesPackage.BOOKING__CUSTOMER:
				return customer != null;
			case ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL:
				return iBookingManagementImpl != null;
			case ClassesPackage.BOOKING__ROOM:
				return room != null && !room.isEmpty();
			case ClassesPackage.BOOKING__IFINANCE_IMPL:
				return iFinanceImpl != null;
			case ClassesPackage.BOOKING__BILL:
				return bill != null;
			case ClassesPackage.BOOKING__IHOTEL_MANAGER_IMPL:
				return iHotelManagerImpl != null;
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
		result.append(", fullyPaid: ");
		result.append(fullyPaid);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
