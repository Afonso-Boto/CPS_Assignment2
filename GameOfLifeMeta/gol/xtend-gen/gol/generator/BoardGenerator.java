package gol.generator;

import gol.gol.Condition;
import gol.gol.ConditionSign;
import gol.gol.Coordinate;
import gol.gol.GameOfLife;
import gol.gol.Grid;
import gol.gol.Rule;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BoardGenerator {
  public static CharSequence baseCode(final GameOfLife root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ArrayList<Point> initGameBoard() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("ArrayList<Point> points = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _addingPoints = BoardGenerator.addingPoints(root.getInitialGrid());
    _builder.append(_addingPoints, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return points;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _computeSurvivors = BoardGenerator.computeSurvivors(root);
    _builder.append(_computeSurvivors, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence addingPoints(final Grid grid) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<Coordinate> _coords = Auxiliary.getCoords(grid);
      for(final Coordinate coord : _coords) {
        _builder.append("points.add(new Point(");
        int _x = coord.getX();
        int _minus = (_x - 1);
        _builder.append(_minus);
        _builder.append(" , ");
        int _y = coord.getY();
        int _minus_1 = (_y - 1);
        _builder.append(_minus_1);
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public static CharSequence computeSurvivors(final GameOfLife root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.newLine();
    {
      EList<Rule> _rule = root.getRules().getRule();
      for(final Rule r : _rule) {
        {
          EList<Condition> _survive = r.getSurvive();
          boolean _hasElements = false;
          for(final Condition s : _survive) {
            if (!_hasElements) {
              _hasElements = true;
            }
            _builder.append("if ((gameBoard[i][j]) && (surrounding ");
            ConditionSign _sign = s.getSign();
            _builder.append(_sign);
            _builder.append(" ");
            int _value = s.getValue();
            _builder.append(_value);
            _builder.append(" ))");
            _builder.newLineIfNotEmpty();
          }
          if (_hasElements) {
            CharSequence _addSurvivingCell = BoardGenerator.addSurvivingCell();
            _builder.append(_addSurvivingCell, "\t                \t");
          }
        }
        {
          EList<Condition> _reborn = r.getReborn();
          boolean _hasElements_1 = false;
          for(final Condition reb : _reborn) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            }
            _builder.append("if ((!gameBoard[i][j]) && (surrounding ");
            ConditionSign _sign_1 = reb.getSign();
            _builder.append(_sign_1);
            _builder.append(" ");
            int _value_1 = reb.getValue();
            _builder.append(_value_1);
            _builder.append(" ))");
            _builder.newLineIfNotEmpty();
          }
          if (_hasElements_1) {
            CharSequence _addSurvivingCell_1 = BoardGenerator.addSurvivingCell();
            _builder.append(_addSurvivingCell_1, "\t                \t");
          }
        }
      }
    }
    _builder.append("\t                ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}  ");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence addSurvivingCell() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("survivingCells.add(new Point(i-1,j-1));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
