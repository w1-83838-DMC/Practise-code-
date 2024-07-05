package p1;

public class Employee extends Person{
	private int empid;
	private String department;
	
	Employee()
	{
		super();
		
	}
	public Employee(String name, int age,int empid,String department)
	{
		super(name,age);
		this.empid=empid;
		this.department=department;
	}
	public String toString()
	{
		System.out.println(super.toString());
		return " Employee id "+ this.empid + " Department " + this.department;
	}
	public void display()
	{
		super.display();
		System.out.println(" Empid "+ this.empid + " department "+ this.department);
	}
	
	
	
	

}
