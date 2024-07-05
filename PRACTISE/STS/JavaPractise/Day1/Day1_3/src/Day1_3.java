
public class Day1_3 {

	int date=12;
	int month;
	int year;
	
	void disDate()
	{
		System.out.println("Display Date");
	}
public static void main(String[] args) {
		
		student2 s3=new student2();
		s3.d1.disDate();
		student2.d2.disDate();
		s3.accept();
		s3.display();
		
		//System.out.println(d2.date);
        
		
	}
}

class student2{
	int rollno;
	int marks;
	static int code;
	Day1_3 d1=new Day1_3();
	static Day1_3 d2=new Day1_3();
	
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
	
	
}
