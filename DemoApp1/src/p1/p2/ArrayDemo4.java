package p1.p2;

import java.util.regex.Pattern;

public class ArrayDemo4 {
	
	public static void main(String[] args) {
		
		String website="www.capgemini.com";
		String dob="17-09-1990";
		
		Pattern p1=Pattern.compile("\\.");
		String s1[]=p1.split(website);
		
		Pattern p2=Pattern.compile("-");
		String s2[]=p2.split(dob);
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
		System.out.println("****************************");
		
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
		
	}

}
