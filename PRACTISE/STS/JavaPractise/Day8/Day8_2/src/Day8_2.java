// calling super class method inside the sub class method only

import java.util.Scanner;

class person
{
	String name;
	int age;
	
	void personaccepct() // method overriding 
	{
		System.out.println("Enter the Name : ");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter the Age : ");
		age= sc.nextInt();
	}
	void persondisplay()
	{
		System.out.println("Name "+ this.name + " Age "+ this.age);
	}
}
class Employee extends person
{
	int empid;
	int salary;
	Scanner sc= new Scanner(System.in);
	void accepct()
	{
		super.personaccepct();
		System.out.println("Enter the Employee id : ");
		empid=sc.nextInt();
		System.out.println("Enter the Employee Salary : ");
		salary=sc.nextInt();
	}
	void display()
	{
		super.persondisplay();
		System.out.println("Empid  "+ this.empid + " Salary "+ this.salary);
	}
	
}
public class Day8_2 {
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.accepct();
		e1.display();
		
	}

}
