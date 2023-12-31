/**
 * generated by Xtext 2.32.0
 */
package gol.gol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gol.gol.Rule#getSurvive <em>Survive</em>}</li>
 *   <li>{@link gol.gol.Rule#getReborn <em>Reborn</em>}</li>
 * </ul>
 *
 * @see gol.gol.GolPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Survive</b></em>' containment reference list.
   * The list contents are of type {@link gol.gol.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Survive</em>' containment reference list.
   * @see gol.gol.GolPackage#getRule_Survive()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getSurvive();

  /**
   * Returns the value of the '<em><b>Reborn</b></em>' containment reference list.
   * The list contents are of type {@link gol.gol.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reborn</em>' containment reference list.
   * @see gol.gol.GolPackage#getRule_Reborn()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getReborn();

} // Rule
