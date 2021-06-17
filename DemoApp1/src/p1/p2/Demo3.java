package p1.p2;

public class Demo3 {
	
	public static void main(String[] args) {
		
		int a=10; // int   : 4  bytes
		long b=a; // long : 8  bytes // implicit type casting
		
		int c=252525252;
		short s=(short)c;
		
		double d=9090.444;
		int i1=(int)d;
		
		System.out.println(c);
		System.out.println(s);
		
		System.out.println("Double Value :a :"+d);
		System.out.println("Integer Value :i1 :"+i1);
		
	}

}
