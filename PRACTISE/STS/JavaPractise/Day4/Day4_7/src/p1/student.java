package p1;

public class student {
	int rollno;
	int marks;
	
	public student() // parameterless constructor
	{
		this.rollno=83838;
		this.marks=98;
	}
	public student(int rollno, int marks) // parameterized Constructor
	{
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString()  // to string method
	{
		return " Roll no " + this.rollno + " Marks "+ this.marks;
		
	}
	
	
	
	

}
