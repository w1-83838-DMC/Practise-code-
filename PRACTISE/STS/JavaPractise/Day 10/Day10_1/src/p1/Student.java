package p1;

public class Student extends Person{
	int rollno;
	String coursename;
	
	Student()
	{
		
	}

	Student(String name, int age, int rollno, String coursename)
	{
		super(name,age);
		this.rollno= rollno;
		this.coursename=coursename;
		
	}
	public void setRollno(int rollno)
	{
		this.rollno= rollno;
	}
	public void setcoursename(String coursename)
	{
		this.coursename=coursename;
	}
	public int getRollno()
	{
		return rollno;
	}
	public String getcoursename()
	{
		return coursename;
	}
	public String toString()
	{
		return " Roll no: " + rollno + " coursename: " + coursename;
	}
	public void test() // overridden method
	{
		super.test();
		System.out.println("Inside Student class Method ");
		
	}
	public void displayMarks(int marks)
	{
		System.out.println("Display of marks "+ marks);
	}

}
