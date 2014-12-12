/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Room#getStatus <em>Status</em>}</li>
 *   <li>{@link Classes.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Classes.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Classes.Room#getIHotelManagerImpl <em>IHotel Manager Impl</em>}</li>
 *   <li>{@link Classes.Room#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Classes.RoomStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see Classes.RoomStatus
	 * @see #setStatus(RoomStatus)
	 * @see Classes.ClassesPackage#getRoom_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomStatus getStatus();

	/**
	 * Sets the value of the '{@link Classes.Room#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see Classes.RoomStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RoomStatus value);

	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see Classes.ClassesPackage#getRoom_RoomNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link Classes.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.RoomType#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(RoomType)
	 * @see Classes.ClassesPackage#getRoom_RoomType()
	 * @see Classes.RoomType#getRoom
	 * @model opposite="room" required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link Classes.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>IHotel Manager Impl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.IHotelManagerImpl#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IHotel Manager Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IHotel Manager Impl</em>' reference.
	 * @see #setIHotelManagerImpl(IHotelManagerImpl)
	 * @see Classes.ClassesPackage#getRoom_IHotelManagerImpl()
	 * @see Classes.IHotelManagerImpl#getRoom
	 * @model opposite="room" required="true" ordered="false"
	 * @generated
	 */
	IHotelManagerImpl getIHotelManagerImpl();

	/**
	 * Sets the value of the '{@link Classes.Room#getIHotelManagerImpl <em>IHotel Manager Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IHotel Manager Impl</em>' reference.
	 * @see #getIHotelManagerImpl()
	 * @generated
	 */
	void setIHotelManagerImpl(IHotelManagerImpl value);

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * It is bidirectional and its opposite is '{@link Classes.Booking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see Classes.ClassesPackage#getRoom_Booking()
	 * @see Classes.Booking#getRoom
	 * @model opposite="room" ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();

} // Room
