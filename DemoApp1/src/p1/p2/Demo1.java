package p1.p2;

public class Demo1 {

	public static void main(String[] args) {
		
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1();
		Demo1 d3=d2;
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		
	}
}
