import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		int numOfGuesses=0;
		String guess;
		Scanner cin=new Scanner(System.in);	
		Dotcom ship1=new Dotcom();
		
		int randomNum=(int)(Math.random()*5);
		
		ArrayList<String> locations = new ArrayList<String>();
		for(int i=0;i<3;i++) {
			String randomNumStr=Integer.toString(randomNum);
			locations.add(randomNumStr);
			randomNum++;
		}
		ship1.setLocation(locations);
		
		String result;
		do{
			System.out.println("Your guess?");
			guess=cin.next();
			result=ship1.checkHit(guess);
			numOfGuesses++;
		}while(result!="kill");
		System.out.printf("You took %d guesses",numOfGuesses);

	}

}
