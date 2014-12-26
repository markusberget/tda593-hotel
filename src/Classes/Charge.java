/**
 */
package Classes;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Charge#getAmount <em>Amount</em>}</li>
 *   <li>{@link Classes.Charge#getDate <em>Date</em>}</li>
 *   <li>{@link Classes.Charge#getChargeType <em>Charge Type</em>}</li>
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
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see Classes.ClassesPackage#getCharge_Amount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link Classes.Charge#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see Classes.ClassesPackage#getCharge_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link Classes.Charge#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Charge Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Classes.ChargeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Type</em>' attribute.
	 * @see Classes.ChargeType
	 * @see #setChargeType(ChargeType)
	 * @see Classes.ClassesPackage#getCharge_ChargeType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ChargeType getChargeType();

	/**
	 * Sets the value of the '{@link Classes.Charge#getChargeType <em>Charge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Type</em>' attribute.
	 * @see Classes.ChargeType
	 * @see #getChargeType()
	 * @generated
	 */
	void setChargeType(ChargeType value);

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
