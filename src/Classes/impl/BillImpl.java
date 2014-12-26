/**
 */
package Classes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Classes.Bill;
import Classes.Booking;
import Classes.Charge;
import Classes.ClassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.BillImpl#getCharge <em>Charge</em>}</li>
 *   <li>{@link Classes.impl.BillImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The cached value of the '{@link #getCharge() <em>Charge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> charge;

	// Why can't I use the Charge type in other classes?
	protected EList<ChargeImpl> charges;
	
	//Why can't I use the Charge type in other classes?
	public EList<ChargeImpl> getChargeImpl() {
		return charges;
	}
	
	//Why can't I use the Charge type in other classes?
	public void setChargeImpl(ChargeImpl charge) {
		charges.add(charge);
	}
	
	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BillImpl() {
		super();
		charge = new BasicEList<Charge>();
		charges = new BasicEList<ChargeImpl>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Charge> getCharge() {
		if (charge == null) {
			charge = new EObjectWithInverseResolvingEList<Charge>(Charge.class, this, ClassesPackage.BILL__CHARGE, ClassesPackage.CHARGE__BILL);
		}
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking() {
		if (booking != null && booking.eIsProxy()) {
			InternalEObject oldBooking = (InternalEObject)booking;
			booking = (Booking)eResolveProxy(oldBooking);
			if (booking != oldBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.BILL__BOOKING, oldBooking, booking));
			}
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooking(Booking newBooking, NotificationChain msgs) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__BOOKING, oldBooking, newBooking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking(Booking newBooking) {
		if (newBooking != booking) {
			NotificationChain msgs = null;
			if (booking != null)
				msgs = ((InternalEObject)booking).eInverseRemove(this, ClassesPackage.BOOKING__BILL, Booking.class, msgs);
			if (newBooking != null)
				msgs = ((InternalEObject)newBooking).eInverseAdd(this, ClassesPackage.BOOKING__BILL, Booking.class, msgs);
			msgs = basicSetBooking(newBooking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.BILL__BOOKING, newBooking, newBooking));
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
			case ClassesPackage.BILL__CHARGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharge()).basicAdd(otherEnd, msgs);
			case ClassesPackage.BILL__BOOKING:
				if (booking != null)
					msgs = ((InternalEObject)booking).eInverseRemove(this, ClassesPackage.BOOKING__BILL, Booking.class, msgs);
				return basicSetBooking((Booking)otherEnd, msgs);
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
			case ClassesPackage.BILL__CHARGE:
				return ((InternalEList<?>)getCharge()).basicRemove(otherEnd, msgs);
			case ClassesPackage.BILL__BOOKING:
				return basicSetBooking(null, msgs);
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
			case ClassesPackage.BILL__CHARGE:
				return getCharge();
			case ClassesPackage.BILL__BOOKING:
				if (resolve) return getBooking();
				return basicGetBooking();
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
			case ClassesPackage.BILL__CHARGE:
				getCharge().clear();
				getCharge().addAll((Collection<? extends Charge>)newValue);
				return;
			case ClassesPackage.BILL__BOOKING:
				setBooking((Booking)newValue);
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
			case ClassesPackage.BILL__CHARGE:
				getCharge().clear();
				return;
			case ClassesPackage.BILL__BOOKING:
				setBooking((Booking)null);
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
			case ClassesPackage.BILL__CHARGE:
				return charge != null && !charge.isEmpty();
			case ClassesPackage.BILL__BOOKING:
				return booking != null;
		}
		return super.eIsSet(featureID);
	}

} //BillImpl
