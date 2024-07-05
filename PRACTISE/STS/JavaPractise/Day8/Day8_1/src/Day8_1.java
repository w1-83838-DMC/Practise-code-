/* Calling Base class Method with the help of derived class object inside main() */

import java.util.Scanner;

class person
{
	String name;
	int age;
	
	void accepctpersondata()
	{
		System.out.println("Enter the Name of person : ");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter the Age of person  :  ");
		age= sc.nextInt();
	}
	void display()
	{
		System.out.println("Name " + this.name + " Age "+ this.age);
	}
	
}
class Employee extends person
{
	int empid;
	int salary;
	void accepctData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Empid : ");
		empid=sc.nextInt();
		System.out.println("Enter the Salary : ");
		salary=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Employee id "+ this.empid + " Employee salary " + this.salary);
	}
}


public class Day8_1 {
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.accepctpersondata();
		e1.accepctData();
		e1.display();
		
	}

	
	
}
