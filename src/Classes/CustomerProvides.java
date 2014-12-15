/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.CustomerProvides#getIFinanceImpl <em>IFinance Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getCustomerProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CustomerProvides extends EObject {
	/**
	 * Returns the value of the '<em><b>IFinance Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IFinance Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IFinance Impl</em>' reference.
	 * @see #setIFinanceImpl(IFinanceImpl)
	 * @see Classes.ClassesPackage#getCustomerProvides_IFinanceImpl()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IFinanceImpl getIFinanceImpl();

	/**
	 * Sets the value of the '{@link Classes.CustomerProvides#getIFinanceImpl <em>IFinance Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IFinance Impl</em>' reference.
	 * @see #getIFinanceImpl()
	 * @generated
	 */
	void setIFinanceImpl(IFinanceImpl value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" sumRequired="true" sumOrdered="false"
	 * @generated
	 */
	boolean makePayment(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean isCreditCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

} // CustomerProvides
