/**
 */
package Classes.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.ClassesPackage;
import Classes.IBookingManagementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IBooking Management Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IBookingManagementImplImpl extends MinimalEObjectImpl.Container implements IBookingManagementImpl {
	
	// These data structures are used for storing temporary data while performing tests.
	ArrayList<BookingImpl> pendingBookings = new ArrayList<>();
	ArrayList<BookingImpl> confirmedBookings = new ArrayList<>();
	ArrayList<RoomImpl> availableRooms = new ArrayList<>();
	ArrayList<RoomImpl> occupiedRooms = new ArrayList<>();
	
	// A list of rooms is used as the value in the HashMap because a customer should be
	// able to have several rooms in a booking.
	Map<Integer, List<RoomImpl>> pendingRooms = new HashMap<Integer, List<RoomImpl>>();
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IBookingManagementImplImpl() {
		super();
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
	public void updateBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBooking(int bookingNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		RoomImpl chosenRoom = availableRooms.remove(room);
		chosenRoom.setStatusoccupiedreadypending(true);		// should be set to pending
		pendingRooms.put(bookingID, (List<RoomImpl>) chosenRoom);
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean confirmBooking(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public void searchRoom(Date checkIn, Date checkOut, Class featureList, int numberOfGuests, int roomType, int maximumPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(Class TODO) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(Class TODO) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * This method is synchronized to avoid some problems when
	 * different threads invoke the method at the same time.
	 *
	 * @generated NOT
	 */
	public synchronized boolean addCustomerInformationToBooking(int bookingID, String firstName, String lastName, String email, String ph) {
		// There are no firstname, lastname, email or phonenumber instance variables in BookingImpl
		// pendingBookings.get(bookingID).setFirstName(firstName);
		// pendingBookings.get(bookingID).setLastName(lastName);
		// pendingBookings.get(bookingID).setEmail(email);
		// pendingBookings.get(bookingID).setPhoneNumber(ph);
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___UPDATE_BOOKING:
				updateBooking();
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___GET_BOOKING__INT:
				getBooking((Integer)arguments.get(0));
				return null;
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
				searchRoom((Date)arguments.get(0), (Date)arguments.get(1), (Class)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CANCEL_BOOKING__INT:
				cancelBooking((Integer)arguments.get(0));
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CHECK_IN__CLASS:
				checkIn((Class)arguments.get(0));
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CHECK_OUT__CLASS:
				checkOut((Class)arguments.get(0));
				return null;
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING:
				return addCustomerInformationToBooking((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL___CREATE_PENDING_BOOKING__DATE_DATE_INT:
				return createPendingBooking((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IBookingManagementImplImpl
