package game21;
import java.util.Scanner;
public class Hand {
	public int P1 = 0;
	public int P2 = 0;
	public int P3 = 0;
	public int C1 = 0;
	public int C2 = 0;
	public int C3 = 0;
	public int Ptotal = 0;
	public int Ctotal = 0;
	public boolean newdraw = true;
	public boolean lose = false;
	//variables
	public void playerHand(){
		Scanner input = new Scanner(System.in);
		int hitme = 0;
		//variable
		P1 = (int)(Math.random() * ((13 - 1) + 1)) + 1;
		P2 = (int)(Math.random() * ((13 - 1) + 1)) + 1;
		P3 = (int)(Math.random() * ((13 - 1) + 1)) + 1;
		//creates random number between 13 and 1 for the players 3 cards (the third card is not always used)
		if (P1 == 11 || P1 == 12 || P1 == 13) {
			P1 = 10;
			// if the card is 11, 12, or 13 it is given a value of 10
		}if (P1 == 1) {
			P1 = 11;
		//defaults 1, an ace, to 11
			
		}if (P2 == 11 ||P2 == 12 ||P2 == 13) {
			P2 = 10;//same as above
		}if (P2 == 1) {
			if (P1 == 11) {
				P2 = 1;
		}else {
			P2 = 11;
			}
		}//if an ace is already drawn and set to a value of 11 the next ace drawn must be a one to prevent going over 21
		if (P3 == 11 ||P3 == 12 ||P3 == 13) {
				P3 = 10;//same as above
		}if (P3 == 1) {
			if (P1 + P2 >= 11) {
				P3 = 1;
		}else {
				P3 = 11;		
			}
		}//if the value of a third drawn ace will push the total over 21 it is set to 1
			
		
		//the next section of code performs the same process for the computers hand
			C1 = (int)(Math.random() * ((13 - 1) + 1)) + 1;
			C2 = (int)(Math.random() * ((13 - 1) + 1)) + 1;
			C3 = (int)(Math.random() * ((13 - 1) + 1)) + 1;
			if (C1 == 11 ||C1 == 12 || C1 == 13) {
				C1 = 10;
			}if (C1 == 1) {
				C1 = 11;
			}if (C2 == 11 ||C2 == 12 ||C2 == 13) {
				C2 = 10;
			}if (C2 == 1) {
				if (C1 == 11) {
					C2 = 1;
				}else {
				C2 = 11;
			}
			}if (C3 == 11 ||C3 == 12 ||C3 == 13) {
				C3 = 10;
			}if (C3 == 1 && C1 + C2 >= 11) {
					C3 = 1;		
			}else if (C3 == 1 && C1 + C2 <=10) {
					C3 = 11;
			}
			
			
			Ptotal = (P1 + P2);
			Ctotal = (C1 + C2);
			//calculates the total of the player and computer's hands
			
			
			System.out.println ("you have a "+P1+" and "+P2);
			System.out.println ("your hand total is "+Ptotal);
			System.out.println ("the computer has a "+C1);

			//tells you the value of all of your cards and one of the computer's cards
			System.out.println("to hit press 1, to hold press 0");
			hitme = input.nextInt();
			//prompts the user for a hit and records their response as a value 
			if (hitme == 1) {
				Ptotal = (P1+P2+P3);
				System.out.println ("you have a "+P1+", "+P2+" and "+P3+", total of "+Ptotal);
				//if the player chooses a hit the third predetermined card value is added to the player's total
				if (Ptotal > 21) {
					if (P1==11 ||P2==11||P3==11) {
						Ptotal = Ptotal-10;
					}
				}//if the total exceeds 21 but there is an ace set to 11 it resets that aces value as a 1 (somewhat redundent)
				}if (P1==11 ||P2==11||P3==11) {
					Ptotal = Ptotal-10;
				}//if the total exceeds 21 but there is an 11, then 10 is taken away because an ace can be 11 or 1
			if (Ptotal > 21) {
					System.out.println("Over 21. Dealer wins");
					lose = true;
				}//if it still exceeds 21 then the game is over and the player loses
			if (lose == false ) {
			newdraw = false;
			//makes newdraw false so the next part of the code does not run
			}
			}
		}
	
				
