/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.RoomType;
import Classes.RoomTypeName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.RoomTypeImpl#getRoomTypeName <em>Room Type Name</em>}</li>
 *   <li>{@link Classes.impl.RoomTypeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link Classes.impl.RoomTypeImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link Classes.impl.RoomTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Classes.impl.RoomTypeImpl#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
	/**
	 * The default value of the '{@link #getRoomTypeName() <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final RoomTypeName ROOM_TYPE_NAME_EDEFAULT = RoomTypeName.SINGLE_ROOM;

	/**
	 * The cached value of the '{@link #getRoomTypeName() <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeName()
	 * @generated
	 * @ordered
	 */
	protected RoomTypeName roomTypeName = ROOM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatures() <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected String features = FEATURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGuests = NUMBER_OF_GUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeName getRoomTypeName() {
		return roomTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeName(RoomTypeName newRoomTypeName) {
		RoomTypeName oldRoomTypeName = roomTypeName;
		roomTypeName = newRoomTypeName == null ? ROOM_TYPE_NAME_EDEFAULT : newRoomTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM_TYPE__ROOM_TYPE_NAME, oldRoomTypeName, roomTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatures(String newFeatures) {
		String oldFeatures = features;
		features = newFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM_TYPE__FEATURES, oldFeatures, features));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfGuests(int newNumberOfGuests) {
		int oldNumberOfGuests = numberOfGuests;
		numberOfGuests = newNumberOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM_TYPE__NUMBER_OF_GUESTS, oldNumberOfGuests, numberOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ROOM_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				return getRoomTypeName();
			case ClassesPackage.ROOM_TYPE__FEATURES:
				return getFeatures();
			case ClassesPackage.ROOM_TYPE__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
			case ClassesPackage.ROOM_TYPE__DESCRIPTION:
				return getDescription();
			case ClassesPackage.ROOM_TYPE__PRICE:
				return getPrice();
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
			case ClassesPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				setRoomTypeName((RoomTypeName)newValue);
				return;
			case ClassesPackage.ROOM_TYPE__FEATURES:
				setFeatures((String)newValue);
				return;
			case ClassesPackage.ROOM_TYPE__NUMBER_OF_GUESTS:
				setNumberOfGuests((Integer)newValue);
				return;
			case ClassesPackage.ROOM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ClassesPackage.ROOM_TYPE__PRICE:
				setPrice((Integer)newValue);
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
			case ClassesPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				setRoomTypeName(ROOM_TYPE_NAME_EDEFAULT);
				return;
			case ClassesPackage.ROOM_TYPE__FEATURES:
				setFeatures(FEATURES_EDEFAULT);
				return;
			case ClassesPackage.ROOM_TYPE__NUMBER_OF_GUESTS:
				setNumberOfGuests(NUMBER_OF_GUESTS_EDEFAULT);
				return;
			case ClassesPackage.ROOM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ClassesPackage.ROOM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
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
			case ClassesPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				return roomTypeName != ROOM_TYPE_NAME_EDEFAULT;
			case ClassesPackage.ROOM_TYPE__FEATURES:
				return FEATURES_EDEFAULT == null ? features != null : !FEATURES_EDEFAULT.equals(features);
			case ClassesPackage.ROOM_TYPE__NUMBER_OF_GUESTS:
				return numberOfGuests != NUMBER_OF_GUESTS_EDEFAULT;
			case ClassesPackage.ROOM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ClassesPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
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
		result.append(" (roomTypeName: ");
		result.append(roomTypeName);
		result.append(", features: ");
		result.append(features);
		result.append(", numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(", description: ");
		result.append(description);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
