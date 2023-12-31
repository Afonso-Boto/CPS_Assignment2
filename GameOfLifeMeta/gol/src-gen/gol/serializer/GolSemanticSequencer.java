/*
 * generated by Xtext 2.32.0
 */
package gol.serializer;

import com.google.inject.Inject;
import gol.gol.Condition;
import gol.gol.Coordinate;
import gol.gol.GameOfLife;
import gol.gol.GolPackage;
import gol.gol.Grid;
import gol.gol.Rule;
import gol.gol.Rules;
import gol.services.GolGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GolSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GolGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GolPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GolPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GolPackage.COORDINATE:
				sequence_Coordinate(context, (Coordinate) semanticObject); 
				return; 
			case GolPackage.GAME_OF_LIFE:
				sequence_GameOfLife(context, (GameOfLife) semanticObject); 
				return; 
			case GolPackage.GRID:
				sequence_Grid(context, (Grid) semanticObject); 
				return; 
			case GolPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case GolPackage.RULES:
				sequence_Rules(context, (Rules) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (sign=ConditionSign value=INT)
	 * </pre>
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GolPackage.Literals.CONDITION__SIGN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GolPackage.Literals.CONDITION__SIGN));
			if (transientValues.isValueTransient(semanticObject, GolPackage.Literals.CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GolPackage.Literals.CONDITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getSignConditionSignEnumRuleCall_0_0(), semanticObject.getSign());
		feeder.accept(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Coordinate returns Coordinate
	 *
	 * Constraint:
	 *     (x=INT y=INT)
	 * </pre>
	 */
	protected void sequence_Coordinate(ISerializationContext context, Coordinate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GolPackage.Literals.COORDINATE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GolPackage.Literals.COORDINATE__X));
			if (transientValues.isValueTransient(semanticObject, GolPackage.Literals.COORDINATE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GolPackage.Literals.COORDINATE__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GameOfLife returns GameOfLife
	 *
	 * Constraint:
	 *     (initialGrid=Grid rules=Rules)
	 * </pre>
	 */
	protected void sequence_GameOfLife(ISerializationContext context, GameOfLife semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GolPackage.Literals.GAME_OF_LIFE__INITIAL_GRID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GolPackage.Literals.GAME_OF_LIFE__INITIAL_GRID));
			if (transientValues.isValueTransient(semanticObject, GolPackage.Literals.GAME_OF_LIFE__RULES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GolPackage.Literals.GAME_OF_LIFE__RULES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGameOfLifeAccess().getInitialGridGridParserRuleCall_3_0(), semanticObject.getInitialGrid());
		feeder.accept(grammarAccess.getGameOfLifeAccess().getRulesRulesParserRuleCall_5_0(), semanticObject.getRules());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Grid returns Grid
	 *
	 * Constraint:
	 *     alive+=Coordinate+
	 * </pre>
	 */
	protected void sequence_Grid(ISerializationContext context, Grid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (survive+=Condition+ | reborn+=Condition+)
	 * </pre>
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rules returns Rules
	 *
	 * Constraint:
	 *     rule+=Rule+
	 * </pre>
	 */
	protected void sequence_Rules(ISerializationContext context, Rules semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
