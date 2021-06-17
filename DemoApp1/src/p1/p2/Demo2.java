package p1.p2;

public class Demo2 {

	int a, b;

	// constructor with 2 int arguments
	public Demo2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// constructor without arguments
	public Demo2() {

	}

	public static void main(String[] args) {

		Demo2 obj1 = new Demo2(1, 2);
		Demo2 obj2 = new Demo2(1, 2);
		Demo2 obj3=obj1;

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));

	}
}
