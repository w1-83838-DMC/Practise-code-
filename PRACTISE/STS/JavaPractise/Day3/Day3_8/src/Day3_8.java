class Employee
{
	/*By default empid and salary will give package level visibility*/
	int empid;
	float salary;
	Employee()
	{
		this.empid=83838;
		this.salary=15000;	
	}
	Employee(int empid, float salary) // parameterized constructor
	{
		this.empid=empid;
		this.salary=salary;
		
	}
	void display()
	{
		System.out.println(" Employee id :- "+ this.empid + " Employee Salary:-  " + this.salary);
	}
}
public class Day3_8 {

	public static void main(String[] args) 
	{
		Employee e1= new Employee(); // parameterless constructor gets called automatically
		Employee e2= new Employee(87900,12000); // parameterized Constructor gets called Automatically 
		e1.display();
		e2.display();
	
	}

}
