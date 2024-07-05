
public class Day1_2 {
	int date=12;
	int month;
	int year;
	void disDate()
	{
		System.out.println("Display Date");
	}

}
class student{
	int rollno;
	int marks;
	static int code;
	Day1_2 d1=new Day1_2();
	static Day1_2 d2=new Day1_2();
	
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
		student s3=new student();
		s3.d1.disDate();
		student.d2.disDate();
		System.out.println(d2.date);

		
	}
}