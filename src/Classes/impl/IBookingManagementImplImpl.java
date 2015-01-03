/**
 */
package Classes.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Classes.Bill;
import Classes.Booking;
import Classes.Charge;
import Classes.ChargeType;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.IBookingManagementImpl;
import Classes.IFinanceImpl;
import Classes.IHotelManagerImpl;
import Classes.Room;
import Classes.RoomStatus;
import Classes.RoomType;
import Classes.RoomTypeName;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>IBooking Management Impl</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getConfirmedBookings <em>Confirmed Bookings</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getPendingBookings <em>Pending Bookings</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getBookingHistory <em>Booking History</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getIFinanceImpl <em>IFinance Impl</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IBookingManagementImplImpl extends MinimalEObjectImpl.Container
		implements IBookingManagementImpl {

	/**
	 * The cached value of the '{@link #getConfirmedBookings() <em>Confirmed Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> confirmedBookings;
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;
	/**
	 * The cached value of the '{@link #getPendingBookings() <em>Pending Bookings</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPendingBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> pendingBookings;
	/**
	 * The cached value of the '{@link #getIHotelManagerImpl() <em>IHotel Manager Impl</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIHotelManagerImpl()
	 * @generated
	 * @ordered
	 */
	protected IHotelManagerImpl iHotelManagerImpl;
	/**
	 * The cached value of the '{@link #getBookingHistory() <em>Booking History</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBookingHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookingHistory;
	/**
	 * The cached value of the '{@link #getIFinanceImpl() <em>IFinance Impl</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIFinanceImpl()
	 * @generated
	 * @ordered
	 */
	protected IFinanceImpl iFinanceImpl;
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

	//used in current implementation to make the bookingIDs unique
	private volatile int bookingsEver;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected IBookingManagementImplImpl() {
		super();
		bookingHistory = new BasicEList<Booking>();
		pendingBookings = new BasicEList<Booking>();
		confirmedBookings = new BasicEList<Booking>();
		room = new BasicEList<Room>();
		this.setIHotelManagerImpl(ClassesFactoryImpl.eINSTANCE
				.createIHotelManagerImpl());
		this.setIFinanceImpl(ClassesFactoryImpl.eINSTANCE.createIFinanceImpl());
	}

	/**
	 * This method is used for instantiating the system with some rooms and
	 * other necessary objects for testing purposes.
	 * 
	 * @return an instance of the system
	 */
	public static IBookingManagementImplImpl instantiateForTest() {
		IBookingManagementImplImpl bookingManagement = new IBookingManagementImplImpl();

		RoomType standardRoomType = new RoomTypeImpl();
		standardRoomType.setRoomTypeName(RoomTypeName.SINGLE_ROOM);
		standardRoomType.setDescription("A single room");
		standardRoomType.setNumberOfGuests(1);
		standardRoomType.setPrice(100);
		standardRoomType.setFeatures("View");

		RoomType doubleRoomType = new RoomTypeImpl();
		doubleRoomType.setRoomTypeName(RoomTypeName.DOUBLE_ROOM);
		doubleRoomType.setDescription("A double room");
		doubleRoomType.setNumberOfGuests(2);
		doubleRoomType.setPrice(250);
		doubleRoomType.setFeatures(null);

		Room room1 = new RoomImpl();
		room1.setRoomNumber(1);
		room1.setRoomType(standardRoomType);
		room1.setStatus(RoomStatus.AVAILABLE);

		Room room2 = new RoomImpl();
		room2.setRoomNumber(2);
		room2.setRoomType(standardRoomType);
		room2.setStatus(RoomStatus.AVAILABLE);

		Room room3 = new RoomImpl();
		room3.setRoomNumber(3);
		room3.setRoomType(standardRoomType);
		room3.setStatus(RoomStatus.AVAILABLE);

		Room room6 = new RoomImpl();
		room6.setRoomNumber(6);
		room6.setRoomType(doubleRoomType);
		room6.setStatus(RoomStatus.AVAILABLE);

		Room room7 = new RoomImpl();
		room7.setRoomNumber(7);
		room7.setRoomType(doubleRoomType);
		room7.setStatus(RoomStatus.AVAILABLE);
		
		Room room8 = new RoomImpl();
		room8.setRoomNumber(8);
		room8.setRoomType(doubleRoomType);
		room8.setStatus(RoomStatus.OCCUPIED);

		standardRoomType.getRoom().add(room1);
		standardRoomType.getRoom().add(room2);
		standardRoomType.getRoom().add(room3);
		doubleRoomType.getRoom().add(room6);
		doubleRoomType.getRoom().add(room7);
		doubleRoomType.getRoom().add(room8);
		bookingManagement.room.add(room1);
		bookingManagement.room.add(room2);
		bookingManagement.room.add(room3);
		bookingManagement.room.add(room6);
		bookingManagement.room.add(room7);
		bookingManagement.room.add(room8);

		return bookingManagement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.IBOOKING_MANAGEMENT_IMPL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getConfirmedBookings() {
		if (confirmedBookings == null) {
			confirmedBookings = new EObjectWithInverseResolvingEList<Booking>(Booking.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS, ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL);
		}
		return confirmedBookings;
	}

	/**
	 * Helper method used to retrieve a specific booking from the
	 * confirmed bookings list.
	 * 
	 * @generated NOT
	 */
	private Booking getConfirmedBooking(int bookingID) {
		for (int i = 0; i < confirmedBookings.size(); i++) {
			if (confirmedBookings.get(i).getBookingID() == bookingID) {
				return confirmedBookings.get(i);
			}
		}
		return null;
	}

	/**
	 * Helper method used to retrieve a specific booking from the
	 * pending bookings list.
	 * 
	 * @generated NOT
	 */
	private Booking getPendingBooking(int bookingID) {
		for (int i = 0; i < pendingBookings.size(); i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				return pendingBookings.get(i);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getPendingBookings() {
		if (pendingBookings == null) {
			pendingBookings = new EObjectResolvingEList<Booking>(Booking.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS);
		}
		return pendingBookings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelManagerImpl getIHotelManagerImpl() {
		if (iHotelManagerImpl != null && iHotelManagerImpl.eIsProxy()) {
			InternalEObject oldIHotelManagerImpl = (InternalEObject)iHotelManagerImpl;
			iHotelManagerImpl = (IHotelManagerImpl)eResolveProxy(oldIHotelManagerImpl);
			if (iHotelManagerImpl != oldIHotelManagerImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL, oldIHotelManagerImpl, iHotelManagerImpl));
			}
		}
		return iHotelManagerImpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL, oldIHotelManagerImpl, newIHotelManagerImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIHotelManagerImpl(IHotelManagerImpl newIHotelManagerImpl) {
		if (newIHotelManagerImpl != iHotelManagerImpl) {
			NotificationChain msgs = null;
			if (iHotelManagerImpl != null)
				msgs = ((InternalEObject)iHotelManagerImpl).eInverseRemove(this, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, IHotelManagerImpl.class, msgs);
			if (newIHotelManagerImpl != null)
				msgs = ((InternalEObject)newIHotelManagerImpl).eInverseAdd(this, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, IHotelManagerImpl.class, msgs);
			msgs = basicSetIHotelManagerImpl(newIHotelManagerImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL, newIHotelManagerImpl, newIHotelManagerImpl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookingHistory() {
		if (bookingHistory == null) {
			bookingHistory = new EObjectResolvingEList<Booking>(Booking.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY);
		}
		return bookingHistory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IFinanceImpl getIFinanceImpl() {
		if (iFinanceImpl != null && iFinanceImpl.eIsProxy()) {
			InternalEObject oldIFinanceImpl = (InternalEObject)iFinanceImpl;
			iFinanceImpl = (IFinanceImpl)eResolveProxy(oldIFinanceImpl);
			if (iFinanceImpl != oldIFinanceImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL, oldIFinanceImpl, iFinanceImpl));
			}
		}
		return iFinanceImpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IFinanceImpl basicGetIFinanceImpl() {
		return iFinanceImpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIFinanceImpl(IFinanceImpl newIFinanceImpl,
			NotificationChain msgs) {
		IFinanceImpl oldIFinanceImpl = iFinanceImpl;
		iFinanceImpl = newIFinanceImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL, oldIFinanceImpl, newIFinanceImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIFinanceImpl(IFinanceImpl newIFinanceImpl) {
		if (newIFinanceImpl != iFinanceImpl) {
			NotificationChain msgs = null;
			if (iFinanceImpl != null)
				msgs = ((InternalEObject)iFinanceImpl).eInverseRemove(this, ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL, IFinanceImpl.class, msgs);
			if (newIFinanceImpl != null)
				msgs = ((InternalEObject)newIFinanceImpl).eInverseAdd(this, ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL, IFinanceImpl.class, msgs);
			msgs = basicSetIFinanceImpl(newIFinanceImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL, newIFinanceImpl, newIFinanceImpl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectWithInverseResolvingEList<Customer>(Customer.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER, ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL);
		}
		return customer;
	}

	/**
	 * Modifies a booking according to given arguments. Parameter checkIn is the
	 * new check-in date (could be the same as before modification) and checkOut
	 * is the new check-out date (could also be the same as before
	 * modification). At the moment the booked dates are updated for every room
	 * in the booking since a booking is from one date to another. Only arguments
	 * that are non-null or non-zero is updated. A room can be added to a booking
	 * if the room is available during specified check-in and check-out dates.
	 * 
	 * 
	 * @generated NOT
	 */
	public String updateBooking(int bookingID, int roomID, Date checkIn, Date checkOut,
			int nrOfGuests) {
		Booking booking = getConfirmedBooking(bookingID);
		
		if (booking == null) {
			return "booking was not found, check if bookingID is correct";
		}
		if (checkIn != null && checkOut != null && checkIn.after(checkOut)) {
			return "Could not update booking, check-in date is later than check-out date";
		}
		if (nrOfGuests < 0) {
			return "Could not update booking since value of nrOfGuests is less than 0";
		}
		if (nrOfGuests != booking.getNumberOfGuests() && nrOfGuests > 0) {
			booking.setNumberOfGuests(nrOfGuests);
		}
		if (roomID < 0) {
			return "Could not update booking since value of roomID is less than 0";
		}
		if (roomID > 0) {
			Room room = getRoomByID(roomID);
			if (room == null) {
				return "room was not found, check if roomID is correct";
			} else {
				// Check if room already booked during any of the desired dates
				EList<Booking> bookings = room.getBookings();
				if (bookings.isEmpty()) {
					// Add room to booking if room do not have any bookings yet
					booking.getRooms().add(room);
				} else {
					boolean available = true;
					ListIterator<Booking> iter = bookings.listIterator();
					while (available && iter.hasNext()) {
						Booking booked = iter.next();
						available = false;
						if (booking.getCheckIn().after(booked.getCheckOut()) || 
								booking.getCheckOut().before(booked.getCheckIn())) {
							available = true;
						}
					}
					if (available) {
						// Add room to booking if room is available during desired dates
						booking.getRooms().add(room);
					} else {
						return "Room could not be added since already booked";
					}
				}
			}
		}
		if (checkIn != null || checkOut != null) {
			// Check if room(s) already booked during any of the desired dates
			EList<Room> rooms = booking.getRooms();
			EList<Room> availableRooms = new BasicEList<Room>();	// Used for comparison
			for (Room room : rooms) {
				EList<Booking> bookings = room.getBookings();
				boolean available = true;
				ListIterator<Booking> iter = bookings.listIterator();
				while (available && iter.hasNext()) {
					Booking booked = iter.next();
					available = false;
					// Must check if room already booked during those dates, and if it is,
					// must check if it is the booking that is supposed to be updated
					if (booking.getCheckIn().after(booked.getCheckOut()) || 
							booking.getCheckOut().before(booked.getCheckIn()) ||
							(booking.getBookingID() == booked.getBookingID() &&
							booking.getCheckIn() == booked.getCheckIn() &&
							booking.getCheckOut() == booked.getCheckOut())) {
						available = true;
					}
				}
				// Add room to availableRooms for later comparison if room is available
				if (available) {
					availableRooms.add(room);
				}
			}
			// If all room(s) were available during desired dates, change dates of booking
			if (rooms.size() == availableRooms.size()) {
				if (checkIn != null) {
					booking.setCheckIn(checkIn);
				}
				if (checkOut != null) {
					booking.setCheckOut(checkOut);
				}
			} else {
				return "Could not update booking because date(s) for room(s) already booked";
			}
		}
		return "Booking was updated successfully";
	}

	/**
	 * Adds a room to a pending booking. Method is synchronized to avoid that
	 * several customers adds the same room to their bookings at the same time.
	 * If a room is added to a booking, a charge for each night of stay at that
	 * room is added to the bookings Bill.
	 * 
	 * @generated NOT
	 */
	public synchronized boolean addRoomPending(int roomNr, int bookingID) {
		Booking booking = getPendingBooking(bookingID);
		Room room = getRoomByID(roomNr);
		boolean free = true;
		
		// Check if booking exists
		if (booking == null) {
			return false;
		}
		
		// Also check if room exists	
		if (room == null) {	
			return false;	
		}
		
		// Check if room already booked during any of the desired dates
		EList<Booking> bookings = room.getBookings();
		if (bookings.isEmpty()) {
			// Add room to booking if room do not have any bookings yet
			booking.getRooms().add(room);
		} else {
			boolean available = true;
			ListIterator<Booking> iter = bookings.listIterator();
			while (available && iter.hasNext()) {
				Booking booked = iter.next();
				available = false;
				free = false;
				if (booking.getCheckIn().after(booked.getCheckOut()) || 
						booking.getCheckOut().before(booked.getCheckIn())) {
					available = true;	// Set to true if room is available for booking
					free = true;	// Set to true for adding charges for each night of stay
				}
			}
			if (available) {
				// Add room to booking if room is available during desired dates
				booking.getRooms().add(room);
			} else {
				return false;		// Room could not be added since already booked
			}
		}
		
		// Convert Date to Calendar
		Calendar calCheckIn = convertCheckInDate(booking);
		Calendar calCheckOut = convertCheckOutDate(booking);
		
		// Retrieve date fields
		int checkInDay = calCheckIn.get(Calendar.DAY_OF_MONTH);
		int checkOutDay = calCheckOut.get(Calendar.DAY_OF_MONTH);
		int checkInYear = calCheckIn.get(Calendar.YEAR);
		int checkOutYear = calCheckOut.get(Calendar.YEAR);
		int checkInMonth = calCheckIn.get(Calendar.MONTH);
		int checkOutMonth = calCheckOut.get(Calendar.MONTH);
		
		if (free) {
			while (checkInDay != checkOutDay) {
				
				// Add charge for each night at specified room
				Charge charge = new ChargeImpl();
				charge.setDate(new Date());
				charge.setAmount(room.getRoomType().getPrice());
				if (room.getRoomType().getRoomTypeName() == RoomTypeName.SINGLE_ROOM) {
					charge.setChargeType(ChargeType.SINGLE_ROOM);
				} else if (room.getRoomType().getRoomTypeName() == RoomTypeName.DOUBLE_ROOM) {
					charge.setChargeType(ChargeType.DOUBLE_ROOM);
				} else {
					charge.setChargeType(ChargeType.FAMILY_SUITE);
				}
				booking.getBill().getCharge().add(charge);
				
				// Increment to next day (Does not work yet when entering new month
				calCheckIn.set(Calendar.DAY_OF_MONTH, calCheckIn.get(Calendar.DAY_OF_MONTH)+1);
				checkInDay++;
			}
			return true;
		} 
		return false;
	}

	/**
	 * Method used for testing. Searches in list of rooms by room number.
	 * 
	 * @param id
	 * @return
	 */
	public Room getRoomByID(int roomNumber) {
		for (int i = 0; i < room.size(); i++) {
			if (room.get(i).getRoomNumber() == roomNumber) {
				return room.get(i);
			}
		}
		return null;
	}

	/**
	 * Confirms a booking by removing the booking from the pending bookings list
	 * and adding it to the confirmed bookings list instead. 
	 * 
	 * This method is synchronized so that several bookings may be removed at
	 * the "same" time, without experiencing a race condition.
	 * 
	 * @generated NOT
	 */
	public synchronized String confirmBooking(int bookingID) {
		for (int i = 0; i < pendingBookings.size(); i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				confirmedBookings.add(pendingBookings.remove(i));
				return "Booking has been confirmed";
			}
		}
		return "Booking could not be confirmed";
	}

	/**
	 * The customer must pay a cancellation fee if the booking is canceled less
	 * than 24 hours before check-in date. The difference between the current
	 * date and the check in date of the booking is used when deciding if the
	 * customer should pay for the whole booking (cancellation fee is currently
	 * the cost of the whole booking). Because a booking cannot be canceled
	 * after a check in, the difference of the current time and the check in
	 * time of the booking will not be negative.
	 * 
	 * @param bookingID
	 *            the bookingID of the booking to be cancelled
	 * @return fee if the difference between dates are less than 24 hours,
	 *         otherwise 0 (-1 if booking not found)
	 * 
	 * @generated NOT
	 */
	public int addCancellationFee(int bookingID) {

		// Check if booking with corresponding bookingID exists
		if (getConfirmedBooking(bookingID) == null) {
			return -1;
		}

		// CurrentDate is used for comparison with check-in date
		Calendar currentDate = Calendar.getInstance();
		
	// Convert Date to Calendar
		Calendar checkIn = convertCheckInDate(getConfirmedBooking(bookingID));

		// Check if difference between check-in and current time is < 24 hours
		if ((checkIn.getTimeInMillis() - currentDate.getTimeInMillis()) < 86400000L) {
			Charge charge = new ChargeImpl();
			charge.setDate(new Date());
			charge.setChargeType(ChargeType.CANCELLATION_FEE);
			int fee = getIFinanceImpl().calculatePayment(bookingID);
			charge.setAmount(fee);
			Bill bill = getConfirmedBooking(bookingID).getBill();
			bill.getCharge().add(charge);
			return fee;
		}
		return 0;
	}

	/**
	 * This method sends a confirmation to the customer of given booking via
	 * SMS or email that the booking has been confirmed/cancelled. Since JavaMail
	 * API etc is not part of the core Java SE, this method is not implemented.
	 * 
	 * @generated NOT
	 */
	public String sendConfirmation(int bookingID, String message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Searches through the existing rooms to find the rooms that match the
	 * parameters.
	 * 
	 * NOTE: If the parameter roomType is not used, send in null instead and if
	 * the parameter maximumPrice is not used, send in 0. The other parameters
	 * are required so that searchRoom can find appropriate rooms.
	 * 
	 * Maybe add so that several rooms can be combined to fit all of the guests. 
	 * Should this be done in another method or when the number of guests exceeds
	 * the maximum number of guest possible in a room.
	 * 
	 * @generated NOT
	 */
	@Override
	public EList searchRoom(Date checkIn, Date checkOut, int numberOfGuests,
			String roomType, int maximumPrice)
			throws IllegalArgumentException {

		EList<Room> rooms = this.getRoom();
		EList<Integer> searchResult = new BasicEList<Integer>();
		final int minimumNbrOfGuests = 1;

		Calendar today = Calendar.getInstance();
		Date todaysDate = today.getTime();
		if (checkIn.before(todaysDate) || checkOut.before(checkIn)
				|| maximumPrice < 0 || numberOfGuests < minimumNbrOfGuests
				|| (roomType != null && RoomTypeName.get(roomType) == null)) {
			throw new IllegalArgumentException();
		}

		for (Room r : rooms) {
			if (numberOfGuests <= (r.getRoomType().getNumberOfGuests())
					&& (maximumPrice >= r.getRoomType().getPrice() || maximumPrice == 0)
					&& (roomType == (r.getRoomType().getRoomTypeName() )
							.toString() || roomType == null)) {
				EList<Booking> bookings = r.getBookings();

				if (bookings.isEmpty()) {
					searchResult.add(r.getRoomNumber());
				} else {
					boolean roomFree = true;
					Iterator<Booking> listIterator = bookings.iterator();
					while (roomFree && listIterator.hasNext()) {
						Booking b = listIterator.next();
						if (checkIn.after(b.getCheckOut())
								|| checkOut.before(b.getCheckIn())) {
							roomFree = true;
						} else {
							roomFree = false;
						}
					}
					if (roomFree) {
						searchResult.add(r.getRoomNumber());
					}
				}

			}

		}

		return searchResult;
	}
	
	/**
	 * Alternative version of searchRoom
	 * 
	 * @param checkIn
	 * @param checkOut
	 * @param numberOfGuests
	 * @param roomType
	 * @param maximumPrice
	 * @return
	 */
	public synchronized EList<Integer> searchRooms(Date checkIn, Date checkOut, int numberOfGuests,
			String roomType, int maximumPrice) {
		EList<Room> allRooms = getRoom();		// allRooms contain rooms that meet criteria
		EList<Integer> allRoomsNumbers = new BasicEList<Integer>();
		
		// If a specific room type is given, remove all rooms of other room types
		if (roomType != null) {
			EList<Room> roomsWithType = new BasicEList<Room>();
			for (int i = 0; i < allRooms.size(); i++) {
				if (allRooms.get(i).getRoomType().getRoomTypeName().toString() == roomType) {
					roomsWithType.add(allRooms.get(i));
				}
			}
			if (roomsWithType.size() > 0) {
				allRooms = roomsWithType;
			}
		}
		
		// Check if any of the rooms is already booked during any of desired dates
		if (checkIn != null && checkOut != null) {
			EList<Room> roomsWithDates = new BasicEList<Room>();
			
			for (Room room : allRooms) {
				EList<Booking> bookings = room.getBookings();
				if (bookings.isEmpty()) {
					roomsWithDates.add(room);
				} else {
					boolean available = true;
					ListIterator<Booking> iter = bookings.listIterator();
					while (available && iter.hasNext()) {
						Booking booking = iter.next();
						available = false;
						if (checkIn.after(booking.getCheckOut()) || 
								checkOut.before(booking.getCheckIn())) {
							available = true;
						}
					}
					if (available) {
						roomsWithDates.add(room);
					}
				}
			}
			// If any rooms meet date criteria, assign those to allRooms
			if (roomsWithDates.size() > 0) {
				allRooms = roomsWithDates;
			}
		}

		// If maximumPrice is greater than 0, only return room(s) that cost less
		if (maximumPrice > 0) {
			EList<Room> roomsWithPrice = new BasicEList<Room>();
			for (int i = 0; i < allRooms.size(); i++) {
				if (allRooms.get(i).getRoomType().getPrice() < maximumPrice) {
					roomsWithPrice.add(allRooms.get(i));
				}
			}
			if (roomsWithPrice.size() > 0) {
				allRooms = roomsWithPrice;
			}
		}
		
		// Assume the customer is considered as 1 guest
		if (numberOfGuests == 1) {
			for (Room room : allRooms) {
				allRoomsNumbers.add(room.getRoomNumber());
			}
			// If only customer, return RoomNr's of all rooms meeting search criteria
			return allRoomsNumbers;
		} else {
			EList<Room> roomsWithGuests = new BasicEList<Room>();
			int totalGuests = 0, i = 0;
			while (totalGuests < numberOfGuests) {
				roomsWithGuests.add(allRooms.get(i));
				totalGuests += allRooms.get(i).getRoomType().getNumberOfGuests();
				i++;
			}
			for (Room room : roomsWithGuests) {
				allRoomsNumbers.add(room.getRoomNumber());
			}
			// Return RoomNr's of enough rooms to hold given number of guests
			return allRoomsNumbers;
		}
	}
	

	/**
	 * A booking can be cancelled while it is pending or when it is in the
	 * confirmed state. For the moment, a canceled booking is placed in the
	 * history list. The method is synchronized to avoid race conditions when
	 * removing bookings (and searching for the correct booking).
	 * 
	 * @generated NOT
	 */
	public synchronized String cancelBooking(int bookingID) {
		// Save current size of list as concurrent activity may change sizes
		int listSize = pendingBookings.size();

		// The lists are traversed separately because a booking should be
		// removed from the correct list
		for (int i = 0; i < listSize; i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				EList<Room> rooms = pendingBookings.get(i).getRooms();
				removeBookedRooms(bookingID, rooms);
				bookingHistory.add(pendingBookings.remove(i));
				return "Pending booking was successfully cancelled";
			}
		}

		listSize = confirmedBookings.size();
		for (int i = 0; i < listSize; i++) {
			if (confirmedBookings.get(i).getBookingID() == bookingID) {
				EList<Room> rooms = confirmedBookings.get(i).getRooms();
				removeBookedRooms(bookingID, rooms);
				bookingHistory.add(confirmedBookings.remove(i));
				return "Confirmed booking was successfully cancelled";
			}
		}
		return "Booking could not be cancelled";
	}
	
	/**
	 * Helper method for updateBooking(...).
	 * Removes booking(s) from room(s) booking lists so that the room(s)
	 * can be booked again during those dates by other customers.
	 * 
	 * @param bookingID		the booking that has its booked dates removed
	 * @param rooms				the room(s) that remove booking from their list
	 */
	private void removeBookedRooms(int bookingID, EList<Room> rooms) {
next: for (Room room : rooms) {
				EList<Booking> bookings = room.getBookings();
				for (int i = 0; i < bookings.size(); i++) {
					if (bookings.get(i).getBookingID() == bookingID ) {
						room.getBookings().remove(i);
						break next;
					}
				}
			}
	}
	
	/**
	 * Helper method for converting the check-in Date to check-in time of
	 * type Calendar.
	 * 
	 * @param booking		the booking which check-in date is converted
	 * @return					the check-in date as type Calendar
	 */
	private Calendar convertCheckInDate(Booking booking) {
		Date checkIn = booking.getCheckIn();
		Calendar calCheckIn = Calendar.getInstance();
		calCheckIn.setTime(checkIn);
		return calCheckIn;
	}
	
	/**
	 * Helper method for converting the check-out Date to check-out time of
	 * type Calendar.
	 * 
	 * @param booking		the booking which check-out date is converted
	 * @return					the check-out date as type Calendar
	 */
	private Calendar convertCheckOutDate(Booking booking) {
		Date checkOut = booking.getCheckOut();
		Calendar calCheckOut = Calendar.getInstance();
		calCheckOut.setTime(checkOut);
		return calCheckOut;
	}
	

	/**
	 * This method is synchronized to avoid problems with assigning wrong values
	 * to instance variables when different threads invoke the method at the
	 * same time. The first name, last name, email and phone number of the
	 * customer is added to a given pending booking. In case some of these
	 * fields have not been filled in by the customer, they are null. If a
	 * parameter would be null, that information will not be added to the
	 * booking. That way a customer can add (or change) information, or parts
	 * of it, at a later stage without overwriting old information (or having
	 * to type in everything again).
	 * 
	 * 
	 * @generated NOT
	 */
	public synchronized boolean addCustomerInformationToBooking(int bookingID,
			String firstName, String lastName, String email, String ph) {
		for (int i = 0; i < pendingBookings.size(); i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				Customer customer = pendingBookings.get(i).getCustomer();
				if (customer == null) {
					return false;
				}
				if (firstName != null) {
					customer.setFirstName(firstName);
				}
				if (lastName != null) {
					customer.setLastName(lastName);
				}
				if (email != null) {
					customer.setEmail(email);
				}
				if (ph != null) {
					customer.setPhoneNumber(ph);
				}
				return true;
			}
		}
		return false;
	}

	/**
	 * The pending booking is created when the customer has chosen which dates
	 * (and number of guests) that person want to book room(s) for. The idea is
	 * that the method is invoked right before addRoomPending(..) (which is
	 * invoked one time per chosen room), but right after the customer has chosen
	 * which room(s) he/she is interested in after a successful search. The pending
	 * booking stores the check-in and check-out dates of the customers choosing (the
	 * dates for which room(s) were found and chosen). 
	 * 
	 * The method is synchronized to avoid several threads interfering, setting
	 * wrong attributes for each other and so on. The customer is associated with
	 * the pending booking, and also a bill is associated with the pending
	 * booking. It is also here the unique ID for a booking is retained.
	 * 
	 * @generated NOT
	 */
	public synchronized int createPendingBooking(Date checkIn, Date checkOut,
			int nrOfGuests) {

		// Test if the check-in date is not later than the check-out date or
		// that guest count is less than 1 since the customer represents 1 guest
		if (checkIn.after(checkOut) || nrOfGuests < 1) {
			return -1;
		}
		
		Bill bill = new BillImpl();
		Customer customer = new CustomerImpl();
		Booking booking = new BookingImpl();
		booking.setBill(bill);
		booking.setCustomer(customer);
		booking.setCheckIn(checkIn);
		booking.setCheckOut(checkOut);
		booking.setNumberOfGuests(nrOfGuests);
		booking.setBookingID(bookingsEver++);
		pendingBookings.add(booking);
		return booking.getBookingID();
	}
	
	// This is a IHotelManager method, only staff should be able to run it
/*	public boolean changeStatusOfRoom(String staffMemberUsername, int roomId,
			RoomStatus status) {
		IHotelManager hm = getIHotelManagerImpl();

		if (!hm.isStaffMemberLoggedIn(staffMemberUsername))
			return false; // not logged in!

		Room room = getRoomByID(roomId);
		room.setStatus(status);

		return true;
	}*/

	/**
	 * Adds an extra charge to the bill of the given booking. The booking
	 * could be a pending booking or a confirmed booking.
	 * 
	 * @generated NOT
	 */
	public String addExtraCharge(int bookingID, String charge, int quantity) {
		if (quantity < 1) {
			return "The quantity of the charge must be at least 1";
		}
		Booking booking = getPendingBooking(bookingID);
		if (booking == null) {
			booking = getConfirmedBooking(bookingID);
			if (booking == null) {
				return "Booking could not be found, try another bookingID";
			}
		}
		if (charge == null) {
			return "A charge must be chosen to be added";
		}
		Bill bill = booking.getBill();
		if (charge.equals(ChargeType.BREAKFAST.toString())) {
			for (int i = 0; i < quantity; i++) {
				Charge newCharge = new ChargeImpl();
				newCharge.setDate(new Date());
				newCharge.setChargeType(ChargeType.BREAKFAST);
				newCharge.setAmount(50);
				bill.getCharge().add(newCharge);
			}
			return "Successfully added " + quantity + " breakfast charges to bill";
		}
		return "Invalid charge";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfirmedBookings()).basicAdd(otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				if (iHotelManagerImpl != null)
					msgs = ((InternalEObject)iHotelManagerImpl).eInverseRemove(this, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, IHotelManagerImpl.class, msgs);
				return basicSetIHotelManagerImpl((IHotelManagerImpl)otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				if (iFinanceImpl != null)
					msgs = ((InternalEObject)iFinanceImpl).eInverseRemove(this, ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL, IFinanceImpl.class, msgs);
				return basicSetIFinanceImpl((IFinanceImpl)otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomer()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return ((InternalEList<?>)getConfirmedBookings()).basicRemove(otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				return basicSetIHotelManagerImpl(null, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				return basicSetIFinanceImpl(null, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return ((InternalEList<?>)getCustomer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return getConfirmedBookings();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				return getRoom();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				return getPendingBookings();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				if (resolve) return getIHotelManagerImpl();
				return basicGetIHotelManagerImpl();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY:
				return getBookingHistory();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				if (resolve) return getIFinanceImpl();
				return basicGetIFinanceImpl();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return getCustomer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				getConfirmedBookings().clear();
				getConfirmedBookings().addAll((Collection<? extends Booking>)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				getPendingBookings().clear();
				getPendingBookings().addAll((Collection<? extends Booking>)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				setIHotelManagerImpl((IHotelManagerImpl)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY:
				getBookingHistory().clear();
				getBookingHistory().addAll((Collection<? extends Booking>)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				setIFinanceImpl((IFinanceImpl)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends Customer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				getConfirmedBookings().clear();
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				getRoom().clear();
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				getPendingBookings().clear();
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				setIHotelManagerImpl((IHotelManagerImpl)null);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY:
				getBookingHistory().clear();
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				setIFinanceImpl((IFinanceImpl)null);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				getCustomer().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return confirmedBookings != null && !confirmedBookings.isEmpty();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				return room != null && !room.isEmpty();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				return pendingBookings != null && !pendingBookings.isEmpty();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				return iHotelManagerImpl != null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY:
				return bookingHistory != null && !bookingHistory.isEmpty();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				return iFinanceImpl != null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return customer != null && !customer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___UPDATE_BOOKING__INT_INT_DATE_DATE_INT:
				return updateBooking((Integer)arguments.get(0), (Integer)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3), (Integer)arguments.get(4));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_ROOM_PENDING__INT_INT:
				return addRoomPending((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CONFIRM_BOOKING__INT:
				return confirmBooking((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___SEARCH_ROOM__DATE_DATE_INT_STRING_INT:
				return searchRoom((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CANCEL_BOOKING__INT:
				return cancelBooking((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING:
				return addCustomerInformationToBooking((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CREATE_PENDING_BOOKING__DATE_DATE_INT:
				return createPendingBooking((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_CANCELLATION_FEE__INT:
				return addCancellationFee((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___SEND_CONFIRMATION__INT_STRING:
				return sendConfirmation((Integer)arguments.get(0), (String)arguments.get(1));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_EXTRA_CHARGE__INT_STRING_INT:
				return addExtraCharge((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} // IBookingManagementImplImpl
