/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.CustomerProvides;
import Classes.IBookingManagementImpl;
import Classes.IFinanceImpl;

import java.lang.reflect.InvocationTargetException;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFinance Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.IFinanceImplImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}</li>
 *   <li>{@link Classes.impl.IFinanceImplImpl#getCustomerProvides <em>Customer Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFinanceImplImpl extends MinimalEObjectImpl.Container implements IFinanceImpl {
	/**
	 * The cached value of the '{@link #getIBookingManagementImpl() <em>IBooking Management Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBookingManagementImpl()
	 * @generated
	 * @ordered
	 */
	protected IBookingManagementImpl iBookingManagementImpl;
	/**
	 * The cached value of the '{@link #getCustomerProvides() <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerProvides()
	 * @generated
	 * @ordered
	 */
	protected CustomerProvides customerProvides;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFinanceImplImpl() {
		super();
	}
	
	/**
	 * Instantiates the implementation of the IFinance interface.
	 * 
	 * @return	the IFinance object
	 */
	public static IFinanceImplImpl instantiateForTest() {
		return new IFinanceImplImpl();
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
	public IBookingManagementImpl getIBookingManagementImpl() {
		if (iBookingManagementImpl != null && iBookingManagementImpl.eIsProxy()) {
			InternalEObject oldIBookingManagementImpl = (InternalEObject)iBookingManagementImpl;
			iBookingManagementImpl = (IBookingManagementImpl)eResolveProxy(oldIBookingManagementImpl);
			if (iBookingManagementImpl != oldIBookingManagementImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, iBookingManagementImpl));
			}
		}
		return iBookingManagementImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManagementImpl basicGetIBookingManagementImpl() {
		return iBookingManagementImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBookingManagementImpl(IBookingManagementImpl newIBookingManagementImpl) {
		IBookingManagementImpl oldIBookingManagementImpl = iBookingManagementImpl;
		iBookingManagementImpl = newIBookingManagementImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL, oldIBookingManagementImpl, iBookingManagementImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides getCustomerProvides() {
		if (customerProvides != null && customerProvides.eIsProxy()) {
			InternalEObject oldCustomerProvides = (InternalEObject)customerProvides;
			customerProvides = (CustomerProvides)eResolveProxy(oldCustomerProvides);
			if (customerProvides != oldCustomerProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.IFINANCE_IMPL__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
			}
		}
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides basicGetCustomerProvides() {
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerProvides(CustomerProvides newCustomerProvides) {
		CustomerProvides oldCustomerProvides = customerProvides;
		customerProvides = newCustomerProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.IFINANCE_IMPL__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int calculatePayment(int bookingId) {
		
		// Question: Are room prices added as charge or should they be added separately into the calculation?
		
		// TODO: fix this.
		/*int sum = 0;
		for (Charge charge : this.iBookingManagement.getBooking(bookingId).getBill().getCharges()) {
				sum += charge.getAmount();
		}
		return sum;
		*/
		return 0;

	}

	/**
	 * Performs the payment of a bill. First the credit card is checked if valid, and if valid the sum is withdrawn
	 * form the credit card. This method contains the interaction with the bank.
	 * 
	 * @generated NOT
	 */
	public String payBill(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, int cost) {
		se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires bankingCustomer;
		boolean valid;
		try {
			bankingCustomer = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
					.instance();
			valid = bankingCustomer.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
			if (valid) {
				valid = bankingCustomer.makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, cost);
				if (valid) {
					return "Payment was successful";
				}
				else {
					return "Amount could not be withdrawn";
				}
			}
			else {
				return "Credit Card is not valid";
			}
		} catch (SOAPException e) {
			System.err
			.println("Error occurred while communicating with the bank administration");
			e.printStackTrace();
		}
		return "Payment was unsuccessful";
	}

	/**
	 * Unimplemented method since the bank's interface do not offer the services necessary
	 * for this method.
	 * 
	 * @generated NOT
	 */
	public void bankSendInvoice() {
		// request that bank sends an invoice assigned to the customer to the customer’s address.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL:
				if (resolve) return getIBookingManagementImpl();
				return basicGetIBookingManagementImpl();
			case ClassesPackage.IFINANCE_IMPL__CUSTOMER_PROVIDES:
				if (resolve) return getCustomerProvides();
				return basicGetCustomerProvides();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)newValue);
				return;
			case ClassesPackage.IFINANCE_IMPL__CUSTOMER_PROVIDES:
				setCustomerProvides((CustomerProvides)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL:
				setIBookingManagementImpl((IBookingManagementImpl)null);
				return;
			case ClassesPackage.IFINANCE_IMPL__CUSTOMER_PROVIDES:
				setCustomerProvides((CustomerProvides)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL:
				return iBookingManagementImpl != null;
			case ClassesPackage.IFINANCE_IMPL__CUSTOMER_PROVIDES:
				return customerProvides != null;
		}
		return super.eIsSet(featureID);
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
				return calculatePayment((Integer)arguments.get(0));
			case ClassesPackage.IFINANCE_IMPL___PAY_BILL__STRING_STRING_INT_INT_STRING_STRING_INT:
				return payBill((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6));
			case ClassesPackage.IFINANCE_IMPL___BANK_SEND_INVOICE:
				bankSendInvoice();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //IFinanceImplImpl
