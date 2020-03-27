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
		int guesses = 0;
		
		//creates variables necessary to run the game tracking the player guess, a random value, the point value and how much the player bets
		System.out.println("Welcome to high low game");
		System.out.println("1 to 6 is low");
		System.out.println("8 to 13 is high");
		System.out.println("7 results in an automatic loss");
		System.out.println("you have 1000 points");
		System.out.println("for every bet you win you bet value is doubled and added to your total points");
		System.out.println("for every bet you lose your original bet value subtracted from your total point value");
		//introduces the rules of the game
		
		while (points>0) {
			guesses+=1;
			//as long as the player's point value is greater than zero the game continues
		System.out.println("how many points do you want to bet");
		bet = input.nextInt();
		while ((bet<0) || (bet > points)) {
			System.out.println("pls enter a valid bet between 0 and " + points);
			bet = input.nextInt();
			//asks the player to bet a certain amount of points and checks to ensure that the entered bet is valid
		}
		System.out.println("Enter 1 to guess high or 0 for low");
		guess = input.nextInt();
		random = (int) ((Math.random() * (13) + 1));
		//prompts the user to guess high or low then generates a random value between 1 and 13
		if (random == 7) {
			points = (points-bet);
			
			System.out.println("Number was "+ random + " you lose");
			System.out.println("You now have "+ points + " points");
			//if the random value is a 7 the player automatically loses their bet and it is subtracted from their total
		}else if (guess == 0 && random>0 && random<7) {
			points = (points+(bet*2));
			
			System.out.println("Number was "+ random + " you win");
			System.out.println("You now have "+ points + " points");
			//if they guessed low and the random number generated was between 0 and 7 they win doubling their bet and adding it to their point value
		}else if (guess == 1 && random>7 && random<14) {
			points = (points+(bet*2));
			System.out.println("Number was "+ random + " you win");
			System.out.println("You now have "+ points + " points");
			//if they guessed high and the random number generated was between 7 and 14 they win doubling their bet and adding it to their point value
		}else {
			points = (points-bet);
			
			System.out.println("Number was "+ random + " you lose");
			System.out.println("You now have "+ points + " points");
			// if neither of the above are fulfilled the player loses their bet and it is subtracted from their total
		}
		
	}
		System.out.println("you are out of points you lose, you guessed " + guesses + " times");
}// after the player point value reaches zero the number of total guesses is displayed
}

