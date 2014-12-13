/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;
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
	 * @model required="true" ordered="false" roomIdRequired="true" roomIdOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	boolean changeStatusOfRoom(int roomId, RoomStatus status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false" ordered="false"
	 * @generated
	 */
	EList getPossibleRoomStatuses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" usernameRequired="true" usernameOrdered="false" firstNameRequired="true" firstNameOrdered="false" secondNameRequired="true" secondNameOrdered="false" emailRequired="true" emailOrdered="false" phoneNumberRequired="true" phoneNumberOrdered="false"
	 * @generated
	 */
	EList findStaffMember(String username, String firstName, String secondName, String email, String phoneNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	boolean isStaffMemberLoggedIn(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	boolean isStaffMemberAdmin(String username);

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
	 * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	boolean isExistingStaffMember(String username);

} // IHotelManager
