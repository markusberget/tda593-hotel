/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFinance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.ClassesPackage#getIFinance()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFinance extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	int calculatePayment(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String payBill(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean validateWithBank(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean bankTransfer(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bankSendInvoice();

} // IFinance
