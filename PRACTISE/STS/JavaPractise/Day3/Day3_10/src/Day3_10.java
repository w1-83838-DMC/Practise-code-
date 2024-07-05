/* Inside the class following are types of methods  1. Constructor 2. Getter 3. setter 4. Facilator(Void display)*/
import java.util.*;
class Employee 
{
	/*Private filed EMployee class*/
	private String name;
	private int age;
	private int empid;
	private String department;
	private String Designation;
	
	Employee()  // parameterless Constructor
	{
		this.name="Ajay";
		this.age=24;
		this.empid=838388;
		this.department="SOFTWARE DEVELOPMENT";
		this.Designation="Apllication development";
		
	}
	Employee(String name, int age, int empid, String department, String Designation) // parameterized Constructor
	{
		this.name=name;
		this.age=age;
		this.empid=empid;
		this.department=department;
		this.Designation=Designation;
		
	}
	void setName(String setName)
	{
		this.name=setName;
	}
	void setDepartment(String newDepartment)
	{
		this.department=newDepartment;
		
	}
	String getDepartment()
	{
		return this.department;
	}
	String getName()
	{
		return this.name;
	}
	void display() // facilator
	{
		System.out.println("Employee Name : " + this.name + " Employee Age : "+ this.age + " Employee id : "+ this.empid + " Employee Department "+this.department + " Employee Designation:"+this.Designation);
		
	}
	
}

public class Day3_10 {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		Scanner sc= new Scanner(System.in);
		e1.display();
		Employee e2= new Employee("jay",23,83838,"SDE","SOFTWARE");
		e2.display();
		System.out.println("Enter the New Name : ");
		String newName=sc.next();
		e2.setName(newName);
		System.out.println("The New name "+ e2.getName());
		System.out.println("Enter the New Department : ");
		String newDepartment=sc.next();
		e2.setDepartment(newDepartment);
		
		
		System.out.println("The New Department is "+ e2.getDepartment());
		
		
		

	}

}
