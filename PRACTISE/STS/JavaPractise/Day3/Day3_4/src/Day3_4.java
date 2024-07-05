/* Default Constructor  Whenever create object of class Constructor gets called automatically Job of constructor is used to initialize  the filed of the object Filed gets initialized as soon as we create object of the class compiler calls the DEFAULT CoMSTRUCTOR
 * */

import java.util.*;
class Employee
{
	int empid; //  filed of Employee class
	float salary; // filed of Employee class
	
	void accepctdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee id ");
		this.empid=sc.nextInt();
		System.out.println("Enter the Salary : ");
		this.salary= sc.nextFloat();
		
	}
	void displaydata()
	{
		System.out.println("Employee id " + empid +" Employee salary "+ salary);
	}
	
	
}

public class Day3_4 {

	public static void main(String[] args) 
	{
		Employee e1= new Employee();
		e1.displaydata();
		e1.accepctdata();
		e1.displaydata();
		

	}

}
