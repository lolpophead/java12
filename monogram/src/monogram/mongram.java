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
		String firstLowShort;
		String middleLowShort;
		String lastUpperShort;
		
		
		System.out.println("pls enter first name");
		first = input.nextLine();
		
		System.out.println("pls enter middle name");
		middle = input.nextLine();
		
		System.out.println("pls enter last name");
		last = input.nextLine();
		
		
		firstLow=first.toLowerCase();
		middleLow=middle.toLowerCase();
		lastUpper=last.toUpperCase();
		
		firstLowShort=firstLow.substring(0, 1);
		middleLowShort=middleLow.substring(0, 1);
		lastUpperShort=lastUpper.substring(0, 1);
		
		System.out.print(firstLowShort + lastUpperShort + middleLowShort);
	}

}
