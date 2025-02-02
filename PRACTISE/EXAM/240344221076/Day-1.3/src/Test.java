import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class execptionoccured extends Exception
{
	public execptionoccured() {
		System.out.println("Exception Occured : ");
	}
}

class item implements Serializable
{
	private String name;
	private int price;
	private int quantity;
	public item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public item(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}

public class Test {
	
	static Scanner sc= new Scanner(System.in);
	static String fname ="Demo.dat";
	static ArrayList<item>al= new ArrayList<item>();
	
	public static void Adddata() throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fname))));)
		{
			item it1= new item("Ajay",100,1);
			item it2= new item("jay",100,1);
			item it3= new item("Akshay",100,1);
			al.add(it1);
			al.add(it2);
			al.add(it3);
			dos.writeObject(al);
			System.out.println("Object is added");
			
		}
	}
	public static void Readdata() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream oi= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fname))));)
		{
			@SuppressWarnings("unchecked")
			ArrayList<item>al=(ArrayList<item>)oi.readObject();
			for(item i: al)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		System.out.println("1. ADDData 2. ReadData 3.SearchByname 4.Removeitem 5.calculateProduct  ");
			int choice;
			try {
			do
			{
				Scanner sc= new Scanner(System.in);
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:
						Adddata();
						break;
					case 2:
						Readdata();
						break;
					case 3:
						System.out.println("Enter the Name : ");
						String name= sc.next();
						for(item i: al)
						{
							if(i.getName().equalsIgnoreCase(name))
							{
								System.out.println("The name is present");
								break;
							}
							else
							{
								throw new execptionoccured();
							}
						}
					case 4:
						System.out.println("Remove item : ");
						int index= sc.nextInt();
						al.remove(index);
						break;
					case 5:
						System.out.println("Print ");
						for(item i: al)
						{
							System.out.println(i);
						}
						break;
					case 6:
						System.out.println("total all products : ");
						int total=0;
						for(item i: al)
						{
							total=total+i.getPrice()*i.getQuantity();
						}
						System.out.println("Total "+ total);
						break;
				}
				
			}while(choice!=0);
			}catch(execptionoccured e)
			{
				
			}
		}
}