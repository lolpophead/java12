package monogram;
import java.util.Scanner;
public class mongram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String first;
		String middle;
		String last;
		String firstLow;
		String middleLow;
		String lastUpper;
		//creates strings for the users inputs as well as for variables to be used in operators
		
		System.out.println("pls enter first name");
		first = input.nextLine();
		//prompts the user to input their first name and assigns it to a variable
		
		System.out.println("pls enter middle name");
		middle = input.nextLine();
		//prompts the user to input their middle name and assigns it to a variable
		
		System.out.println("pls enter last name");
		last = input.nextLine();
		//prompts the user to input their last name and assigns it to a variable
		
		firstLow=first.toLowerCase();
		middleLow=middle.toLowerCase();
		lastUpper=last.toUpperCase();
		//takes the users inputed first last and middle name and converts them to the appropriate case
		
		System.out.print(firstLow.substring(0, 1) + lastUpper.substring(0, 1) + middleLow.substring(0, 1) );
		//prints out the fist letter cased strings in  specified order 
		
	}

}
