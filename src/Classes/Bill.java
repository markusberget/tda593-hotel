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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge</em>' reference list.
	 * @see Classes.ClassesPackage#getBill_Charge()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Charge> getCharge();

} // Bill
