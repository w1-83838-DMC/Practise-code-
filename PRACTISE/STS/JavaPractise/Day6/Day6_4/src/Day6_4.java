import java.util.Scanner;

class Employee
{
	String name; // filed of Employee class
	int empid;  // filed of Employee class 
	Employee()
	{
		
	}

	Employee(String name, int empid)  
	{
		this.name=name;
		this.empid=empid;
	}
	void accepct()
	{
		System.out.println("Enter the Name :  ");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter the Employee id ");
		empid=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name = "+name + " empid = "+empid);
	}
}

/*
public class Day6_4 {

	public static void main(String[] args) {
		Employee e1= new Employee("Ajay",83838);
		e1.accepct();
		e1.display();
			
	}

}
*/
/*
public class Day6_4
{
	public static void main(String[] args) {
		Employee e[]= new Employee[4];  // it contians null value 
//		for(Employee row:e)
//		{
//			System.out.println(row);
//		}
		
		int arr[]= new int[5];
//		for(int i : arr)
//		{
//			System.out.print(i + "\t");
//		}
		System.out.println(arr[1]);
		e[1].accepct();
		e[1].display();
	}
}
*/

class Day6_4
{
	public static void main(String[] args) {
		Employee e1[]= new Employee[5]; // array of reference
		e1[0]= new Employee();
		e1[1]= new Employee();
		e1[2]= new Employee();
		e1[3]= new Employee();
		e1[4]= new Employee();
		
//		for(Employee i: e1)
//		{
//			System.out.println(i + "\t");
//		}
//		for(Employee i: e1)
//		{
//			System.out.println(e1);
//		}
		for(Employee i : e1)
		{
			i.accepct();
			i.display();
		
		}
		
		
		
	}
}



