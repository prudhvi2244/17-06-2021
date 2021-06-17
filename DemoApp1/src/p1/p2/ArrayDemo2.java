package p1.p2;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		int[] arr=new int[3];
		
		System.out.println("length is :"+arr.length);
		
		int eids[]= {1,2,3,53,3636,36,36,36,36,36,36,6,266,26,26,26,26,262,62,6};
		
		System.out.println("length is :"+eids.length);
		
		for(int i=0;i<eids.length;i++)
		{
			System.out.println("Element at index position:"+i+" is :"+eids[i]);
		}
	}

}
