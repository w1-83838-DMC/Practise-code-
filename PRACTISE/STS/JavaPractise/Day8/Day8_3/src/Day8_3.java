import java.util.Scanner;

class person
{
	String name;
	int age;
	void accepctName()
	{
		System.out.println("Enter the Name : ");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
	}
	void displayperson()
	{
		System.out.println("Name " + this.name + " Age "+ this.age);
	}
	
}
class Employee extends person
{
	int empid;
	int salary;
	void accepctEmployee()
	{
		this.accepctName();
		System.out.println("Enter the Employee id : ");
		Scanner sc= new Scanner(System.in);
		empid=sc.nextInt();
		System.out.println("Enter the Salary : ");
		salary=sc.nextInt();
	}
	void display()
	{
		this.displayperson();
		System.out.println("Employeeid " + this.empid + " Salary "+ this.salary);
	}
}
public class Day8_3 {

	public static void main(String[] args) {
		Employee eobj= new Employee();
		eobj.accepctEmployee();
		eobj.display();
		
	}
}
