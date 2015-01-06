/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.RoomType#getRoomTypeName <em>Room Type Name</em>}</li>
 *   <li>{@link Classes.RoomType#getFeatures <em>Features</em>}</li>
 *   <li>{@link Classes.RoomType#getNumberOfGuests <em>Number Of Guests</em>}</li>
 *   <li>{@link Classes.RoomType#getDescription <em>Description</em>}</li>
 *   <li>{@link Classes.RoomType#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Type Name</b></em>' attribute.
	 * The literals are from the enumeration {@link Classes.RoomTypeName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Name</em>' attribute.
	 * @see Classes.RoomTypeName
	 * @see #setRoomTypeName(RoomTypeName)
	 * @see Classes.ClassesPackage#getRoomType_RoomTypeName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomTypeName getRoomTypeName();

	/**
	 * Sets the value of the '{@link Classes.RoomType#getRoomTypeName <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Name</em>' attribute.
	 * @see Classes.RoomTypeName
	 * @see #getRoomTypeName()
	 * @generated
	 */
	void setRoomTypeName(RoomTypeName value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute.
	 * @see #setFeatures(String)
	 * @see Classes.ClassesPackage#getRoomType_Features()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFeatures();

	/**
	 * Sets the value of the '{@link Classes.RoomType#getFeatures <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' attribute.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Guests</em>' attribute.
	 * @see #setNumberOfGuests(int)
	 * @see Classes.ClassesPackage#getRoomType_NumberOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * Sets the value of the '{@link Classes.RoomType#getNumberOfGuests <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Guests</em>' attribute.
	 * @see #getNumberOfGuests()
	 * @generated
	 */
	void setNumberOfGuests(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Classes.ClassesPackage#getRoomType_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Classes.RoomType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see Classes.ClassesPackage#getRoomType_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link Classes.RoomType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

} // RoomType
