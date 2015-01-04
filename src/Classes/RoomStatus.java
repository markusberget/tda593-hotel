/**
 */
package Classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Room Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Classes.ClassesPackage#getRoomStatus()
 * @model
 * @generated
 */
public enum RoomStatus implements Enumerator {
	/**
	 * The '<em><b>Occupied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED_VALUE
	 * @generated
	 * @ordered
	 */
	OCCUPIED(0, "Occupied", "Occupied"),

	/**
	 * The '<em><b>Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABLE(1, "Available", "Available"),

	/**
	 * The '<em><b>Cleaning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEANING_VALUE
	 * @generated
	 * @ordered
	 */
	CLEANING(2, "Cleaning", "Cleaning"), /**
	 * The '<em><b>Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTENANCE(3, "Maintenance", "Maintenance");

	/**
	 * The '<em><b>Occupied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Occupied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED
	 * @model name="Occupied"
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPIED_VALUE = 0;

	/**
	 * The '<em><b>Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Available</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE
	 * @model name="Available"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABLE_VALUE = 1;

	/**
	 * The '<em><b>Cleaning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cleaning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEANING
	 * @model name="Cleaning"
	 * @generated
	 * @ordered
	 */
	public static final int CLEANING_VALUE = 2;

	/**
	 * The '<em><b>Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE
	 * @model name="Maintenance"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Room Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoomStatus[] VALUES_ARRAY =
		new RoomStatus[] {
			OCCUPIED,
			AVAILABLE,
			CLEANING,
			MAINTENANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Room Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoomStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Room Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomStatus get(int value) {
		switch (value) {
			case OCCUPIED_VALUE: return OCCUPIED;
			case AVAILABLE_VALUE: return AVAILABLE;
			case CLEANING_VALUE: return CLEANING;
			case MAINTENANCE_VALUE: return MAINTENANCE;
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
	private RoomStatus(int value, String name, String literal) {
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
	
} //RoomStatus
