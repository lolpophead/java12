package methods2;
import java.util.Scanner;
public class methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int inputNum;
		System.out.println("pls input number");
		inputNum = input.nextInt();
	
		if(isPrime(inputNum)) {
			//this inputs inputNum into the method to give a value to primeCheck
			System.out.println("its prime");
		}else if(!isPrime(inputNum)) {
			//! mark asks if it is false
			System.out.println("the number is divisable by " + divisor(inputNum));
		}
		
	}
	
	public static boolean isPrime(int primeCheck) {
		//this method returns a boolean
		//it requires an integer to be sent
		//in the brackets a value is stored locally as primeCheck
		if(primeCheck <=1) {
			return false;
			//if something returns the method stops
		}
		//we don't need an else 
		for(int i = 2; i<primeCheck; i++) {
			if(primeCheck%i == 0) {
				return false;
				
				}
			}
			return true;
		}
		public static int divisor(int compNum) {
			for(int i = 2; i < compNum; i++) {
				if (compNum%i == 0) {
					return i;
					
				}
			}
			return 1;
			//must guarantee a return in all cases
		}
	
	}
	

