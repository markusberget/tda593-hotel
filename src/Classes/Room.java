/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Room#isStatusoccupiedreadypending <em>Statusoccupiedreadypending</em>}</li>
 *   <li>{@link Classes.Room#getRoomNumber <em>Room Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Statusoccupiedreadypending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statusoccupiedreadypending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statusoccupiedreadypending</em>' attribute.
	 * @see #setStatusoccupiedreadypending(boolean)
	 * @see Classes.ClassesPackage#getRoom_Statusoccupiedreadypending()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='status(occupied, ready, pending)'"
	 * @generated
	 */
	boolean isStatusoccupiedreadypending();

	/**
	 * Sets the value of the '{@link Classes.Room#isStatusoccupiedreadypending <em>Statusoccupiedreadypending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statusoccupiedreadypending</em>' attribute.
	 * @see #isStatusoccupiedreadypending()
	 * @generated
	 */
	void setStatusoccupiedreadypending(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see Classes.ClassesPackage#getRoom_RoomNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link Classes.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

} // Room
