/**
 */
package Classes.impl;

import Classes.Bill;
import Classes.Booking;
import Classes.Charge;
import Classes.ChargeType;
import Classes.ClassesFactory;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.IBookingManagementImpl;
import Classes.IFinanceImpl;
import Classes.IHotelManagerImpl;
import Classes.Room;
import Classes.RoomStatus;
import Classes.RoomType;
import Classes.RoomTypeName;
import Classes.StaffMember;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassesFactoryImpl extends EFactoryImpl implements ClassesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassesFactory init() {
		try {
			ClassesFactory theClassesFactory = (ClassesFactory)EPackage.Registry.INSTANCE.getEFactory(ClassesPackage.eNS_URI);
			if (theClassesFactory != null) {
				return theClassesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassesPackage.ROOM: return createRoom();
			case ClassesPackage.BOOKING: return createBooking();
			case ClassesPackage.CUSTOMER: return createCustomer();
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL: return createIBookingManagementImpl();
			case ClassesPackage.IHOTEL_MANAGER_IMPL: return createIHotelManagerImpl();
			case ClassesPackage.STAFF_MEMBER: return createStaffMember();
			case ClassesPackage.IFINANCE_IMPL: return createIFinanceImpl();
			case ClassesPackage.BILL: return createBill();
			case ClassesPackage.CHARGE: return createCharge();
			case ClassesPackage.ROOM_TYPE: return createRoomType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ClassesPackage.ROOM_STATUS:
				return createRoomStatusFromString(eDataType, initialValue);
			case ClassesPackage.CHARGE_TYPE:
				return createChargeTypeFromString(eDataType, initialValue);
			case ClassesPackage.ROOM_TYPE_NAME:
				return createRoomTypeNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ClassesPackage.ROOM_STATUS:
				return convertRoomStatusToString(eDataType, instanceValue);
			case ClassesPackage.CHARGE_TYPE:
				return convertChargeTypeToString(eDataType, instanceValue);
			case ClassesPackage.ROOM_TYPE_NAME:
				return convertRoomTypeNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManagementImpl createIBookingManagementImpl() {
		IBookingManagementImplImpl iBookingManagementImpl = new IBookingManagementImplImpl();
		return iBookingManagementImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFinanceImpl createIFinanceImpl() {
		IFinanceImplImpl iFinanceImpl = new IFinanceImplImpl();
		return iFinanceImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charge createCharge() {
		ChargeImpl charge = new ChargeImpl();
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMember createStaffMember() {
		StaffMemberImpl staffMember = new StaffMemberImpl();
		return staffMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStatus createRoomStatusFromString(EDataType eDataType, String initialValue) {
		RoomStatus result = RoomStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeName createRoomTypeNameFromString(EDataType eDataType, String initialValue) {
		RoomTypeName result = RoomTypeName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomTypeNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeType createChargeTypeFromString(EDataType eDataType, String initialValue) {
		ChargeType result = ChargeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelManagerImpl createIHotelManagerImpl() {
		IHotelManagerImplImpl iHotelManagerImpl = new IHotelManagerImplImpl();
		return iHotelManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesPackage getClassesPackage() {
		return (ClassesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassesPackage getPackage() {
		return ClassesPackage.eINSTANCE;
	}

} //ClassesFactoryImpl
