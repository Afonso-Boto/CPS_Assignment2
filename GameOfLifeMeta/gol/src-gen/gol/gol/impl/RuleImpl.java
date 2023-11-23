/**
 * generated by Xtext 2.32.0
 */
package gol.gol.impl;

import gol.gol.Condition;
import gol.gol.GolPackage;
import gol.gol.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gol.gol.impl.RuleImpl#getSurvive <em>Survive</em>}</li>
 *   <li>{@link gol.gol.impl.RuleImpl#getReborn <em>Reborn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The cached value of the '{@link #getSurvive() <em>Survive</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurvive()
   * @generated
   * @ordered
   */
  protected EList<Condition> survive;

  /**
   * The cached value of the '{@link #getReborn() <em>Reborn</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReborn()
   * @generated
   * @ordered
   */
  protected EList<Condition> reborn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GolPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getSurvive()
  {
    if (survive == null)
    {
      survive = new EObjectContainmentEList<Condition>(Condition.class, this, GolPackage.RULE__SURVIVE);
    }
    return survive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getReborn()
  {
    if (reborn == null)
    {
      reborn = new EObjectContainmentEList<Condition>(Condition.class, this, GolPackage.RULE__REBORN);
    }
    return reborn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GolPackage.RULE__SURVIVE:
        return ((InternalEList<?>)getSurvive()).basicRemove(otherEnd, msgs);
      case GolPackage.RULE__REBORN:
        return ((InternalEList<?>)getReborn()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GolPackage.RULE__SURVIVE:
        return getSurvive();
      case GolPackage.RULE__REBORN:
        return getReborn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GolPackage.RULE__SURVIVE:
        getSurvive().clear();
        getSurvive().addAll((Collection<? extends Condition>)newValue);
        return;
      case GolPackage.RULE__REBORN:
        getReborn().clear();
        getReborn().addAll((Collection<? extends Condition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GolPackage.RULE__SURVIVE:
        getSurvive().clear();
        return;
      case GolPackage.RULE__REBORN:
        getReborn().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GolPackage.RULE__SURVIVE:
        return survive != null && !survive.isEmpty();
      case GolPackage.RULE__REBORN:
        return reborn != null && !reborn.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RuleImpl