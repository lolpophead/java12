package password;

import java.util.Scanner;

import java.util.Scanner;
public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String guess;
		String password = "cat";
		//creates a string and sets its value as "cat"
		int counter;
		counter = 0;
		//creates a counter to track password tries and sets the counter to zero		
		
		System.out.println("Enter the password");
		guess = input.nextLine();
		//Prompts the user to enter a password attempt and assigns the entered value to "guess"
		
		while(counter<2) {
			//starts a while loop that only runs while the counter value is below 2 (three attempts)
			if(password.equals(guess)){
				System.out.println("welcome");				
				// if statement checks to see if the entered guess matches the preset password; if true welcomes the user
				
				break;
				
				
			}else {
				System.out.println("try again");
				guess = input.nextLine();
				counter++;
				// if the users input doesn't match the preset password the user is prompted to try again; for every attempt the
				//the counter is increased by one until the while loop breaks
				
			}
		}if(!password.equals(guess) && counter==2){
			System.out.println("lock");
		}if(password.equals(guess) && counter==2){
			System.out.println("welcome") ;
			// both if  statements run after the while loop when the counter reaches 2
			//to facilitate the third guess, welcoming or locking out the user
		
		}
		
		
		
		
	}
}
