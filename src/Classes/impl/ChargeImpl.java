/**
 */
package Classes.impl;

import Classes.Bill;
import Classes.Charge;
import Classes.ChargeType;
import Classes.ClassesPackage;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.ChargeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link Classes.impl.ChargeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link Classes.impl.ChargeImpl#getChargeType <em>Charge Type</em>}</li>
 *   <li>{@link Classes.impl.ChargeImpl#getBill <em>Bill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChargeImpl extends MinimalEObjectImpl.Container implements Charge {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected int amount = AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getChargeType() <em>Charge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeType()
	 * @generated
	 * @ordered
	 */
	protected static final ChargeType CHARGE_TYPE_EDEFAULT = ChargeType.CANCELLATION_FEE;
	/**
	 * The cached value of the '{@link #getChargeType() <em>Charge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeType()
	 * @generated
	 * @ordered
	 */
	protected ChargeType chargeType = CHARGE_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected Bill bill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.CHARGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(int newAmount) {
		int oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CHARGE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CHARGE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeType getChargeType() {
		return chargeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeType(ChargeType newChargeType) {
		ChargeType oldChargeType = chargeType;
		chargeType = newChargeType == null ? CHARGE_TYPE_EDEFAULT : newChargeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CHARGE__CHARGE_TYPE, oldChargeType, chargeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill getBill() {
		if (bill != null && bill.eIsProxy()) {
			InternalEObject oldBill = (InternalEObject)bill;
			bill = (Bill)eResolveProxy(oldBill);
			if (bill != oldBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.CHARGE__BILL, oldBill, bill));
			}
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill basicGetBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBill(Bill newBill, NotificationChain msgs) {
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.CHARGE__BILL, oldBill, newBill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill(Bill newBill) {
		if (newBill != bill) {
			NotificationChain msgs = null;
			if (bill != null)
				msgs = ((InternalEObject)bill).eInverseRemove(this, ClassesPackage.BILL__CHARGE, Bill.class, msgs);
			if (newBill != null)
				msgs = ((InternalEObject)newBill).eInverseAdd(this, ClassesPackage.BILL__CHARGE, Bill.class, msgs);
			msgs = basicSetBill(newBill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.CHARGE__BILL, newBill, newBill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassesPackage.CHARGE__BILL:
				if (bill != null)
					msgs = ((InternalEObject)bill).eInverseRemove(this, ClassesPackage.BILL__CHARGE, Bill.class, msgs);
				return basicSetBill((Bill)otherEnd, msgs);
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
			case ClassesPackage.CHARGE__BILL:
				return basicSetBill(null, msgs);
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
			case ClassesPackage.CHARGE__AMOUNT:
				return getAmount();
			case ClassesPackage.CHARGE__DATE:
				return getDate();
			case ClassesPackage.CHARGE__CHARGE_TYPE:
				return getChargeType();
			case ClassesPackage.CHARGE__BILL:
				if (resolve) return getBill();
				return basicGetBill();
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
			case ClassesPackage.CHARGE__AMOUNT:
				setAmount((Integer)newValue);
				return;
			case ClassesPackage.CHARGE__DATE:
				setDate((Date)newValue);
				return;
			case ClassesPackage.CHARGE__CHARGE_TYPE:
				setChargeType((ChargeType)newValue);
				return;
			case ClassesPackage.CHARGE__BILL:
				setBill((Bill)newValue);
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
			case ClassesPackage.CHARGE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case ClassesPackage.CHARGE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ClassesPackage.CHARGE__CHARGE_TYPE:
				setChargeType(CHARGE_TYPE_EDEFAULT);
				return;
			case ClassesPackage.CHARGE__BILL:
				setBill((Bill)null);
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
			case ClassesPackage.CHARGE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case ClassesPackage.CHARGE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ClassesPackage.CHARGE__CHARGE_TYPE:
				return chargeType != CHARGE_TYPE_EDEFAULT;
			case ClassesPackage.CHARGE__BILL:
				return bill != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (amount: ");
		result.append(amount);
		result.append(", date: ");
		result.append(date);
		result.append(", chargeType: ");
		result.append(chargeType);
		result.append(')');
		return result.toString();
	}

} //ChargeImpl
