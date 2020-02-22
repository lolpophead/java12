package hilo;
import java.util.Scanner;
public class hilo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int guess;
		int random;
		int points = 1000;
		int bet;
		
		System.out.println("Welcome to high low game");
		System.out.println("1 to 6 is low");
		System.out.println("8 to 13 is high");
		System.out.println("7 results in an automatic loss");
		System.out.println("you have 1000 points");
		System.out.println("for every bet you win you bet value is doubled and added to your total points");
		System.out.println("for every bet you lose your original bet value subtracted from your total point value");
		
		
		while (points>0) {
		System.out.println("how many points do you want to bet");
		bet = input.nextInt();
		if ((bet<0) || (bet > points)) {
			System.out.println("pls enter a valid bet between 0 and " + points);
			bet = input.nextInt();
		}
		System.out.println("Enter 1 to guess high or 0 for low");
		guess = input.nextInt();
		random = (int) ((Math.random() * (13) + 1));
		
		if (random == 7) {
			points = (points-bet);
			
			System.out.println("Number was "+ random + " you lose");
			System.out.println("You now have "+ points + " points");
			
		}else if (guess == 0 && random>0 && random<7) {
			points = (points+(bet*2));
			
			System.out.println("Number was "+ random + " you win");
			System.out.println("You now have "+ points + " points");

		}else if (guess == 1 && random>7 && random<13) {
			points = (points+(bet*2));
			System.out.println("Number was "+ random + " you win");
			System.out.println("You now have "+ points + " points");
			
		}else {
			points = (points-bet);
			
			System.out.println("Number was "+ random + " you lose");
			System.out.println("You now have "+ points + " points");
			
		}
		
	}
		System.out.println("you are out of points you lose");
}
}

