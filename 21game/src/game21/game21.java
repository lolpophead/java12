package game21;
import java.util.Scanner;
public class game21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Hand Hand = new Hand();
		//creates object, hand
		int hand = 0;
		int replay;
		//variables for gameplay
		System.out.println("welcome to 21");
		System.out.println("an ace, 1, can have a value of 11 or 1");
		System.out.println("11, 12, 13 are all worth 10");
		System.out.println("");
		//displays rules of game a the start of the game for the user
		while (Hand.newdraw == true) {
		//allows for hand creation, is set to false once a hand is drawn
			if (Hand.newdraw == true) {
				Hand.playerHand();
				//runs the method playerHand to draw a new set of hands
		}while (Hand.newdraw == false) {
			Hand.Ctotal = Hand.C1+Hand.C2;
			System.out.println ("the computer has "+Hand.C1+" and "+Hand.C2);
			System.out.println ("the computer has a total of "+Hand.Ctotal);
		//tells the player the cards the computer has and the total
			if (Hand.Ptotal >= Hand.Ctotal) {
				Hand.Ctotal = Hand.C1+Hand.C2+Hand.C3;
				System.out.println("The computer drew a card");
				System.out.println("The computer drew a "+Hand.C3+" and now has a hand value of "+Hand.Ctotal);
			}//if the player has a higher value then the computer then the computer draws another card
			if (Hand.Ctotal > 21) {
				System.out.println("The computer went over 21. You win");
				Hand.newdraw = true;
			}//if the computer has more then 21 then the computer loses
			else if (Hand.Ptotal > Hand.Ctotal) {
				System.out.println("You have "+Hand.Ptotal+", you win");
				break;
			}//if the players number is higher then the computers number then the player wins and the loop breaks
			else if (Hand.Ptotal < Hand.Ctotal) {
				System.out.println("The computer has "+Hand.Ctotal+", you lose");
				break;
			}//if the players number is lower then the computers number then the player wins and the loop breaks
			else if (Hand.Ptotal == Hand.Ctotal) {
				System.out.println("The computer has "+Hand.Ctotal+" and you have "+Hand.Ptotal+" it is a tie");	
				break;
			}//if the player and computer have the same hand total it is a tie and the loop breaks
		}
		System.out.println ("would you like to play again");
		System.out.println ("if you do, press 1 if not press 0");
		replay = input.nextInt();
		//asks if the player wants to play again and takes the input
		if (replay == 1) {
			Hand.newdraw = true;
		}else {
			Hand.newdraw = false;
			}//if the person wants to continue playing then newdraw is set to true again if not  it is set to false and the program ends.
		}System.out.println("bye");
	}
}
