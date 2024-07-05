import java.util.Scanner;

class product
{
	private int pid;  // filed of the class
	private int price ;
	private String name;
	private String compamyname;
	private String location;
	
	product() // parameterless constructor
	{
		this.pid=123;
		this.price=10000;
		this.name="Ajay";
		this.compamyname="SUNBEAM";
		this.location="Akurdi";
		
	} 
	product(int pid, int price,String name, String companyname, String location) // parameterized constructor
	{
		this.pid=pid;
		this.price=price;
		this.name=name;
		this.compamyname=companyname;
		this.location=location;
	}
	void accepct()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the product id : ");
		this.pid=sc.nextInt();
		System.out.println("Enter the Price : ");
		this.price=sc.nextInt();
		System.out.println("Enter the Name : ");
		this.name=sc.next();
		System.out.println("Enter the CompanyName : ");
		this.compamyname=sc.next();
		System.out.println("Enter the Location : ");
		this.location=sc.next();	
	}
	
	int callprice(int quantity)
	{
		int totalprice=quantity*this.price;
		return totalprice;
		
	}
	void display()
	{
		System.out.println("product id = " + pid + "Product price " + price + " product name = " + name + " companyname = " + compamyname + " Location = "+ location);
	}
	
}
public class Day3_13 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		product p1=new product();
//		p1.display();
		product p2= new product();
		p2.accepct();
		p2.display();
		System.out.println("Enter the price Quantity :");
		int quantity=sc.nextInt();
		int totalprice=p2.callprice(quantity);
		System.out.println("Total price is "+totalprice);
		
	}

	
	

}
