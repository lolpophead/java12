package factortree;
import java.util.Scanner;
public class factortree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int factorable;
		//creates a variable factorable that will be inputed by the user
		
		System.out.println("pls enter a number");
		factorable = input.nextInt();
		//prompts the user to enter a number to be factored and assigns its value to the variable
		 for(int i = 2; i< factorable/2; i++) {
			 	//for loop assigns a value to i from 2 until half of the inputed number increasing by one
	         while(factorable%i == 0) {	        	 
	            System.out.println(i);
	            //while loop prints out i value if reminder division yields a o indicating a prime factor
	            factorable = factorable/i;
	            //divides the inputed factorable value by the found prime factor and reassigns its value
	            //for loop resets and runs again
	         }
	      }
		 if(factorable >2) {
	         System.out.println(factorable);
	      //if the value of the variable factorable is greater than 2 after the for and while loop it prints out the remaining value
		 }
	}

}
