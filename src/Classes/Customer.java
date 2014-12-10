/**
 */
package Classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Customer#getPersonalInfo <em>Personal Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends IPerson {
	/**
	 * Returns the value of the '<em><b>Personal Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Info</em>' attribute.
	 * @see #setPersonalInfo(String)
	 * @see Classes.ClassesPackage#getCustomer_PersonalInfo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPersonalInfo();

	/**
	 * Sets the value of the '{@link Classes.Customer#getPersonalInfo <em>Personal Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Info</em>' attribute.
	 * @see #getPersonalInfo()
	 * @generated
	 */
	void setPersonalInfo(String value);

} // Customer
