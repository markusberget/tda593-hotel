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
	 * @model
	 * @generated
	 */
	void updateBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	Booking getBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDRequired="true" roomIDOrdered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	void getBooking(int roomID, Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	int addRoomPending(int room, int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean confirmBooking(int bookingID);

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
	boolean cancelBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean checkIn(int bookingID);

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
	 * @model required="true" ordered="false" staffMemberUsernameRequired="true" staffMemberUsernameOrdered="false" roomIdRequired="true" roomIdOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	boolean changeStatusOfRoom(String staffMemberUsername, int roomId, RoomStatus status);

} // IBookingManagement
