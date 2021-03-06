/**
 */
package Classes;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.ClassesPackage#getIBookingManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false" roomIDRequired="true" roomIDOrdered="false" checkInRequired="true" checkInOrdered="false" checkOutRequired="true" checkOutOrdered="false" nrOfGuestsRequired="true" nrOfGuestsOrdered="false"
	 * @generated
	 */
	String updateBooking(int bookingID, int roomID, Date checkIn, Date checkOut, int nrOfGuests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String addRoomPending(int room, int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String confirmBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" checkInRequired="true" checkInOrdered="false" checkOutRequired="true" checkOutOrdered="false" numberOfGuestsRequired="true" numberOfGuestsOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" maximumPriceRequired="true" maximumPriceOrdered="false"
	 * @generated
	 */
	EList searchRoom(Date checkIn, Date checkOut, int numberOfGuests, String roomType, int maximumPrice);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String cancelBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" emailRequired="true" emailOrdered="false" phRequired="true" phOrdered="false"
	 * @generated
	 */
	boolean addCustomerInformationToBooking(int bookingID, String firstName, String lastName, String email, String ph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" checkInRequired="true" checkInOrdered="false" checkOutRequired="true" checkOutOrdered="false" guestCountRequired="true" guestCountOrdered="false"
	 * @generated
	 */
	int createPendingBooking(Date checkIn, Date checkOut, int guestCount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false" messageRequired="true" messageOrdered="false"
	 * @generated
	 */
	String sendConfirmation(int bookingID, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false" chargeRequired="true" chargeOrdered="false" quantityRequired="true" quantityOrdered="false"
	 * @generated
	 */
	String addExtraCharge(int bookingID, String charge, int quantity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	EList getRoomsOfBooking(int bookingID);

} // IBookingManagement
