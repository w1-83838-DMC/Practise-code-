class Employee
{
	// filed of Employee class 
	String name; // non-primitive 
	int empid; // primitive 
	float salary; // primitive
	
	Employee()
	{
		this.name="Ajay";
		this.empid=83838;
		this.salary=78000;
	}
	
	void display()  // facilator
	{
		System.out.println(" Name = " + name + " Employee id = " + empid + " Salary = " + salary);
	}
	
}
public class Day3_5 
{
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.display();  // null 
		
		// e1 object is created As soon as Constructor get called Automatically 
		
		Employee e2= new Employee();
		e2.display();
		
		
	}

}
