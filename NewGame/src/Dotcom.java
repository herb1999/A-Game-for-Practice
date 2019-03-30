import java.util.ArrayList;
public class Dotcom {
	private ArrayList<String> locationCells;
	
	
	void setLocation(ArrayList<String> locations) {
		locationCells=locations;
	}
	
	
	
	String checkHit(String guess) {
		String result="miss";

		if (locationCells.contains(guess)) {
			result="hit";
			locationCells.remove(guess);
		}
		
		if (locationCells.isEmpty()) {
			result="kill";
		}
		System.out.println(result);
		return result;
	}

	
}
