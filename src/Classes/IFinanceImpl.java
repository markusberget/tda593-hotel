/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFinance Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.IFinanceImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getIFinanceImpl()
 * @model
 * @generated
 */
public interface IFinanceImpl extends IFinance {

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link Classes.Booking}.
	 * It is bidirectional and its opposite is '{@link Classes.Booking#getIFinanceImpl <em>IFinance Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see Classes.ClassesPackage#getIFinanceImpl_Booking()
	 * @see Classes.Booking#getIFinanceImpl
	 * @model opposite="iFinanceImpl" ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();
} // IFinanceImpl
