import java.io.*;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		int numOfGuesses=0;
		String guess;
		Scanner cin=new Scanner(System.in);	
		Dotcom ship1=new Dotcom();
		
		int randomNum=(int)(Math.random()*5);
		int[]locations= {randomNum,randomNum+1,randomNum+2};
		ship1.setLocation(locations);
		
		while(ship1.getHp()!=0) {
			System.out.println("Your guess?");
			guess=cin.next();
			ship1.checkHit(guess);
			numOfGuesses++;
		}
		System.out.printf("You took %d guesses",numOfGuesses);

	}

}
