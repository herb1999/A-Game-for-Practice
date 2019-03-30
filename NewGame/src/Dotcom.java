
public class Dotcom {
	private int[] locationCells;
	private int hp;
	
	void setLocation(int[] locations) {
		locationCells=locations;
		hp=locations.length;
	}
	
	int getHp() {
		return hp;
	}
	
	String checkHit(String guess) {
		int guessLoc=Integer.parseInt(guess);
		String result="miss";
		for(int location:locationCells) {
			if (guessLoc==location) {
				hp--;
				result="hit";
				break;
			}
		}
		if (hp==0) {
			result="kill";
		}
		System.out.println(result);
		return result;
	}

	
}
