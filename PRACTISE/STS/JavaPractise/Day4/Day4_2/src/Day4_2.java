/* To string() is overridden inside the class Employee It is going to call toString() From Employee class */

import java.util.*;

class employee
{
	private String name;
    private String department;
	private String designation;
	private int empid;
	private float salary;
	
	public employee()  // parameterless Constructor
	{
		this.name=" Ajay";
		this.department=" DMC";
		this.designation=" Software Developer";
		this.empid= 83838;
		this.salary=890000;
	}
	public employee(String name, String department, String designation, int empid, float salary)
	{
		this.name=name;
		this.department=department;
		this.designation=designation;
		this.empid=empid;
		this.salary=salary;
		
	}
	void setEmployeename(String name)
	{
		this.name=name;
		
	}
	void display()
	{
		System.out.println(" Employee name= "+this.name + " Employee Department= "+this.department + " Employee Designation= "+this.designation + " Employee id= " + this.empid + " Employee salary= " + this.salary);
	}
}



public class Day4_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		employee e1= new employee(); // parameterless constructor get's called automatically when we create the object of employee class 
		e1.display();
		employee e2 = new employee("Kalpesh","CS","NDA",100,87000); // parameterized Constructor gets called we are passing the Arguments to object
		e2.display();
		System.out.println("Enter New Name : ");
		String newname=sc.next();
		e2.setEmployeename(newname);
		e2.display();
		
	}

}
