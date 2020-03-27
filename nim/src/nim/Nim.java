package nim;
import java.util.Scanner;
public class Nim {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int computerStones;  
		int playerStones;  
		int totalStones = (int) (Math.random() * 16) + 15;
		while (totalStones > 0) {
			System.out.println("There are " + totalStones + " stones.");
			playerStones = playerDraw();
			computerStones = computerDraw();
			totalStones = totalStones - playerStones; 
			System.out.println("There are " + totalStones + " stones.");
			if (totalStones > 0) {
				//computerStones = computerDraw(totalStones);
				totalStones = totalStones - computerStones;
				System.out.println("The computer took " + computerStones + " stones."); 
				if(totalStones == 0) {
					System.out.println("Computer drew the final stones, you win!");
				}
			}else {
				System.out.println("You drew the final stone, Computer wins!");
			}

		}
		
	}
	public static int playerDraw() {
		System.out.println("draw 1,2, or 3 stones");
		int playerStones;
		playerStones = input.nextInt();
		return playerStones;
		//prompts the user to pick a certain number of stones then returns that value
	
}
	public static int computerDraw() {
		int computertake; 
		computertake = (int) ((Math.random() * (3) + 1));
		return computertake;
		//makes a random selection between 1 and 3 stones and returns it as the computers value
		//as the number of total stones cannot be accessed by this method it is possible that the computer may draw more than the available number of stones
}
}