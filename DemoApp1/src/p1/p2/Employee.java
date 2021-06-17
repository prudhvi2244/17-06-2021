package p1.p2;

import java.util.Scanner;

public class Employee {

	Integer eid;
	String ename,email;
	Double esalary;
	
	public void captureEmployeeDetails()
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter Employee ID:");
		eid=sc.nextInt();
		
		System.out.print("Enter Employee Name:");
		ename=sc.next();
		
		System.out.print("Employee Email:");
		email=sc.next();
		
		System.out.print("Employee Salary:");
		esalary=sc.nextDouble();
		
		System.out.println("Employee Information Captured");
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee ID :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Email :"+email);
		System.out.println("Employee Salary :"+esalary);

	}
	
	public static void main(String[] args) {
	
		Employee e1=new Employee();
		e1.captureEmployeeDetails();
		e1.displayEmployeeDetails();
	}
	
}
