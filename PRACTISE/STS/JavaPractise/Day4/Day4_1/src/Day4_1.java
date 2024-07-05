/*toString() is not overridden  inside The Employee class */
class employee
{
	private String name;
	private String dept;
	private String designation;
	private int empid;
	private int salary;
	
	employee()
	{
		this.name="Ajay";
		this.dept="DMC";
		this.designation="Software Developer";
		this.empid=4567;
		this.salary=90000;	
	}
	employee(String name,String dept, String designation, int empid, int salary)
	{
		this.name=name;
		this.dept=dept;
		this.designation=designation;
		this.empid=empid;
		this.salary=salary;
	}
	void dispData()
	{
		System.out.println(" Employee Name = "+ this.name +" Employee Department "+this.dept + " Employee Designation "+this.designation +" Employee id "+ this.empid + " Employee Salary "+ this.salary);
	}
}

public class Day4_1 {
	public static void main(String[] args) {
		employee e1=new employee();
		e1.dispData();
		employee e2=new employee("Jay","DAC","SDE",2345,89000);
		e2.dispData();
		employee e3= new employee();
		e3=e2;  // Reference copy
		e3.dispData();
		System.out.println(" E2= "+ e2);// to string method get called from object class
		
		
	}

}
