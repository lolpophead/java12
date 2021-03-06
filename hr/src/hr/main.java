package hr;
import java.util.Scanner;
public class main {

public static Employee bob;
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int action = 0;
		//creates the varible action which will be used to select different menu choices
		System.out.println("enter ur name");
		String Name = input.next();
		bob = new Employee(Name);
		//asks the user to input a name and sets it to the new employee
		while (action!=6) {
			System.out.println("1 New Employee");
			System.out.println("2 Employee Info");
			System.out.println("3 Edit Info");
			System.out.println("4 Raise");
			System.out.println("5 Weekly Pay");
			System.out.println("6 Exit");
			System.out.println("Pls enter ur selection 1-6");
			//starts a loop and provides menu options
			
			action = input.nextInt();
			//sets the users input value to the action
				
				if (action==1) {
					create();
					
				}else if (action==2) {
					read();
					
				}else if (action==3) {
					edit();
					
				}else if (action==4) {
					raise();
					
				}else if (action==5) {
					calc();
					
				}else if (action==6) {
					System.out.println("Bye");
					break;
					//depending on the users choice different methods will be executed 
				}
				
		}
		
	}
	public static void create() {
		System.out.println("Enter ID");
		int ID = input.nextInt();
		bob.setID(ID);
		System.out.println("Enter Salary");
		double salary = input.nextDouble();
		bob.setSalary(salary);
		System.out.println("Enter Title");
		String Title = input.next();
		bob.setTitle(Title);
		System.out.println("Enter SIN");
		int SIN = input.nextInt();
		bob.setSIN(SIN);
		//allows for the initial input of user information

	}
	public static void read() {
		System.out.println("All employee info:");
		bob.printAll();
		//prints out all info by referencing the printAll method
	}
	public static void edit() {
		System.out.println("Enter new ID");
		int ID = input.nextInt();
		bob.setID(ID);
		System.out.println("Enter new Salary");
		double salary = input.nextDouble();
		bob.setSalary(salary);
		System.out.println("Enter new Title");
		String Title = input.next();
		bob.setTitle(Title);
		System.out.println("Enter new SIN");
		int SIN = input.nextInt();
		bob.setSIN(SIN);
		System.out.println("Edit complete");
		//allows the user to edit all user info except for the name
	}
	public static void raise() {
		System.out.println("Raise value");
		double value = input.nextDouble();
		bob.giveRaise(value);
		//Executes the giveRaiser method
	}
	public static void calc() {
		System.out.println("Weekly pay = " + bob.weeklyPay());
	}//executes weeklypay method
	
}
