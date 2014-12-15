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
	 * @generated NOT
	 */
	public int calculatePayment(int bookingId) {
		
		int sum = 0;
		//for (Charge charge : this.booking.getBookingById(bookingId).getBill().getCharges()) {
		//		sum += charge;
		//}
		return sum;
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String payBill(int bookingId) {
		// TODO: implement this method
		
		//Booking b = booking.getBookingById(bookingId);
		
		int amount = calculatePayment(bookingId);
		
		// for now.
		return "";
	/*	
		if (amount > 0) {
		
			String customerFirstName;
			String customerLastName;
			
			
			/* prompt user to fill in customer information here */
			/* check validity of customer information */
			
			//customerFirstName = "Pellefjant";
			//customerLastName = "Stenskog";
			
			/* if(! 	customerFirstName == b.getCustomer().getFirstName() 
			 			&& 	customerLastName == b.getCustomer().getLastName() ) { 
			 				return "Payment failed: customer information invalid" 
			}*/
			
			/* prompt user to select payment method */		
			/* if( no selection ) { return "Payment failed: No payment option was selected" }*/
			/* else if( selection is invoice ) { bankSendInvoice() }*/
			/* else */
		
			//String ccNumber, ccv, firstName, lastName;
			//int expiryMonth, expiryYear;
			
			/* prompt user to fill in ccNumber:String, ccv:String, expiryMonth:int,
			expiryYear:int, firstName:String, lastName:String */
	/*		
			ccNumber = "1-1111-1111-1111-1111";
			ccv = "345";
			firstName = customerFirstName;
			lastName = customerLastName;
			expiryMonth = 12;
			expiryYear = 16;*/
/*			
			if ( !validateWithBank(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName) ) {
				return "Payment failed: Invalid credit card information";
			}
			
			
			boolean customerConfirm;
			/* use case says: "The customer confirms the information."*/
		/*	
			customerConfirm = true;
			if( !customerConfirm ) { 
				return "Payment failed"; 
			}

			boolean bankTransferSuccess;
			
			bankTransferSuccess = bankTransfer(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
			if( !bankTransferSuccess ) { 
				return "Payment failed: Something went wrong with bank transfer";
			}
			
		}
				
		/* register payment as done */
		
	//	return "Successful payment completed!";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateWithBank(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// return customerProvides = isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean bankTransfer(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// return customerProvides = makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
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
