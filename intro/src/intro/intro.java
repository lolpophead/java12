package intro;
import java.util.Scanner;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName;
		//this makes a string type variable
		//we need to end each line with a ; or {}
		int age;
		String name = "ben";
		int height;
		
		Scanner input = new Scanner(System.in);
		//this creates a scanner object called input
		//scanners look in System for user inputs
		
		System.out.print("pls enter ur name");
		userName = input.next();
		//input.next() gets the next string 
		// spaces or enters ends the input
		
		System.out.println("Pls enter ur age");
		age = input.nextInt();
		System.out.println("Pls enter ur height(cm)");
		height = input.nextInt();
		
		System.out.println("Hello " + userName + " you are " + age + " years old and " + height + "cm tall.");
		// can print multiple outputs by concatenating them with a +
		
		if(age > 17) {
			System.out.println("ur older than me");
			
		}else if(age < 17) {
			System.out.println("ur younger than me");
			
		}else {
			System.out.println("we are the same age");
		}
		//numerical comparison symbols
		//< , > , == , != , >= , <=
		
		if(userName.equals(name)) {
			System.out.println("hello me");
			//when comparing strings must use .equals or .equalsIgnoreCase
			//to check for not equal username.equals(name)==False
		}
		
		if(age == 17 && height == 180) {
			System.out.println("we are the same age and height");
			//&& is the boolean operator for "and", || is the "or" operator
		}
		
	}

}
