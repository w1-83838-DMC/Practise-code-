import java.util.Scanner;

class Employee
{
	int empid;  // filed
	float salary; // filed
	
	void accepctData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee id :");
		this.empid=sc.nextInt();
		System.out.println("Enter Employee Salary:");
		this.salary=sc.nextFloat();
	}
	void display()  // method
	{
		System.out.println("Employee id "+ empid + " Employee salary "+ salary);
	}
}
public class Day3_2 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.accepctData();  // accepctData() is called upon e1 object 
		// this will hold e1 object
		// this keyword hold the Current Object
		e1.display(); // display is called upon e1 object 
		
		e2.accepctData();  // accepctData is called upon e2 object 
		
		e2.display(); // display() is called upon e2 object
		Employee e3;
		e3=e1;
		e3.display();
	}

}
