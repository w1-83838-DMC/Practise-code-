/* Parameterized Constructor Sequence must be followed at the time of creation of object Object shall get initialized with its values */

import java.util.*;
class Employee
{
	String name; // filed of Employee Class Non primitive Type
	int empid;  // filed of Employee class  primitive type  
	float salary; // filed of Employee Class primitive Type 


	Employee()
	{
		System.out.println("Inside parameterless Constructor ");
		this.name="Ajay";
		this.empid= 83838;
		this.salary=34000;
	}
	Employee(String name, int empid, float salary)
	{
		System.out.println("Inside parameter Constrctor ");
		this.name=name;
		this.empid=empid;
		this.salary=salary;

	}
	void accepctdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Employee id : ");
		empid=sc.nextInt();
		System.out.println("Enter Salary : ");
		salary=sc.nextFloat();		
		
	}
	void display()
	{
		System.out.println("Employee Name = "+ this.name + " Employee id = " + this.empid + " Employee salary = "+ this.salary );
	}
}
public class Day3_6 {

	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2= new Employee("Kalpesh",123,90000);
		e1.accepctdata();
		e1.display();
		e2.display();
		Employee e3= new Employee();
		e3.display();
		
		
	}

}
