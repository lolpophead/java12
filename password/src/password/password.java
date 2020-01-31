package password;

import java.util.Scanner;

import java.util.Scanner;
public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String password = "cat";
		int counter;
		counter = 0;
		
			
		String guess;
		
		
		System.out.println("Enter the password");
		guess = input.nextLine();
		
		while(counter<2) {
			
			if(password.equals(guess)){
				System.out.println("welcome");				
				
				break;
				
			}else {
				System.out.println("try again");
				guess = input.nextLine();
				counter++;
				
			}
		}if(!password.equals(guess) && counter==2){
			System.out.println("lock");
		}if(password.equals(guess) && counter==2){
			System.out.println("welcome") ;
		
		
		
		}
		
		
		
		
	}
}
