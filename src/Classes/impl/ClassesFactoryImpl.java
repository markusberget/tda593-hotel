/**
 */
package Classes.impl;

import Classes.Booking;
import Classes.ClassesFactory;
import Classes.ClassesPackage;
import Classes.Customer;
import Classes.HotelManager;
import Classes.HotelManager_IHotelManagerImpl;
import Classes.IBookingManagementImpl;
import Classes.IFinanceImpl;
import Classes.Room;
import Classes.Staff;

import org.eclipse.emf.ecore.EClass;
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
			case ClassesPackage.IBOOKING_MANAGEMENT_IMPL: return createIBookingManagementImpl();
			case ClassesPackage.HOTEL_MANAGER: return createHotelManager();
			case ClassesPackage.HOTEL_MANAGER_IHOTEL_MANAGER_IMPL: return createHotelManager_IHotelManagerImpl();
			case ClassesPackage.IFINANCE_IMPL: return createIFinanceImpl();
			case ClassesPackage.BOOKING: return createBooking();
			case ClassesPackage.STAFF: return createStaff();
			case ClassesPackage.CUSTOMER: return createCustomer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public IBookingManagementImpl createIBookingManagementImpl() {
		IBookingManagementImplImpl iBookingManagementImpl = new IBookingManagementImplImpl();
		return iBookingManagementImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManager createHotelManager() {
		HotelManagerImpl hotelManager = new HotelManagerImpl();
		return hotelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManager_IHotelManagerImpl createHotelManager_IHotelManagerImpl() {
		HotelManager_IHotelManagerImplImpl hotelManager_IHotelManagerImpl = new HotelManager_IHotelManagerImplImpl();
		return hotelManager_IHotelManagerImpl;
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
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
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
