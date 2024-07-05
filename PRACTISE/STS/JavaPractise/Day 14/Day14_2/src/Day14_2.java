import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

// Transient means when we don't want to do serialization as well as deserialization particular filed will be private 
class Employee implements Serializable
{
	private String name;
	private int age;
	private transient double salary;
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
public class Day14_2 {
	
	static Scanner sc= new Scanner(System.in);
	static String fname="Demo.dat";
	
	static void WriteData() throws IOException
	{
		try(ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fname))));)
		{
			Employee e1= new Employee("Ajay",34,34000);
			os.writeObject(e1);  // serialization
			System.out.println("Object is Written inside the file ");
			
		}
	}
	static void ReadData() throws ClassNotFoundException, IOException
	{
		try(ObjectInputStream oi= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fname))));)
		{
			Employee e1=(Employee) oi.readObject(); // deserialization 
			System.out.println(e1 + "\t");
			
		}
		
	}
	static int menuchoice()
	{
		System.out.println("0. Exit 1.WriteData 2. ReadData : ");
		return sc.nextInt();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int choice;
		while((choice=menuchoice())!=0)
		{
			switch(choice)
			{
				case 1:
					WriteData();
					break;
				case 2:
					ReadData();
					break;
			}
			
		}
		
	}

}
