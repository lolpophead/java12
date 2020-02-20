package classesandobjects;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		rectangle steve = new rectangle(3.0, 7.0);
		//this creates a rectangle object called steve 
		//we sent two values to the constructor to set the initial length and width
		
		System.out.println("the length of steve is "+ steve.length + " the width of steve is "+ steve.getWidth());
		//width cannot be accessed directly because it is private
		System.out.println("insert a new lenth and width");
		double userInput;
		userInput = input.nextDouble();
		steve.length = userInput;
		userInput = input.nextDouble();
		steve.setWidth(userInput);
		System.out.println("new length and width" + steve.length + steve.getWidth());
		
		System.out.println("area of steve is " + steve.area());
	
	
		rectangle margaret = new rectangle();
		System.out.println("steve length = " + steve.length);
		System.out.println("margaret length = " + margaret.length);
		
	}
	

}
