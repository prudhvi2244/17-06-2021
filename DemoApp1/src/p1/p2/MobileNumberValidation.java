package p1.p2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Requirement : 
 * Validate 10-digit mobile number
 * mobile number should start with either 6 or 7 or 8 or 9 
 */
public class MobileNumberValidation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Mobile Number:");
		String mobile=sc.next();
		
		Pattern p=Pattern.compile("[6789][0-9]{9}");
		
		Matcher m=p.matcher(mobile);
		
		if(m.find() && m.group().equals(mobile))
		{
			System.out.println("Mobile Number is valid :"+mobile);
		}
		else
		{
			System.out.println("Mobile Number is invalid :"+mobile);
		}
		
		
	}
	
}
