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
} // IHotelManagerImpl
