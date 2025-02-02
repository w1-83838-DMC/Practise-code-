/*equals is overridden inside the student class  generally if we override equals() method we override hashcode()  We write the logic for comparing the Content inside the object   */
import java.util.Objects;

class student
{
	int rollno;
	int marks;
	
	student()
	{
		this.rollno=83838;
		this.marks=987;
	}
	
	public String toString()
	{
		return " Rollno = " + this.rollno + " Marks = "+ this.marks;
	}
	
	student(int rollno, int marks)
	{
		this.rollno= rollno;
		this.marks = marks;
		
	}
	public boolean equals(Object obj)
	{
			if(this==obj)  // s1==s3 ->false
			{
				return true;
			}
			if(obj==null) // s3==null ->false
			{
				return true;
			}
			if(this.getClass()!= obj.getClass())  //s1.getclass != s3.getclass  student != student
			{
				return false;
			}
			student other=(student)obj;
			
			return this.rollno==other.rollno && this.marks == other.marks;
	}
	
	
}

public class Day4_5 {

	public static void main(String[] args) 
	{
		student s1= new student(12,90);
		student s2=s1;
		student s3= new student(12,90);
		System.out.println(" s1==s2 "+(s1==s2));
		System.out.println(" s3.equals(s2)"+s3.equals(s2));  // 
		System.out.println(s1);
		System.out.println(" s1==s3 "+(s1==s3));
		System.out.println(" s1.equals(s3)"+s1.equals(s3));  // s1 is this and s3 is object  
		
	}

}
