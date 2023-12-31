package gol.generator

import gol.gol.GameOfLife
import gol.gol.Grid

class BoardGenerator {
	def static baseCode(GameOfLife root)'''
		package generated;
		
		import java.awt.Point;
		import java.util.ArrayList;
		
		public class RulesOfLife {
			public static ArrayList<Point> initGameBoard() {
		    	ArrayList<Point> points = new ArrayList<>();
				
				«addingPoints(root.initialGrid)»
				
				return points;
			}
			
			«computeSurvivors(root)»
			
			
		}
	'''
	
	def static addingPoints(Grid grid)'''
		«FOR coord : Auxiliary.getCoords(grid)»
			points.add(new Point(«coord.x - 1» , «coord.y - 1»));
		«ENDFOR»
	'''
	
	def static computeSurvivors(GameOfLife root)'''
		public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
			for (int i=1; i<gameBoard.length-1; i++) {
				for (int j=1; j<gameBoard[0].length-1; j++) {
		                int surrounding = 0;
		                if (gameBoard[i-1][j-1]) { surrounding++; }
		                if (gameBoard[i-1][j])   { surrounding++; }
		                if (gameBoard[i-1][j+1]) { surrounding++; }
		                if (gameBoard[i][j-1])   { surrounding++; }
		                if (gameBoard[i][j+1])   { surrounding++; }
		                if (gameBoard[i+1][j-1]) { surrounding++; }
		                if (gameBoard[i+1][j])   { surrounding++; }
		                if (gameBoard[i+1][j+1]) { surrounding++; }
	      
	                	«FOR r : root.rules.rule »
	                		«FOR s : r.getSurvive() AFTER addSurvivingCell() »
					if ((gameBoard[i][j]) && (surrounding «s.sign» «s.value» ))
	                		«ENDFOR»
	                		«FOR reb : r.getReborn() AFTER addSurvivingCell()»
					if ((!gameBoard[i][j]) && (surrounding «reb.sign» «reb.value» ))
	                		«ENDFOR»
	                	«ENDFOR»
	                
				}
			}
		}  
	'''
	
	def static addSurvivingCell()'''
				{
		survivingCells.add(new Point(i-1,j-1));
				}
	'''
	
	
	
}