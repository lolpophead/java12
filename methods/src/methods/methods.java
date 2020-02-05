package methods;
import java.util.Scanner;
public class methods {

	public static double inputTemp;
	//this is a global variable, it can be accessed from any method 
	
	public static void main(String[] args) {
		//the main method it runs first
		Scanner input = new Scanner(System.in);
		
		String choice;
		//choice is a local variable and can only be accessed from inside the method
		System.out.println("F2C is F to C");
		System.out.println("C2F is C to F");
		System.out.println("input ur choice");
		choice = input.next();
		System.out.println("what is the temp");
		inputTemp= input.nextDouble();
		//we can access inputTemp in the method because it is global
		
		if(choice.equalsIgnoreCase("f2c")) {
			//run f2c method
			f2c();
			
		}else {
			c2f();
			//run c2f method
		}
		
	}
//this section is inside the class but outside the main
	
	public static void f2c() {
		//this method returns nothing therefore it is a void
		double cTemp;
		//cTemp is local to f2c
		cTemp = (5.0/9.0)*(inputTemp-32);
		//if we divide integers we get an integer, so 5/9=0	
		//we can access inputTemp because its global
		System.out.println("The celcius temp is "+cTemp);
		
		
	}
	public static void c2f() {
		//this method returns nothing therefore it is a void
		double fTemp;
		//cTemp is local to f2c
		fTemp = (9.0/5.0)*inputTemp + 32 ;
		//if we divide integers we get an integer, so 5/9=0	
		//we can access inputTemp because its global
		System.out.println("The ferenheit temp is "+fTemp);
		
		
	}
	
}
