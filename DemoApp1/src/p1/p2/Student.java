package p1.p2;

public class Student {

	Integer sid;
	String sname;
	String scity;
	String mobile;

	public Student() {

	}

	public Student(int sid, String sname, String scity,String mobile) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.mobile=mobile;
	}

	public String toString()
	{
		return "sid:"+sid+"\tstudent Name:"+sname+"\tstudent city:"+scity;
	}
	
	
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collector Executed");
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student(1,"Prudhvi","Goa","898989892");
		Student s2=new Student(2,"Rajeev","Vijayawada","87878787");
		Student s3=new Student(3,"Raj","Hyderabad","7787878787");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s3.getClass());
		System.out.println(s3.sname.getClass());
		
		System.out.println("Mobile Number :"+s1.mobile);
		
		Long mobile_number=Long.parseLong(s1.mobile);
		Integer m1=Integer.parseInt(s1.mobile);
		
		Integer.parseInt("Raj");
		
		
		
		s1=null;
		System.gc();
		

	}

}
