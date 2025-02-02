/* == operator check reference equality  if two reference points to same memory location it wil return true while in case of (==)    */
class student
{
	int rollno; 
	int marks;
	String name;
	
	student()  // parameterless constructor 
	{
		this.rollno=83838;
		this.marks=100;
		this.name="Ajay";	
	}
	student(int rollno,int marks,String name)
	{
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
		
	}
	void display() // facilator 
	{
		System.out.println("Roll no "+this.rollno + " Marks is "+this.marks + " The Name of employee is "+this.name);
	}
	public String toString() // toString method will provide Quick and partial information 
	{
		return"Name of Employee "+this.name + '\t' +" Marks obtained "+this.marks;
	}
	
	
}

public class Day4_3 {
	public static void main(String[] args) 
	{
		student s1= new student(123456,900,"Jaya");
		student s2= new student(987643,100,"madhuri");
		student s3= new student(456782,345,"Akansha ");
		student s4=s3;  // Reference copy
		System.out.println("s1" + s1);  // it will called to String method 
		System.out.println("s2" + s2);
		System.out.println("s3" + s3);
		
		System.out.println("s1==s2 "+ (s1==s2));
		System.out.println("s2==s3 "+ (s2==s3));  // reference is diffrent
		System.out.println("s1==s3 " + (s1==s3));
		System.out.println("s3==s4 "+ (s3==s4));  // s3 content will store in s4
		
	}

}
