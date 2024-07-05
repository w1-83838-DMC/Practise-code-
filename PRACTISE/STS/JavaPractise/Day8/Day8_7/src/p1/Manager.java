package p1;

public class Manager extends Employee{
	private int managerid;
	private int salary;
	
	Manager()
	{
		super();
		
	}
	Manager(String name,int age,int empid, String department,int managerid,int salary)
	{
		super(name,age,empid,department);
		this.managerid=managerid;
		this.salary=salary;
	}
//	public String toString()
//	{
//		super.toString();
//		return "Managerid "+ managerid + " Salary " +salary;
//	}
	
	public void display()
	{
		super.display();
		System.out.println(" Manager id "+ this.managerid + " Salary "+ this.salary);
	}
	@Override
	public String toString() {
		System.out.println(super.toString());		
		return "Manager [managerid=" +this.managerid + ", salary=" + this.salary + "]";
	}

}
