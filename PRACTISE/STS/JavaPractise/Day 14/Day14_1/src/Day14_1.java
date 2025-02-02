// Serialization and deserialization

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable

{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private long salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int age, long salary) {
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
}

public class Day14_1 
{
	static Scanner sc= new Scanner(System.in);
	static String fname="File.dat";
	
	public static void WriteData() throws IOException 
	{
		try(ObjectOutputStream os= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fname))));)
		{
			Employee e1= new Employee("Ajay",45,340000); // serialization 
			os.writeObject(e1); 
			System.out.println("Objects is Written inside the file : ");
		
			
		}
		
	}
	public static void ReadData() throws ClassNotFoundException, IOException 
	{
		try(ObjectInputStream oi= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fname))));)
		{
			Employee e1=(Employee)oi.readObject();
			System.out.println(e1);
		}
		
	}
	static int menuchoice()
	{
		System.out.println("0. Exit 1. Writedata 2. Readdata ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
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
