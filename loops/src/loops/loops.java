package loops;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int lowNum, highNum;
		int total = 0;
		
		System.out.println("pls enter a low number");
		lowNum = input.nextInt();
		
		System.out.println("pls enter a high number, enter a 0 to quit");
		highNum = input.nextInt();
		
		while(highNum !=0 ) {
			//while loops repeat while the condition is true
			for(int i = lowNum; i <= highNum; i++) {
				//for loops take the form 
				//for(initialization; condition; increment){
				//++ goes up by one; adds one
				total+=i;
				//adds i to total
			}
			System.out.println("the sum is "+total);
			System.out.println("pls enter a low number");
			lowNum = input.nextInt();
			
			System.out.println("pls enter a high number, enter 0 to quit");
			highNum = input.nextInt();
			total = 0;
			
		}
	}

}
