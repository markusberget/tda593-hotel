/**
 */
package Classes.impl;

import Classes.Booking;
import Classes.ClassesFactory;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.HotelManager;
import Classes.HotelManager_IHotelManagerImpl;
import Classes.IBookingManagement;
import Classes.IBookingManagementImpl;
import Classes.IFinance;
import Classes.IFinanceImpl;
import Classes.IHotelManager;
import Classes.Room;
import Classes.Staff;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassesPackageImpl extends EPackageImpl implements ClassesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingManagementImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFinanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelManager_IHotelManagerImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFinanceImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Classes.ClassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassesPackageImpl() {
		super(eNS_URI, ClassesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClassesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassesPackage init() {
		if (isInited) return (ClassesPackage)EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI);

		// Obtain or create and register package
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theClassesPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theClassesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassesPackage.eNS_URI, theClassesPackage);
		return theClassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Statusoccupiedreadypending() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNumber() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingManagementImpl() {
		return iBookingManagementImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingManagement() {
		return iBookingManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__UpdateBooking() {
		return iBookingManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__GetBooking__int() {
		return iBookingManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__GetBooking__int_Date() {
		return iBookingManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__AddRoomPending__int_int() {
		return iBookingManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__ConfirmBooking__int() {
		return iBookingManagementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__AddCancelationFee__Class() {
		return iBookingManagementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__SearchRoom__Date_Date_Class_int_int_int() {
		return iBookingManagementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__CancelBooking__int() {
		return iBookingManagementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__CheckIn__Class() {
		return iBookingManagementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__CheckOut__Class() {
		return iBookingManagementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__AddCustomerInformationToBooking__int_String_String_String_String() {
		return iBookingManagementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__CreatePendingBooking__Date_Date_int() {
		return iBookingManagementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFinance() {
		return iFinanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFinance__CalculatePayment__int() {
		return iFinanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFinance__PayBill__int() {
		return iFinanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFinance__ValidateWithBank__String_String_int_int_String_String() {
		return iFinanceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFinance__BankTransfer__String_String_int_int_String_String() {
		return iFinanceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFinance__BankSendInvoice() {
		return iFinanceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelManager() {
		return iHotelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__Login__String_String() {
		return iHotelManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__AddStaffMember__String_String_String_String_String_String_String() {
		return iHotelManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__IsPasswordSecure__String() {
		return iHotelManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__IsValidUsername__String() {
		return iHotelManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__ChangeStatusOfRoom__int_Enumerator() {
		return iHotelManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__GetPossibleRoomStatuses() {
		return iHotelManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelManager() {
		return hotelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelManager_IHotelManagerImpl() {
		return hotelManager_IHotelManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFinanceImpl() {
		return iFinanceImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckIn() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckOut() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingID() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_NumberOfGuests() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Admin() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_UserId() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Password() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_PersonalInfo() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__Submit() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesFactory getClassesFactory() {
		return (ClassesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__STATUSOCCUPIEDREADYPENDING);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);

		iBookingManagementImplEClass = createEClass(IBOOKING_MANAGEMENT_IMPL);

		iBookingManagementEClass = createEClass(IBOOKING_MANAGEMENT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___UPDATE_BOOKING);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___GET_BOOKING__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___GET_BOOKING__INT_DATE);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___ADD_ROOM_PENDING__INT_INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CONFIRM_BOOKING__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___ADD_CANCELATION_FEE__CLASS);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_CLASS_INT_INT_INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CHECK_IN__CLASS);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CHECK_OUT__CLASS);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CREATE_PENDING_BOOKING__DATE_DATE_INT);

		iFinanceEClass = createEClass(IFINANCE);
		createEOperation(iFinanceEClass, IFINANCE___CALCULATE_PAYMENT__INT);
		createEOperation(iFinanceEClass, IFINANCE___PAY_BILL__INT);
		createEOperation(iFinanceEClass, IFINANCE___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iFinanceEClass, IFINANCE___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iFinanceEClass, IFINANCE___BANK_SEND_INVOICE);

		iHotelManagerEClass = createEClass(IHOTEL_MANAGER);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___LOGIN__STRING_STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___IS_PASSWORD_SECURE__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___IS_VALID_USERNAME__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_ENUMERATOR);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___GET_POSSIBLE_ROOM_STATUSES);

		hotelManagerEClass = createEClass(HOTEL_MANAGER);

		hotelManager_IHotelManagerImplEClass = createEClass(HOTEL_MANAGER_IHOTEL_MANAGER_IMPL);

		iFinanceImplEClass = createEClass(IFINANCE_IMPL);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__CHECK_IN);
		createEAttribute(bookingEClass, BOOKING__CHECK_OUT);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEAttribute(bookingEClass, BOOKING__NUMBER_OF_GUESTS);

		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__ADMIN);
		createEAttribute(staffEClass, STAFF__USER_ID);
		createEAttribute(staffEClass, STAFF__PASSWORD);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__PERSONAL_INFO);
		createEOperation(customerEClass, CUSTOMER___SUBMIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iBookingManagementImplEClass.getESuperTypes().add(this.getIBookingManagement());
		hotelManager_IHotelManagerImplEClass.getESuperTypes().add(this.getIHotelManager());
		iFinanceImplEClass.getESuperTypes().add(this.getIFinance());

		// Initialize classes, features, and operations; add parameters
		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Statusoccupiedreadypending(), theTypesPackage.getBoolean(), "statusoccupiedreadypending", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomNumber(), theTypesPackage.getInteger(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingManagementImplEClass, IBookingManagementImpl.class, "IBookingManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iBookingManagementEClass, IBookingManagement.class, "IBookingManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBookingManagement__UpdateBooking(), null, "updateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIBookingManagement__GetBooking__int(), null, "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__GetBooking__int_Date(), null, "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__AddRoomPending__int_int(), ecorePackage.getEInt(), "addRoomPending", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__ConfirmBooking__int(), ecorePackage.getEBoolean(), "confirmBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__AddCancelationFee__Class(), null, "addCancelationFee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaClass(), "TODO", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__SearchRoom__Date_Date_Class_int_int_int(), null, "searchRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaClass(), "featureList", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "maximumPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CancelBooking__int(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CheckIn__Class(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaClass(), "TODO", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CheckOut__Class(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaClass(), "TODO", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__AddCustomerInformationToBooking__int_String_String_String_String(), ecorePackage.getEBoolean(), "addCustomerInformationToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ph", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CreatePendingBooking__Date_Date_int(), ecorePackage.getEInt(), "createPendingBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "guestCount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iFinanceEClass, IFinance.class, "IFinance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIFinance__CalculatePayment__int(), null, "calculatePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFinance__PayBill__int(), null, "payBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFinance__ValidateWithBank__String_String_int_int_String_String(), null, "validateWithBank", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFinance__BankTransfer__String_String_int_int_String_String(), null, "bankTransfer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIFinance__BankSendInvoice(), null, "bankSendInvoice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelManagerEClass, IHotelManager.class, "IHotelManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelManager__Login__String_String(), ecorePackage.getEBoolean(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__AddStaffMember__String_String_String_String_String_String_String(), ecorePackage.getEBoolean(), "addStaffMember", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "adminUsername", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "secondName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__IsPasswordSecure__String(), ecorePackage.getEBoolean(), "isPasswordSecure", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__IsValidUsername__String(), ecorePackage.getEBoolean(), "isValidUsername", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__ChangeStatusOfRoom__int_Enumerator(), ecorePackage.getEBoolean(), "changeStatusOfRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEEnumerator(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIHotelManager__GetPossibleRoomStatuses(), ecorePackage.getEEList(), "getPossibleRoomStatuses", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotelManagerEClass, HotelManager.class, "HotelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelManager_IHotelManagerImplEClass, HotelManager_IHotelManagerImpl.class, "HotelManager_IHotelManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iFinanceImplEClass, IFinanceImpl.class, "IFinanceImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_CheckIn(), theTypesPackage.getInteger(), "checkIn", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckOut(), theTypesPackage.getInteger(), "checkOut", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_BookingID(), theTypesPackage.getInteger(), "bookingID", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_NumberOfGuests(), theTypesPackage.getInteger(), "numberOfGuests", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_Admin(), theTypesPackage.getBoolean(), "admin", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_UserId(), theTypesPackage.getString(), "userId", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_Password(), theTypesPackage.getString(), "password", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_PersonalInfo(), theTypesPackage.getString(), "personalInfo", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCustomer__Submit(), null, "submit", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (getRoom_Statusoccupiedreadypending(), 
		   source, 
		   new String[] {
			 "originalName", "status(occupied, ready, pending)"
		   });
	}

} //ClassesPackageImpl
