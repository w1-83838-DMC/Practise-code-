// serialization and deserialization 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Employee implements Serializable
{
	private String name;
	private int age;
	private long salary;
	public Employee() {
		super();
		
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
public class Day14_3 {
	
	static Scanner sc= new Scanner(System.in);
	static String fname="Demo.dat";
	
	static void Readdata() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream obj= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fname))));)
		{
			ArrayList<Employee> e1=(ArrayList<Employee>)obj.readObject();
			for(Employee i: e1)
			{
				System.out.println(i + "\t");
			}
		}
		
	}
	
	static void Writedata() throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream os= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fname))));)
		{
			Employee e1= new Employee("Ajay",43,65000);
			Employee e2= new Employee("Ramakant",65,890000);
			Employee e3= new Employee("Surse",54,20000);
			Employee e4= new Employee("Su",34,78000);
			
			ArrayList<Employee> al= new ArrayList<Employee>();
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
			
			os.writeObject(al);
			System.out.println("Object is created : ");
		}
	}
	static int menuchoice()
	{
		System.out.println("0. Exit 1. WriteData 2. ReadData ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		int choice;
		while((choice=menuchoice())!=0)
		{
			switch(choice)
			{
				case 1:
					Writedata();
					break;
				case 2:
					Readdata();
					break;
			}
			
		}
		
	}

}
