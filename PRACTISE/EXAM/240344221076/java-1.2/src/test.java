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

class itemisnotfount extends Exception
{
	itemisnotfount()
	{
		System.out.println("Exception Occured !");
	}
	
}
class item implements Serializable
{
	private String name;
	private double price;
	private int quantity;
	public item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public item(String name, double price, int quantity) {
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
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
public class test
{
	static Scanner sc= new Scanner(System.in);
	static String fname="Demo.dat";
	static ArrayList<item>al= new ArrayList<item>();
	
	static void WriteData() throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream( new FileOutputStream(new File(fname))));)
		{
			item i1= new item("Ajay",4.8,9);
			item i2= new item("Jay",9.8,6);
			item i3= new item("yash",8.5,8);
			
			al.add(i1);
			al.add(i2);
			al.add(i3);
			os.writeObject(al);
			System.out.println("Object is Created!");
		}
		
	}
	
	static void ReadData() throws ClassNotFoundException, IOException
	{
		try(ObjectInputStream oi= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fname))));)
		{
			@SuppressWarnings("unchecked")
			ArrayList<item>al=(ArrayList<item>) oi.readObject();
			for(item i:al)
			{
				System.out.println(i);
			}
		}
	}
		
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		try
		{
			int choice;
			do
			{
				System.out.println("1.WriteData  2. ReadData  3. searchByname 4. Removeitem  5.Display 6.calculate all products 7. Product of salary   ");
				Scanner sc= new Scanner(System.in);
				choice=sc.nextInt();
				
				switch(choice)
				{
					case 1:
						System.out.println("Adding ");
						WriteData();
						break;
					case 2:
						System.out.println("Fetching ");
						ReadData();
						break;
					case 3:
						System.out.println("Enter the data : ");
						String name=sc.next();
						for(item i: al)
						{
							if(i.getName().equals(name))
							{
								System.out.println("Got it");
								break;
							}else
							{
								 throw new itemisnotfount();
							}
						}
				
						break;
						
					
					case 4:
						System.out.println("Remove item ");
						int index=sc.nextInt();
						al.remove(index);
						break;
					case 5:
						System.out.println("To display all items ");
						for(item i: al)
						{
							System.out.println(i);
						}
						break;
					case 6:
						System.out.println("additio of salary: ");
						double total=0;
						double salary=0;
						for(item i:al)
						{
							salary=i.getPrice();
							total=total+salary;
						}
						System.out.println("Total is "+ total);
					
					case 7:
						double product=1;
						System.out.println("Product of salary :");
						for(item i: al)
						{
							product=product*i.getPrice();
						}
						System.out.println("Product of price is "+ product);
						
				}
		}while(choice!=0);
		}catch(itemisnotfount e)
		{
			System.out.println("Ecxepction is ocuured please enter the choice:  ");
			
		}
	 
}
}