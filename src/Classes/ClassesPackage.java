/**
 */
package Classes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.ClassesFactory
 * @model kind="package"
 * @generated
 */
public interface ClassesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Classes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassesPackage eINSTANCE = Classes.impl.ClassesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.RoomImpl
	 * @see Classes.impl.ClassesPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BOOKINGS = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.RoomTypeImpl
	 * @see Classes.impl.ClassesPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NUMBER_OF_GUESTS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM = 5;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.IBookingManagement <em>IBooking Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IBookingManagement
	 * @see Classes.impl.ClassesPackageImpl#getIBookingManagement()
	 * @generated
	 */
	int IBOOKING_MANAGEMENT = 12;

	/**
	 * The meta object id for the '{@link Classes.impl.IBookingManagementImplImpl <em>IBooking Management Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.IBookingManagementImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getIBookingManagementImpl()
	 * @generated
	 */
	int IBOOKING_MANAGEMENT_IMPL = 4;

	/**
	 * The meta object id for the '{@link Classes.IFinance <em>IFinance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IFinance
	 * @see Classes.impl.ClassesPackageImpl#getIFinance()
	 * @generated
	 */
	int IFINANCE = 11;

	/**
	 * The meta object id for the '{@link Classes.IHotelManager <em>IHotel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IHotelManager
	 * @see Classes.impl.ClassesPackageImpl#getIHotelManager()
	 * @generated
	 */
	int IHOTEL_MANAGER = 8;

	/**
	 * The meta object id for the '{@link Classes.impl.IFinanceImplImpl <em>IFinance Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.IFinanceImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getIFinanceImpl()
	 * @generated
	 */
	int IFINANCE_IMPL = 9;

	/**
	 * The meta object id for the '{@link Classes.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BookingImpl
	 * @see Classes.impl.ClassesPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 2;

	/**
	 * The meta object id for the '{@link Classes.IPerson <em>IPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IPerson
	 * @see Classes.impl.ClassesPackageImpl#getIPerson()
	 * @generated
	 */
	int IPERSON = 7;

	/**
	 * The meta object id for the '{@link Classes.impl.StaffMemberImpl <em>Staff Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.StaffMemberImpl
	 * @see Classes.impl.ClassesPackageImpl#getStaffMember()
	 * @generated
	 */
	int STAFF_MEMBER = 6;

	/**
	 * The meta object id for the '{@link Classes.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.CustomerImpl
	 * @see Classes.impl.ClassesPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 3;

	/**
	 * The meta object id for the '{@link Classes.impl.IHotelManagerImplImpl <em>IHotel Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.IHotelManagerImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getIHotelManagerImpl()
	 * @generated
	 */
	int IHOTEL_MANAGER_IMPL = 5;

	/**
	 * The feature id for the '<em><b>Check In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECK_IN = 0;

	/**
	 * The feature id for the '<em><b>Check Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECK_OUT = 1;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 2;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__NUMBER_OF_GUESTS = 3;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>IBooking Management Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IBOOKING_MANAGEMENT_IMPL = 5;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BILL = 6;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOMS = 7;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON__PHONE_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>IPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>IPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPERSON_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = IPERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = IPERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = IPERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = IPERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUMBER = IPERSON__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>IBooking Management Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__IBOOKING_MANAGEMENT_IMPL = IPERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BOOKING = IPERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = IPERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = IPERSON_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IBooking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___UPDATE_BOOKING__INT_INT_DATE_DATE_INT = 0;

	/**
	 * The operation id for the '<em>Add Room Pending</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___ADD_ROOM_PENDING__INT_INT = 1;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CONFIRM_BOOKING__INT = 2;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_INT_STRING_INT = 3;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT = 4;

	/**
	 * The operation id for the '<em>Add Customer Information To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Create Pending Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CREATE_PENDING_BOOKING__DATE_DATE_INT = 6;

	/**
	 * The operation id for the '<em>Send Confirmation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___SEND_CONFIRMATION__INT_STRING = 7;

	/**
	 * The operation id for the '<em>Add Extra Charge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___ADD_EXTRA_CHARGE__INT_STRING_INT = 8;

	/**
	 * The number of operations of the '<em>IBooking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_OPERATION_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Confirmed Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS = IBOOKING_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL__ROOM = IBOOKING_MANAGEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pending Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS = IBOOKING_MANAGEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IHotel Manager Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL = IBOOKING_MANAGEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Booking History</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY = IBOOKING_MANAGEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>IFinance Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL = IBOOKING_MANAGEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL__CUSTOMER = IBOOKING_MANAGEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>IBooking Management Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL_FEATURE_COUNT = IBOOKING_MANAGEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___UPDATE_BOOKING__INT_INT_DATE_DATE_INT = IBOOKING_MANAGEMENT___UPDATE_BOOKING__INT_INT_DATE_DATE_INT;

	/**
	 * The operation id for the '<em>Add Room Pending</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___ADD_ROOM_PENDING__INT_INT = IBOOKING_MANAGEMENT___ADD_ROOM_PENDING__INT_INT;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___CONFIRM_BOOKING__INT = IBOOKING_MANAGEMENT___CONFIRM_BOOKING__INT;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___SEARCH_ROOM__DATE_DATE_INT_STRING_INT = IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_INT_STRING_INT;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___CANCEL_BOOKING__INT = IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Add Customer Information To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING = IBOOKING_MANAGEMENT___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Create Pending Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___CREATE_PENDING_BOOKING__DATE_DATE_INT = IBOOKING_MANAGEMENT___CREATE_PENDING_BOOKING__DATE_DATE_INT;

	/**
	 * The operation id for the '<em>Send Confirmation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___SEND_CONFIRMATION__INT_STRING = IBOOKING_MANAGEMENT___SEND_CONFIRMATION__INT_STRING;

	/**
	 * The operation id for the '<em>Add Extra Charge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___ADD_EXTRA_CHARGE__INT_STRING_INT = IBOOKING_MANAGEMENT___ADD_EXTRA_CHARGE__INT_STRING_INT;

	/**
	 * The number of operations of the '<em>IBooking Management Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL_OPERATION_COUNT = IBOOKING_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BillImpl
	 * @see Classes.impl.ClassesPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 13;

	/**
	 * The meta object id for the '{@link Classes.impl.ChargeImpl <em>Charge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.ChargeImpl
	 * @see Classes.impl.ClassesPackageImpl#getCharge()
	 * @generated
	 */
	int CHARGE = 14;

	/**
	 * The number of structural features of the '<em>IHotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___LOGIN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Add Staff Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Is Password Secure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___IS_PASSWORD_SECURE__STRING = 2;

	/**
	 * The operation id for the '<em>Is Valid Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___IS_VALID_USERNAME__STRING = 3;

	/**
	 * The operation id for the '<em>Is Staff Member Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___IS_STAFF_MEMBER_LOGGED_IN__STRING = 4;

	/**
	 * The operation id for the '<em>Is Staff Member Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___IS_STAFF_MEMBER_ADMIN__STRING = 5;

	/**
	 * The operation id for the '<em>Get Staff Member Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___GET_STAFF_MEMBER_PASSWORD__STRING = 6;

	/**
	 * The operation id for the '<em>Get Staff Member First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___GET_STAFF_MEMBER_FIRST_NAME__STRING = 7;

	/**
	 * The operation id for the '<em>Get Staff Member Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___GET_STAFF_MEMBER_LAST_NAME__STRING = 8;

	/**
	 * The operation id for the '<em>Get Staff Member Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___GET_STAFF_MEMBER_EMAIL__STRING = 9;

	/**
	 * The operation id for the '<em>Get Staff Member Phone Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___GET_STAFF_MEMBER_PHONE_NUMBER__STRING = 10;

	/**
	 * The operation id for the '<em>Get Staff Member Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___GET_STAFF_MEMBER_ADDRESS__STRING = 11;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___LOGOUT__STRING = 12;

	/**
	 * The operation id for the '<em>Check In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___CHECK_IN_BOOKING__INT_STRING = 13;

	/**
	 * The operation id for the '<em>Change Status Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_STRING_STRING = 14;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___CHECK_OUT__INT = 15;

	/**
	 * The number of operations of the '<em>IHotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_OPERATION_COUNT = 16;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL__STAFF = IHOTEL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBooking Management Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL = IHOTEL_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IHotel Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL_FEATURE_COUNT = IHOTEL_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___LOGIN__STRING_STRING = IHOTEL_MANAGER___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Staff Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_BOOLEAN = IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Password Secure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___IS_PASSWORD_SECURE__STRING = IHOTEL_MANAGER___IS_PASSWORD_SECURE__STRING;

	/**
	 * The operation id for the '<em>Is Valid Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___IS_VALID_USERNAME__STRING = IHOTEL_MANAGER___IS_VALID_USERNAME__STRING;

	/**
	 * The operation id for the '<em>Is Staff Member Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_LOGGED_IN__STRING = IHOTEL_MANAGER___IS_STAFF_MEMBER_LOGGED_IN__STRING;

	/**
	 * The operation id for the '<em>Is Staff Member Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___IS_STAFF_MEMBER_ADMIN__STRING = IHOTEL_MANAGER___IS_STAFF_MEMBER_ADMIN__STRING;

	/**
	 * The operation id for the '<em>Get Staff Member Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_PASSWORD__STRING = IHOTEL_MANAGER___GET_STAFF_MEMBER_PASSWORD__STRING;

	/**
	 * The operation id for the '<em>Get Staff Member First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_FIRST_NAME__STRING = IHOTEL_MANAGER___GET_STAFF_MEMBER_FIRST_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Staff Member Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_LAST_NAME__STRING = IHOTEL_MANAGER___GET_STAFF_MEMBER_LAST_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Staff Member Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_EMAIL__STRING = IHOTEL_MANAGER___GET_STAFF_MEMBER_EMAIL__STRING;

	/**
	 * The operation id for the '<em>Get Staff Member Phone Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_PHONE_NUMBER__STRING = IHOTEL_MANAGER___GET_STAFF_MEMBER_PHONE_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Staff Member Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___GET_STAFF_MEMBER_ADDRESS__STRING = IHOTEL_MANAGER___GET_STAFF_MEMBER_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___LOGOUT__STRING = IHOTEL_MANAGER___LOGOUT__STRING;

	/**
	 * The operation id for the '<em>Check In Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___CHECK_IN_BOOKING__INT_STRING = IHOTEL_MANAGER___CHECK_IN_BOOKING__INT_STRING;

	/**
	 * The operation id for the '<em>Change Status Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___CHANGE_STATUS_OF_ROOM__INT_STRING_STRING = IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___CHECK_OUT__INT = IHOTEL_MANAGER___CHECK_OUT__INT;

	/**
	 * The number of operations of the '<em>IHotel Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL_OPERATION_COUNT = IHOTEL_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__FIRST_NAME = IPERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__LAST_NAME = IPERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__ADDRESS = IPERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__EMAIL = IPERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__PHONE_NUMBER = IPERSON__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__ADMIN = IPERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__USERNAME = IPERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__PASSWORD = IPERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Logged In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__IS_LOGGED_IN = IPERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Staff Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER_FEATURE_COUNT = IPERSON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Staff Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER_OPERATION_COUNT = IPERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.AdministratorProvides <em>Administrator Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.AdministratorProvides
	 * @see Classes.impl.ClassesPackageImpl#getAdministratorProvides()
	 * @generated
	 */
	int ADMINISTRATOR_PROVIDES = 15;

	/**
	 * The meta object id for the '{@link Classes.CustomerProvides <em>Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.CustomerProvides
	 * @see Classes.impl.ClassesPackageImpl#getCustomerProvides()
	 * @generated
	 */
	int CUSTOMER_PROVIDES = 10;

	/**
	 * The number of structural features of the '<em>IFinance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE___CALCULATE_PAYMENT__INT = 0;

	/**
	 * The operation id for the '<em>Pay Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE___PAY_BILL__INT_STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Bank Send Invoice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE___BANK_SEND_INVOICE = 2;

	/**
	 * The number of operations of the '<em>IFinance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Customer Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL__CUSTOMER_PROVIDES = IFINANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBooking Management Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL = IFINANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IFinance Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL_FEATURE_COUNT = IFINANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL___CALCULATE_PAYMENT__INT = IFINANCE___CALCULATE_PAYMENT__INT;

	/**
	 * The operation id for the '<em>Pay Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL___PAY_BILL__INT_STRING_STRING_INT_INT_STRING_STRING_DOUBLE = IFINANCE___PAY_BILL__INT_STRING_STRING_INT_INT_STRING_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Bank Send Invoice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL___BANK_SEND_INVOICE = IFINANCE___BANK_SEND_INVOICE;

	/**
	 * The number of operations of the '<em>IFinance Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL_OPERATION_COUNT = IFINANCE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Charge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CHARGE = 0;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__BOOKING = 1;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Charge Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__CHARGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__BILL = 3;

	/**
	 * The number of structural features of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Add Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_OPERATION_COUNT = 4;


	/**
	 * The meta object id for the '{@link Classes.RoomStatus <em>Room Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.RoomStatus
	 * @see Classes.impl.ClassesPackageImpl#getRoomStatus()
	 * @generated
	 */
	int ROOM_STATUS = 16;


	/**
	 * The meta object id for the '{@link Classes.RoomTypeName <em>Room Type Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.RoomTypeName
	 * @see Classes.impl.ClassesPackageImpl#getRoomTypeName()
	 * @generated
	 */
	int ROOM_TYPE_NAME = 17;

	/**
	 * The meta object id for the '{@link Classes.ChargeType <em>Charge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.ChargeType
	 * @see Classes.impl.ClassesPackageImpl#getChargeType()
	 * @generated
	 */
	int CHARGE_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link Classes.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Classes.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Classes.Room#getStatus()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Status();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Classes.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the reference '{@link Classes.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see Classes.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Room#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see Classes.Room#getBookings()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Bookings();

	/**
	 * Returns the meta object for class '{@link Classes.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see Classes.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getRoomTypeName <em>Room Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Name</em>'.
	 * @see Classes.RoomType#getRoomTypeName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_RoomTypeName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Features</em>'.
	 * @see Classes.RoomType#getFeatures()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Features();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see Classes.RoomType#getNumberOfGuests()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NumberOfGuests();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for the reference list '{@link Classes.RoomType#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see Classes.RoomType#getRoom()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_Room();

	/**
	 * Returns the meta object for class '{@link Classes.IBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Management Impl</em>'.
	 * @see Classes.IBookingManagementImpl
	 * @generated
	 */
	EClass getIBookingManagementImpl();

	/**
	 * Returns the meta object for the reference list '{@link Classes.IBookingManagementImpl#getConfirmedBookings <em>Confirmed Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Confirmed Bookings</em>'.
	 * @see Classes.IBookingManagementImpl#getConfirmedBookings()
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	EReference getIBookingManagementImpl_ConfirmedBookings();

	/**
	 * Returns the meta object for the reference list '{@link Classes.IBookingManagementImpl#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see Classes.IBookingManagementImpl#getRoom()
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	EReference getIBookingManagementImpl_Room();

	/**
	 * Returns the meta object for the reference list '{@link Classes.IBookingManagementImpl#getPendingBookings <em>Pending Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pending Bookings</em>'.
	 * @see Classes.IBookingManagementImpl#getPendingBookings()
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	EReference getIBookingManagementImpl_PendingBookings();

	/**
	 * Returns the meta object for the reference '{@link Classes.IBookingManagementImpl#getIHotelManagerImpl <em>IHotel Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IHotel Manager Impl</em>'.
	 * @see Classes.IBookingManagementImpl#getIHotelManagerImpl()
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	EReference getIBookingManagementImpl_IHotelManagerImpl();

	/**
	 * Returns the meta object for the reference list '{@link Classes.IBookingManagementImpl#getBookingHistory <em>Booking History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking History</em>'.
	 * @see Classes.IBookingManagementImpl#getBookingHistory()
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	EReference getIBookingManagementImpl_BookingHistory();

	/**
	 * Returns the meta object for the reference '{@link Classes.IBookingManagementImpl#getIFinanceImpl <em>IFinance Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IFinance Impl</em>'.
	 * @see Classes.IBookingManagementImpl#getIFinanceImpl()
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	EReference getIBookingManagementImpl_IFinanceImpl();

	/**
	 * Returns the meta object for the reference list '{@link Classes.IBookingManagementImpl#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer</em>'.
	 * @see Classes.IBookingManagementImpl#getCustomer()
	 * @see #getIBookingManagementImpl()
	 * @generated
	 */
	EReference getIBookingManagementImpl_Customer();

	/**
	 * Returns the meta object for class '{@link Classes.IBookingManagement <em>IBooking Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Management</em>'.
	 * @see Classes.IBookingManagement
	 * @generated
	 */
	EClass getIBookingManagement();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#updateBooking(int, int, java.util.Date, java.util.Date, int) <em>Update Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Booking</em>' operation.
	 * @see Classes.IBookingManagement#updateBooking(int, int, java.util.Date, java.util.Date, int)
	 * @generated
	 */
	EOperation getIBookingManagement__UpdateBooking__int_int_Date_Date_int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#addRoomPending(int, int) <em>Add Room Pending</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Pending</em>' operation.
	 * @see Classes.IBookingManagement#addRoomPending(int, int)
	 * @generated
	 */
	EOperation getIBookingManagement__AddRoomPending__int_int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#confirmBooking(int) <em>Confirm Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Booking</em>' operation.
	 * @see Classes.IBookingManagement#confirmBooking(int)
	 * @generated
	 */
	EOperation getIBookingManagement__ConfirmBooking__int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#searchRoom(java.util.Date, java.util.Date, int, java.lang.String, int) <em>Search Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room</em>' operation.
	 * @see Classes.IBookingManagement#searchRoom(java.util.Date, java.util.Date, int, java.lang.String, int)
	 * @generated
	 */
	EOperation getIBookingManagement__SearchRoom__Date_Date_int_String_int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#cancelBooking(int) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Classes.IBookingManagement#cancelBooking(int)
	 * @generated
	 */
	EOperation getIBookingManagement__CancelBooking__int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#addCustomerInformationToBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Add Customer Information To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Customer Information To Booking</em>' operation.
	 * @see Classes.IBookingManagement#addCustomerInformationToBooking(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingManagement__AddCustomerInformationToBooking__int_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#createPendingBooking(java.util.Date, java.util.Date, int) <em>Create Pending Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pending Booking</em>' operation.
	 * @see Classes.IBookingManagement#createPendingBooking(java.util.Date, java.util.Date, int)
	 * @generated
	 */
	EOperation getIBookingManagement__CreatePendingBooking__Date_Date_int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#sendConfirmation(int, java.lang.String) <em>Send Confirmation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Confirmation</em>' operation.
	 * @see Classes.IBookingManagement#sendConfirmation(int, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingManagement__SendConfirmation__int_String();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#addExtraCharge(int, java.lang.String, int) <em>Add Extra Charge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Extra Charge</em>' operation.
	 * @see Classes.IBookingManagement#addExtraCharge(int, java.lang.String, int)
	 * @generated
	 */
	EOperation getIBookingManagement__AddExtraCharge__int_String_int();

	/**
	 * Returns the meta object for class '{@link Classes.IFinance <em>IFinance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFinance</em>'.
	 * @see Classes.IFinance
	 * @generated
	 */
	EClass getIFinance();

	/**
	 * Returns the meta object for the '{@link Classes.IFinance#calculatePayment(int) <em>Calculate Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Payment</em>' operation.
	 * @see Classes.IFinance#calculatePayment(int)
	 * @generated
	 */
	EOperation getIFinance__CalculatePayment__int();

	/**
	 * Returns the meta object for the '{@link Classes.IFinance#payBill(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Pay Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Bill</em>' operation.
	 * @see Classes.IFinance#payBill(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getIFinance__PayBill__int_String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Classes.IFinance#bankSendInvoice() <em>Bank Send Invoice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bank Send Invoice</em>' operation.
	 * @see Classes.IFinance#bankSendInvoice()
	 * @generated
	 */
	EOperation getIFinance__BankSendInvoice();

	/**
	 * Returns the meta object for class '{@link Classes.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see Classes.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Bill#getCharge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charge</em>'.
	 * @see Classes.Bill#getCharge()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Charge();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bill#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see Classes.Bill#getBooking()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Booking();

	/**
	 * Returns the meta object for class '{@link Classes.Charge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge</em>'.
	 * @see Classes.Charge
	 * @generated
	 */
	EClass getCharge();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Charge#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Classes.Charge#getAmount()
	 * @see #getCharge()
	 * @generated
	 */
	EAttribute getCharge_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Charge#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see Classes.Charge#getDate()
	 * @see #getCharge()
	 * @generated
	 */
	EAttribute getCharge_Date();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Charge#getChargeType <em>Charge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Type</em>'.
	 * @see Classes.Charge#getChargeType()
	 * @see #getCharge()
	 * @generated
	 */
	EAttribute getCharge_ChargeType();

	/**
	 * Returns the meta object for the reference '{@link Classes.Charge#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see Classes.Charge#getBill()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_Bill();

	/**
	 * Returns the meta object for class '{@link Classes.IHotelManager <em>IHotel Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Manager</em>'.
	 * @see Classes.IHotelManager
	 * @generated
	 */
	EClass getIHotelManager();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see Classes.IHotelManager#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__Login__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#addStaffMember(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean) <em>Add Staff Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Staff Member</em>' operation.
	 * @see Classes.IHotelManager#addStaffMember(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getIHotelManager__AddStaffMember__String_String_String_String_String_String_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#isPasswordSecure(java.lang.String) <em>Is Password Secure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Password Secure</em>' operation.
	 * @see Classes.IHotelManager#isPasswordSecure(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__IsPasswordSecure__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#isValidUsername(java.lang.String) <em>Is Valid Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Username</em>' operation.
	 * @see Classes.IHotelManager#isValidUsername(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__IsValidUsername__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#isStaffMemberLoggedIn(java.lang.String) <em>Is Staff Member Logged In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Staff Member Logged In</em>' operation.
	 * @see Classes.IHotelManager#isStaffMemberLoggedIn(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__IsStaffMemberLoggedIn__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#isStaffMemberAdmin(java.lang.String) <em>Is Staff Member Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Staff Member Admin</em>' operation.
	 * @see Classes.IHotelManager#isStaffMemberAdmin(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__IsStaffMemberAdmin__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#getStaffMemberPassword(java.lang.String) <em>Get Staff Member Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Member Password</em>' operation.
	 * @see Classes.IHotelManager#getStaffMemberPassword(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__GetStaffMemberPassword__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#getStaffMemberFirstName(java.lang.String) <em>Get Staff Member First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Member First Name</em>' operation.
	 * @see Classes.IHotelManager#getStaffMemberFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__GetStaffMemberFirstName__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#getStaffMemberLastName(java.lang.String) <em>Get Staff Member Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Member Last Name</em>' operation.
	 * @see Classes.IHotelManager#getStaffMemberLastName(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__GetStaffMemberLastName__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#getStaffMemberEmail(java.lang.String) <em>Get Staff Member Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Member Email</em>' operation.
	 * @see Classes.IHotelManager#getStaffMemberEmail(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__GetStaffMemberEmail__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#getStaffMemberPhoneNumber(java.lang.String) <em>Get Staff Member Phone Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Member Phone Number</em>' operation.
	 * @see Classes.IHotelManager#getStaffMemberPhoneNumber(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__GetStaffMemberPhoneNumber__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#getStaffMemberAddress(java.lang.String) <em>Get Staff Member Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Member Address</em>' operation.
	 * @see Classes.IHotelManager#getStaffMemberAddress(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__GetStaffMemberAddress__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#logout(java.lang.String) <em>Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logout</em>' operation.
	 * @see Classes.IHotelManager#logout(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__Logout__String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#checkInBooking(int, java.lang.String) <em>Check In Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Booking</em>' operation.
	 * @see Classes.IHotelManager#checkInBooking(int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__CheckInBooking__int_String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#changeStatusOfRoom(int, java.lang.String, java.lang.String) <em>Change Status Of Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Status Of Room</em>' operation.
	 * @see Classes.IHotelManager#changeStatusOfRoom(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__ChangeStatusOfRoom__int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#checkOut(int) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.IHotelManager#checkOut(int)
	 * @generated
	 */
	EOperation getIHotelManager__CheckOut__int();

	/**
	 * Returns the meta object for enum '{@link Classes.RoomStatus <em>Room Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Status</em>'.
	 * @see Classes.RoomStatus
	 * @generated
	 */
	EEnum getRoomStatus();

	/**
	 * Returns the meta object for enum '{@link Classes.RoomTypeName <em>Room Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Type Name</em>'.
	 * @see Classes.RoomTypeName
	 * @generated
	 */
	EEnum getRoomTypeName();

	/**
	 * Returns the meta object for enum '{@link Classes.ChargeType <em>Charge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Type</em>'.
	 * @see Classes.ChargeType
	 * @generated
	 */
	EEnum getChargeType();

	/**
	 * Returns the meta object for class '{@link Classes.IFinanceImpl <em>IFinance Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFinance Impl</em>'.
	 * @see Classes.IFinanceImpl
	 * @generated
	 */
	EClass getIFinanceImpl();

	/**
	 * Returns the meta object for the reference '{@link Classes.IFinanceImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBooking Management Impl</em>'.
	 * @see Classes.IFinanceImpl#getIBookingManagementImpl()
	 * @see #getIFinanceImpl()
	 * @generated
	 */
	EReference getIFinanceImpl_IBookingManagementImpl();

	/**
	 * Returns the meta object for the reference '{@link Classes.IFinanceImpl#getCustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Provides</em>'.
	 * @see Classes.IFinanceImpl#getCustomerProvides()
	 * @see #getIFinanceImpl()
	 * @generated
	 */
	EReference getIFinanceImpl_CustomerProvides();

	/**
	 * Returns the meta object for class '{@link Classes.AdministratorProvides <em>Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator Provides</em>'.
	 * @see Classes.AdministratorProvides
	 * @generated
	 */
	EClass getAdministratorProvides();

	/**
	 * Returns the meta object for the '{@link Classes.AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Deposit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Deposit</em>' operation.
	 * @see Classes.AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Classes.AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Add Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Credit Card</em>' operation.
	 * @see Classes.AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Remove Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credit Card</em>' operation.
	 * @see Classes.AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Get Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Balance</em>' operation.
	 * @see Classes.AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__GetBalance__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link Classes.CustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Provides</em>'.
	 * @see Classes.CustomerProvides
	 * @generated
	 */
	EClass getCustomerProvides();

	/**
	 * Returns the meta object for the '{@link Classes.CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see Classes.CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Classes.CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Is Credit Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Valid</em>' operation.
	 * @see Classes.CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link Classes.StaffMember <em>Staff Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Member</em>'.
	 * @see Classes.StaffMember
	 * @generated
	 */
	EClass getStaffMember();

	/**
	 * Returns the meta object for the attribute '{@link Classes.StaffMember#isAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin</em>'.
	 * @see Classes.StaffMember#isAdmin()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Admin();

	/**
	 * Returns the meta object for the attribute '{@link Classes.StaffMember#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see Classes.StaffMember#getUsername()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Username();

	/**
	 * Returns the meta object for the attribute '{@link Classes.StaffMember#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Classes.StaffMember#getPassword()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Password();

	/**
	 * Returns the meta object for the attribute '{@link Classes.StaffMember#isLoggedIn <em>Is Logged In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Logged In</em>'.
	 * @see Classes.StaffMember#isLoggedIn()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_IsLoggedIn();

	/**
	 * Returns the meta object for class '{@link Classes.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see Classes.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getCheckIn <em>Check In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In</em>'.
	 * @see Classes.Booking#getCheckIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckIn();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getCheckOut <em>Check Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out</em>'.
	 * @see Classes.Booking#getCheckOut()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckOut();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see Classes.Booking#getBookingID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingID();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see Classes.Booking#getNumberOfGuests()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_NumberOfGuests();

	/**
	 * Returns the meta object for the reference '{@link Classes.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see Classes.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the reference '{@link Classes.Booking#getIBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBooking Management Impl</em>'.
	 * @see Classes.Booking#getIBookingManagementImpl()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_IBookingManagementImpl();

	/**
	 * Returns the meta object for the reference '{@link Classes.Booking#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see Classes.Booking#getBill()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Bill();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Booking#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see Classes.Booking#getRooms()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Rooms();

	/**
	 * Returns the meta object for class '{@link Classes.IPerson <em>IPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPerson</em>'.
	 * @see Classes.IPerson
	 * @generated
	 */
	EClass getIPerson();

	/**
	 * Returns the meta object for the attribute '{@link Classes.IPerson#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Classes.IPerson#getFirstName()
	 * @see #getIPerson()
	 * @generated
	 */
	EAttribute getIPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.IPerson#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Classes.IPerson#getLastName()
	 * @see #getIPerson()
	 * @generated
	 */
	EAttribute getIPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.IPerson#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Classes.IPerson#getAddress()
	 * @see #getIPerson()
	 * @generated
	 */
	EAttribute getIPerson_Address();

	/**
	 * Returns the meta object for the attribute '{@link Classes.IPerson#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.IPerson#getEmail()
	 * @see #getIPerson()
	 * @generated
	 */
	EAttribute getIPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link Classes.IPerson#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see Classes.IPerson#getPhoneNumber()
	 * @see #getIPerson()
	 * @generated
	 */
	EAttribute getIPerson_PhoneNumber();

	/**
	 * Returns the meta object for class '{@link Classes.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see Classes.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference '{@link Classes.Customer#getIBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBooking Management Impl</em>'.
	 * @see Classes.Customer#getIBookingManagementImpl()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_IBookingManagementImpl();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Customer#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking</em>'.
	 * @see Classes.Customer#getBooking()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Booking();

	/**
	 * Returns the meta object for class '{@link Classes.IHotelManagerImpl <em>IHotel Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Manager Impl</em>'.
	 * @see Classes.IHotelManagerImpl
	 * @generated
	 */
	EClass getIHotelManagerImpl();

	/**
	 * Returns the meta object for the reference list '{@link Classes.IHotelManagerImpl#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff</em>'.
	 * @see Classes.IHotelManagerImpl#getStaff()
	 * @see #getIHotelManagerImpl()
	 * @generated
	 */
	EReference getIHotelManagerImpl_Staff();

	/**
	 * Returns the meta object for the reference '{@link Classes.IHotelManagerImpl#getIBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBooking Management Impl</em>'.
	 * @see Classes.IHotelManagerImpl#getIBookingManagementImpl()
	 * @see #getIHotelManagerImpl()
	 * @generated
	 */
	EReference getIHotelManagerImpl_IBookingManagementImpl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassesFactory getClassesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.RoomImpl
		 * @see Classes.impl.ClassesPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__STATUS = eINSTANCE.getRoom_Status();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BOOKINGS = eINSTANCE.getRoom_Bookings();

		/**
		 * The meta object literal for the '{@link Classes.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.RoomTypeImpl
		 * @see Classes.impl.ClassesPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Room Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__ROOM_TYPE_NAME = eINSTANCE.getRoomType_RoomTypeName();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__FEATURES = eINSTANCE.getRoomType_Features();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NUMBER_OF_GUESTS = eINSTANCE.getRoomType_NumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__ROOM = eINSTANCE.getRoomType_Room();

		/**
		 * The meta object literal for the '{@link Classes.impl.IBookingManagementImplImpl <em>IBooking Management Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.IBookingManagementImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getIBookingManagementImpl()
		 * @generated
		 */
		EClass IBOOKING_MANAGEMENT_IMPL = eINSTANCE.getIBookingManagementImpl();

		/**
		 * The meta object literal for the '<em><b>Confirmed Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBOOKING_MANAGEMENT_IMPL__CONFIRMED_BOOKINGS = eINSTANCE.getIBookingManagementImpl_ConfirmedBookings();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBOOKING_MANAGEMENT_IMPL__ROOM = eINSTANCE.getIBookingManagementImpl_Room();

		/**
		 * The meta object literal for the '<em><b>Pending Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS = eINSTANCE.getIBookingManagementImpl_PendingBookings();

		/**
		 * The meta object literal for the '<em><b>IHotel Manager Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBOOKING_MANAGEMENT_IMPL__IHOTEL_MANAGER_IMPL = eINSTANCE.getIBookingManagementImpl_IHotelManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Booking History</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBOOKING_MANAGEMENT_IMPL__BOOKING_HISTORY = eINSTANCE.getIBookingManagementImpl_BookingHistory();

		/**
		 * The meta object literal for the '<em><b>IFinance Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBOOKING_MANAGEMENT_IMPL__IFINANCE_IMPL = eINSTANCE.getIBookingManagementImpl_IFinanceImpl();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBOOKING_MANAGEMENT_IMPL__CUSTOMER = eINSTANCE.getIBookingManagementImpl_Customer();

		/**
		 * The meta object literal for the '{@link Classes.IBookingManagement <em>IBooking Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.IBookingManagement
		 * @see Classes.impl.ClassesPackageImpl#getIBookingManagement()
		 * @generated
		 */
		EClass IBOOKING_MANAGEMENT = eINSTANCE.getIBookingManagement();

		/**
		 * The meta object literal for the '<em><b>Update Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___UPDATE_BOOKING__INT_INT_DATE_DATE_INT = eINSTANCE.getIBookingManagement__UpdateBooking__int_int_Date_Date_int();

		/**
		 * The meta object literal for the '<em><b>Add Room Pending</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___ADD_ROOM_PENDING__INT_INT = eINSTANCE.getIBookingManagement__AddRoomPending__int_int();

		/**
		 * The meta object literal for the '<em><b>Confirm Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CONFIRM_BOOKING__INT = eINSTANCE.getIBookingManagement__ConfirmBooking__int();

		/**
		 * The meta object literal for the '<em><b>Search Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_INT_STRING_INT = eINSTANCE.getIBookingManagement__SearchRoom__Date_Date_int_String_int();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT = eINSTANCE.getIBookingManagement__CancelBooking__int();

		/**
		 * The meta object literal for the '<em><b>Add Customer Information To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING = eINSTANCE.getIBookingManagement__AddCustomerInformationToBooking__int_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Create Pending Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CREATE_PENDING_BOOKING__DATE_DATE_INT = eINSTANCE.getIBookingManagement__CreatePendingBooking__Date_Date_int();

		/**
		 * The meta object literal for the '<em><b>Send Confirmation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___SEND_CONFIRMATION__INT_STRING = eINSTANCE.getIBookingManagement__SendConfirmation__int_String();

		/**
		 * The meta object literal for the '<em><b>Add Extra Charge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___ADD_EXTRA_CHARGE__INT_STRING_INT = eINSTANCE.getIBookingManagement__AddExtraCharge__int_String_int();

		/**
		 * The meta object literal for the '{@link Classes.IFinance <em>IFinance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.IFinance
		 * @see Classes.impl.ClassesPackageImpl#getIFinance()
		 * @generated
		 */
		EClass IFINANCE = eINSTANCE.getIFinance();

		/**
		 * The meta object literal for the '<em><b>Calculate Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFINANCE___CALCULATE_PAYMENT__INT = eINSTANCE.getIFinance__CalculatePayment__int();

		/**
		 * The meta object literal for the '<em><b>Pay Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFINANCE___PAY_BILL__INT_STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getIFinance__PayBill__int_String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Bank Send Invoice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFINANCE___BANK_SEND_INVOICE = eINSTANCE.getIFinance__BankSendInvoice();

		/**
		 * The meta object literal for the '{@link Classes.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.BillImpl
		 * @see Classes.impl.ClassesPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Charge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CHARGE = eINSTANCE.getBill_Charge();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__BOOKING = eINSTANCE.getBill_Booking();

		/**
		 * The meta object literal for the '{@link Classes.impl.ChargeImpl <em>Charge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.ChargeImpl
		 * @see Classes.impl.ClassesPackageImpl#getCharge()
		 * @generated
		 */
		EClass CHARGE = eINSTANCE.getCharge();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE__AMOUNT = eINSTANCE.getCharge_Amount();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE__DATE = eINSTANCE.getCharge_Date();

		/**
		 * The meta object literal for the '<em><b>Charge Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE__CHARGE_TYPE = eINSTANCE.getCharge_ChargeType();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__BILL = eINSTANCE.getCharge_Bill();

		/**
		 * The meta object literal for the '{@link Classes.IHotelManager <em>IHotel Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.IHotelManager
		 * @see Classes.impl.ClassesPackageImpl#getIHotelManager()
		 * @generated
		 */
		EClass IHOTEL_MANAGER = eINSTANCE.getIHotelManager();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___LOGIN__STRING_STRING = eINSTANCE.getIHotelManager__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Staff Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_BOOLEAN = eINSTANCE.getIHotelManager__AddStaffMember__String_String_String_String_String_String_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Password Secure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___IS_PASSWORD_SECURE__STRING = eINSTANCE.getIHotelManager__IsPasswordSecure__String();

		/**
		 * The meta object literal for the '<em><b>Is Valid Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___IS_VALID_USERNAME__STRING = eINSTANCE.getIHotelManager__IsValidUsername__String();

		/**
		 * The meta object literal for the '<em><b>Is Staff Member Logged In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___IS_STAFF_MEMBER_LOGGED_IN__STRING = eINSTANCE.getIHotelManager__IsStaffMemberLoggedIn__String();

		/**
		 * The meta object literal for the '<em><b>Is Staff Member Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___IS_STAFF_MEMBER_ADMIN__STRING = eINSTANCE.getIHotelManager__IsStaffMemberAdmin__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Member Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___GET_STAFF_MEMBER_PASSWORD__STRING = eINSTANCE.getIHotelManager__GetStaffMemberPassword__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Member First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___GET_STAFF_MEMBER_FIRST_NAME__STRING = eINSTANCE.getIHotelManager__GetStaffMemberFirstName__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Member Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___GET_STAFF_MEMBER_LAST_NAME__STRING = eINSTANCE.getIHotelManager__GetStaffMemberLastName__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Member Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___GET_STAFF_MEMBER_EMAIL__STRING = eINSTANCE.getIHotelManager__GetStaffMemberEmail__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Member Phone Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___GET_STAFF_MEMBER_PHONE_NUMBER__STRING = eINSTANCE.getIHotelManager__GetStaffMemberPhoneNumber__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Member Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___GET_STAFF_MEMBER_ADDRESS__STRING = eINSTANCE.getIHotelManager__GetStaffMemberAddress__String();

		/**
		 * The meta object literal for the '<em><b>Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___LOGOUT__STRING = eINSTANCE.getIHotelManager__Logout__String();

		/**
		 * The meta object literal for the '<em><b>Check In Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___CHECK_IN_BOOKING__INT_STRING = eINSTANCE.getIHotelManager__CheckInBooking__int_String();

		/**
		 * The meta object literal for the '<em><b>Change Status Of Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_STRING_STRING = eINSTANCE.getIHotelManager__ChangeStatusOfRoom__int_String_String();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___CHECK_OUT__INT = eINSTANCE.getIHotelManager__CheckOut__int();

		/**
		 * The meta object literal for the '{@link Classes.RoomStatus <em>Room Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.RoomStatus
		 * @see Classes.impl.ClassesPackageImpl#getRoomStatus()
		 * @generated
		 */
		EEnum ROOM_STATUS = eINSTANCE.getRoomStatus();

		/**
		 * The meta object literal for the '{@link Classes.RoomTypeName <em>Room Type Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.RoomTypeName
		 * @see Classes.impl.ClassesPackageImpl#getRoomTypeName()
		 * @generated
		 */
		EEnum ROOM_TYPE_NAME = eINSTANCE.getRoomTypeName();

		/**
		 * The meta object literal for the '{@link Classes.ChargeType <em>Charge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.ChargeType
		 * @see Classes.impl.ClassesPackageImpl#getChargeType()
		 * @generated
		 */
		EEnum CHARGE_TYPE = eINSTANCE.getChargeType();

		/**
		 * The meta object literal for the '{@link Classes.impl.IFinanceImplImpl <em>IFinance Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.IFinanceImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getIFinanceImpl()
		 * @generated
		 */
		EClass IFINANCE_IMPL = eINSTANCE.getIFinanceImpl();

		/**
		 * The meta object literal for the '<em><b>IBooking Management Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFINANCE_IMPL__IBOOKING_MANAGEMENT_IMPL = eINSTANCE.getIFinanceImpl_IBookingManagementImpl();

		/**
		 * The meta object literal for the '<em><b>Customer Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFINANCE_IMPL__CUSTOMER_PROVIDES = eINSTANCE.getIFinanceImpl_CustomerProvides();

		/**
		 * The meta object literal for the '{@link Classes.AdministratorProvides <em>Administrator Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.AdministratorProvides
		 * @see Classes.impl.ClassesPackageImpl#getAdministratorProvides()
		 * @generated
		 */
		EClass ADMINISTRATOR_PROVIDES = eINSTANCE.getAdministratorProvides();

		/**
		 * The meta object literal for the '<em><b>Make Deposit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Add Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__GetBalance__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link Classes.CustomerProvides <em>Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.CustomerProvides
		 * @see Classes.impl.ClassesPackageImpl#getCustomerProvides()
		 * @generated
		 */
		EClass CUSTOMER_PROVIDES = eINSTANCE.getCustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link Classes.impl.StaffMemberImpl <em>Staff Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.StaffMemberImpl
		 * @see Classes.impl.ClassesPackageImpl#getStaffMember()
		 * @generated
		 */
		EClass STAFF_MEMBER = eINSTANCE.getStaffMember();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__ADMIN = eINSTANCE.getStaffMember_Admin();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__USERNAME = eINSTANCE.getStaffMember_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__PASSWORD = eINSTANCE.getStaffMember_Password();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__IS_LOGGED_IN = eINSTANCE.getStaffMember_IsLoggedIn();

		/**
		 * The meta object literal for the '{@link Classes.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.BookingImpl
		 * @see Classes.impl.ClassesPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECK_IN = eINSTANCE.getBooking_CheckIn();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECK_OUT = eINSTANCE.getBooking_CheckOut();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingID();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__NUMBER_OF_GUESTS = eINSTANCE.getBooking_NumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>IBooking Management Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__IBOOKING_MANAGEMENT_IMPL = eINSTANCE.getBooking_IBookingManagementImpl();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BILL = eINSTANCE.getBooking_Bill();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOMS = eINSTANCE.getBooking_Rooms();

		/**
		 * The meta object literal for the '{@link Classes.IPerson <em>IPerson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.IPerson
		 * @see Classes.impl.ClassesPackageImpl#getIPerson()
		 * @generated
		 */
		EClass IPERSON = eINSTANCE.getIPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPERSON__FIRST_NAME = eINSTANCE.getIPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPERSON__LAST_NAME = eINSTANCE.getIPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPERSON__ADDRESS = eINSTANCE.getIPerson_Address();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPERSON__EMAIL = eINSTANCE.getIPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPERSON__PHONE_NUMBER = eINSTANCE.getIPerson_PhoneNumber();

		/**
		 * The meta object literal for the '{@link Classes.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.CustomerImpl
		 * @see Classes.impl.ClassesPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>IBooking Management Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__IBOOKING_MANAGEMENT_IMPL = eINSTANCE.getCustomer_IBookingManagementImpl();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__BOOKING = eINSTANCE.getCustomer_Booking();

		/**
		 * The meta object literal for the '{@link Classes.impl.IHotelManagerImplImpl <em>IHotel Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.IHotelManagerImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getIHotelManagerImpl()
		 * @generated
		 */
		EClass IHOTEL_MANAGER_IMPL = eINSTANCE.getIHotelManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IHOTEL_MANAGER_IMPL__STAFF = eINSTANCE.getIHotelManagerImpl_Staff();

		/**
		 * The meta object literal for the '<em><b>IBooking Management Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL = eINSTANCE.getIHotelManagerImpl_IBookingManagementImpl();

	}

} //ClassesPackage
