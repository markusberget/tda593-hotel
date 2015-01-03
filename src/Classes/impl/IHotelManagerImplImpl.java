/**
 */
package Classes.impl;

import Classes.Booking;
import Classes.ClassesPackage;
import Classes.IBookingManagementImpl;
import Classes.IHotelManagerImpl;
import Classes.Room;
import Classes.RoomStatus;
import Classes.StaffMember;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IHotel Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.IHotelManagerImplImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link Classes.impl.IHotelManagerImplImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IHotelManagerImplImpl extends MinimalEObjectImpl.Container implements IHotelManagerImpl {

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */

	protected EList<StaffMember> staff;


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
	 * If you don't know what you're doing, don't FUCKING change these methods.
	 */
	private void internal_addStaffMember(StaffMember newStaff) {
		staff.add(newStaff);
	}
	private StaffMember internal_lookupStaffMember(String username) {
		for(StaffMember s : staff) {
			if(s.getUsername().equals(username)) {
				return s;
			}
		}

		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IHotelManagerImplImpl() {
		super();

		this.staff = new BasicEList<StaffMember>();

		// add an admin for testing purposes.
		StaffMember newStaffMember = ClassesFactoryImpl.eINSTANCE.createStaffMember();
		newStaffMember.setUsername("pelle");
		newStaffMember.setPassword("hunter2");
		newStaffMember.setFirstName("Pelle");
		newStaffMember.setLastName("Svantesson");
		newStaffMember.setEmail("pelle2@hotmail.com");
		newStaffMember.setPhoneNumber("33449");
		newStaffMember.setAddress("Aprilvägen 12");
		newStaffMember.setAdmin(true);

		this.internal_addStaffMember(newStaffMember);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.IHOTEL_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffMember> getStaff() {
		if (staff == null) {
			staff = new EObjectResolvingEList<StaffMember>(StaffMember.class, this, ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF);
		}
		return staff;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, iBookingManagementImpl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, newIBookingManagementImpl);
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
				msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL, IBookingManagementImpl.class, msgs);
			if (newIBookingManagementImpl != null)
				msgs = ((InternalEObject)newIBookingManagementImpl).eInverseAdd(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL, IBookingManagementImpl.class, msgs);
			msgs = basicSetIBookingManagementImpl(newIBookingManagementImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL, newIBookingManagementImpl, newIBookingManagementImpl));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean login(String username, String password) {
		StaffMember s = this.internal_lookupStaffMember(username);

		if(s == null) return false;

		if(s.isLoggedIn()) {
			// can't login twice!
			return false;
		}

		if(s.getPassword().equals(password)) {
			s.setIsLoggedIn(true);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addStaffMember(String adminUsername, String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, boolean admin) {

		// is the adding user logged in?
		if(!isStaffMemberLoggedIn(adminUsername)) {
			return false;
		}

		// is the adding user actually an admin?
		if(!isStaffMemberAdmin(adminUsername)) {
			return false;
		}

		// are the password and username of the new user okay?
		if(!isPasswordSecure(password) || !isValidUsername(username)) {
			return false;

		}

         // also, check whether a user with that username doesn't already exist!
		if(this.internal_lookupStaffMember(username) != null) {
			return false;
		}
		
		
		// Both the new username and password are fine! Create the new user:


		StaffMember newStaffMember = ClassesFactoryImpl.eINSTANCE.createStaffMember();

		newStaffMember.setUsername(username);
		newStaffMember.setPassword(password);
		newStaffMember.setFirstName(firstName);
		newStaffMember.setLastName(lastName);
		newStaffMember.setEmail(email);
		newStaffMember.setPhoneNumber(phoneNumber);
		newStaffMember.setAddress(address);
		newStaffMember.setAdmin(admin);

		// and finally, add the new user to the system. 
		this.internal_addStaffMember(newStaffMember);
		return true;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPasswordSecure(String password) {

		int numDigits = 0;
		int numLetters = 0;

		if(password.length() < 6) {
			// password is not long enough, so early exit.
			return false;
		}

		for(char ch : password.toCharArray()) {
			if(!(ch > 32 && ch < 127)) {

				// we won't allow unprintable ascii characters nor spaces.
				// For more information: http://www.asciitable.com/
				return false;
			}

			// if digit.
			if(ch >= 48 && ch <= 57) {
				++numDigits;
			} else if(( 65 <= ch && ch <= 90) || ( 97 <= ch && ch <= 122)) {
				++numLetters;
			}

		}

		// does the string fulfill the requirements?
		return (numDigits >= 2) && (numLetters >= 3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isValidUsername(String username) {
		for(char ch : username.toCharArray()) {
			if(!(
					(48 <= ch && ch <= 57) ||
					( 65 <= ch && ch <= 90) ||
					( 97 <= ch && ch <= 122))) {

				// characters that are not ASCII letters nor digits are not allowed:
				return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isStaffMemberLoggedIn(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return s == null ? null : s.isLoggedIn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean isStaffMemberAdmin(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return s == null ? null : s.isAdmin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberPassword(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getPassword();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberFirstName(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getFirstName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberLastName(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getLastName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberEmail(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getEmail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberPhoneNumber(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getPhoneNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffMemberAddress(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);
		return  s == null ? null : s.getAddress();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean logout(String username) {
		StaffMember s = this.internal_lookupStaffMember(username);

		// if staff member doesn't exist in the system. 
		if(s == null) return false;

		if(s.isLoggedIn()) {
			s.setIsLoggedIn(false);
			return true;
		} else {
			// can't logout twice!
			return false;
		}
	}

	/**
	 * The customer is checked in by setting the status of the room(s) in the
	 * booking to Occupied. Checking in is only allowed if the status of the
	 * room(s) is Available and the current date is the same as the check-in date.
	 * This method is used to check in to all room(s) in a booking at the same
	 * time. If a room in the booking has already been checked in to, it is just
	 * ignored.
	 * 
	 * @generated NOT
	 */
	public String checkInBooking(int bookingID) {
		EList<Booking> bookings = getIBookingManagementImpl().getConfirmedBookings();
		Booking booking = null;
		for (int i = 0; i < bookings.size(); i++) {
			if(bookings.get(i).getBookingID() == bookingID) {
				booking = bookings.get(i);
			}
		}
		Calendar currentDate = Calendar.getInstance();
		
		// Set parameters of currentDate to the check-in time of the date for comparison
		currentDate.set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH, Calendar.HOUR, 00);
		Calendar calTest = Calendar.getInstance();		// Used for comparison only
		
		if (booking == null) {
			return "Booking was not found, please try another bookingID";
		}
		
		EList<Room> rooms = booking.getRooms();
		EList<Integer> roomNumbersFail = new BasicEList<Integer>();
		EList<Integer> roomNumbersSuccess = new BasicEList<Integer>();
		int roomCheckIns = 0;		// Keep track of how many rooms are checked in
		calTest.setTime(booking.getCheckIn());
		if (calTest.get(0) == currentDate.get(0) && calTest.get(1) == currentDate.get(1)
				&& calTest.get(2) == currentDate.get(2) && currentDate.get(3) >= calTest.get(3)) {
			for (Room room : rooms) {
				roomNumbersFail.add(room.getRoomNumber());		// Add room's number to list
				if (room.getStatus() == RoomStatus.AVAILABLE) {
					room.setStatus(RoomStatus.OCCUPIED);
					roomCheckIns++;		
					roomNumbersSuccess.add(roomNumbersFail.remove(roomNumbersFail.size()-1));
				}
			}
			if (roomCheckIns == rooms.size()) {
				return "Checked in successfully to rooms " + roomNumbersSuccess.toString();
			} else {
				return "Failed to check in to rooms " + roomNumbersFail.toString();
			}
		}
		return "Check-in failed";
	}
	
	/**
	 * Change status of a room.
	 * 
	 * @generated NOT
	 */
	public String changeStatusOfRoom(int roomID, String status) {
		String message = "Status of room could not be changed";
		EList<Room> rooms = getIBookingManagementImpl().getRoom();
		Room room = null;
		for (int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).getRoomNumber() == roomID) {
				room = rooms.get(i);
			}
		}
		
		if (room == null) {
			return "Room could not be found";
		}
		
		if (status == RoomStatus.AVAILABLE.toString()) {
			room.setStatus(RoomStatus.AVAILABLE);
			message = "Changed status of room " + roomID + " to Available";
		} else if (status == RoomStatus.OCCUPIED.toString()) {
			room.setStatus(RoomStatus.OCCUPIED);
			message = "Changed status of room " + roomID + " to Occupied";
		} else if (status == RoomStatus.CLEANING.toString()) {
			room.setStatus(RoomStatus.CLEANING);
			message = "Changed status of room " + roomID + " to Cleaning";
		}
		return message;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				if (iBookingManagementImpl != null)
					msgs = ((InternalEObject)iBookingManagementImpl).eInverseRemove(this, ClassesPackage.IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL, IBookingManagementImpl.class, msgs);
				return basicSetIBookingManagementImpl((IBookingManagementImpl)otherEnd, msgs);
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
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				return basicSetIBookingManagementImpl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	/**
	 * The customer is checked in by setting the status of the room to Occupied.
	 * Checking in is only allowed if the status of the room is Available and the
	 * room's check-in date is the same as the current date. This method is used to
	 * check in to a specific room.
	 * 
	 * @generated NOT
	 */
	public String checkIn(int roomID) {
		Room room = null;
		EList<Room> rooms = getIBookingManagementImpl().getRoom();
		for (int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).getRoomNumber() == roomID) {
				room = rooms.get(i);
			}
		}
		
		Calendar currentDate = Calendar.getInstance();
		
		// Set parameters of currentDate to the check-in time of the date for comparison
		// Hour of currentDate must be equal or greater than hour of check-in Date
		currentDate.set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH, Calendar.HOUR, 00);
		Calendar calTest = Calendar.getInstance();
		
		if (room == null) {
			return "Room was not found, please try another room number";
		}
		if (room.getStatus() != RoomStatus.AVAILABLE) {
			return "Cannot check in since room is currently not available";
		}
		EList<Booking> bookings = room.getBookings();
		// Check that the room has been booked for this particular date
		if (bookings.isEmpty()) {
			return "Could not check in since no booking is made for the room";
		} else {
			for (Booking booking : bookings) {
				calTest.setTime(booking.getCheckIn());
				if (calTest.get(0) == currentDate.get(0) && calTest.get(1) == currentDate.get(1)
						&& calTest.get(2) == currentDate.get(2) && currentDate.get(3) >= calTest.get(3)) {
					room.setStatus(RoomStatus.OCCUPIED);
					return "Checked in successfully";
				}
			}
		}
		return "Check-in failed";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				return getStaff();
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				if (resolve) return getIBookingManagementImpl();
				return basicGetIBookingManagementImpl();
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
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends StaffMember>)newValue);
				return;
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)newValue);
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
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				getStaff().clear();
				return;
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)null);
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
			case ClassesPackage.IHOTEL_MANAGER_IMPL__STAFF:
				return staff != null && !staff.isEmpty();
			case ClassesPackage.IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL:
				return iBookingManagementImpl != null;
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
			case ClassesPackage.IHOTEL_MANAGER_IMPL___LOGIN__STRING_STRING:
				return login((String)arguments.get(0), (String)arguments.get(1));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_BOOLEAN:
				return addStaffMember((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (Boolean)arguments.get(8));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_PASSWORD_SECURE__STRING:
				return isPasswordSecure((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_VALID_USERNAME__STRING:
				return isValidUsername((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_LOGGED_IN__STRING:
				return isStaffMemberLoggedIn((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_ADMIN__STRING:
				return isStaffMemberAdmin((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_PASSWORD__STRING:
				return getStaffMemberPassword((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_FIRST_NAME__STRING:
				return getStaffMemberFirstName((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_LAST_NAME__STRING:
				return getStaffMemberLastName((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_EMAIL__STRING:
				return getStaffMemberEmail((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_PHONE_NUMBER__STRING:
				return getStaffMemberPhoneNumber((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_ADDRESS__STRING:
				return getStaffMemberAddress((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___LOGOUT__STRING:
				return logout((String)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___CHECK_IN__INT:
				return checkIn((Integer)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___CHECK_IN_BOOKING__INT:
				return checkInBooking((Integer)arguments.get(0));
			case ClassesPackage.IHOTEL_MANAGER_IMPL___CHANGE_STATUS_OF_ROOM__INT_STRING:
				return changeStatusOfRoom((Integer)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IHotelManagerImplImpl
