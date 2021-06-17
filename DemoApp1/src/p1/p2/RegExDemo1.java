package p1.p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

	public static void main(String[] args) {
		String target = "absbaaababbab";

		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher(target);
		int count = 0;

		while (m.find()) {
			count = count + 1;
			System.out.println("Start Index :" + m.start() + " End Index :" + m.end() + " Matched String :" + m.group());
		}
		System.out.println("No of occurences :" + count);

	}
}
