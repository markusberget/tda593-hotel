/**
 */
package Classes.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

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

import Classes.Booking;
import Classes.Charge;
import Classes.ChargeType;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.IBookingManagementImpl;
import Classes.IFinanceImpl;
import Classes.IHotelManager;
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
 * <li>{@link Classes.impl.IBookingManagementImplImpl#getConfirmedBookings <em>
 * Confirmed Bookings</em>}</li>
 * <li>{@link Classes.impl.IBookingManagementImplImpl#getRoom <em>Room</em>}</li>
 * <li>{@link Classes.impl.IBookingManagementImplImpl#getPendingBookings <em>
 * Pending Bookings</em>}</li>
 * <li>{@link Classes.impl.IBookingManagementImplImpl#getIHotelManagerImpl <em>
 * IHotel Manager Impl</em>}</li>
 * <li>{@link Classes.impl.IBookingManagementImplImpl#getBookingHistory <em>
 * Booking History</em>}</li>
 * <li>{@link Classes.impl.IBookingManagementImplImpl#getIFinanceImpl <em>
 * IFinance Impl</em>}</li>
 * <li>{@link Classes.impl.IBookingManagementImplImpl#getCustomer <em>Customer
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IBookingManagementImplImpl extends MinimalEObjectImpl.Container
		implements IBookingManagementImpl {

	/**
	 * The cached value of the '{@link #getConfirmedBookings()
	 * <em>Confirmed Bookings</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConfirmedBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> confirmedBookings;
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;
	/**
	 * The cached value of the '{@link #getPendingBookings()
	 * <em>Pending Bookings</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPendingBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> pendingBookings;
	/**
	 * The cached value of the '{@link #getIHotelManagerImpl()
	 * <em>IHotel Manager Impl</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIHotelManagerImpl()
	 * @generated
	 * @ordered
	 */
	protected IHotelManagerImpl iHotelManagerImpl;
	/**
	 * The cached value of the '{@link #getBookingHistory()
	 * <em>Booking History</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getBookingHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookingHistory;
	/**
	 * The cached value of the '{@link #getIFinanceImpl()
	 * <em>IFinance Impl</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIFinanceImpl()
	 * @generated
	 * @ordered
	 */
	protected IFinanceImpl iFinanceImpl;
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

	private volatile int bookingsEver; // used in current implementation to make
										// the
										// bookingIDs unique

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

		standardRoomType.getRoom().add(room1);
		standardRoomType.getRoom().add(room2);
		standardRoomType.getRoom().add(room3);
		doubleRoomType.getRoom().add(room6);
		doubleRoomType.getRoom().add(room7);
		bookingManagement.room.add(room1);
		bookingManagement.room.add(room2);
		bookingManagement.room.add(room3);
		bookingManagement.room.add(room6);
		bookingManagement.room.add(room7);

		return bookingManagement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.IBOOKING_MANAGEMENT_IMPL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Booking> getConfirmedBookings() {
		if (confirmedBookings == null) {
			confirmedBookings = new EObjectWithInverseResolvingEList<Booking>(
					Booking.class,
					this,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS,
					ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL);
		}
		return confirmedBookings;
	}

	/**
	 * Used to retrieve a specific booking from the confirmed bookings list.
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
	 * Used to retrieve a specific booking from the pending bookings list.
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
	 * 
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Booking> getPendingBookings() {
		if (pendingBookings == null) {
			pendingBookings = new EObjectResolvingEList<Booking>(Booking.class,
					this,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS);
		}
		return pendingBookings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IHotelManagerImpl getIHotelManagerImpl() {
		if (iHotelManagerImpl != null && iHotelManagerImpl.eIsProxy()) {
			InternalEObject oldIHotelManagerImpl = (InternalEObject) iHotelManagerImpl;
			iHotelManagerImpl = (IHotelManagerImpl) eResolveProxy(oldIHotelManagerImpl);
			if (iHotelManagerImpl != oldIHotelManagerImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL,
							oldIHotelManagerImpl, iHotelManagerImpl));
			}
		}
		return iHotelManagerImpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IHotelManagerImpl basicGetIHotelManagerImpl() {
		return iHotelManagerImpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIHotelManagerImpl(IHotelManagerImpl newIHotelManagerImpl) {
		IHotelManagerImpl oldIHotelManagerImpl = iHotelManagerImpl;
		iHotelManagerImpl = newIHotelManagerImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL,
					oldIHotelManagerImpl, iHotelManagerImpl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Booking> getBookingHistory() {
		if (bookingHistory == null) {
			bookingHistory = new EObjectResolvingEList<Booking>(Booking.class,
					this,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY);
		}
		return bookingHistory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFinanceImpl getIFinanceImpl() {
		if (iFinanceImpl != null && iFinanceImpl.eIsProxy()) {
			InternalEObject oldIFinanceImpl = (InternalEObject) iFinanceImpl;
			iFinanceImpl = (IFinanceImpl) eResolveProxy(oldIFinanceImpl);
			if (iFinanceImpl != oldIFinanceImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL,
							oldIFinanceImpl, iFinanceImpl));
			}
		}
		return iFinanceImpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFinanceImpl basicGetIFinanceImpl() {
		return iFinanceImpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIFinanceImpl(IFinanceImpl newIFinanceImpl,
			NotificationChain msgs) {
		IFinanceImpl oldIFinanceImpl = iFinanceImpl;
		iFinanceImpl = newIFinanceImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL,
					oldIFinanceImpl, newIFinanceImpl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIFinanceImpl(IFinanceImpl newIFinanceImpl) {
		if (newIFinanceImpl != iFinanceImpl) {
			NotificationChain msgs = null;
			if (iFinanceImpl != null)
				msgs = ((InternalEObject) iFinanceImpl).eInverseRemove(this,
						ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL,
						IFinanceImpl.class, msgs);
			if (newIFinanceImpl != null)
				msgs = ((InternalEObject) newIFinanceImpl).eInverseAdd(this,
						ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL,
						IFinanceImpl.class, msgs);
			msgs = basicSetIFinanceImpl(newIFinanceImpl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL,
					newIFinanceImpl, newIFinanceImpl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectWithInverseResolvingEList<Customer>(
					Customer.class, this,
					ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER,
					ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL);
		}
		return customer;
	}

	/**
	 * Modifies a booking according to given arguments. Parameter checkIn is the
	 * new check-in date (could be the same as before modification) and checkOut
	 * is the new check-out date (could also be the same as before
	 * modification). At the moment the booked dates are updated for every room
	 * in the booking (not possible yet to add certain rooms or update specific
	 * rooms).
	 * 
	 * @generated NOT
	 */
	public String updateBooking(int bookingID, Date checkIn, Date checkOut,
			int nrOfGuests) {
		Booking booking = getConfirmedBooking(bookingID);
		if (booking == null) {
			return "booking was not found, check if bookingID is correct";
		}
		if (checkIn.after(checkOut)) {
			return "Could not update booking, check-in date is later than check-out date";
		}
		if ((checkIn != null || checkOut != null) && nrOfGuests > 0) {
			if (checkIn != null) {
				booking.setCheckIn(checkIn);
				// Change booked dates for room in rooms bookedDate list
			}
			if (checkOut != null) {
				booking.setCheckOut(checkOut);
				// Change booked dates for room in rooms bookedDate list
			}
			booking.setNumberOfGuests(nrOfGuests);
			return "Booking was updated successfully";
		}
		return "Booking could not be updated due to invalid argument(s)";
	}

	/**
	 * Returns the booking object with the corresponding bookingNumber
	 * containing its information. At the moment all three lists of bookings
	 * (pending, confirmed, history) are checked because all three types of
	 * bookings could be interesting to retrieve.
	 *
	 * @generated NOT
	 */
	private Booking getBooking(int bookingNumber) {
		// pendingBookings is merged with confirmedBookings and bookingHistory
		EList<Booking> tmpList = new BasicEList<Booking>(pendingBookings);
		tmpList.addAll(confirmedBookings);
		tmpList.addAll(bookingHistory);

		for (int i = 0; i < tmpList.size(); i++) {
			if (tmpList.get(i).getBookingID() == bookingNumber) {
				return tmpList.get(i);
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private void getBooking(int roomID, Date date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Adds a room to a pending booking. Method is synchronized to avoid that
	 * several customers adds the same room to their bookings at the same time.
	 * The dates for which the room is being booked is created (date objects)
	 * here and added to the room objects bookedDates list so that other users
	 * of the system won't be able to book these dates for the specific room (or
	 * even retrieve the room as a search result during booked date).
	 * 
	 * @generated NOT
	 */
	public synchronized boolean addRoomPending(int roomNr, int bookingID) {
		Booking booking = getPendingBooking(bookingID);
		Room room = getRoomByID(roomNr);
		Date bookedDate;
		
		// Check if booking exists
		if (booking == null) {
			return false;
		}
		
		// Add room to booking
		booking.getRooms().add(room);
		
		// Convert Date to Calendar
		Date checkIn = booking.getCheckIn();
		Date checkOut = booking.getCheckOut();
		Calendar calCheckIn = Calendar.getInstance();
		calCheckIn.setTime(checkIn);
		Calendar calCheckOut = Calendar.getInstance();
		calCheckOut.setTime(checkOut);
		
		// Retrieve date fields
		int checkInDay = calCheckIn.get(calCheckIn.DAY_OF_MONTH);
		int checkOutDay = calCheckOut.get(calCheckOut.DAY_OF_MONTH);
		int checkInYear = calCheckIn.get(calCheckIn.YEAR);
		int checkOutYear = calCheckOut.get(calCheckOut.YEAR);
		int checkInMonth = calCheckIn.get(calCheckIn.MONTH);
		int checkOutMonth = calCheckOut.get(calCheckOut.MONTH);
		
		// If any of these two are true, create Date objects for booked dates
		boolean check1 = (checkInYear == checkOutYear) && (checkInMonth <= checkOutMonth);
		boolean check2 = checkInYear < checkOutYear;

		// This implementation do not work (roll) in all cases, like for different months
		if (check1) {
			while (checkInDay < checkOutDay) {
				bookedDate = calCheckIn.getTime();
				getRoomByID(roomNr).getBookedDates().add(bookedDate);
				
				// Add charge for spending one night at specified room
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
				
				// Increment to next day
				calCheckIn.roll(calCheckIn.DAY_OF_MONTH, 1);
				checkInDay++;
			}
			return true;
		} else if (check2) {
			return true;
		}
		return false;
	}

	/**
	 * Searches in the array of rooms by room number
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
	 * the "same" time, instead of experiencing race condition.
	 * 
	 * @generated NOT
	 */
	public synchronized boolean confirmBooking(int bookingID) {
		for (int i = 0; i < pendingBookings.size(); i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				confirmedBookings.add(pendingBookings.remove(i));
				return true;
			}
		}
		return false;
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

		// Convert Dates to Calendar
		Calendar currentDate = Calendar.getInstance();
		Date bookingsCheckIn = getConfirmedBooking(bookingID).getCheckIn();
		Calendar checkIn = Calendar.getInstance();
		checkIn.setTime(bookingsCheckIn);

		// Check if difference between check-in and current time is < 24 hours
		if ((checkIn.getTimeInMillis() - currentDate.getTimeInMillis()) < 86400000L) {
			Charge charge = new ChargeImpl();
			charge.setDate(new Date());
			charge.setChargeType(ChargeType.CANCELLATION_FEE);
			int fee = getIFinanceImpl().calculatePayment(bookingID);
			charge.setAmount(fee);
			((BillImpl) getConfirmedBooking(bookingID).getBill())
					.setCharge(charge);
			return fee;
		}
		return 0;
	}

	/**
	 * Searches through the existing rooms to find the rooms that match the
	 * parameters.
	 * 
	 * NOTE: If the parameter roomType is not used, send in null instead and if
	 * the parameter maximumPrice is not used, send in 0. The other parameters
	 * are required so that searchRoom can find appropriate rooms.
	 * 
	 * @generated NOT
	 */
	@Override
	public EList searchRoom(Date checkIn, Date checkOut, int numberOfGuests,
			String roomType, int maximumPrice)
			throws UnsupportedOperationException {

		EList<Room> rooms = this.getRoom();
		EList<Integer> searchResult = new BasicEList<Integer>();
		int minimumNbrOfGuests = 1;

		// Works if Dates are entered in valid form, not the weird 1900
		// + form
		Calendar today = Calendar.getInstance();
		Date todaysDate = today.getTime();
		if (checkIn.before(todaysDate) || checkOut.before(checkIn)
				|| maximumPrice < 0 || numberOfGuests < minimumNbrOfGuests
				|| (roomType != null && RoomTypeName.get(roomType) == null)) {
			throw new UnsupportedOperationException();
		}

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

		return searchResult;
	}

	/**
	 * A booking can be cancelled while it is pending and also when it is in the
	 * confirmed state. For the moment, a cancelled booking is placed in the
	 * history list. The method is synchronized to avoid race conditions when
	 * removing bookings (and searching for the correct booking)
	 * 
	 * NOTE: A cancelled booking should make the associated rooms available for
	 * booking again during concerned dates. This will be implemented later.
	 * 
	 * @generated NOT
	 */
	public synchronized boolean cancelBooking(int bookingID) {
		// Save current size of list because concurrent activity may change
		// sizes
		int listSize = pendingBookings.size();

		// The lists are traversed separately because a booking should be
		// removed from the correct list
		for (int i = 0; i < listSize; i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				// Remove booked dates for room(s) so they get available again
				bookingHistory.add(pendingBookings.remove(i));
				return true;
			}
		}

		listSize = confirmedBookings.size();
		for (int i = 0; i < listSize; i++) {
			if (confirmedBookings.get(i).getBookingID() == bookingID) {
				// Remove booked dates for room(s) so they get available again
				bookingHistory.add(confirmedBookings.remove(i));
				return true;
			}
		}
		return false;
	}

	/**
	 * The customer is checked in by setting the status of the rooms in the
	 * booking to occupied.
	 * 
	 * Note: There should be some check when it is allowed to check-in.
	 * 
	 * @generated NOT
	 */
	public boolean checkIn(int bookingID) {
		// Booking booking = bookings.get(bookingID);
		if (confirmedBookings != null) {
			// List<Room> rooms = rooms.get(bookingID);
			// for (Room room : rooms) {
			// room.setStatus(RoomStatus.OCCUPIED);
			// }
			return true;
		}
		return false;
	}

	/**
	 * This method is synchronized to avoid problems with assigning wrong values
	 * to instance variables when different threads invoke the method at the
	 * same time. The first name, last name, email and phone number of the
	 * customer is added to a given pending booking. In case some of these
	 * fields have not been filled in by the customer, they are null.
	 * 
	 * Because the createPendingBooking() method is also synchronized, the
	 * bookingID should be unique for each booking.
	 *
	 * @generated NOT
	 */
	public synchronized boolean addCustomerInformationToBooking(int bookingID,
			String firstName, String lastName, String email, String ph) {
		for (int i = 0; i < pendingBookings.size(); i++) {
			if (pendingBookings.get(i).getBookingID() == bookingID) {
				Customer customer = pendingBookings.get(i).getCustomer();
				customer.setFirstName(firstName);
				customer.setLastName(lastName);
				customer.setEmail(email);
				customer.setPhoneNumber(ph);
				return true;
			}
		}
		return false;
	}

	/**
	 * A pending booking has not yet been stored in the system. The pending
	 * bookings are stored in the pendingBookings array. The method is
	 * synchronized to avoid several threads interfering, setting wrong
	 * attributes for each other and so on. A "place holder object" for the
	 * customer is created and referenced to from this pending booking.
	 * 
	 * The bookingID is returned for use when invoking the contains method on
	 * the pendingBooking array (if necessary, depends on how we implement it).
	 * 
	 * @generated NOT
	 */
	public synchronized int createPendingBooking(Date checkIn, Date checkOut,
			int guestCount) {

		// Test if the check-in date is not later than the check-out date
		if (checkIn.after(checkOut) || guestCount <= 0) {
			return -1;
		}
		
		BillImpl bill = new BillImpl();
		Customer customer = new CustomerImpl();
		Booking booking = new BookingImpl();
		booking.setBill(bill);
		booking.setCustomer(customer);
		booking.setCheckIn(checkIn);
		booking.setCheckOut(checkOut);
		booking.setNumberOfGuests(guestCount);
		booking.setBookingID(bookingsEver++);
		pendingBookings.add(booking);
		return booking.getBookingID();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean changeStatusOfRoom(String staffMemberUsername, int roomId,
			RoomStatus status) {
		IHotelManager hm = getIHotelManagerImpl();

		if (!hm.isStaffMemberLoggedIn(staffMemberUsername))
			return false; // not logged in!

		Room room = getRoomByID(roomId);
		room.setStatus(status);

		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConfirmedBookings())
					.basicAdd(otherEnd, msgs);
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
			if (iFinanceImpl != null)
				msgs = ((InternalEObject) iFinanceImpl).eInverseRemove(this,
						ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL,
						IFinanceImpl.class, msgs);
			return basicSetIFinanceImpl((IFinanceImpl) otherEnd, msgs);
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCustomer())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
			return ((InternalEList<?>) getConfirmedBookings()).basicRemove(
					otherEnd, msgs);
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
			return basicSetIFinanceImpl(null, msgs);
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
			return ((InternalEList<?>) getCustomer()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
			if (resolve)
				return getIHotelManagerImpl();
			return basicGetIHotelManagerImpl();
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY:
			return getBookingHistory();
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
			if (resolve)
				return getIFinanceImpl();
			return basicGetIFinanceImpl();
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
			return getCustomer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS:
			getConfirmedBookings().clear();
			getConfirmedBookings().addAll(
					(Collection<? extends Booking>) newValue);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
			getRoom().clear();
			getRoom().addAll((Collection<? extends Room>) newValue);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
			getPendingBookings().clear();
			getPendingBookings().addAll(
					(Collection<? extends Booking>) newValue);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL:
			setIHotelManagerImpl((IHotelManagerImpl) newValue);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY:
			getBookingHistory().clear();
			getBookingHistory()
					.addAll((Collection<? extends Booking>) newValue);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
			setIFinanceImpl((IFinanceImpl) newValue);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
			getCustomer().clear();
			getCustomer().addAll((Collection<? extends Customer>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
			setIHotelManagerImpl((IHotelManagerImpl) null);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY:
			getBookingHistory().clear();
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL:
			setIFinanceImpl((IFinanceImpl) null);
			return;
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
			getCustomer().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___UPDATE_BOOKING__INT_DATE_DATE_INT:
			return updateBooking((Integer) arguments.get(0),
					(Date) arguments.get(1), (Date) arguments.get(2),
					(Integer) arguments.get(3));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_ROOM_PENDING__INT_INT:
			return addRoomPending((Integer) arguments.get(0),
					(Integer) arguments.get(1));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CONFIRM_BOOKING__INT:
			return confirmBooking((Integer) arguments.get(0));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___SEARCH_ROOM__DATE_DATE_INT_STRING_INT:
			return searchRoom((Date) arguments.get(0), (Date) arguments.get(1),
					(Integer) arguments.get(2), (String) arguments.get(3),
					(Integer) arguments.get(4));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CANCEL_BOOKING__INT:
			return cancelBooking((Integer) arguments.get(0));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CHECK_IN__INT:
			return checkIn((Integer) arguments.get(0));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING:
			return addCustomerInformationToBooking((Integer) arguments.get(0),
					(String) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3), (String) arguments.get(4));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CREATE_PENDING_BOOKING__DATE_DATE_INT:
			return createPendingBooking((Date) arguments.get(0),
					(Date) arguments.get(1), (Integer) arguments.get(2));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CHANGE_STATUS_OF_ROOM__STRING_INT_ROOMSTATUS:
			return changeStatusOfRoom((String) arguments.get(0),
					(Integer) arguments.get(1), (RoomStatus) arguments.get(2));
		case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_CANCELLATION_FEE__INT:
			return addCancellationFee((Integer) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // IBookingManagementImplImpl
