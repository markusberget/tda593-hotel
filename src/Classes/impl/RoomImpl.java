/**
 */
package Classes.impl;

import Classes.Booking;
import Classes.ClassesPackage;
import Classes.Room;
import Classes.RoomStatus;
import Classes.RoomType;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.RoomImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getBookedDates <em>Booked Dates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RoomStatus STATUS_EDEFAULT = RoomStatus.OCCUPIED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RoomStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookings;

	/**
	 * The cached value of the '{@link #getBookedDates() <em>Booked Dates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedDates()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> bookedDates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}
	
	/**
	 * This constructor is used for testing purposes.
	 * 
	 * @generated NOT
	 */
	protected RoomImpl(int roomNumber, RoomType roomType) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	/**
	 * Instantiation method for Room used for testing.
	 * 
	 * @param roomNumber		desired room number
	 * @param roomType			desired room type
	 * @return							a newly created room
	 * @generated NOT
	 */
	public static RoomImpl instantiateForTest(int roomNumber, RoomType roomType) {
		return new RoomImpl(roomNumber, roomType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RoomStatus newStatus) {
		RoomStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomType(RoomType newRoomType, NotificationChain msgs) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM__ROOM_TYPE, oldRoomType, newRoomType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		if (newRoomType != roomType) {
			NotificationChain msgs = null;
			if (roomType != null)
				msgs = ((InternalEObject)roomType).eInverseRemove(this, ClassesPackage.ROOM_TYPE__ROOM, RoomType.class, msgs);
			if (newRoomType != null)
				msgs = ((InternalEObject)newRoomType).eInverseAdd(this, ClassesPackage.ROOM_TYPE__ROOM, RoomType.class, msgs);
			msgs = basicSetRoomType(newRoomType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM__ROOM_TYPE, newRoomType, newRoomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectWithInverseResolvingEList.ManyInverse<Booking>(Booking.class, this, ClassesPackage.ROOM__BOOKINGS, ClassesPackage.BOOKING__ROOMS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getBookedDates() {
		if (bookedDates == null) {
			bookedDates = new EDataTypeUniqueEList<Date>(Date.class, this, ClassesPackage.ROOM__BOOKED_DATES);
		}
		return bookedDates;
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
			case ClassesPackage.ROOM__ROOM_TYPE:
				if (roomType != null)
					msgs = ((InternalEObject)roomType).eInverseRemove(this, ClassesPackage.ROOM_TYPE__ROOM, RoomType.class, msgs);
				return basicSetRoomType((RoomType)otherEnd, msgs);
			case ClassesPackage.ROOM__BOOKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBookings()).basicAdd(otherEnd, msgs);
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
			case ClassesPackage.ROOM__ROOM_TYPE:
				return basicSetRoomType(null, msgs);
			case ClassesPackage.ROOM__BOOKINGS:
				return ((InternalEList<?>)getBookings()).basicRemove(otherEnd, msgs);
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
			case ClassesPackage.ROOM__STATUS:
				return getStatus();
			case ClassesPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case ClassesPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case ClassesPackage.ROOM__BOOKINGS:
				return getBookings();
			case ClassesPackage.ROOM__BOOKED_DATES:
				return getBookedDates();
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
			case ClassesPackage.ROOM__STATUS:
				setStatus((RoomStatus)newValue);
				return;
			case ClassesPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case ClassesPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case ClassesPackage.ROOM__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends Booking>)newValue);
				return;
			case ClassesPackage.ROOM__BOOKED_DATES:
				getBookedDates().clear();
				getBookedDates().addAll((Collection<? extends Date>)newValue);
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
			case ClassesPackage.ROOM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ClassesPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case ClassesPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case ClassesPackage.ROOM__BOOKINGS:
				getBookings().clear();
				return;
			case ClassesPackage.ROOM__BOOKED_DATES:
				getBookedDates().clear();
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
			case ClassesPackage.ROOM__STATUS:
				return status != STATUS_EDEFAULT;
			case ClassesPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case ClassesPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case ClassesPackage.ROOM__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case ClassesPackage.ROOM__BOOKED_DATES:
				return bookedDates != null && !bookedDates.isEmpty();
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
		result.append(" (status: ");
		result.append(status);
		result.append(", roomNumber: ");
		result.append(roomNumber);
		result.append(", bookedDates: ");
		result.append(bookedDates);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
