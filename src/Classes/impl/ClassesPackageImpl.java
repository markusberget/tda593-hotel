/**
 */
package Classes.impl;

import Classes.Bill;
import Classes.Booking;
import Classes.Charge;
import Classes.ClassesFactory;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.IBookingManagement;
import Classes.IBookingManagementImpl;
import Classes.IFinance;
import Classes.IFinanceImpl;
import Classes.IHotelManager;
import Classes.IHotelManagerImpl;
import Classes.IPerson;
import Classes.Room;
import Classes.RoomStatus;
import Classes.RoomType;
import Classes.StaffMember;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
	private EClass roomTypeEClass = null;

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
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargeEClass = null;

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
	private EEnum roomStatusEEnum = null;

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
	private EClass staffMemberEClass = null;

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
	private EClass iPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelManagerImplEClass = null;

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
	public EAttribute getRoom_Status() {
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
	public EReference getRoom_RoomType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Booking() {
		return (EReference)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Features() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_NumberOfGuests() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Description() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Price() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_Room() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getIBookingManagementImpl_Booking() {
		return (EReference)iBookingManagementImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBookingManagementImpl_Room() {
		return (EReference)iBookingManagementImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBookingManagementImpl_PendingBookings() {
		return (EReference)iBookingManagementImplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBookingManagementImpl_Customer() {
		return (EReference)iBookingManagementImplEClass.getEStructuralFeatures().get(3);
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
	public EOperation getIBookingManagement__CheckIn__int() {
		return iBookingManagementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManagement__CheckOut__int() {
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
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Charge() {
		return (EReference)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Booking() {
		return (EReference)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharge() {
		return chargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharge_Bill() {
		return (EReference)chargeEClass.getEStructuralFeatures().get(0);
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
	public EOperation getIHotelManager__AddStaffMember__String_String_String_String_String_String_String_String_boolean() {
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
	public EOperation getIHotelManager__ChangeStatusOfRoom__int_RoomStatus() {
		return iHotelManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__FindStaffMember__String_String_String_String_String() {
		return iHotelManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__IsStaffMemberLoggedIn__String() {
		return iHotelManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__IsStaffMemberAdmin__String() {
		return iHotelManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__GetStaffMemberPassword__String() {
		return iHotelManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__GetStaffMemberFirstName__String() {
		return iHotelManagerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__GetStaffMemberLastName__String() {
		return iHotelManagerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__GetStaffMemberEmail__String() {
		return iHotelManagerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__GetStaffMemberPhoneNumber__String() {
		return iHotelManagerEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__GetStaffMemberAddress__String() {
		return iHotelManagerEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__Logout__String() {
		return iHotelManagerEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelManager__IsExistingStaffMember__String() {
		return iHotelManagerEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomStatus() {
		return roomStatusEEnum;
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
	public EReference getIFinanceImpl_Booking() {
		return (EReference)iFinanceImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffMember() {
		return staffMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffMember_Admin() {
		return (EAttribute)staffMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffMember_Username() {
		return (EAttribute)staffMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffMember_Password() {
		return (EAttribute)staffMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffMember_IsLoggedIn() {
		return (EAttribute)staffMemberEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getBooking_FirstName() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_LastName() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Email() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_PhoneNumber() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Customer() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_IBookingManagementImpl() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Room() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_IFinanceImpl() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Bill() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPerson() {
		return iPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPerson_FirstName() {
		return (EAttribute)iPersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPerson_LastName() {
		return (EAttribute)iPersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPerson_Address() {
		return (EAttribute)iPersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPerson_Email() {
		return (EAttribute)iPersonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPerson_PhoneNumber() {
		return (EAttribute)iPersonEClass.getEStructuralFeatures().get(4);
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
	public EReference getCustomer_IBookingManagementImpl() {
		return (EReference)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Booking() {
		return (EReference)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelManagerImpl() {
		return iHotelManagerImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIHotelManagerImpl_Staff() {
		return (EReference)iHotelManagerImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIHotelManagerImpl_IBookingManagementImpl() {
		return (EReference)iHotelManagerImplEClass.getEStructuralFeatures().get(1);
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
		createEAttribute(roomEClass, ROOM__STATUS);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEReference(roomEClass, ROOM__ROOM_TYPE);
		createEReference(roomEClass, ROOM__BOOKING);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEAttribute(roomTypeEClass, ROOM_TYPE__FEATURES);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NUMBER_OF_GUESTS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCRIPTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE);
		createEReference(roomTypeEClass, ROOM_TYPE__ROOM);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__CHECK_IN);
		createEAttribute(bookingEClass, BOOKING__CHECK_OUT);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEAttribute(bookingEClass, BOOKING__NUMBER_OF_GUESTS);
		createEAttribute(bookingEClass, BOOKING__FIRST_NAME);
		createEAttribute(bookingEClass, BOOKING__LAST_NAME);
		createEAttribute(bookingEClass, BOOKING__EMAIL);
		createEAttribute(bookingEClass, BOOKING__PHONE_NUMBER);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__IBOOKING_MANAGEMENT_IMPL);
		createEReference(bookingEClass, BOOKING__IFINANCE_IMPL);
		createEReference(bookingEClass, BOOKING__BILL);
		createEReference(bookingEClass, BOOKING__ROOM);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__PERSONAL_INFO);
		createEReference(customerEClass, CUSTOMER__IBOOKING_MANAGEMENT_IMPL);
		createEReference(customerEClass, CUSTOMER__BOOKING);

		iBookingManagementImplEClass = createEClass(IBOOKING_MANAGEMENT_IMPL);
		createEReference(iBookingManagementImplEClass, IBOOKING_MANAGEMENT_IMPL__BOOKING);
		createEReference(iBookingManagementImplEClass, IBOOKING_MANAGEMENT_IMPL__ROOM);
		createEReference(iBookingManagementImplEClass, IBOOKING_MANAGEMENT_IMPL__PENDING_BOOKINGS);
		createEReference(iBookingManagementImplEClass, IBOOKING_MANAGEMENT_IMPL__CUSTOMER);

		iBookingManagementEClass = createEClass(IBOOKING_MANAGEMENT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___UPDATE_BOOKING);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___GET_BOOKING__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___GET_BOOKING__INT_DATE);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___ADD_ROOM_PENDING__INT_INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CONFIRM_BOOKING__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___ADD_CANCELATION_FEE__CLASS);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___SEARCH_ROOM__DATE_DATE_CLASS_INT_INT_INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CANCEL_BOOKING__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CHECK_IN__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CHECK_OUT__INT);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___ADD_CUSTOMER_INFORMATION_TO_BOOKING__INT_STRING_STRING_STRING_STRING);
		createEOperation(iBookingManagementEClass, IBOOKING_MANAGEMENT___CREATE_PENDING_BOOKING__DATE_DATE_INT);

		iPersonEClass = createEClass(IPERSON);
		createEAttribute(iPersonEClass, IPERSON__FIRST_NAME);
		createEAttribute(iPersonEClass, IPERSON__LAST_NAME);
		createEAttribute(iPersonEClass, IPERSON__ADDRESS);
		createEAttribute(iPersonEClass, IPERSON__EMAIL);
		createEAttribute(iPersonEClass, IPERSON__PHONE_NUMBER);

		iFinanceImplEClass = createEClass(IFINANCE_IMPL);
		createEReference(iFinanceImplEClass, IFINANCE_IMPL__BOOKING);

		iFinanceEClass = createEClass(IFINANCE);
		createEOperation(iFinanceEClass, IFINANCE___CALCULATE_PAYMENT__INT);
		createEOperation(iFinanceEClass, IFINANCE___PAY_BILL__INT);
		createEOperation(iFinanceEClass, IFINANCE___VALIDATE_WITH_BANK__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iFinanceEClass, IFINANCE___BANK_TRANSFER__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iFinanceEClass, IFINANCE___BANK_SEND_INVOICE);

		billEClass = createEClass(BILL);
		createEReference(billEClass, BILL__CHARGE);
		createEReference(billEClass, BILL__BOOKING);

		chargeEClass = createEClass(CHARGE);
		createEReference(chargeEClass, CHARGE__BILL);

		iHotelManagerEClass = createEClass(IHOTEL_MANAGER);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___LOGIN__STRING_STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___ADD_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING_STRING_STRING_STRING_BOOLEAN);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___IS_PASSWORD_SECURE__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___IS_VALID_USERNAME__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___CHANGE_STATUS_OF_ROOM__INT_ROOMSTATUS);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___FIND_STAFF_MEMBER__STRING_STRING_STRING_STRING_STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___IS_STAFF_MEMBER_LOGGED_IN__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___IS_STAFF_MEMBER_ADMIN__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___GET_STAFF_MEMBER_PASSWORD__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___GET_STAFF_MEMBER_FIRST_NAME__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___GET_STAFF_MEMBER_LAST_NAME__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___GET_STAFF_MEMBER_EMAIL__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___GET_STAFF_MEMBER_PHONE_NUMBER__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___GET_STAFF_MEMBER_ADDRESS__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___LOGOUT__STRING);
		createEOperation(iHotelManagerEClass, IHOTEL_MANAGER___IS_EXISTING_STAFF_MEMBER__STRING);

		staffMemberEClass = createEClass(STAFF_MEMBER);
		createEAttribute(staffMemberEClass, STAFF_MEMBER__ADMIN);
		createEAttribute(staffMemberEClass, STAFF_MEMBER__USERNAME);
		createEAttribute(staffMemberEClass, STAFF_MEMBER__PASSWORD);
		createEAttribute(staffMemberEClass, STAFF_MEMBER__IS_LOGGED_IN);

		iHotelManagerImplEClass = createEClass(IHOTEL_MANAGER_IMPL);
		createEReference(iHotelManagerImplEClass, IHOTEL_MANAGER_IMPL__STAFF);
		createEReference(iHotelManagerImplEClass, IHOTEL_MANAGER_IMPL__IBOOKING_MANAGEMENT_IMPL);

		// Create enums
		roomStatusEEnum = createEEnum(ROOM_STATUS);
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
		customerEClass.getESuperTypes().add(this.getIPerson());
		iBookingManagementImplEClass.getESuperTypes().add(this.getIBookingManagement());
		iFinanceImplEClass.getESuperTypes().add(this.getIFinance());
		staffMemberEClass.getESuperTypes().add(this.getIPerson());
		iHotelManagerImplEClass.getESuperTypes().add(this.getIHotelManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Status(), this.getRoomStatus(), "status", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomNumber(), theTypesPackage.getInteger(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), this.getRoomType_Room(), "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Booking(), this.getBooking(), this.getBooking_Room(), "booking", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Name(), theTypesPackage.getString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Features(), theTypesPackage.getString(), "features", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_NumberOfGuests(), theTypesPackage.getInteger(), "numberOfGuests", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Description(), theTypesPackage.getString(), "description", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomType_Room(), this.getRoom(), this.getRoom_RoomType(), "room", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_CheckIn(), ecorePackage.getEDate(), "checkIn", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckOut(), ecorePackage.getEDate(), "checkOut", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_BookingID(), theTypesPackage.getInteger(), "bookingID", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_NumberOfGuests(), theTypesPackage.getInteger(), "numberOfGuests", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Email(), theTypesPackage.getString(), "email", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_PhoneNumber(), theTypesPackage.getString(), "phoneNumber", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Customer(), this.getCustomer(), this.getCustomer_Booking(), "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_IBookingManagementImpl(), this.getIBookingManagementImpl(), this.getIBookingManagementImpl_Booking(), "iBookingManagementImpl", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_IFinanceImpl(), this.getIFinanceImpl(), this.getIFinanceImpl_Booking(), "iFinanceImpl", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Bill(), this.getBill(), this.getBill_Booking(), "bill", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Room(), this.getRoom(), this.getRoom_Booking(), "room", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_PersonalInfo(), theTypesPackage.getString(), "personalInfo", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_IBookingManagementImpl(), this.getIBookingManagementImpl(), this.getIBookingManagementImpl_Customer(), "iBookingManagementImpl", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_Booking(), this.getBooking(), this.getBooking_Customer(), "booking", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingManagementImplEClass, IBookingManagementImpl.class, "IBookingManagementImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIBookingManagementImpl_Booking(), this.getBooking(), this.getBooking_IBookingManagementImpl(), "booking", null, 0, -1, IBookingManagementImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIBookingManagementImpl_Room(), this.getRoom(), null, "room", null, 0, -1, IBookingManagementImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIBookingManagementImpl_PendingBookings(), this.getBooking(), null, "pendingBookings", null, 0, -1, IBookingManagementImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIBookingManagementImpl_Customer(), this.getCustomer(), this.getCustomer_IBookingManagementImpl(), "customer", null, 0, -1, IBookingManagementImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingManagementEClass, IBookingManagement.class, "IBookingManagement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBookingManagement__UpdateBooking(), null, "updateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIBookingManagement__GetBooking__int(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

		op = initEOperation(getIBookingManagement__SearchRoom__Date_Date_Class_int_int_int(), ecorePackage.getEEList(), "searchRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaClass(), "featureList", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "maximumPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CancelBooking__int(), ecorePackage.getEBoolean(), "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CheckIn__int(), ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManagement__CheckOut__int(), ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

		initEClass(iPersonEClass, IPerson.class, "IPerson", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, IPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIPerson_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, IPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIPerson_Address(), ecorePackage.getEString(), "address", null, 1, 1, IPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIPerson_Email(), ecorePackage.getEString(), "email", null, 1, 1, IPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIPerson_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 1, 1, IPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iFinanceImplEClass, IFinanceImpl.class, "IFinanceImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFinanceImpl_Booking(), this.getBooking(), this.getBooking_IFinanceImpl(), "booking", null, 0, -1, IFinanceImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iFinanceEClass, IFinance.class, "IFinance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIFinance__CalculatePayment__int(), ecorePackage.getEInt(), "calculatePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
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

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBill_Charge(), this.getCharge(), this.getCharge_Bill(), "charge", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Booking(), this.getBooking(), this.getBooking_Bill(), "booking", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(chargeEClass, Charge.class, "Charge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharge_Bill(), this.getBill(), this.getBill_Charge(), "bill", null, 1, 1, Charge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iHotelManagerEClass, IHotelManager.class, "IHotelManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelManager__Login__String_String(), ecorePackage.getEBoolean(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__AddStaffMember__String_String_String_String_String_String_String_String_boolean(), ecorePackage.getEBoolean(), "addStaffMember", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "adminUsername", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "address", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "admin", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__IsPasswordSecure__String(), ecorePackage.getEBoolean(), "isPasswordSecure", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__IsValidUsername__String(), ecorePackage.getEBoolean(), "isValidUsername", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__ChangeStatusOfRoom__int_RoomStatus(), ecorePackage.getEBoolean(), "changeStatusOfRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomStatus(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__FindStaffMember__String_String_String_String_String(), ecorePackage.getEEList(), "findStaffMember", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "secondName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__IsStaffMemberLoggedIn__String(), ecorePackage.getEBoolean(), "isStaffMemberLoggedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__IsStaffMemberAdmin__String(), ecorePackage.getEBoolean(), "isStaffMemberAdmin", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__GetStaffMemberPassword__String(), ecorePackage.getEString(), "getStaffMemberPassword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__GetStaffMemberFirstName__String(), ecorePackage.getEString(), "getStaffMemberFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__GetStaffMemberLastName__String(), ecorePackage.getEString(), "getStaffMemberLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__GetStaffMemberEmail__String(), ecorePackage.getEString(), "getStaffMemberEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__GetStaffMemberPhoneNumber__String(), ecorePackage.getEString(), "getStaffMemberPhoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__GetStaffMemberAddress__String(), ecorePackage.getEString(), "getStaffMemberAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__Logout__String(), ecorePackage.getEBoolean(), "logout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelManager__IsExistingStaffMember__String(), ecorePackage.getEBoolean(), "isExistingStaffMember", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffMemberEClass, StaffMember.class, "StaffMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffMember_Admin(), theTypesPackage.getBoolean(), "admin", null, 1, 1, StaffMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffMember_Username(), theTypesPackage.getString(), "username", null, 1, 1, StaffMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffMember_Password(), theTypesPackage.getString(), "password", null, 1, 1, StaffMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffMember_IsLoggedIn(), ecorePackage.getEBoolean(), "isLoggedIn", null, 1, 1, StaffMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iHotelManagerImplEClass, IHotelManagerImpl.class, "IHotelManagerImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIHotelManagerImpl_Staff(), this.getStaffMember(), null, "staff", null, 0, -1, IHotelManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIHotelManagerImpl_IBookingManagementImpl(), this.getIBookingManagementImpl(), null, "iBookingManagementImpl", null, 1, 1, IHotelManagerImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roomStatusEEnum, RoomStatus.class, "RoomStatus");
		addEEnumLiteral(roomStatusEEnum, RoomStatus.OCCUPIED);
		addEEnumLiteral(roomStatusEEnum, RoomStatus.AVAILABLE);
		addEEnumLiteral(roomStatusEEnum, RoomStatus.CLEANING);

		// Create resource
		createResource(eNS_URI);
	}

} //ClassesPackageImpl
