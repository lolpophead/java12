package war;
import java.util.Scanner;
public class War {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int player = drawCard();
		int computer = drawCard();
//sets the player and computers card draw number using the random card drawing method

				
		System.out.println("you drew a " + cardName(player));
		System.out.println("the computer drew a " + cardName(computer));
//tells the user what card they drew and what card the computer drew converting it using the card name method

		if (winner(player, computer)) {
			System.out.println("you won");
//uses the winner method to determine if the player beat the computer
		}else {
			if(tie(player, computer)) {
				System.out.println("you tied");
				//if the player didn't win checks for a tie using the tie method
			}else {
				System.out.println("you lost");
				// if the player didn't win and their wasn't a tie the player must have lost
			}
		}
		
//runs the game once
while (playAgain()) {
//then prompts the player using the play again method, if true it runs the game again
	player = drawCard();
	computer = drawCard();
//Generates new card values every time the game is played.
System.out.println("you drew a " + cardName(player));
System.out.println("the computer drew a " + cardName(computer));


if (winner(player, computer)) {
	System.out.println("you won");

}else {
	if(tie(player, computer)) {
		System.out.println("you tied");
	}else {
		System.out.println("you lost");
	}
}

}


	}
	
	public static int drawCard() {
		return (int)(Math.random()*13 +1);
	}
	
	public static String cardName(int card) {
		if (card == 1) {
			return "Ace";
		}else if (card<=10) {
			return String.valueOf(card);
		}else if (card == 11) {
			return "Jack";
		}else if (card == 12) {
			return "Queen";
		}else {
			return "King";
		}
	}
	
	public static boolean tie(int pCard, int cCard) {
		if (pCard == cCard) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean winner(int pCard, int cCard) {
		if (pCard == 1) {
			pCard = 14;
		}
		if (cCard == 1) {
			cCard = 14;
		}
		if(pCard>cCard) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean playAgain() {
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to play again? y/n");
		String choice = input.next();
		if(choice.equalsIgnoreCase("n")) {
			return false;
		}else {
			return true;
		}
	}

}
