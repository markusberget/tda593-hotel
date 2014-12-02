/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.IFinanceImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFinance Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IFinanceImplImpl extends MinimalEObjectImpl.Container implements IFinanceImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFinanceImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.IFINANCE_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculatePayment(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payBill(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void validateWithBank(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bankTransfer(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bankSendInvoice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassesPackage.IFINANCE_IMPL___CALCULATE_PAYMENT__INT:
				calculatePayment((Integer)arguments.get(0));
				return null;
			case ClassesPackage.IFINANCE_IMPL___PAY_BILL__INT:
				payBill((Integer)arguments.get(0));
				return null;
			case ClassesPackage.IFINANCE_IMPL___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING:
				validateWithBank((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case ClassesPackage.IFINANCE_IMPL___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING:
				bankTransfer((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case ClassesPackage.IFINANCE_IMPL___BANK_SEND_INVOICE:
				bankSendInvoice();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //IFinanceImplImpl
