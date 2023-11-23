package generated;

import java.awt.Point;
import java.util.ArrayList;

public class RulesOfLife {
	public static ArrayList<Point> initGameBoard() {
    	ArrayList<Point> points = new ArrayList<>();
		
		points.add(new Point(2 , 2));
		points.add(new Point(3 , 2));
		points.add(new Point(4 , 2));
		points.add(new Point(7 , 2));
		points.add(new Point(6 , 7));
		points.add(new Point(5 , 3));
		
		return points;
	}
	
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
		      
	if ((gameBoard[i][j]) && (surrounding == 2 ))
			{
		                	survivingCells.add(new Point(i-1,j-1));
		                			}
		                	if ((gameBoard[i][j]) && (surrounding == 3 ))
			{
		                	survivingCells.add(new Point(i-1,j-1));
		                			}
		                	if ((!gameBoard[i][j]) && (surrounding == 5 ))
			{
		                	survivingCells.add(new Point(i-1,j-1));
		                			}
		                		                
			}
		}
	}  
	
	
}
