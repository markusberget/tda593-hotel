/**
 */
package Classes;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFinance Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.IFinanceImpl#getCustomerProvides <em>Customer Provides</em>}</li>
 *   <li>{@link Classes.IFinanceImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getIFinanceImpl()
 * @model
 * @generated
 */
public interface IFinanceImpl extends IFinance {

	/**
	 * Returns the value of the '<em><b>IBooking Management Impl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.IBookingManagementImpl#getIFinanceImpl <em>IFinance Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBooking Management Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #setIBookingManagementImpl(IBookingManagementImpl)
	 * @see Classes.ClassesPackage#getIFinanceImpl_IBookingManagementImpl()
	 * @see Classes.IBookingManagementImpl#getIFinanceImpl
	 * @model opposite="iFinanceImpl" required="true" ordered="false"
	 * @generated
	 */
	IBookingManagementImpl getIBookingManagementImpl();

	/**
	 * Sets the value of the '{@link Classes.IFinanceImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	void setIBookingManagementImpl(IBookingManagementImpl value);

	/**
	 * Returns the value of the '<em><b>Customer Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Provides</em>' reference.
	 * @see #setCustomerProvides(CustomerProvides)
	 * @see Classes.ClassesPackage#getIFinanceImpl_CustomerProvides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerProvides getCustomerProvides();

	/**
	 * Sets the value of the '{@link Classes.IFinanceImpl#getCustomerProvides <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Provides</em>' reference.
	 * @see #getCustomerProvides()
	 * @generated
	 */
	void setCustomerProvides(CustomerProvides value);
} // IFinanceImpl
