package triple;


public class triple {
	public static int a;
	public static int b;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100; i++) {
			a = i;
			//generates all numbers between 1 and 100 assigning them to variable a
			for(int i1 = 1; i1 < 101; i1++) {
				b = i1;
				//within the first loop generates all numbers between 1 and 100 assigning them to variable b
				perfectSquare();		
				//uses the perfect square method and variables a and b to find triples

			}
		}
		 
 
		
		
	}

public static void perfectSquare() {
	//this method returns nothing therefore it is a void
		
	int c = 0;
	//creates the variable c which will represent the c*2 in a*2 + b*2 = c*2

	 c = (a*a) + (b*b);
	 //assigns a value to c based on the calculation a*2 + b*2 = c*2
	
	 if (Math.sqrt(c)%1==0) {
		 //if the calculated c value when square rooted is an integer value it is part of a triple
		 c = (int) Math.sqrt(c);
		 //Converting the value for display
		 System.out.println("");
		 System.out.print(a + ", " + b + " and " + c + " are pythagoran triples");
		 //prints out the values for the triples
	 }

	 
	
}
}