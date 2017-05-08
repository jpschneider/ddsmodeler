/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Latency Budget Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsLatencyBudgetQos#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsLatencyBudgetQos()
 * @model
 * @generated
 */
public interface DdsLatencyBudgetQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsLatencyBudgetQos_Duration()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getDuration();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsLatencyBudgetQos#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(DdsDuration value);

} // DdsLatencyBudgetQos
