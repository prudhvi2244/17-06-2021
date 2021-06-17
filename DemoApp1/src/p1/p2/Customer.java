package p1.p2;

import java.util.Scanner;

public class Customer {

	
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Name:");
		String name=sc.next();
		
		System.out.print("Enter Your Mobile:");
		Long mobile=sc.nextLong();
		
		System.out.println("Thank You For Providing Details....");
		
		System.out.println("Your Name :"+name);
		System.out.println("Your Mobile :"+mobile);
		
		
		
	}
	
}
