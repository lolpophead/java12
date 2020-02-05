package primeNumberFinder;
import java.util.Scanner;
public class PrimeNumberFinder {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int prime;
		//creates a variable prime that will be inputed by the user
		boolean Primes = true;
		//creates a boolean that will be set to true or false based on a later process to track if the number is prime or not
		
		System.out.println("pls enter a number");
		prime = input.nextInt();
		//prompts the user to enter a number that might be prime and assigns its value to the variable
		if (prime<=1) {
			System.out.println("not prime");
			//if the number is less than or equal to one the number is not prime
			
			
		}else {
		//if the number is greater than 1 it is checked
			
		  for(int i=2;i<=prime/2;i++) {
				if(prime % i == 0) {
					Primes = false;
				//uses reminder division in a for loop to see if there is a reminder when divided by 2 to a number half of itself increasing by one
				//if not possible the boolean is set to false to indicate the number is prime
					break;
				// the loop ends at this point
				}
				}if(Primes == true) {
					System.out.println("prime");
				}else {
					System.out.println("not prime");
				}
				//if the boolean remains at true from the start of the program the number is prime
				//if the for loop returns false the number is not prime
			
			
	}
}
}	


