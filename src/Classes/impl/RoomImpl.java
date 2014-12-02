/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.RoomImpl#isStatusoccupiedreadypending <em>Statusoccupiedreadypending</em>}</li>
 *   <li>{@link Classes.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.ROOM__STATUSOCCUPIEDREADYPENDING:
				return isStatusoccupiedreadypending();
			case ClassesPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassesPackage.ROOM__STATUSOCCUPIEDREADYPENDING:
				setStatusoccupiedreadypending((Boolean)newValue);
				return;
			case ClassesPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
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
