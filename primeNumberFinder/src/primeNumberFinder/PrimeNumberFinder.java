package primeNumberFinder;
import java.util.Scanner;
public class PrimeNumberFinder {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int prime;
		boolean primes = true;
		
		System.out.println("pls enter a number");
		prime = input.nextInt();
		
		  for(int i=2;i<=prime/2;i++) {
				if(prime % i == 0) {
					primes = false;
				
					break;
					
				}
				}if(primes == true) {
					System.out.println("prime");
				}else {
					System.out.println("not prime");
				}
				
			
			
	}
}
	


