package unitConversion;
import java.util.Scanner;
public class unitConversion {
	public static double inputMeasurement;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String choice;
		
		System.out.println("i2c: Inch to Cent");
		System.out.println("c2i: Cent to inch");
		System.out.println("f2c: feet to cent");
		System.out.println("c2f: cent to feet");
		System.out.println("y2m: yard to meter");
		System.out.println("m2y: meter to yard");
		System.out.println("m2k: mi to km");
		System.out.println("k2m: km to mi");
		System.out.println("input ur choice");
		choice = input.next();
		System.out.println("what is the measurement");
		inputMeasurement = input.nextDouble();
				
		
		if(choice.equalsIgnoreCase("i2c")) {
			//run f2c method
			i2c();
		}if(choice.equalsIgnoreCase("c2i")) {
				//run f2c method
				c2i();
		}if(choice.equalsIgnoreCase("f2c")) {
					//run f2c method
					f2c();
		}if(choice.equalsIgnoreCase("c2f")) {
						//run f2c method
						c2f();
		}if(choice.equalsIgnoreCase("y2m")) {
							//run f2c method
							y2m();
		}if(choice.equalsIgnoreCase("m2y")) {
								//run f2c method
								m2y();
		}if(choice.equalsIgnoreCase("m2k")) {
									//run f2c method
									m2k();
		}if(choice.equalsIgnoreCase("k2m")) {
										//run f2c method
										k2m();
		}
	}
public static void i2c() {
	//this method returns nothing therefore it is a void
	double centi;
	//cTemp is local to f2c
	centi = (inputMeasurement)*(2.54);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The length in centimeters is "+centi);
	
	
}
public static void c2i() {
	//this method returns nothing therefore it is a void
	double inches;
	//cTemp is local to f2c
	inches = (inputMeasurement)/(2.54);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The length in inches is "+inches);
	
	
}
public static void f2c() {
	//this method returns nothing therefore it is a void
	double centi;
	//cTemp is local to f2c
	centi = (inputMeasurement)*(30.48);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The length in centimeteris is "+centi);
	
	
}
public static void c2f() {
	//this method returns nothing therefore it is a void
	double feet;
	//cTemp is local to f2c
	feet = (inputMeasurement)/(30.48);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The length in feet is "+feet);
	
	
}
public static void y2m() {
	//this method returns nothing therefore it is a void
	double meter;
	//cTemp is local to f2c
	meter = (inputMeasurement)*(0.9144);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The length in meters is "+meter);
	
	
}
public static void m2y() {
	//this method returns nothing therefore it is a void
	double yards;
	//cTemp is local to f2c
	yards = (inputMeasurement)/(0.9144);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The length in yards is "+yards);
	
	
}
public static void m2k() {
	//this method returns nothing therefore it is a void
	double kilo;
	//cTemp is local to f2c
	kilo = (inputMeasurement)*(1.60934);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The distenace in km is "+kilo);
	
	
}
public static void k2m() {
	//this method returns nothing therefore it is a void
	double miles;
	//cTemp is local to f2c
	miles = (inputMeasurement)/(1.60934);
	//if we divide integers we get an integer, so 5/9=0	
	//we can access inputTemp because its global
	System.out.println("The dsitance in miles is "+miles);
	
	
}
}


