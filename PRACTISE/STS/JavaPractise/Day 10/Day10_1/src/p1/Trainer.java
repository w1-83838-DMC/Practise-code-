package p1;

public class Trainer extends Person{
	int tid;
	String department;
	
	Trainer()
	{
		
	}
	Trainer(String name, int age,int tid, String department)
	{
		super(name,age);
		this.tid=tid;
		this.department=department;
		
	}
	public void setTid(int tid)
	{
		this.tid=tid;
		
	}
	public void setDepartment(String department)
	{
		this.department= department;
		
	}
	public int getTid()
	{
		return tid;
	}
	
	public String getdepartment()
	{
		return department;
	}
	
	public String toString()
	{
		return " tid "+ tid + " Department " + department;
	}
	public void test()
	{
		System.out.println("Inside Trainer class Method ");
		
	}
	public void displayDetails(String module)
	{
		System.out.println("The module is " + module);
		
	}
	
	

}
