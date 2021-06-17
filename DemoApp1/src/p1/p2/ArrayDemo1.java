package p1.p2;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int a[];//Array Declaration
		int[] b;//Array Declaration
		int []c;//Array Declaration
		
		a=new int[5]; //Array Creation
		b=new int[3];
		c=new int[10];
		
		a[0]=1;
		a[1]=90;
		a[4]=100;		
		
		System.out.println("Element at index position-0:"+a[0]);//1
		System.out.println("Element at index position-1:"+a[1]);//90
		System.out.println("Element at index position-2:"+a[2]);//0
		System.out.println("Element at index position-3:"+a[3]);//0
		System.out.println("Element at index position-4:"+a[4]);//100
		
		System.out.println("length of array :a :"+a.length);
		System.out.println("length of array :b :"+b.length);
		System.out.println("length of array :c :"+c.length);
		
	}
}
