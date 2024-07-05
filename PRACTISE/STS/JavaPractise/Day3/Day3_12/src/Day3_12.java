// We have created Date class Reference inside student class
// it is Throwing Null pointer Exception when we call call.doj.disp();
// because doj is not pointing to any object of the type Date

class Date
{
	int dd;
	int mm;
	int yy;
	
	Date()
	{
		this.dd=24;
		this.mm=03;
		this.yy=2002;
	}
	void display()
	{
		System.out.println(this.dd+"/"+this.mm+"/"+this.yy);
	}
}
class student
{
	int rollno;
	Date dobj;
	
	student()
	{
		this.rollno=1;
		dobj=new Date();
	}
	void printStudent()
	{
		System.out.println("Roll no "+this.rollno);
		dobj.display();
	}
	
}

public class Day3_12 {
	public static void main(String[] args)
	{
		student s1= new student();
		s1.printStudent();
		
		
	}

}
