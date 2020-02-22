package triple;

import java.util.Scanner;

public class triple {
	public static int a;
	public static int b;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int triple;
		
		for(int i = 1; i < 100; i++) {
			a = i;
			for(int i1 = 1; i1 < 100; i1++) {
				b = i1;
				perfectSquare();		

			}
		}
		 
 
		
		
	}

public static void perfectSquare() {
	//this method returns nothing therefore it is a void
		
	double c = 0;
	

	 c = (a*a) + (b*b);
	
	 if (Math.sqrt(c)%1==0) {
		 c = Math.sqrt(c);
		 System.out.println("");
		 System.out.print(a + ", " + b + " and " + c + " are pythagoran triples");
	 }

	 
	
}
}