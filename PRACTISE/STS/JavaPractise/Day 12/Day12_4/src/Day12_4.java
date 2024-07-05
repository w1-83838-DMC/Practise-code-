import java.util.ArrayList;

class Employee
{
	String name;
	int empid;
	public Employee()
	{
		
	}
	public Employee(String name,int empid)
	{
		this.name= name;
		this.empid= empid;
	}
	// to String() method
	public String toString()
	{
		return "Employee Name: " + this.name+ " Employee id: "+ this.empid;
				
	}
}

public class Day12_4 {
	public static void main(String[] args)
	{
		ArrayList<Employee>a1= new ArrayList<Employee>();
		Employee e1= new Employee("Ajay",123);
		Employee e2= new Employee("Ramakant",455);
		Employee e3= new Employee("Surse",234);
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		//System.out.println(e1); // toString method get called from Employee class if ToString method is not overridden from object class the n toString() method gets calls from object class 
	
		//System.out.println(e1);  //Employee@58d25a40
		for(Employee i: a1)
		{
			System.out.println(i+"\t");
		}
	}

}
