/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Customer#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends IPerson {
	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * It is bidirectional and its opposite is '{@link Classes.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see Classes.ClassesPackage#getCustomer_Booking()
	 * @see Classes.Booking#getCustomer
	 * @model opposite="customer" ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();

} // Customer
