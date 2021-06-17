package p1.p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {

	public static void main(String[] args) {

		String target="asCAPGEMINI bangalore@gmail.com1235";
		Pattern p=Pattern.compile("[\\s]");
		Matcher m=p.matcher(target);

		while(m.find())
		{
			System.out.println("Start Index :" + m.start() + " End Index :" + m.end() + " Matched String :" + m.group());
		}
		
	}

}
