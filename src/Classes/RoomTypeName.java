/**
 */
package Classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Room Type Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Classes.ClassesPackage#getRoomTypeName()
 * @model
 * @generated
 */
public enum RoomTypeName implements Enumerator {
	/**
	 * The '<em><b>Single Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_ROOM(0, "SingleRoom", "SingleRoom"),

	/**
	 * The '<em><b>Double Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_ROOM(1, "DoubleRoom", "DoubleRoom"),

	/**
	 * The '<em><b>Family Suite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_SUITE_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_SUITE(2, "FamilySuite", "FamilySuite");

	/**
	 * The '<em><b>Single Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_ROOM
	 * @model name="SingleRoom"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_ROOM_VALUE = 0;

	/**
	 * The '<em><b>Double Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ROOM
	 * @model name="DoubleRoom"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_ROOM_VALUE = 1;

	/**
	 * The '<em><b>Family Suite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family Suite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILY_SUITE
	 * @model name="FamilySuite"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_SUITE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Room Type Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoomTypeName[] VALUES_ARRAY =
		new RoomTypeName[] {
			SINGLE_ROOM,
			DOUBLE_ROOM,
			FAMILY_SUITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Room Type Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoomTypeName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Room Type Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomTypeName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomTypeName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomTypeName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomTypeName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomTypeName get(int value) {
		switch (value) {
			case SINGLE_ROOM_VALUE: return SINGLE_ROOM;
			case DOUBLE_ROOM_VALUE: return DOUBLE_ROOM;
			case FAMILY_SUITE_VALUE: return FAMILY_SUITE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RoomTypeName(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RoomTypeName
