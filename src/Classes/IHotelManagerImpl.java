/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.IHotelManagerImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.IHotelManagerImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link Classes.IHotelManagerImpl#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getIHotelManagerImpl()
 * @model
 * @generated
 */
public interface IHotelManagerImpl extends IHotelManager {

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * It is bidirectional and its opposite is '{@link Classes.Booking#getIHotelManagerImpl <em>IHotel Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see Classes.ClassesPackage#getIHotelManagerImpl_Booking()
	 * @see Classes.Booking#getIHotelManagerImpl
	 * @model opposite="iHotelManagerImpl" ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link Classes.StaffMember}.
	 * It is bidirectional and its opposite is '{@link Classes.StaffMember#getIHotelManagerImpl <em>IHotel Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see Classes.ClassesPackage#getIHotelManagerImpl_Staff()
	 * @see Classes.StaffMember#getIHotelManagerImpl
	 * @model opposite="iHotelManagerImpl" ordered="false"
	 * @generated
	 */
	EList<StaffMember> getStaff();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link Classes.Room}.
	 * It is bidirectional and its opposite is '{@link Classes.Room#getIHotelManagerImpl <em>IHotel Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see Classes.ClassesPackage#getIHotelManagerImpl_Room()
	 * @see Classes.Room#getIHotelManagerImpl
	 * @model opposite="iHotelManagerImpl" ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();
} // IHotelManagerImpl
