package gol.generator

import gol.gol.Coordinate
import java.util.List
import gol.gol.Grid
import java.util.ArrayList
import gol.gol.Condition
import gol.gol.Rule


class Auxiliary {
	def static List<Coordinate> getCoords(Grid root) {
		var List<Coordinate> coords = new ArrayList<Coordinate>()
		
		for (Coordinate t : root.alive){
			coords.add(t) }
		return coords;
	}
	
}