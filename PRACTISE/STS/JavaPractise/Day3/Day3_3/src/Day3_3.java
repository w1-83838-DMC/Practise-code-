import java.util.Scanner;

class Employee
{
	int empid; // filed of class Employee
	float salary; // filed of class Employee
	
	void accepctData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Employee id : ");
		this.empid=sc.nextInt();
		System.out.println("Enter Your Employee Salary :");
		this.salary=sc.nextFloat();
	}
	void display()  // method instance method
	{
		System.out.println("Employee id "+ this.empid + " Employee salary "+ this.salary );
		
	}
}// end of scope of class Employee
public class Day3_3 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.accepctData();  // "this" keyword will hold the e1 object
		e2.accepctData();  // "this" keyword will hold the e2 object
		e1.display(); 
		e2.display();
		Employee e3= new Employee();
		e3=e1;
		e3.display();
	}

}
