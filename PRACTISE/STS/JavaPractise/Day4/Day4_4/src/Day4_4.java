/* equals() method is called for, object class */

class student
{
	int rollno;  // filed of student class
	int marks; 	 // filed of student class
	
	student()
	{
		this.rollno=83838;
		this.marks=90;
	}
	student(int rollno, int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
		
	}
	public String toString()
	{
		return " Roll no "+ this.rollno +" Marks "+ this.marks;
	}
	
	
}


public class Day4_4 {

	public static void main(String[] args) 
	{
		student s1= new student();
		student s2= new student(87654,100);
		student s4= new student(87654,100);
		student s3=s2;
		System.out.println("s3 == s2 " + (s3==s2));  // cause s3 is pointing to s2
		System.out.println("s3.equals(s2) " + s3.equals(s2));
		System.out.println("s2 == s4 " + (s2==s4));// its Reference is diffrent
		System.out.println("s2.equals(s4) " + s2.equals(s4));  // false 
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
