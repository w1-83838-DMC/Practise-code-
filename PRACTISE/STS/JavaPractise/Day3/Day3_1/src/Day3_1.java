import java.util.Scanner;

class Employee
{
	int empid;  // filed of a class 
	float salary;  // filed of a class
	
	void accepctData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee id : ");
		empid=sc.nextInt();
		System.out.println("Enter the Emloyee Salary : ");
		salary=sc.nextFloat();
	}
	void displayData()
	{
		System.out.println("Employee id "+ empid + " Salary "+salary);
	}
	
	
	
}
//public class Day3_1
//{
//	public static void main(String[] args) 
//	{
//		Employee e1=new Employee();
//		e1.accepctData();
//		Employee e2=new Employee();
//		e2.accepctData();
//		e1.displayData();
//		e2.displayData();
//		
//	}	
//}

//public class Day3_1
//{
//	public static void main(String[] args) {
//		Employee e1;
//		e1.accepctData();  // Compliue time error (Javc error)
//		e1.displayData();
//	}
//}


//public class Day3_1
//{
//	public static void main(String[] args) {
//		Employee e1=null;
//		e1.accepctData();  // NULLPointerException present in java.lang package 
//		e1.displayData();
//		
//	}
//}

//public class Day3_1
//{
//	public static void main(String[] args) {
//		Employee e1;  // Local Reference variable // local variable // uninitialized
//		e1=new Employee(); // initialization
//		e1.accepctData();
//		e1.displayData();
//	}
//}

/*Null pointer Exception Thrown when an appiication 
 Attempt to use Null in a case Where an object is required
 Calling an instance method of a null object
 Accessing or modifying the filed of null object
 * */

public class Day3_1
{
	public static void main(String[] args) {
		Employee e1=null;
		e1=new Employee();   // Allocating a memory to Null reference
		e1.accepctData();
		e1.displayData();
		
	}
}


