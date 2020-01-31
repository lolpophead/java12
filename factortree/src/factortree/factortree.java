package factortree;
import java.util.Scanner;
public class factortree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int factorable;
		
		
		System.out.println("pls enter a number");
		factorable = input.nextInt();
		
		 for(int i = 2; i< factorable/2; i++) {
	         while(factorable%i == 0) {
	            System.out.println(i);
	            factorable = factorable/i;
	         }
	      }
		 if(factorable >2) {
	         System.out.println(factorable);
	      }
	}

}
