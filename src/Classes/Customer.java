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
 *   <li>{@link Classes.Customer#getPersonalInfo <em>Personal Info</em>}</li>
 *   <li>{@link Classes.Customer#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>IBooking Management Impl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.IBookingManagementImpl#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBooking Management Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #setIBookingManagementImpl(IBookingManagementImpl)
	 * @see Classes.ClassesPackage#getCustomer_IBookingManagementImpl()
	 * @see Classes.IBookingManagementImpl#getCustomer
	 * @model opposite="customer" required="true" ordered="false"
	 * @generated
	 */
	IBookingManagementImpl getIBookingManagementImpl();

	/**
	 * Sets the value of the '{@link Classes.Customer#getIBookingManagementImpl <em>IBooking Management Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	void setIBookingManagementImpl(IBookingManagementImpl value);

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
