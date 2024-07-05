public class Day1_4 {

	int date=12;
	int month;
	int year;
	
	void disDate()
	{
		System.out.println("Display Date");
	}

}
class student1{
	int rollno;
	int marks;
	static int code;
	Day1_4 d1=new Day1_4();
	static Day1_4 d2=new Day1_4();
	
	void accept()
	{
		System.out.println("Accepct");
	}
	void display()
	{
		System.out.println("display");
	}
	static void m1()
	{
		System.out.println("M1 Method");
	}
	
	public static void main(String[] args) {
		
		student1 s3=new student1();
		s3.d1.disDate();
		student1.d2.disDate();
		System.out.println(d2.date);
        
		Day1_4 d = new Day1_4();
		d.disDate();
		
	}
	
	
}