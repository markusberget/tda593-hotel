/**
 */
package Classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.StaffMember#isAdmin <em>Admin</em>}</li>
 *   <li>{@link Classes.StaffMember#getUsername <em>Username</em>}</li>
 *   <li>{@link Classes.StaffMember#getPassword <em>Password</em>}</li>
 *   <li>{@link Classes.StaffMember#isLoggedIn <em>Is Logged In</em>}</li>
 *   <li>{@link Classes.StaffMember#getIHotelManagerImpl <em>IHotel Manager Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getStaffMember()
 * @model
 * @generated
 */
public interface StaffMember extends IPerson {
	/**
	 * Returns the value of the '<em><b>Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' attribute.
	 * @see #setAdmin(boolean)
	 * @see Classes.ClassesPackage#getStaffMember_Admin()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAdmin();

	/**
	 * Sets the value of the '{@link Classes.StaffMember#isAdmin <em>Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin</em>' attribute.
	 * @see #isAdmin()
	 * @generated
	 */
	void setAdmin(boolean value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see Classes.ClassesPackage#getStaffMember_Username()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link Classes.StaffMember#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see Classes.ClassesPackage#getStaffMember_Password()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Classes.StaffMember#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Is Logged In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Logged In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Logged In</em>' attribute.
	 * @see #setIsLoggedIn(boolean)
	 * @see Classes.ClassesPackage#getStaffMember_IsLoggedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isLoggedIn();

	/**
	 * Sets the value of the '{@link Classes.StaffMember#isLoggedIn <em>Is Logged In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Logged In</em>' attribute.
	 * @see #isLoggedIn()
	 * @generated
	 */
	void setIsLoggedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>IHotel Manager Impl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Classes.IHotelManagerImpl#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IHotel Manager Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IHotel Manager Impl</em>' reference.
	 * @see #setIHotelManagerImpl(IHotelManagerImpl)
	 * @see Classes.ClassesPackage#getStaffMember_IHotelManagerImpl()
	 * @see Classes.IHotelManagerImpl#getStaff
	 * @model opposite="staff" required="true" ordered="false"
	 * @generated
	 */
	IHotelManagerImpl getIHotelManagerImpl();

	/**
	 * Sets the value of the '{@link Classes.StaffMember#getIHotelManagerImpl <em>IHotel Manager Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IHotel Manager Impl</em>' reference.
	 * @see #getIHotelManagerImpl()
	 * @generated
	 */
	void setIHotelManagerImpl(IHotelManagerImpl value);

} // StaffMember
