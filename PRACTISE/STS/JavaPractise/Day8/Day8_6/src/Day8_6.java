import java.util.Scanner;

class person
{
	private String name;
	private int age;
	
	public person()
	{
		super();
	}
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void accepct()
	{
		System.out.println("Enter the Name : ");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println(" Name "+ this.name+ " age "+this.age);
	}
	
	
}
class Employee extends person
{
	private int empid;
	private int salary;
	
	Employee()
	{
		super();
		
	}
	public Employee(String name,int age,int empid,int salary)
	{
		//this.name=name;
		//this.age=age;
		super(name,age); //call to the parameterized constructor from super class 
		this.empid= empid;
		this.salary=salary;
	}
	void accepct()
	{
		super.accepct();
		System.out.println("Enter the Employee id : ");
		Scanner sc= new Scanner(System.in);
		empid= sc.nextInt();
		System.out.println("Enter the Salary : ");
		salary= sc.nextInt();
		
	}
	void display()
	{
		super.display();
		System.out.println(" empid "+ this.empid + " salary "+ this.salary);
	}
	
}
public class Day8_6 {
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.display();
		
		Employee e2= new Employee("Ajay",17,1234,78659);
		e2.display();
		
	}

}
