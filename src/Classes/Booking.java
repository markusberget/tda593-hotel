/**
 */
package Classes;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Booking#getCheckIn <em>Check In</em>}</li>
 *   <li>{@link Classes.Booking#getCheckOut <em>Check Out</em>}</li>
 *   <li>{@link Classes.Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link Classes.Booking#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link Classes.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Classes.Booking#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 *   <li>{@link Classes.Booking#getBill <em>Bill</em>}</li>
 *   <li>{@link Classes.Booking#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Check In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In</em>' attribute.
	 * @see #setCheckIn(Date)
	 * @see Classes.ClassesPackage#getBooking_CheckIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckIn();

	/**
	 * Sets the value of the '{@link Classes.Booking#getCheckIn <em>Check In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In</em>' attribute.
	 * @see #getCheckIn()
	 * @generated
	 */
	void setCheckIn(Date value);

	/**
	 * Returns the value of the '<em><b>Check Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out</em>' attribute.
	 * @see #setCheckOut(Date)
	 * @see Classes.ClassesPackage#getBooking_CheckOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckOut();

	/**
	 * Sets the value of the '{@link Classes.Booking#getCheckOut <em>Check Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out</em>' attribute.
	 * @see #getCheckOut()
	 * @generated
	 */
	void setCheckOut(Date value);

	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see Classes.ClassesPackage#getBooking_BookingID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link Classes.Booking#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Guests</em>' attribute.
	 * @see #setNumberOfGuests(int)
	 * @see Classes.ClassesPackage#getBooking_NumberOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * Sets the value of the '{@link Classes.Booking#getNumberOfGuests <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Guests</em>' attribute.
	 * @see #getNumberOfGuests()
	 * @generated
	 */
	void setNumberOfGuests(int value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Customer#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see Classes.ClassesPackage#getBooking_Customer()
	 * @see Classes.Customer#getBooking
	 * @model opposite="booking" required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link Classes.Booking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>IBooking Management Impl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.IBookingManagementImpl#getConfirmedBookings <em>Confirmed Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBooking Management Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #setIBookingManagementImpl(IBookingManagementImpl)
	 * @see Classes.ClassesPackage#getBooking_IBookingManagementImpl()
	 * @see Classes.IBookingManagementImpl#getConfirmedBookings
	 * @model opposite="confirmedBookings" required="true" ordered="false"
	 * @generated
	 */
	IBookingManagementImpl getIBookingManagementImpl();

	/**
	 * Sets the value of the '{@link Classes.Booking#getIBookingManagementImpl <em>IBooking Management Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	void setIBookingManagementImpl(IBookingManagementImpl value);

	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference.
	 * @see #setBill(Bill)
	 * @see Classes.ClassesPackage#getBooking_Bill()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bill getBill();

	/**
	 * Sets the value of the '{@link Classes.Booking#getBill <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill</em>' reference.
	 * @see #getBill()
	 * @generated
	 */
	void setBill(Bill value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link Classes.Room}.
	 * It is bidirectional and its opposite is '{@link Classes.Room#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see Classes.ClassesPackage#getBooking_Rooms()
	 * @see Classes.Room#getBookings
	 * @model opposite="bookings" ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

} // Booking
