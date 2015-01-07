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
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getPendingBookings <em>Pending Bookings</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getBookingHistory <em>Booking History</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getIFinanceImpl <em>IFinance Impl</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getConfirmedBookings <em>Confirmed Bookings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IBookingManagementImplImpl extends MinimalEObjectImpl.Container
		implements IBookingManagementImpl {

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;
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
	 * The cached value of the '{@link #getConfirmedBookings() <em>Confirmed Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> confirmedBookings;

	// used in current implementation to make the bookingIDs unique
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
	 * Helper method used to retrieve a specific booking from the confirmed
	 * bookings list.
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
	 * Helper method used to retrieve a specific booking from the pending
	 * bookings list.
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
			room = new EObjectWithInverseResolvingEList<Room>(Room.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM, ClassesPackage.ROOM__IBOOKING_MANAGEMENT_IMPL);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIHotelManagerImpl(
			IHotelManagerImpl newIHotelManagerImpl, NotificationChain msgs) {
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
			customer = new EObjectResolvingEList<Customer>(Customer.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER);
		}
		return customer;
	}

	/**
	 * Modifies a booking according to given arguments. Parameter checkIn is the
	 * new check-in date (could be the same as before modification) and checkOut
	 * is the new check-out date (could also be the same as before
	 * modification). At the moment the booked dates are updated for every room
	 * in the booking since a booking is from one date to another. Only
	 * arguments that are non-null or non-zero is updated. A room can be added
	 * to a booking if the room is available during specified check-in and
	 * check-out dates. Only non-null or non-zero (positive) arguments are
	 * updated.
	 * 
	 * 
	 * @generated NOT
	 */
	public String updateBooking(int bookingID, int roomID, Date checkIn,
			Date checkOut, int nrOfGuests) {
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
		if (roomID > 0 && (checkIn != null || checkOut != null)) {
			return "Cannot update check-in and check-out dates for a single room only";
		}

		// if we are adding a new room to the booking.
		if (roomID > 0 && (checkIn == null && checkOut == null)) {
			Room room = getRoomByID(roomID);
			if (room == null) {
				return "room was not found, check if roomID is correct";
			} else {
				// Check if room already booked during any of the desired dates
				EList<Booking> bookings = room.getBookings();
				if (bookings.isEmpty()) {
					// Add room to booking if room do not have any bookings yet
					booking.getRooms().add(room);
					updateBillWithNewRoomCharge(roomID, bookingID);
				} else {
					boolean available = true;
					ListIterator<Booking> iter = bookings.listIterator();
					// Check if room is available during given dates
					while (available && iter.hasNext()) {
						Booking booked = iter.next();
						if (!booking.getCheckIn().after(booked.getCheckOut())
								&& !booking.getCheckOut().before(
										booked.getCheckIn())) {
							available = false;
							break;
						}
					}
					if (available) {
						// Add room to booking if room is available during
						// desired dates
						booking.getRooms().add(room);
						updateBillWithNewRoomCharge(roomID, bookingID);
					} else {
						return "Room could not be added since already booked";
					}
				}
			}
		}

		// If we are changing the checkIn and/or checkOut times of the booking.
		if ((checkIn != null || checkOut != null) && roomID == 0) {
			// Check if room(s) already booked during any of the desired dates
			if (checkIn == null) {
				checkIn = booking.getCheckIn();
			}
			if (checkOut == null) {
				checkOut = booking.getCheckOut();
			}
			EList<Room> rooms = booking.getRooms();
			EList<Room> availableRooms = new BasicEList<Room>(); // Used for
																	// comparison
			for (Room room : rooms) {
				EList<Booking> bookings = room.getBookings();
				boolean available = true;
				ListIterator<Booking> iter = bookings.listIterator();
				while (available && iter.hasNext()) {
					Booking booked = iter.next();
					// Must check if room already booked during those dates, and
					// if it is,
					// must check if it is the booking that is supposed to be
					// updated
					if (((checkIn.before(booked.getCheckOut()) && checkOut
							.after(booked.getCheckOut())) || checkIn
							.before(booked.getCheckIn())
							&& checkOut.after(booked.getCheckIn()))
							&& bookingID != booked.getBookingID()) {
						available = false;
						break;
					}
				}
				// Add room to availableRooms for later comparison if room is
				// available
				if (available) {
					availableRooms.add(room);
				}
			}
			// If all room(s) were available during desired dates, change dates
			// of booking
			if (rooms.size() == availableRooms.size()) {
				if (checkIn != null) {
					booking.setCheckIn(checkIn);
				}
				if (checkOut != null) {
					booking.setCheckOut(checkOut);
				}
				updateBillWithNewDateCharges(bookingID);
			} else {
				return "Could not update booking because date(s) for room(s) already booked";
			}
		}
		return "Booking was updated successfully";
	}

	/**
	 * Helper method for updateBooking(...) that adds a charge for each night of
	 * newly added room.
	 */
	private void updateBillWithNewRoomCharge(int roomID, int bookingID) {
		Booking booking = getConfirmedBooking(bookingID);
		Room room = getRoomByID(roomID);

		// Convert Date to Calendar
		Calendar calCheckIn = convertCheckInDate(booking);
		Calendar calCheckOut = convertCheckOutDate(booking);

		while (!calCheckIn.after(calCheckOut)) {

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
			calCheckIn.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

	/**
	 * Helper method for updateBooking(...) that adds a charge for each night
	 * for each room of the modified dates of the booking.
	 */
	private void updateBillWithNewDateCharges(int bookingID) {
		Booking booking = getConfirmedBooking(bookingID);
		EList<Room> rooms = booking.getRooms();

		// Remove only charges for rooms, not other types of charges
		EList<Charge> charges = booking.getBill().getCharge();
		ListIterator<Charge> iter = charges.listIterator();
		while (iter.hasNext()) {
			Charge charge = iter.next();
			if (charge.getChargeType() == ChargeType.SINGLE_ROOM
					|| charge.getChargeType() == ChargeType.DOUBLE_ROOM
					|| charge.getChargeType() == ChargeType.FAMILY_SUITE) {
				iter.remove();
			}
		}

		// Add charges for each room in booking
		for (Room room : rooms) {
			// Convert Date to Calendar
			Calendar calCheckIn = convertCheckInDate(booking);
			Calendar calCheckOut = convertCheckOutDate(booking);

			while (!calCheckIn.after(calCheckOut)) {

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
				calCheckIn.add(Calendar.DAY_OF_MONTH, 1);
			}
		}

	}

	/**
	 * Adds a room to a pending booking. Method is synchronized to avoid that
	 * several customers adds the same room to their bookings at the same time.
	 * If a room is added to a booking, a charge for each night of stay at that
	 * room is added to the bookings Bill.
	 * 
	 * @generated NOT
	 */
	public synchronized String addRoomPending(int roomNr, int bookingID) {
		Booking booking = getPendingBooking(bookingID);
		Room room = getRoomByID(roomNr);
		boolean free = true; // Used for adding charges for each night for each
								// room

		// Check if booking exists
		if (booking == null) {
			return "Booking could not be found";
		}

		// Also check if room exists
		if (room == null) {
			return "Room " + roomNr + " could not be found";
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
				if (booking.getCheckIn().after(booked.getCheckOut())
						|| booking.getCheckOut().before(booked.getCheckIn())) {
					available = true; // Set to true if room is available for
										// booking
					free = true; // Set to true for adding charges for each
									// night of stay
				}
			}
			if (available) {
				// Add room to booking if room is available during desired dates
				booking.getRooms().add(room);
			} else {
				return "Room " + roomNr
						+ " could not be added since already booked";
			}
		}

		// Convert Date to Calendar
		Calendar calCheckIn = convertCheckInDate(booking);
		Calendar calCheckOut = convertCheckOutDate(booking);

		if (free) {
			while (!calCheckIn.after(calCheckOut)) {

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
				calCheckIn.add(Calendar.DAY_OF_MONTH, 1);
			}
			return "Room " + roomNr
					+ " was successfully added to pending booking";
		}
		return "Room " + roomNr + " could not be added to pending booking";
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
	 * and adding it to the confirmed bookings list instead, after a check has
	 * been made that the required information has been added to the booking.
	 * The required information is the customer's first name, last name, credit
	 * card information, check-in and check-out dates, number of guests, and
	 * email or phone (needed for retrieving confirmation of successful
	 * booking/canceling if desired, and for being contacted).
	 * 
	 * @generated NOT
	 */
	public synchronized String confirmBooking(int bookingID) {
		for (int i = 0; i < pendingBookings.size(); i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				Customer customer = pendingBookings.get(i).getCustomer();
				if (customer.getFirstName() == null) {
					return "Must fill in First Name";
				} else if (customer.getLastName() == null) {
					return "Must fill in Last Name";
				} else if (pendingBookings.get(i).getCheckIn() == null) {
					return "Must fill in Check-in date";
				} else if (pendingBookings.get(i).getCheckOut() == null) {
					return "Must fill in Check-out date";
				} else if (pendingBookings.get(i).getNumberOfGuests() < 1) {
					return "Must fill in Number of guests";
				} else if (customer.getEmail() == null
						&& customer.getPhoneNumber() == null) {
					return "Must fill in at least an E-mail or a Phone number";
				} else {
					confirmedBookings.add(pendingBookings.remove(i));
					return "Booking has been confirmed";
				}
			}
		}
		return "Booking could not be found, please try another bookingID";
	}

	/**
	 * Helper method for calculating a cancellation fee. The customer must pay a
	 * cancellation fee if the booking is canceled less than 24 hours before
	 * check-in date. The difference between the current date and the check in
	 * date of the booking is used when deciding if the customer should pay for
	 * the whole booking (cancellation fee is currently the cost of the whole
	 * booking). Because a booking cannot be canceled after a check in, the
	 * difference of the current time and the check in time of the booking will
	 * not be negative. Only confirmed bookings that are cancelled can have a
	 * cancellation fee added.
	 * 
	 * @param bookingID
	 *            the bookingID of the booking to be cancelled
	 * @return fee if the difference between dates are less than 24 hours,
	 *         otherwise 0
	 * 
	 * @generated NOT
	 */
	private int addCancellationFee(int bookingID) {
		int fee = 0;

		// CurrentDate is used for comparison with check-in date
		Calendar currentDate = Calendar.getInstance();

		// Convert Date to Calendar
		Calendar checkIn = convertCheckInDate(getConfirmedBooking(bookingID));

		// Check if difference between check-in and current time is < 24 hours
		if ((checkIn.getTimeInMillis() - currentDate.getTimeInMillis()) < 86400000L) {
			Charge newCharge = new ChargeImpl();
			newCharge.setDate(new Date());
			newCharge.setChargeType(ChargeType.CANCELLATION_FEE);
			EList<Charge> charges = getConfirmedBooking(bookingID).getBill()
					.getCharge();
			// Set the cancellation fee equal to the sum of the charges of the
			// bill
			for (Charge charge : charges) {
				fee += charge.getAmount();
			}
			newCharge.setAmount(fee);
			Bill bill = getConfirmedBooking(bookingID).getBill();
			bill.getCharge().add(newCharge);
			return fee;
		}
		return fee;
	}

	/**
	 * This method sends a confirmation to the customer of given booking via SMS
	 * or email that the booking has been confirmed/cancelled. Since JavaMail
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
	 * parameters. If the parameter numberOfGuests is to large for a single room
	 * an alternate method of search will be used to take out a combination of
	 * rooms that can accommodate for the large number of guests.
	 * 
	 * NOTE: If the parameter roomType is not used, send in null instead, if
	 * maximum and if the parameter maximumPrice is not used, send in 0. The
	 * other parameters are required so that searchRoom can find appropriate
	 * rooms.
	 * 
	 * 
	 * 
	 * @generated NOT
	 */
	@Override
	public synchronized EList<Integer> searchRoom(Date checkIn, Date checkOut,
			int numberOfGuests, String roomType, int maximumPrice)
			throws IllegalArgumentException {

		EList<Room> rooms = this.getRoom();
		EList<Integer> searchResult = new BasicEList<Integer>();
		final int minimumNbrOfGuests = 1;

		Calendar today = Calendar.getInstance();
		Date todaysDate = today.getTime();
		if (checkIn.before(todaysDate)
				|| checkOut.before(checkIn)
				|| maximumPrice < 0
				|| numberOfGuests < minimumNbrOfGuests
				|| (roomType != null && RoomTypeName.get(roomType) == null
						|| checkIn == null || checkOut == null)) {
			throw new IllegalArgumentException();
		}

		if (!toManyPeople(numberOfGuests)) {
			for (Room r : rooms) {
				if (numberOfGuests <= (r.getRoomType().getNumberOfGuests())
						&& (maximumPrice >= r.getRoomType().getPrice() || maximumPrice == 0)
						&& (roomType == (r.getRoomType().getRoomTypeName())
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
		} else {
			return searchRooms(checkIn, checkOut, numberOfGuests, roomType,
					maximumPrice);
		}

		return searchResult;
	}

	/**
	 * Helper method to searchRoom that decides if a combination of rooms that
	 * fits all of the guests should be returned instead of a list containing
	 * all of the rooms if the number of guests doesn't fit in just one room.
	 * 
	 *
	 */

	private boolean toManyPeople(int numberOfGuests) {
		EList<Room> rooms = this.getRoom();
		for (Room r : rooms) {
			if (numberOfGuests <= (r.getRoomType().getNumberOfGuests())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Alternative version of searchRoom that returns a combination of rooms
	 * that can accommodate for a large company. Returns an empty list if 
	 * no combination of rooms can be found to fit all of the guests.
	 * 
	 * @param checkIn
	 * @param checkOut
	 * @param numberOfGuests
	 * @param roomType
	 * @param maximumPrice
	 * @return
	 */
	public synchronized EList<Integer> searchRooms(Date checkIn, Date checkOut,
			int numberOfGuests, String roomType, int maximumPrice) {
		EList<Room> allRooms = getRoom(); // allRooms contain rooms that meet
											// criteria
		EList<Integer> allRoomsNumbers = new BasicEList<Integer>();

		// If a specific room type is given, remove all rooms of other room
		// types
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

		// Check if any of the rooms is already booked during any of desired
		// dates
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
						if (checkIn.after(booking.getCheckOut())
								|| checkOut.before(booking.getCheckIn())) {
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
			// If only customer, return RoomNr's of all rooms meeting search
			// criteria
			return allRoomsNumbers;
		} else {
			EList<Room> roomsWithGuests = new BasicEList<Room>();
			int totalGuests = 0;
			for (int j = 0; j < allRooms.size(); j++) {
				roomsWithGuests.add(allRooms.get(j));
				totalGuests += allRooms.get(j).getRoomType()
						.getNumberOfGuests();
				if (totalGuests >= numberOfGuests) {
					break;
				}
			}
			if (totalGuests >= numberOfGuests) {

				for (Room room : roomsWithGuests) {
					allRoomsNumbers.add(room.getRoomNumber());
				}
			}
			else{
				allRoomsNumbers.clear();
			}
			// Return RoomNr's of enough rooms to hold given number of guests
			return allRoomsNumbers;
		}
	}

	/**
	 * A booking can be cancelled while it is pending or when it is in the
	 * confirmed state. For the moment, a canceled booking is placed in the
	 * history list. Only a confirmed booking has to be paid if cancelled within
	 * 24 hours of check-in time (the cancellation fee), which is why only
	 * confirmed bookings are checked if they contain a Cancellation Fee and if
	 * it is zero (which means it has been paid). The cancellation fee must be
	 * zero (paid) before a confirmed booking can be cancelled. If a confirmed
	 * booking is canceled within 24 hours of the booking's check-in date, and
	 * the bill do not yet contain a charge of type Cancellation fee, a new
	 * charge is created.
	 * 
	 * @generated NOT
	 */
	public synchronized String cancelBooking(int bookingID) {
		boolean feeExist = false;
		Calendar currentTime = Calendar.getInstance();
		Date currentDate = currentTime.getTime();

		int billSum = -1;
		// Save current size of list as concurrent activity may change sizes
		int listSize = pendingBookings.size();

		// The lists are traversed separately because a booking should be
		// removed from the correct list
		for (int i = 0; i < listSize; i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				if (currentDate.after(pendingBookings.get(i).getCheckIn())) {
					return "Cannot cancel a booking after its check-in time";
				}
				removeBookedRooms(pendingBookings.get(i));
				bookingHistory.add(pendingBookings.remove(i));
				return "Pending booking was successfully cancelled";
			}
		}

		listSize = confirmedBookings.size();
		for (int i = 0; i < listSize; i++) {
			if (confirmedBookings.get(i).getBookingID() == bookingID) {
				if (currentDate.after(confirmedBookings.get(i).getCheckIn())) {
					return "Cannot cancel a booking after its check-in time";
				}
				// Check that a cancellation fee (if existing) has been paid
				// before canceling
				EList<Charge> charges = confirmedBookings.get(i).getBill()
						.getCharge();
				for (Charge charge : charges) {
					if (charge.getChargeType() == ChargeType.CANCELLATION_FEE) {
						billSum = charge.getAmount();
						feeExist = true;
						if (billSum != 0) {
							return "Booking could not be cancelled since cancellation fee has not been paid";
						}
					}
				}
				// If no cancellation fee exists already, add one if
				// cancellation of
				// the booking is performed within 24 hours of booking's
				// check-in date
				if (!feeExist) {
					billSum = addCancellationFee(bookingID);
				}
				// If bill has been paid (all charges set to 0), cancel booking
				if (billSum == 0) {
					removeBookedRooms(confirmedBookings.get(i));
					bookingHistory.add(confirmedBookings.remove(i));
					return "Confirmed booking was successfully cancelled";
				} else {
					return "Late cancel, please pay the added cancellation fee";
				}

			}
		}
		return "Booking could not be cancelled since it was not found";
	}

	/**
	 * Helper method for updateBooking(...). Removes booking(s) from room(s)
	 * booking lists so that the room(s) can be booked again during those dates
	 * by other customers.
	 * 
	 * @param bookingID
	 *            the booking that has its booked dates removed
	 */
	private void removeBookedRooms(Booking booking) {
		EList<Room> rooms = getRoom();

		for (int i = 0; i < rooms.size(); i++) {
			EList<Booking> bookings = rooms.get(i).getBookings();
			int j = 0;
			boolean notFound = true;
			while (j < bookings.size() && notFound) {
				if (bookings.get(j).getBookingID() == booking.getBookingID()) {
					bookings.remove(j);
					notFound = false;
				}
				j++;
			}
		}
	}

	/**
	 * Helper method for converting the check-in Date to check-in time of type
	 * Calendar.
	 * 
	 * @param booking
	 *            the booking which check-in date is converted
	 * @return the check-in date as type Calendar
	 */
	private Calendar convertCheckInDate(Booking booking) {
		Date checkIn = booking.getCheckIn();
		Calendar calCheckIn = Calendar.getInstance();
		calCheckIn.setTime(checkIn);
		return calCheckIn;
	}

	/**
	 * Helper method for converting the check-out Date to check-out time of type
	 * Calendar.
	 * 
	 * @param booking
	 *            the booking which check-out date is converted
	 * @return the check-out date as type Calendar
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
	 * booking. That way a customer can add (or change) information, or parts of
	 * it, at a later stage without overwriting old information (or having to
	 * type in everything again).
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
	 * invoked one time per chosen room), but right after the customer has
	 * chosen which room(s) he/she is interested in after a successful search.
	 * The pending booking stores the check-in and check-out dates of the
	 * customers choosing (the dates for which room(s) were found and chosen).
	 * 
	 * The method is synchronized to avoid several threads interfering, setting
	 * wrong attributes for each other and so on. The customer is associated
	 * with the pending booking, and also a bill is associated with the pending
	 * booking. It is also here the unique ID for a booking is retained.
	 * 
	 * @generated NOT
	 */
	public synchronized int createPendingBooking(Date checkIn, Date checkOut,
			int nrOfGuests) {

		// Test if the check-in date is not later than the check-out date or
		// that guest count is less than 1 since the customer represents 1 guest
		if (checkIn == null || checkOut == null || checkIn.after(checkOut)
				|| nrOfGuests < 1) {
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

	/**
	 * Adds an extra charge to the bill of the given pending booking. At the
	 * moment the only extra charge that can be added is breakfast. A confirmed
	 * booking must use the updateBooking(...) method for modification.
	 * 
	 * @generated NOT
	 */
	public String addExtraCharge(int bookingID, String charge, int quantity) {
		if (quantity < 1) {
			return "The quantity of the charge must be at least 1";
		}
		Booking booking = getPendingBooking(bookingID);
		if (booking == null) {
			return "Booking could not be found, try another bookingID";
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
			return "Successfully added " + quantity
					+ " breakfast charges to bill";
		}
		return "Invalid charge";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public EList getRoomsOfBooking(int bookingID) {

		Booking booking = this.getConfirmedBooking(bookingID);

		EList<Room> rooms = booking.getRooms();

		EList roomIds = new BasicEList();
		for (Room room : rooms) {
			roomIds.add(room.getRoomNumber());
		}

		return roomIds;
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoom()).basicAdd(otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				if (iHotelManagerImpl != null)
					msgs = ((InternalEObject)iHotelManagerImpl).eInverseRemove(this, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, IHotelManagerImpl.class, msgs);
				return basicSetIHotelManagerImpl((IHotelManagerImpl)otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				if (iFinanceImpl != null)
					msgs = ((InternalEObject)iFinanceImpl).eInverseRemove(this, ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL, IFinanceImpl.class, msgs);
				return basicSetIFinanceImpl((IFinanceImpl)otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfirmedBookings()).basicAdd(otherEnd, msgs);
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				return ((InternalEList<?>)getRoom()).basicRemove(otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
				return basicSetIHotelManagerImpl(null, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
				return basicSetIFinanceImpl(null, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return ((InternalEList<?>)getConfirmedBookings()).basicRemove(otherEnd, msgs);
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return getCustomer();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return getConfirmedBookings();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends Customer>)newValue);
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				getConfirmedBookings().clear();
				getConfirmedBookings().addAll((Collection<? extends Booking>)newValue);
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				getCustomer().clear();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				getConfirmedBookings().clear();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return customer != null && !customer.isEmpty();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
				return confirmedBookings != null && !confirmedBookings.isEmpty();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___SEND_CONFIRMATION__INT_STRING:
				return sendConfirmation((Integer)arguments.get(0), (String)arguments.get(1));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_EXTRA_CHARGE__INT_STRING_INT:
				return addExtraCharge((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___GET_ROOMS_OF_BOOKING__INT:
				return getRoomsOfBooking((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // IBookingManagementImplImpl
