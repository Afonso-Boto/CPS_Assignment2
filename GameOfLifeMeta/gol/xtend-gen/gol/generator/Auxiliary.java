package gol.generator;

import gol.gol.Coordinate;
import gol.gol.Grid;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class Auxiliary {
  public static List<Coordinate> getCoords(final Grid root) {
    List<Coordinate> coords = new ArrayList<Coordinate>();
    EList<Coordinate> _alive = root.getAlive();
    for (final Coordinate t : _alive) {
      coords.add(t);
    }
    return coords;
  }
}
