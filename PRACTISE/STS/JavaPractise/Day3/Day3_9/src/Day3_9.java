/*getter and setter method  getter (inspector) setter(Mutable) if we wish to modify the private filed of the object then we write setter and getter These are the member function of the class defined inside the class */

import java.util.Scanner;
class Employee
{
	private int empid;
	private int salary;
	
	Employee() // parameterless constructor
	{
		this.empid=1;
		this.salary=980000;
	}
	Employee(int empid, int salary)
	{
		this.empid=empid;
		this.salary=salary;
	}
	void setsalary(int newsalary)
	{
		this.salary=newsalary;
		
	}
	int getsalary()
	{
		return this.salary;
	}
	void setempid(int empid)
	{
		this.empid=empid;
	}
	int getempid()
	{
		return this.empid;
	}
	void display()
	{
		System.out.println("Empid = " + empid + " Employeesalary = " + salary);
	}
	
	
}

public class Day3_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1= new Employee(123,99999);
		e1.display();
		System.out.println("\n Enter the salary : ");
		int newsalary=sc.nextInt();
		e1.setsalary(newsalary);
		e1.display();
		System.out.println("Employee Salary is " + e1.getsalary());
		System.out.println("Enter the Employee id : ");
		int newempid=sc.nextInt();
		e1.setempid(newempid);
		System.out.println("Employee id is " + e1.getempid()+ " Employee salary is "+ e1.getsalary() );

	}

}
