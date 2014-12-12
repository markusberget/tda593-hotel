/**
 */
package Classes.impl;

import Classes.Booking;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.IBookingManagementImpl;
import Classes.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IBooking Management Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getPendingBookings <em>Pending Bookings</em>}</li>
 *   <li>{@link Classes.impl.IBookingManagementImplImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IBookingManagementImplImpl extends MinimalEObjectImpl.Container implements IBookingManagementImpl {
	
	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> booking;
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;
	// These data structures are used for storing temporary data while performing tests.
	public EList<Booking> pendingBookings;
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;
	private ArrayList<Booking> confirmedBookings;
	private ArrayList<Room> availableRooms;
	private ArrayList<Booking> bookingHistory;
	
	// A list of rooms is used as the value in the HashMap because a customer should be
	// able to have several rooms in a booking. The key part is the bookingID.
	private Map<Integer, List<Room>> pendingRooms;
	private Map<Integer, List<Room>> occupiedRooms;		// Contains booked rooms
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IBookingManagementImplImpl() {
		super();
	}
	
	/**
	 * This method is just temporary for early testing, will be
	 * removed shortly.
	 * 
	 * @return 		a new object of the class
	 */
	public static IBookingManagementImplImpl instantiateForTest() {
		return new IBookingManagementImplImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.IBOOKING_MANAGEMENT_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBooking() {
		if (booking == null) {
			booking = new EObjectWithInverseResolvingEList<Booking>(Booking.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING, ClassesPackage.BOOKING__IBOOKING_MANAGEMENT_IMPL);
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getPendingBookings() {
		if (pendingBookings == null) {
			pendingBookings = new EObjectResolvingEList<Booking>(Booking.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS);
		}
		return pendingBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectWithInverseResolvingEList<Customer>(Customer.class, this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER, ClassesPackage.CUSTOMER__IBOOKING_MANAGEMENT_IMPL);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the booking object with the corresponding bookingNumber
	 * containing its information. Only the list of confirmed bookings is
	 * checked because a pending booking is already "active".
	 *
	 * @generated NOT
	 */
	public Booking getBooking(int bookingNumber) {
		return confirmedBookings.get(bookingNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBooking(int roomID, Date date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Removes an available room from the list of available rooms to the
	 * list of pending rooms after a user has chosen to add the room
	 * to his/her pending booking. By using the bookingID as the key in
	 * the HashMap the now pending room will be associated with the
	 * correct booking.
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public int addRoomPending(int room, int bookingID) {
		Room chosenRoom = availableRooms.remove(room);
		
		// TODO: fix this, joel. 
		//chosenRoom.setStatusoccupiedreadypending(true);		// should be set to pending
		pendingRooms.put(bookingID, (List<Room>) chosenRoom);
		return bookingID;
	}

	/**
	 * Confirms a booking by removing the booking from the pending bookings list
	 * and adding it to the confirmed bookings list instead.
	 * 
	 * @generated NOT
	 */
	public boolean confirmBooking(int bookingID) {
		confirmedBookings.add(bookingID, pendingBookings.remove(bookingID));
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCancelationFee(Class TODO) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList searchRoom(Date checkIn, Date checkOut, Class featureList, int numberOfGuests, int roomType, int maximumPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * A booking can be cancelled while it is pending and also when it is
	 * in the confirmed state. For the moment, a cancelled booking is
	 * placed in the history list.
	 * 
	 * @generated NOT
	 */
	public boolean cancelBooking(int bookingID) {
		if (pendingBookings.get(bookingID) != null) {
			return bookingHistory.add(pendingBookings.remove(bookingID));
		}
		else if (confirmedBookings.get(bookingID) != null) {
			return bookingHistory.add(confirmedBookings.remove(bookingID));
		}
		return false;
	}

	/**
	 * The customer is checked in by setting the status of the rooms
	 * in the booking to occupied.
	 * 
	 * Note: There should be some check when it is allowed to check-in.
	 * 
	 * @generated NOT
	 */
	public boolean checkIn(int bookingID) {
		Booking booking = confirmedBookings.get(bookingID);
		if (booking != null) {
			List<Room> rooms = occupiedRooms.get(bookingID);
			for(Room room : rooms) {
				// TODO: fix this, joel.
				//room.setStatusoccupiedreadypending(true);		// should be set to occupied
			}
			return true;
		}
		return false;
	}

	/**
	 * This method checks the customer out from the hotel, but first the status
	 * of the booking is checked if it is payed. A customer cannot check out
	 * before the booking is payed for.
	 * 
	 * @generated NOT
	 */
	public boolean checkOut(int bookingID) {
		Booking booking = confirmedBookings.get(bookingID);
		if (booking.isFullyPaid()) {		// payed is set to true after payment method has succeeded
			List<Room> rooms = occupiedRooms.remove(bookingID);
			for(Room room : rooms) {
				// TODO: fix this, joel.
				//room.setStatusoccupiedreadypending(true);		// should be set to cleaning
			}
			return true;
		}
		return false;
	}

	/**
	 * This method is synchronized to avoid some problems when
	 * different threads invoke the method at the same time. The
	 * first name, last name, email and phone number of the customer
	 * is added to a given pending booking. In case some of these fields
	 * have not been filled in by the customer, they are null.
	 *
	 * @generated NOT
	 */
	public synchronized boolean addCustomerInformationToBooking(int bookingID, String firstName, String lastName, String email, String ph) {
		pendingBookings.get(bookingID).setFirstName(firstName);
		pendingBookings.get(bookingID).setLastName(lastName);
		pendingBookings.get(bookingID).setEmail(email);
		pendingBookings.get(bookingID).setPhoneNumber(ph);
		return true;
	}

	/**
	 * A pending booking has not yet been stored in the system. The pending bookings
	 * are stored in the pendingBookings array. The method is synchronized to avoid
	 * several threads interfering, setting wrong attributes for each other and so on.
	 * 
	 * The bookingID is returned for use when invoking the contains method on the
	 * pendingBooking array (if necessary, depends on how we implement it).
	 * 
	 * @generated NOT
	 */
	public synchronized int createPendingBooking(Date checkIn, Date checkOut, int guestCount) {
		BookingImpl booking = new BookingImpl();
		booking.setCheckIn(checkIn);
		booking.setCheckOut(checkOut);
		booking.setNumberOfGuests(guestCount);
		booking.setBookingID();
		pendingBookings.add(booking.getBookingID() , booking);
		return booking.getBookingID();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooking()).basicAdd(otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomer()).basicAdd(otherEnd, msgs);
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING:
				return ((InternalEList<?>)getBooking()).basicRemove(otherEnd, msgs);
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return ((InternalEList<?>)getCustomer()).basicRemove(otherEnd, msgs);
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING:
				return getBooking();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				return getRoom();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				return getPendingBookings();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return getCustomer();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING:
				getBooking().clear();
				getBooking().addAll((Collection<? extends Booking>)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				getPendingBookings().clear();
				getPendingBookings().addAll((Collection<? extends Booking>)newValue);
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends Customer>)newValue);
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING:
				getBooking().clear();
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				getRoom().clear();
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				getPendingBookings().clear();
				return;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				getCustomer().clear();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__BOOKING:
				return booking != null && !booking.isEmpty();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__ROOM:
				return room != null && !room.isEmpty();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS:
				return pendingBookings != null && !pendingBookings.isEmpty();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL__CUSTOMER:
				return customer != null && !customer.isEmpty();
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___UPDATE_BOOKING:
				updateBooking();
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___GET_BOOKING__INT_DATE:
				getBooking((Integer)arguments.get(0), (Date)arguments.get(1));
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_ROOM_PENDING__INT_INT:
				return addRoomPending((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CONFIRM_BOOKING__INT:
				return confirmBooking((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_CANCELATION_FEE__CLASS:
				addCancelationFee((Class)arguments.get(0));
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___SEARCH_ROOM__DATE_DATE_CLASS_INT_INT_INT:
				return searchRoom((Date)arguments.get(0), (Date)arguments.get(1), (Class)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CANCEL_BOOKING__INT:
				return cancelBooking((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CHECK_IN__INT:
				return checkIn((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CHECK_OUT__INT:
				return checkOut((Integer)arguments.get(0));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING:
				return addCustomerInformationToBooking((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CREATE_PENDING_BOOKING__DATE_DATE_INT:
				return createPendingBooking((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IBookingManagementImplImpl
