/**
 */
package Classes.impl;

import Classes.Booking;
import Classes.ClassesPackage;
import Classes.IHotelManagerImpl;
import Classes.Room;
import Classes.RoomType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.RoomImpl#isStatusoccupiedreadypending <em>Statusoccupiedreadypending</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #isStatusoccupiedreadypending() <em>Statusoccupiedreadypending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusoccupiedreadypending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUSOCCUPIEDREADYPENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatusoccupiedreadypending() <em>Statusoccupiedreadypending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusoccupiedreadypending()
	 * @generated
	 * @ordered
	 */
	protected boolean statusoccupiedreadypending = STATUSOCCUPIEDREADYPENDING_EDEFAULT;

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
	 * The cached value of the '{@link #getIHotelManagerImpl() <em>IHotel Manager Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHotelManagerImpl()
	 * @generated
	 * @ordered
	 */
	protected IHotelManagerImpl iHotelManagerImpl;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
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
	public boolean isStatusoccupiedreadypending() {
		return statusoccupiedreadypending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusoccupiedreadypending(boolean newStatusoccupiedreadypending) {
		boolean oldStatusoccupiedreadypending = statusoccupiedreadypending;
		statusoccupiedreadypending = newStatusoccupiedreadypending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM__STATUSOCCUPIEDREADYPENDING, oldStatusoccupiedreadypending, statusoccupiedreadypending));
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
	public IHotelManagerImpl getIHotelManagerImpl() {
		if (iHotelManagerImpl != null && iHotelManagerImpl.eIsProxy()) {
			InternalEObject oldIHotelManagerImpl = (InternalEObject)iHotelManagerImpl;
			iHotelManagerImpl = (IHotelManagerImpl)eResolveProxy(oldIHotelManagerImpl);
			if (iHotelManagerImpl != oldIHotelManagerImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL, oldIHotelManagerImpl, iHotelManagerImpl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL, oldIHotelManagerImpl, newIHotelManagerImpl);
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
				msgs = ((InternalEObject)iHotelManagerImpl).eInverseRemove(this, ClassesPackage.IHOTEL_MANAGER_IMPL__ROOM, IHotelManagerImpl.class, msgs);
			if (newIHotelManagerImpl != null)
				msgs = ((InternalEObject)newIHotelManagerImpl).eInverseAdd(this, ClassesPackage.IHOTEL_MANAGER_IMPL__ROOM, IHotelManagerImpl.class, msgs);
			msgs = basicSetIHotelManagerImpl(newIHotelManagerImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL, newIHotelManagerImpl, newIHotelManagerImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBooking() {
		if (booking == null) {
			booking = new EObjectWithInverseResolvingEList.ManyInverse<Booking>(Booking.class, this, ClassesPackage.ROOM__BOOKING, ClassesPackage.BOOKING__ROOM);
		}
		return booking;
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
			case ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL:
				if (iHotelManagerImpl != null)
					msgs = ((InternalEObject)iHotelManagerImpl).eInverseRemove(this, ClassesPackage.IHOTEL_MANAGER_IMPL__ROOM, IHotelManagerImpl.class, msgs);
				return basicSetIHotelManagerImpl((IHotelManagerImpl)otherEnd, msgs);
			case ClassesPackage.ROOM__BOOKING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooking()).basicAdd(otherEnd, msgs);
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
			case ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL:
				return basicSetIHotelManagerImpl(null, msgs);
			case ClassesPackage.ROOM__BOOKING:
				return ((InternalEList<?>)getBooking()).basicRemove(otherEnd, msgs);
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
			case ClassesPackage.ROOM__STATUSOCCUPIEDREADYPENDING:
				return isStatusoccupiedreadypending();
			case ClassesPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case ClassesPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL:
				if (resolve) return getIHotelManagerImpl();
				return basicGetIHotelManagerImpl();
			case ClassesPackage.ROOM__BOOKING:
				return getBooking();
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
			case ClassesPackage.ROOM__STATUSOCCUPIEDREADYPENDING:
				setStatusoccupiedreadypending((Boolean)newValue);
				return;
			case ClassesPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case ClassesPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL:
				setIHotelManagerImpl((IHotelManagerImpl)newValue);
				return;
			case ClassesPackage.ROOM__BOOKING:
				getBooking().clear();
				getBooking().addAll((Collection<? extends Booking>)newValue);
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
			case ClassesPackage.ROOM__STATUSOCCUPIEDREADYPENDING:
				setStatusoccupiedreadypending(STATUSOCCUPIEDREADYPENDING_EDEFAULT);
				return;
			case ClassesPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case ClassesPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL:
				setIHotelManagerImpl((IHotelManagerImpl)null);
				return;
			case ClassesPackage.ROOM__BOOKING:
				getBooking().clear();
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
			case ClassesPackage.ROOM__STATUSOCCUPIEDREADYPENDING:
				return statusoccupiedreadypending != STATUSOCCUPIEDREADYPENDING_EDEFAULT;
			case ClassesPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case ClassesPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case ClassesPackage.ROOM__IHOTEL_MANAGER_IMPL:
				return iHotelManagerImpl != null;
			case ClassesPackage.ROOM__BOOKING:
				return booking != null && !booking.isEmpty();
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
		result.append(" (statusoccupiedreadypending: ");
		result.append(statusoccupiedreadypending);
		result.append(", roomNumber: ");
		result.append(roomNumber);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
