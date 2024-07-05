// private filed 

/* Method of the class can access the filed of the class directly*/
class Employeee
{
	private int empid;
	private float salary;
	
	Employeee()  // parameterless constructor
	{
		this.empid=83839;
		this.salary=100000;
	}
	Employeee(int empid, float salary) // parameterized constructor
	{
		this.empid=empid;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("employee id "+ this.empid + "Employee salary " + this.salary);
	}
}

public class Day3 {
	public static void main(String[] args) {
		Employeee e1= new Employeee(83838,95000);
		Employee e2 = new Employee(469,45000);
		e1.display();
		e2.display();
	}

}

/*If we wish to set or update the value of private filed then we should go for setter and getter  method*/
