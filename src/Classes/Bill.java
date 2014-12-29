/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bill#getCharge <em>Charge</em>}</li>
 *   <li>{@link Classes.Bill#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
	/**
	 * Returns the value of the '<em><b>Charge</b></em>' reference list.
	 * The list contents are of type {@link Classes.Charge}.
	 * It is bidirectional and its opposite is '{@link Classes.Charge#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge</em>' reference list.
	 * @see Classes.ClassesPackage#getBill_Charge()
	 * @see Classes.Charge#getBill
	 * @model opposite="bill" required="true" ordered="false"
	 * @generated
	 */
	EList<Charge> getCharge();

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Booking#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference.
	 * @see #setBooking(Booking)
	 * @see Classes.ClassesPackage#getBill_Booking()
	 * @see Classes.Booking#getBill
	 * @model opposite="bill" required="true" ordered="false"
	 * @generated
	 */
	Booking getBooking();

	/**
	 * Sets the value of the '{@link Classes.Bill#getBooking <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking</em>' reference.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(Booking value);

} // Bill
