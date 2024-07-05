class Employee
{
	String name;
	int age;
	int empid;
	String department;
	String Designation;
	
	Employee()
	{
		System.out.println("Parameter less Constructor ");
		this.name="Ajay";
		this.age=19;
		this.empid=83838;
		this.department="DMC";
		this.Designation="SOFTWARE DEVELOPMENT";
	}
	Employee(String name,int age, int empid, String department, String Designation)
	{
		System.out.println("Parameterised Constructor ");
		this.name=name;
		this.age=age;
		this.empid=empid;
		this.department=department;
		this.Designation=Designation;
		
	}
	void display() // facilator
	{
		System.out.println("Employee name-: "+ this.name + " Employee age-: "+ this.age + " Employee id-: "+this.empid + " Employee Department-: "+this.department + " Employee Designation-: "+this.Designation);
		
	}
	
}
public class Day3_7 {

	public static void main(String[] args) {
		Employee e1= new Employee(); // object is created Constructor gets called Automatically
		Employee e2= new Employee("Akashay",20,84845,"DMC","SOFTWARE DEVELOPMENT ");
		e1.display();
		e2.display();
		
		
		

	}

}
