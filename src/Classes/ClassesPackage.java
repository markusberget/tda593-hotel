/**
 */
package Classes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.IBookingManagement <em>IBooking Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IBookingManagement
	 * @see Classes.impl.ClassesPackageImpl#getIBookingManagement()
	 * @generated
	 */
	int IBOOKING_MANAGEMENT = 2;

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
	int IBOOKING_MANAGEMENT___CHECK_IN__CLASS = 8;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT___CHECK_OUT__CLASS = 9;

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
	int IBOOKING_MANAGEMENT_IMPL = 1;

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
	int IBOOKING_MANAGEMENT_IMPL___CHECK_IN__CLASS = IBOOKING_MANAGEMENT___CHECK_IN__CLASS;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_IMPL___CHECK_OUT__CLASS = IBOOKING_MANAGEMENT___CHECK_OUT__CLASS;

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
	int IFINANCE = 3;

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
	 * The meta object id for the '{@link Classes.IHotelManager <em>IHotel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.IHotelManager
	 * @see Classes.impl.ClassesPackageImpl#getIHotelManager()
	 * @generated
	 */
	int IHOTEL_MANAGER = 4;

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
	int IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING = 1;

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
	 * The number of operations of the '<em>IHotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_MANAGER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link Classes.impl.HotelManagerImpl <em>Hotel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.HotelManagerImpl
	 * @see Classes.impl.ClassesPackageImpl#getHotelManager()
	 * @generated
	 */
	int HOTEL_MANAGER = 5;

	/**
	 * The number of structural features of the '<em>Hotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.HotelManager_IHotelManagerImplImpl <em>Hotel Manager IHotel Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.HotelManager_IHotelManagerImplImpl
	 * @see Classes.impl.ClassesPackageImpl#getHotelManager_IHotelManagerImpl()
	 * @generated
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL = 6;

	/**
	 * The number of structural features of the '<em>Hotel Manager IHotel Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL_FEATURE_COUNT = IHOTEL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL___LOGIN__STRING_STRING = IHOTEL_MANAGER___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Staff Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING = IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Is Password Secure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL___IS_PASSWORD_SECURE__STRING = IHOTEL_MANAGER___IS_PASSWORD_SECURE__STRING;

	/**
	 * The operation id for the '<em>Is Valid Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL___IS_VALID_USERNAME__STRING = IHOTEL_MANAGER___IS_VALID_USERNAME__STRING;

	/**
	 * The operation id for the '<em>Change Status Of Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR = IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR;

	/**
	 * The operation id for the '<em>Get Possible Room Statuses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL___GET_POSSIBLE_ROOM_STATUSES = IHOTEL_MANAGER___GET_POSSIBLE_ROOM_STATUSES;

	/**
	 * The number of operations of the '<em>Hotel Manager IHotel Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_IHOTEL_MANAGER_IMPL_OPERATION_COUNT = IHOTEL_MANAGER_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link Classes.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.BookingImpl
	 * @see Classes.impl.ClassesPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 8;

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
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.impl.StaffImpl
	 * @see Classes.impl.ClassesPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 9;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ADMIN = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Personal Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PERSONAL_INFO = 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the '{@link Classes.IBookingManagement#checkIn(java.lang.Class) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see Classes.IBookingManagement#checkIn(java.lang.Class)
	 * @generated
	 */
	EOperation getIBookingManagement__CheckIn__Class();

	/**
	 * Returns the meta object for the '{@link Classes.IBookingManagement#checkOut(java.lang.Class) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.IBookingManagement#checkOut(java.lang.Class)
	 * @generated
	 */
	EOperation getIBookingManagement__CheckOut__Class();

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
	 * Returns the meta object for the '{@link Classes.IHotelManager#addStaffMember(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Add Staff Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Staff Member</em>' operation.
	 * @see Classes.IHotelManager#addStaffMember(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelManager__AddStaffMember__String_String_String_String_String_String_String();

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
	 * Returns the meta object for class '{@link Classes.HotelManager <em>Hotel Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Manager</em>'.
	 * @see Classes.HotelManager
	 * @generated
	 */
	EClass getHotelManager();

	/**
	 * Returns the meta object for class '{@link Classes.HotelManager_IHotelManagerImpl <em>Hotel Manager IHotel Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Manager IHotel Manager Impl</em>'.
	 * @see Classes.HotelManager_IHotelManagerImpl
	 * @generated
	 */
	EClass getHotelManager_IHotelManagerImpl();

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
	 * Returns the meta object for class '{@link Classes.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see Classes.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff#isAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin</em>'.
	 * @see Classes.Staff#isAdmin()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Admin();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see Classes.Staff#getUserId()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_UserId();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Classes.Staff#getPassword()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Password();

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
		EOperation IBOOKING_MANAGEMENT___CHECK_IN__CLASS = eINSTANCE.getIBookingManagement__CheckIn__Class();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGEMENT___CHECK_OUT__CLASS = eINSTANCE.getIBookingManagement__CheckOut__Class();

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
		EOperation IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getIHotelManager__AddStaffMember__String_String_String_String_String_String_String();

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
		 * The meta object literal for the '{@link Classes.impl.HotelManagerImpl <em>Hotel Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.HotelManagerImpl
		 * @see Classes.impl.ClassesPackageImpl#getHotelManager()
		 * @generated
		 */
		EClass HOTEL_MANAGER = eINSTANCE.getHotelManager();

		/**
		 * The meta object literal for the '{@link Classes.impl.HotelManager_IHotelManagerImplImpl <em>Hotel Manager IHotel Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.HotelManager_IHotelManagerImplImpl
		 * @see Classes.impl.ClassesPackageImpl#getHotelManager_IHotelManagerImpl()
		 * @generated
		 */
		EClass HOTEL_MANAGER_IHOTEL_MANAGER_IMPL = eINSTANCE.getHotelManager_IHotelManagerImpl();

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
		 * The meta object literal for the '{@link Classes.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.impl.StaffImpl
		 * @see Classes.impl.ClassesPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__ADMIN = eINSTANCE.getStaff_Admin();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__USER_ID = eINSTANCE.getStaff_UserId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__PASSWORD = eINSTANCE.getStaff_Password();

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

	}

} //ClassesPackage
