/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Charge#getBill <em>Bill</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getCharge()
 * @model
 * @generated
 */
public interface Charge extends EObject {
	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.Bill#getCharge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference.
	 * @see #setBill(Bill)
	 * @see Classes.ClassesPackage#getCharge_Bill()
	 * @see Classes.Bill#getCharge
	 * @model opposite="charge" required="true" ordered="false"
	 * @generated
	 */
	Bill getBill();

	/**
	 * Sets the value of the '{@link Classes.Charge#getBill <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill</em>' reference.
	 * @see #getBill()
	 * @generated
	 */
	void setBill(Bill value);

} // Charge
