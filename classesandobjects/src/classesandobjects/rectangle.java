package classesandobjects;

public class rectangle {
	public double length;
	private double width;
	//public variables are accessible from outside the class private are not
	//both these variables are global
	//private variables prevent outside edits of their values
	
	//constructors are run when a new object is created
	
	public rectangle(double l, double w) {
		length = l;
		width = w;
		
	}
	//constructors must always have the same name as the class
	
	public double getWidth() {
		return width;
		//returns the value of width
		
		
	}
	public void setWidth(double W) {
	if(W<=0) {
		System.out.println("invalid width");
		
	}else {
		width = W;
		
	}
	
	
	}
	public double area() {
		return length*width;
		
	}
	public double perimeter() {
		return 2*length+2*width;
		
	}
	public rectangle() {
		length = 1.0;
		width = 1.0;
	}
	//this is also a constructor 
	//java will pick which constructor to run based on what arguments (in brackets) are being sent
	//this is called overloading a method
}

