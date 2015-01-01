/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.IHotelManagerImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link Classes.IHotelManagerImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getIHotelManagerImpl()
 * @model
 * @generated
 */
public interface IHotelManagerImpl extends IHotelManager {

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link Classes.StaffMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see Classes.ClassesPackage#getIHotelManagerImpl_Staff()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StaffMember> getStaff();

	/**
	 * Returns the value of the '<em><b>IBooking Management Impl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.IBookingManagementImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBooking Management Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #setIBookingManagementImpl(IBookingManagementImpl)
	 * @see Classes.ClassesPackage#getIHotelManagerImpl_IBookingManagementImpl()
	 * @see Classes.IBookingManagementImpl#getIHotelManagerImpl
	 * @model opposite="iHotelManagerImpl" required="true" ordered="false"
	 * @generated
	 */
	IBookingManagementImpl getIBookingManagementImpl();

	/**
	 * Sets the value of the '{@link Classes.IHotelManagerImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBooking Management Impl</em>' reference.
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	void setIBookingManagementImpl(IBookingManagementImpl value);
} // IHotelManagerImpl
