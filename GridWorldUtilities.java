import java.util.ArrayList;

import com.sun.jdi.Location;

public class GridWorldUtilities {

	public GridWorldUtilities() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Location> getEmptyLocations(Grid<Actor> grid) {
		ArrayList<Location> result = new ArrayList<Location>();
		for (int i = 0; i < grid.size; i++) {
			for (int j = 0; j < grid[i].size; j++) {
				if (grid[i][j].isEmpty) {
					result.add(new Location(i,j));
				}
			}
		}
	}
}
