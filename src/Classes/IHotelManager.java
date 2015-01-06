/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.ClassesPackage#getIHotelManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean login(String username, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" adminUsernameRequired="true" adminUsernameOrdered="false" usernameRequired="true" usernameOrdered="false" passwordRequired="true" passwordOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" emailRequired="true" emailOrdered="false" phoneNumberRequired="true" phoneNumberOrdered="false" addressRequired="true" addressOrdered="false" adminRequired="true" adminOrdered="false"
	 * @generated
	 */
	boolean addStaffMember(String adminUsername, String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, boolean admin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean isPasswordSecure(String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	boolean isValidUsername(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	Boolean isStaffMemberLoggedIn(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	Boolean isStaffMemberAdmin(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getStaffMemberPassword(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getStaffMemberFirstName(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getStaffMemberLastName(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getStaffMemberEmail(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getStaffMemberPhoneNumber(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getStaffMemberAddress(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	boolean logout(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	String checkIn(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String checkInBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIDRequired="true" roomIDOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	String changeStatusOfRoom(int roomID, String status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String checkOut(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model staffMemberUsernameRequired="true" staffMemberUsernameOrdered="false" roomIdRequired="true" roomIdOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void changeStatusOfRoom(String staffMemberUsername, int roomId, RoomStatus status);

} // IHotelManager
