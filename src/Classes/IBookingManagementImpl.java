/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Management Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.IBookingManagementImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.IBookingManagementImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.IBookingManagementImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getIBookingManagementImpl()
 * @model
 * @generated
 */
public interface IBookingManagementImpl extends IBookingManagement {

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * It is bidirectional and its opposite is '{@link Classes.Booking#getIBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_Booking()
	 * @see Classes.Booking#getIBookingManagementImpl
	 * @model opposite="iBookingManagementImpl" ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link Classes.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_Room()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference list.
	 * The list contents are of type {@link Classes.Customer}.
	 * It is bidirectional and its opposite is '{@link Classes.Customer#getIBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference list.
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_Customer()
	 * @see Classes.Customer#getIBookingManagementImpl
	 * @model opposite="iBookingManagementImpl" ordered="false"
	 * @generated
	 */
	EList<Customer> getCustomer();
} // IBookingManagementImpl
