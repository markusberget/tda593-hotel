/**
 */
package Classes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Statusoccupiedreadypending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__STATUSOCCUPIEDREADYPENDING = 0;

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
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 0;

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
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 5;

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
	int IBOOKING_MANAGEMENT = 3;

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
	int IBOOKING_MANAGEMENT___UPDATE_BOOKING = 0;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___GET_BOOKING__INT = 1;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___GET_BOOKING__INT_DATE = 2;

	/**
	 * The operation id for the '<em>Add Room Pending</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___ADD_ROOM_PENDING__INT_INT = 3;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CONFIRM_BOOKING__INT = 4;

	/**
	 * The operation id for the '<em>Add Cancelation Fee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___ADD_CANCELATION_FEE__CLASS = 5;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_CLASS_INT_INT_INT = 6;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT = 7;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CHECK_IN__INT = 8;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CHECK_OUT__INT = 9;

	/**
	 * The operation id for the '<em>Add Customer Information To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING = 10;

	/**
	 * The operation id for the '<em>Create Pending Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CREATE_PENDING_BOOKING__DATE_DATE_INT = 11;

	/**
	 * The number of operations of the '<em>IBooking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link Classes.impl.IBookingManagementImplImpl <em>IBooking Management Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.IBookingManagementImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getIBookingManagementImpl()
	 * @generated
	 */
	int IBOOKING_MANAGEMENT_IMPL = 2;

	/**
	 * The number of structural features of the '<em>IBooking Management Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL_FEATURE_COUNT = IBOOKING_MANAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___UPDATE_BOOKING = IBOOKING_MANAGEMENT___UPDATE_BOOKING;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___GET_BOOKING__INT = IBOOKING_MANAGEMENT___GET_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___GET_BOOKING__INT_DATE = IBOOKING_MANAGEMENT___GET_BOOKING__INT_DATE;

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
	 * The operation id for the '<em>Add Cancelation Fee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___ADD_CANCELATION_FEE__CLASS = IBOOKING_MANAGEMENT___ADD_CANCELATION_FEE__CLASS;

	/**
	 * The operation id for the '<em>Search Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___SEARCH_ROOM__DATE_DATE_CLASS_INT_INT_INT = IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_CLASS_INT_INT_INT;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___CANCEL_BOOKING__INT = IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___CHECK_IN__INT = IBOOKING_MANAGEMENT___CHECK_IN__INT;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___CHECK_OUT__INT = IBOOKING_MANAGEMENT___CHECK_OUT__INT;

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
	 * The number of operations of the '<em>IBooking Management Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL_OPERATION_COUNT = IBOOKING_MANAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.IFinance <em>IFinance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IFinance
	 * @see Classes.impl.ClassesPackageImpl#getIFinance()
	 * @generated
	 */
	int IFINANCE = 5;

	/**
	 * The meta object id for the '{@link Classes.IHotelManager <em>IHotel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IHotelManager
	 * @see Classes.impl.ClassesPackageImpl#getIHotelManager()
	 * @generated
	 */
	int IHOTEL_MANAGER = 6;

	/**
	 * The meta object id for the '{@link Classes.impl.IFinanceImplImpl <em>IFinance Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.IFinanceImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getIFinanceImpl()
	 * @generated
	 */
	int IFINANCE_IMPL = 7;

	/**
	 * The meta object id for the '{@link Classes.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BookingImpl
	 * @see Classes.impl.ClassesPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 4;

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
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__LAST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PHONE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Fully Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__FULLY_PAID = 8;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

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
	int IFINANCE___PAY_BILL__INT = 1;

	/**
	 * The operation id for the '<em>Validate With Bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Bank Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Bank Send Invoice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE___BANK_SEND_INVOICE = 4;

	/**
	 * The number of operations of the '<em>IFinance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_OPERATION_COUNT = 5;

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
	 * The operation id for the '<em>Change Status Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR = 4;

	/**
	 * The operation id for the '<em>Get Possible Room Statuses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___GET_POSSIBLE_ROOM_STATUSES = 5;

	/**
	 * The operation id for the '<em>Find Staff Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___FIND_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Is Staff Member Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___IS_STAFF_MEMBER_LOGGED_IN__STRING = 7;

	/**
	 * The operation id for the '<em>Is Staff Member Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER___IS_STAFF_MEMBER_ADMIN__STRING = 8;

	/**
	 * The number of operations of the '<em>IHotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_OPERATION_COUNT = 9;

	/**
	 * The number of structural features of the '<em>IFinance Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL_FEATURE_COUNT = IFINANCE_FEATURE_COUNT + 0;

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
	int IFINANCE_IMPL___PAY_BILL__INT = IFINANCE___PAY_BILL__INT;

	/**
	 * The operation id for the '<em>Validate With Bank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING = IFINANCE___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Bank Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFINANCE_IMPL___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING = IFINANCE___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING;

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
	 * The meta object id for the '{@link Classes.IPerson <em>IPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IPerson
	 * @see Classes.impl.ClassesPackageImpl#getIPerson()
	 * @generated
	 */
	int IPERSON = 9;

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
	 * The meta object id for the '{@link Classes.impl.StaffMemberImpl <em>Staff Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.StaffMemberImpl
	 * @see Classes.impl.ClassesPackageImpl#getStaffMember()
	 * @generated
	 */
	int STAFF_MEMBER = 8;

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
	 * The meta object id for the '{@link Classes.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.CustomerImpl
	 * @see Classes.impl.ClassesPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 10;

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
	 * The feature id for the '<em><b>Personal Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PERSONAL_INFO = IPERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = IPERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = IPERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.impl.IHotelManagerImplImpl <em>IHotel Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.IHotelManagerImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getIHotelManagerImpl()
	 * @generated
	 */
	int IHOTEL_MANAGER_IMPL = 11;

	/**
	 * The number of structural features of the '<em>IHotel Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL_FEATURE_COUNT = IHOTEL_MANAGER_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Change Status Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR = IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR;

	/**
	 * The operation id for the '<em>Get Possible Room Statuses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___GET_POSSIBLE_ROOM_STATUSES = IHOTEL_MANAGER___GET_POSSIBLE_ROOM_STATUSES;

	/**
	 * The operation id for the '<em>Find Staff Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL___FIND_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING = IHOTEL_MANAGER___FIND_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING;

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
	 * The number of operations of the '<em>IHotel Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_IMPL_OPERATION_COUNT = IHOTEL_MANAGER_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link Classes.Room#isStatusoccupiedreadypending <em>Statusoccupiedreadypending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statusoccupiedreadypending</em>'.
	 * @see Classes.Room#isStatusoccupiedreadypending()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Statusoccupiedreadypending();

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
	 * Returns the meta object for class '{@link Classes.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see Classes.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link Classes.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

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
	 * Returns the meta object for class '{@link Classes.IBookingManagementImpl <em>IBooking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Management Impl</em>'.
	 * @see Classes.IBookingManagementImpl
	 * @generated
	 */
	EClass getIBookingManagementImpl();

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
	 * Returns the meta object for the '{@link Classes.IBookingManagement#updateBooking() <em>Update Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Booking</em>' operation.
	 * @see Classes.IBookingManagement#updateBooking()
	 * @generated
	 */
	EOperation getIBookingManagement__UpdateBooking();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#getBooking(int) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see Classes.IBookingManagement#getBooking(int)
	 * @generated
	 */
	EOperation getIBookingManagement__GetBooking__int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#getBooking(int, java.util.Date) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see Classes.IBookingManagement#getBooking(int, java.util.Date)
	 * @generated
	 */
	EOperation getIBookingManagement__GetBooking__int_Date();

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
	 * Returns the meta object for the '{@link Classes.IBookingManagement#addCancelationFee(java.lang.Class) <em>Add Cancelation Fee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Cancelation Fee</em>' operation.
	 * @see Classes.IBookingManagement#addCancelationFee(java.lang.Class)
	 * @generated
	 */
	EOperation getIBookingManagement__AddCancelationFee__Class();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#searchRoom(java.util.Date, java.util.Date, java.lang.Class, int, int, int) <em>Search Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room</em>' operation.
	 * @see Classes.IBookingManagement#searchRoom(java.util.Date, java.util.Date, java.lang.Class, int, int, int)
	 * @generated
	 */
	EOperation getIBookingManagement__SearchRoom__Date_Date_Class_int_int_int();

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
	 * Returns the meta object for the '{@link Classes.IBookingManagement#checkIn(int) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see Classes.IBookingManagement#checkIn(int)
	 * @generated
	 */
	EOperation getIBookingManagement__CheckIn__int();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#checkOut(int) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.IBookingManagement#checkOut(int)
	 * @generated
	 */
	EOperation getIBookingManagement__CheckOut__int();

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
	 * Returns the meta object for the '{@link Classes.IFinance#payBill(int) <em>Pay Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Bill</em>' operation.
	 * @see Classes.IFinance#payBill(int)
	 * @generated
	 */
	EOperation getIFinance__PayBill__int();

	/**
	 * Returns the meta object for the '{@link Classes.IFinance#validateWithBank(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Validate With Bank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate With Bank</em>' operation.
	 * @see Classes.IFinance#validateWithBank(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIFinance__ValidateWithBank__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.IFinance#bankTransfer(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Bank Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bank Transfer</em>' operation.
	 * @see Classes.IFinance#bankTransfer(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIFinance__BankTransfer__String_String_int_int_String_String();

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
	 * Returns the meta object for the '{@link Classes.IHotelManager#changeStatusOfRoom(int, org.eclipse.emf.common.util.Enumerator) <em>Change Status Of Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Status Of Room</em>' operation.
	 * @see Classes.IHotelManager#changeStatusOfRoom(int, org.eclipse.emf.common.util.Enumerator)
	 * @generated
	 */
	EOperation getIHotelManager__ChangeStatusOfRoom__int_Enumerator();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#getPossibleRoomStatuses() <em>Get Possible Room Statuses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Room Statuses</em>' operation.
	 * @see Classes.IHotelManager#getPossibleRoomStatuses()
	 * @generated
	 */
	EOperation getIHotelManager__GetPossibleRoomStatuses();

	/**
	 * Returns the meta object for the '{@link Classes.IHotelManager#findStaffMember(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Find Staff Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Staff Member</em>' operation.
	 * @see Classes.IHotelManager#findStaffMember(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__FindStaffMember__String_String_String_String_String();

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
	 * Returns the meta object for class '{@link Classes.IFinanceImpl <em>IFinance Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFinance Impl</em>'.
	 * @see Classes.IFinanceImpl
	 * @generated
	 */
	EClass getIFinanceImpl();

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
	 * Returns the meta object for the attribute '{@link Classes.Booking#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Classes.Booking#getFirstName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Classes.Booking#getLastName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.Booking#getEmail()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Email();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see Classes.Booking#getPhoneNumber()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Booking#isFullyPaid <em>Fully Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Paid</em>'.
	 * @see Classes.Booking#isFullyPaid()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_FullyPaid();

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
	 * Returns the meta object for the attribute '{@link Classes.Customer#getPersonalInfo <em>Personal Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Info</em>'.
	 * @see Classes.Customer#getPersonalInfo()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PersonalInfo();

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
		 * The meta object literal for the '<em><b>Statusoccupiedreadypending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__STATUSOCCUPIEDREADYPENDING = eINSTANCE.getRoom_Statusoccupiedreadypending();

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
		 * The meta object literal for the '{@link Classes.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.RoomTypeImpl
		 * @see Classes.impl.ClassesPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

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
		 * The meta object literal for the '{@link Classes.impl.IBookingManagementImplImpl <em>IBooking Management Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.IBookingManagementImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getIBookingManagementImpl()
		 * @generated
		 */
		EClass IBOOKING_MANAGEMENT_IMPL = eINSTANCE.getIBookingManagementImpl();

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
		EOperation IBOOKING_MANAGEMENT___UPDATE_BOOKING = eINSTANCE.getIBookingManagement__UpdateBooking();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___GET_BOOKING__INT = eINSTANCE.getIBookingManagement__GetBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___GET_BOOKING__INT_DATE = eINSTANCE.getIBookingManagement__GetBooking__int_Date();

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
		 * The meta object literal for the '<em><b>Add Cancelation Fee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___ADD_CANCELATION_FEE__CLASS = eINSTANCE.getIBookingManagement__AddCancelationFee__Class();

		/**
		 * The meta object literal for the '<em><b>Search Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_CLASS_INT_INT_INT = eINSTANCE.getIBookingManagement__SearchRoom__Date_Date_Class_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT = eINSTANCE.getIBookingManagement__CancelBooking__int();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CHECK_IN__INT = eINSTANCE.getIBookingManagement__CheckIn__int();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CHECK_OUT__INT = eINSTANCE.getIBookingManagement__CheckOut__int();

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
		EOperation IFINANCE___PAY_BILL__INT = eINSTANCE.getIFinance__PayBill__int();

		/**
		 * The meta object literal for the '<em><b>Validate With Bank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFINANCE___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIFinance__ValidateWithBank__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Bank Transfer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFINANCE___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIFinance__BankTransfer__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Bank Send Invoice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFINANCE___BANK_SEND_INVOICE = eINSTANCE.getIFinance__BankSendInvoice();

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
		 * The meta object literal for the '<em><b>Change Status Of Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR = eINSTANCE.getIHotelManager__ChangeStatusOfRoom__int_Enumerator();

		/**
		 * The meta object literal for the '<em><b>Get Possible Room Statuses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___GET_POSSIBLE_ROOM_STATUSES = eINSTANCE.getIHotelManager__GetPossibleRoomStatuses();

		/**
		 * The meta object literal for the '<em><b>Find Staff Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_MANAGER___FIND_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getIHotelManager__FindStaffMember__String_String_String_String_String();

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
		 * The meta object literal for the '{@link Classes.impl.IFinanceImplImpl <em>IFinance Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.IFinanceImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getIFinanceImpl()
		 * @generated
		 */
		EClass IFINANCE_IMPL = eINSTANCE.getIFinanceImpl();

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
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__FIRST_NAME = eINSTANCE.getBooking_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__LAST_NAME = eINSTANCE.getBooking_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__EMAIL = eINSTANCE.getBooking_Email();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PHONE_NUMBER = eINSTANCE.getBooking_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Fully Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__FULLY_PAID = eINSTANCE.getBooking_FullyPaid();

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
		 * The meta object literal for the '<em><b>Personal Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PERSONAL_INFO = eINSTANCE.getCustomer_PersonalInfo();

		/**
		 * The meta object literal for the '{@link Classes.impl.IHotelManagerImplImpl <em>IHotel Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.IHotelManagerImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getIHotelManagerImpl()
		 * @generated
		 */
		EClass IHOTEL_MANAGER_IMPL = eINSTANCE.getIHotelManagerImpl();

	}

} //ClassesPackage
