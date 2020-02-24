package war;
import java.util.Scanner;
public class War {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int player = drawCard();
		int computer = drawCard();


				
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
		
		
while (playAgain()) {

	player = drawCard();
	computer = drawCard();
		
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
