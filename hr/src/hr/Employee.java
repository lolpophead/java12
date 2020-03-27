package hr;

public class Employee {
	private String name;
	private int ID;
	private Double salary;
	private String title;
	private int SIN;
	public Employee(String n) {
		name = n;
	}
	public void setID(int id) {
		ID = id;
	}
	public void setSalary(Double s) {
		if (s<0) {
			System.out.println("Invalid Salary");
		}else {
			salary = s;
		}
	}
	public void setTitle(String t) {
		title = t;
	}
	public void setSIN(int num) {
		if(num<100000000) {
			System.out.println("Invalid SIN");
		}else {
			SIN = num;
		}
	}
	public void printAll() {
		System.out.println("Name: "+name);
		System.out.println("ID#: "+ID);
		System.out.println("Salary: "+salary);
		System.out.println("Title: "+title);
		System.out.println("SIN: "+SIN);
	}
	public void giveRaise(Double raise) {
		salary +=raise;
	}
	public Double weeklyPay() {
		return salary*7/365.0;
	}
	

}
