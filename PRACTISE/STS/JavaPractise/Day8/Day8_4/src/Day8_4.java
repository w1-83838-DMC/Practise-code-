/* Parameterless Constructor call*/

import java.util.Scanner;

class Person
{
	String name;
	int age;
	
	Person()
	{
		this.name="Ajay";
		this.age=19;
	}
	void accepct()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name=sc.next();
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name "+ this.name + " age "+ this.age);
	}
	public String toString()
	{
		return "Name "+name + "Age "+age;
	}
	
}
class Employee extends Person
{
	int employee;
	int salary;
	
	Employee() // parameterless Constructor
	{
		super();
		this.employee=134;
		this.salary=89000;	
	}
	void accepct()
	{
		super.accepct();
		System.out.println("Enter the Employee id : ");
		Scanner sc= new Scanner(System.in);
		employee=sc.nextInt();
		System.out.println("Enter the Employee Salary : ");
		salary= sc.nextInt();
		
	}
	void display()
	{
		super.display();
		System.out.println("Employee "+employee + " Salary "+salary);
	}
	public String toString()
	{
		return "Employee"+ this.employee+ " Salary" + this.salary;	
	}
	
}

public class Day8_4 
{
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.accepct();
		e1.display();
		
	}

}
