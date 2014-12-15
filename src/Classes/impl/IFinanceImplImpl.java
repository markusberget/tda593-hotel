/**
 */
package Classes.impl;

import Classes.Booking;
import Classes.ClassesPackage;
import Classes.IFinanceImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFinance Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.IFinanceImplImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFinanceImplImpl extends MinimalEObjectImpl.Container implements IFinanceImpl {
	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> booking;

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
	public EList<Booking> getBooking() {
		if (booking == null) {
			booking = new EObjectWithInverseResolvingEList<Booking>(Booking.class, this, ClassesPackage.IFINANCE_IMPL__BOOKING, ClassesPackage.BOOKING__IFINANCE_IMPL);
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int calculatePayment(int bookingId) {
		
		// int sum = 0;
		// for (Charge charge : this.booking.getBookingById(bookingId).getBill().getCharges()) {
		//			sum += charge;
		// }
		// return sum
		
		
		// TODO: the booking object doesn't have any room(s)
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void payBill(int bookingId) {
		// TODO: implement this method
		
		//Booking b = booking.getBookingById(bookingId);
		
		int amount = calculatePayment(bookingId);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__BOOKING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooking()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__BOOKING:
				return ((InternalEList<?>)getBooking()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__BOOKING:
				return getBooking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassesPackage.IFINANCE_IMPL__BOOKING:
				getBooking().clear();
				getBooking().addAll((Collection<? extends Booking>)newValue);
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
			case ClassesPackage.IFINANCE_IMPL__BOOKING:
				getBooking().clear();
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
			case ClassesPackage.IFINANCE_IMPL__BOOKING:
				return booking != null && !booking.isEmpty();
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
