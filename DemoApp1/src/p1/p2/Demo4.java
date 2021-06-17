package p1.p2;

public class Demo4 {
	
	public static void main(String[] args) {
		
		String name="Prudhvi";
		
		Object obj=name; //implicit Type Casting
		
		System.out.println(name);
		System.out.println(obj);
		
		Object obj1="Raj";
		String s1=(String)obj1; //Explicit Type Casting
		
		System.out.println(obj1);
		System.out.println(s1);
		
		
	}

}
