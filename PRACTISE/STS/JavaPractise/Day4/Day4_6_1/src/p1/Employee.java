package p1;

public class Employee {
	int empid;
	String name;
	
	Employee()
	{
		this.empid=0;
		this.name="Null";
	}
	Employee(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
		
	}
	public String toString()
	{
		return " Employee id = "+this.empid + " Employee Name = "+this.name;
		
	}
}
