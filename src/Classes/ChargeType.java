/**
 */
package Classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Charge Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Classes.ClassesPackage#getChargeType()
 * @model
 * @generated
 */
public enum ChargeType implements Enumerator {
	/**
	 * The '<em><b>Cancellation Fee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLATION_FEE_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLATION_FEE(0, "CancellationFee", "CancellationFee"),

	/**
	 * The '<em><b>Breakfast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKFAST_VALUE
	 * @generated
	 * @ordered
	 */
	BREAKFAST(1, "Breakfast", "Breakfast"),

	/**
	 * The '<em><b>Single Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_ROOM(2, "SingleRoom", "SingleRoom"), /**
	 * The '<em><b>Double Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_ROOM(3, "DoubleRoom", "DoubleRoom"), /**
	 * The '<em><b>Family Suite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_SUITE_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_SUITE(4, "FamilySuite", "FamilySuite");

	/**
	 * The '<em><b>Cancellation Fee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancellation Fee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCELLATION_FEE
	 * @model name="CancellationFee"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLATION_FEE_VALUE = 0;

	/**
	 * The '<em><b>Breakfast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Breakfast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAKFAST
	 * @model name="Breakfast"
	 * @generated
	 * @ordered
	 */
	public static final int BREAKFAST_VALUE = 1;

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
	public static final int SINGLE_ROOM_VALUE = 2;

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
	public static final int DOUBLE_ROOM_VALUE = 3;

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
	public static final int FAMILY_SUITE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Charge Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChargeType[] VALUES_ARRAY =
		new ChargeType[] {
			CANCELLATION_FEE,
			BREAKFAST,
			SINGLE_ROOM,
			DOUBLE_ROOM,
			FAMILY_SUITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Charge Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChargeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Charge Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChargeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChargeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChargeType get(int value) {
		switch (value) {
			case CANCELLATION_FEE_VALUE: return CANCELLATION_FEE;
			case BREAKFAST_VALUE: return BREAKFAST;
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
	private ChargeType(int value, String name, String literal) {
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
	
} //ChargeType
