// We have created Date class reference inside Student class 
// it is Throwing NPE(Null pointer exception ) when we call.obj.disp();
// because doj is not pointing to any Object of the class

class Date
{
	int dd;  // filed of a class primitive type
	int mm; // filed of a class primitive type
	int yy; // filed of a class primitive type
	
	Date()  // parameterless constructor
	{
		this.dd=24;
		this.dd=03;
		this.yy=2002;
	}
	Date(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	void display()
	{
		System.out.println(this.dd + "/" + this.mm + "/" + this.yy);
	}
	
	
}
class student
{
	int rollno; //filed of Student primitive type
	Date doj=new Date();  // reference of date type // filed // Non primitive type
	
	student()
	{
		this.rollno=1;
	}
	
	void printStudent()
	{
		System.out.println("Roll no = "+this.rollno);
		System.out.println("doj = "+this.doj);
		doj.display();
	}
	
}


public class Day3_11 {
	public static void main(String[] args) {
		student s1= new student();
		s1.printStudent();
		
	}


}
