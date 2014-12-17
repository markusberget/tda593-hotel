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
 *   <li>{@link Classes.IBookingManagementImpl#getConfirmedBookings <em>Confirmed Bookings</em>}</li>
 *   <li>{@link Classes.IBookingManagementImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.IBookingManagementImpl#getPendingBookings <em>Pending Bookings</em>}</li>
 *   <li>{@link Classes.IBookingManagementImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}</li>
 *   <li>{@link Classes.IBookingManagementImpl#getIFinanceImpl <em>IFinance Impl</em>}</li>
 *   <li>{@link Classes.IBookingManagementImpl#getBookingHistory <em>Booking History</em>}</li>
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
	 * Returns the value of the '<em><b>Confirmed Bookings</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * It is bidirectional and its opposite is '{@link Classes.Booking#getIBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmed Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmed Bookings</em>' reference list.
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_ConfirmedBookings()
	 * @see Classes.Booking#getIBookingManagementImpl
	 * @model opposite="iBookingManagementImpl" ordered="false"
	 * @generated
	 */
	EList<Booking> getConfirmedBookings();

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
	 * Returns the value of the '<em><b>Pending Bookings</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Bookings</em>' reference list.
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_PendingBookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getPendingBookings();

	/**
	 * Returns the value of the '<em><b>IHotel Manager Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IHotel Manager Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IHotel Manager Impl</em>' reference.
	 * @see #setIHotelManagerImpl(IHotelManagerImpl)
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_IHotelManagerImpl()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IHotelManagerImpl getIHotelManagerImpl();

	/**
	 * Sets the value of the '{@link Classes.IBookingManagementImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IHotel Manager Impl</em>' reference.
	 * @see #getIHotelManagerImpl()
	 * @generated
	 */
	void setIHotelManagerImpl(IHotelManagerImpl value);

	/**
	 * Returns the value of the '<em><b>IFinance Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IFinance Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IFinance Impl</em>' reference.
	 * @see #setIFinanceImpl(IBookingManagementImpl)
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_IFinanceImpl()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookingManagementImpl getIFinanceImpl();

	/**
	 * Sets the value of the '{@link Classes.IBookingManagementImpl#getIFinanceImpl <em>IFinance Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IFinance Impl</em>' reference.
	 * @see #getIFinanceImpl()
	 * @generated
	 */
	void setIFinanceImpl(IBookingManagementImpl value);

	/**
	 * Returns the value of the '<em><b>Booking History</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking History</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking History</em>' reference list.
	 * @see Classes.ClassesPackage#getIBookingManagementImpl_BookingHistory()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getBookingHistory();

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
