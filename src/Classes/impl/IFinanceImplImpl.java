/**
 */
package Classes.impl;

import Classes.AdministratorProvides;
import Classes.ClassesPackage;
import Classes.CustomerProvides;
import Classes.IBookingManagementImpl;
import Classes.IFinanceImpl;
import java.lang.reflect.InvocationTargetException;
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
 *   <li>{@link Classes.impl.IFinanceImplImpl#getAdministratorProvides <em>Administrator Provides</em>}</li>
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
	 * The cached value of the '{@link #getAdministratorProvides() <em>Administrator Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministratorProvides()
	 * @generated
	 * @ordered
	 */
	protected AdministratorProvides administratorProvides;

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
	 * @generated
	 */
	public AdministratorProvides getAdministratorProvides() {
		if (administratorProvides != null && administratorProvides.eIsProxy()) {
			InternalEObject oldAdministratorProvides = (InternalEObject)administratorProvides;
			administratorProvides = (AdministratorProvides)eResolveProxy(oldAdministratorProvides);
			if (administratorProvides != oldAdministratorProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.IFINANCE_IMPL__ADMINISTRATOR_PROVIDES, oldAdministratorProvides, administratorProvides));
			}
		}
		return administratorProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministratorProvides basicGetAdministratorProvides() {
		return administratorProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministratorProvides(AdministratorProvides newAdministratorProvides) {
		AdministratorProvides oldAdministratorProvides = administratorProvides;
		administratorProvides = newAdministratorProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.IFINANCE_IMPL__ADMINISTRATOR_PROVIDES, oldAdministratorProvides, administratorProvides));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String payBill(int bookingId) {
		
		int amount = calculatePayment(bookingId);
		
		// for now.
		//return "";
		
		if (amount > 0) {
		
			String customerFirstName;
			String customerLastName;
			
			
			/* prompt user to fill in customer information here */
			// for now
			customerFirstName = "Pellefjant";
			customerLastName = "Stenskog";
			
			// Validate customer information
			// TODO: fix this.
			/*if(!customerFirstName == this.iBookingManagement.getBooking(bookingId).getCustomer().getFirstName() 
			&& 	customerLastName == this.iBookingManagement.getBooking(bookingId).getCustomer().getLastName() ) { 
				return "Payment failed: customer information invalid";
			}*/
			
			//possibly enum
			String paymentOption = "none";
			/* prompt user to select payment method */	
			// for now
			paymentOption = "CreditCard";
			
			// If selected option is not using credit card
			if( paymentOption.equals("none") ) { 
				return "Payment failed: No payment option was selected"; 
			}
			else if( paymentOption.equals("Invoice") ) { 
				bankSendInvoice();
				return "Success";
			}
		
			String ccNumber, ccv, firstName, lastName;
			int expiryMonth, expiryYear;
			
			/* prompt user to fill in ccNumber:String, ccv:String, expiryMonth:int,
			expiryYear:int, firstName:String, lastName:String */
			
			// for now
			ccNumber = "1-1111-1111-1111-1111";
			ccv = "345";
			firstName = customerFirstName;
			lastName = customerLastName;
			expiryMonth = 12;
			expiryYear = 16;
			
			// If invalid
			if ( !validateWithBank(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName) ) {
				return "Payment failed: Invalid credit card information";
			}
			
			
			boolean customerConfirm;
			/* use case says: "The customer confirms the information."*/
			// for now
			customerConfirm = true;
			
			if( !customerConfirm ) { 
				return "Payment failed: Aborted"; 
			}

			boolean bankTransferSuccess;
			
			bankTransferSuccess = bankTransfer(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
			if( !bankTransferSuccess ) { 
				return "Payment failed: Something went wrong with bank transfer";
			}
			
		}
				
		/* register payment as done */
		
		return "Success";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateWithBank(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		return false;
		// TODO: fix this.
		//return customerProvides = isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean bankTransfer(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: fix this.
		//return customerProvides = makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
		return false;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL:
				if (resolve) return getIBookingManagementImpl();
				return basicGetIBookingManagementImpl();
			case ClassesPackage.IFINANCE_IMPL__CUSTOMER_PROVIDES:
				if (resolve) return getCustomerProvides();
				return basicGetCustomerProvides();
			case ClassesPackage.IFINANCE_IMPL__ADMINISTRATOR_PROVIDES:
				if (resolve) return getAdministratorProvides();
				return basicGetAdministratorProvides();
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
			case ClassesPackage.IFINANCE_IMPL__ADMINISTRATOR_PROVIDES:
				setAdministratorProvides((AdministratorProvides)newValue);
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
			case ClassesPackage.IFINANCE_IMPL__ADMINISTRATOR_PROVIDES:
				setAdministratorProvides((AdministratorProvides)null);
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
			case ClassesPackage.IFINANCE_IMPL__ADMINISTRATOR_PROVIDES:
				return administratorProvides != null;
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
			case ClassesPackage.IFINANCE_IMPL___PAY_BILL__INT:
				return payBill((Integer)arguments.get(0));
			case ClassesPackage.IFINANCE_IMPL___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING:
				return validateWithBank((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case ClassesPackage.IFINANCE_IMPL___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING:
				return bankTransfer((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case ClassesPackage.IFINANCE_IMPL___BANK_SEND_INVOICE:
				bankSendInvoice();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //IFinanceImplImpl
