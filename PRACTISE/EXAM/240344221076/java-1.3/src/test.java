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

class castExcepction extends Exception
{
	public castExcepction() {
		System.out.println("Exception Occured ");
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
	public void accepctData()
	{
		System.out.println("Enter the Name : ");
		name=sc.
	}
	@Override
	public String toString() {
		return "item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
public class test {
	
	static Scanner sc= new Scanner(System.in);
	static String fname="Demo.dat";
	static ArrayList<item>al= new ArrayList<item>();
	
	public static void accepctData() throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream os= new ObjectOutputStream (new BufferedOutputStream(new FileOutputStream(new File(fname))));)
		{
//			item i1= new item("Ajay",1.0,12);
//			item i2= new item("jay",8.9,65);
//			item i3= new item("abhi",6.3,10);
//			al.add(i1);
//			al.add(i2);
//			al.add(i3);
//			os.writeObject(al);
			item i= new item();
			accepct();
			System.out.println("Object is added !");
			
		}
	}
	public static void readData() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fname))));)
		{
			ArrayList<item>al=(ArrayList<item>) oi.readObject();
			for(item i: al)
			{
				System.out.println(i);
			}
			
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		System.out.println("1. Adddata 2.Readdata 3. searchbyname 4.Removeitem 5.calculate all productsprice ");
		try
		{
			int choice;
			do {
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:
						accepctData();
						break;
					case 2:
						readData();
						break;
					case 3:
						System.out.println("Enter the Index: ");
						int index= sc.nextInt();
						al.remove(index);
						break;
					case 4:
						for(item i: al)
						{
							System.out.println(i);
						}
					
					case 5:
						System.out.println("Enter the Name : ");
						String searchname=sc.next();
						for(item i:al)
						{
							if(i.getName().equals(searchname))
							{
								System.out.println("Got it");
								break;
							}else
							{
								 throw new castExcepction();
							}
						}
						break;
					case 6:
						System.out.println("Calculate total price : ");
						double total=0;
						for(item i:al)
						{
							total=total+i.getPrice()*i.getQuantity();
							
						}
						System.out.println("Total is "+ total);
					break;
						
				}
			}while(choice!=0);
		}catch(castExcepction e)
		{
			System.out.println("Exception Occured ");
			
		}
		
		
	}

}
