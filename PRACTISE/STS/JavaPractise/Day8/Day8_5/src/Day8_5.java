//import java.util.Scanner;
//
//class person
//{
//	String name;
//	int age;
//	
//	person()
//	{
//		this.name="Ajay";
//		this.age=19;
//	}
//	void accepct()
//	{
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Name : ");
//		this.name=sc.next();
//		System.out.println("Enter the Age : ");
//		this.age=sc.nextInt();
//		
//	}
//	void display()
//	{
//
//		System.out.println(" Name " + this.name + " Age "+ this.age);
//	}
//	
//}
//class Employee extends person
//{
//	int empid;
//	int salary;
//	
//	Employee()
//	{
//		this.empid=999;
//		this.salary=19000;
//	}
//	void accepct()
//	{
//		super.accepct();
//		System.out.println("Enter the Employee id : ");
//		Scanner sc= new Scanner(System.in);
//		empid=sc.nextInt();
//		System.out.println("Enter the Salary : ");
//		salary=sc.nextInt();
//	}
//	void display()
//	{
//		super.display();
//		System.out.println(" empid "+empid  +" salary "+salary);
//	}
//	
//}
//public class Day8_5 
//{
//	public static void main(String[] args) {
//		Employee e1= new Employee();
//		e1.accepct();
//		e1.display();
//		
//		
//		
//	}
//
//}

// parameterless constructor of super gets automatically 
// from the parameterless constructor of sub class

import java.util.Scanner;

class person
{
	String name;
	int age;
	
	person()
	{
		super();
		
	}
	void accepct()
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name : ");
		this.name=sc.next();
		System.out.println("Enter the Age : ");
		this.age= sc.nextInt();
		
	}
	void display()
	{
		System.out.println(" Name "+this.name + " Age "+ this.age);
	}
	
}
class Employee extends person
{
	int empid;
	int salary;
	
	Employee()
	{
		super();
	}
	void accepct()
	{
		super.accepct();
		System.out.println("Enter the Employee id ");
		Scanner sc= new Scanner(System.in);
		this.empid=sc.nextInt();
		System.out.println("Enter the Employee Salary ");
		this.salary=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println(" empid "+this.empid + " salary "+this.salary);
	}
	
}
public class Day8_5
{
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.accepct();
		e1.display();
		
	}
}

