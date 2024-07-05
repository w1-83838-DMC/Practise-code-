package p1;

import java.util.Scanner;

public class product {
	private int productid;
	private int price;
	private String name;
	private String companyname;
	private String location;
	
	product()  //parameterless Constructor
	{
		productid=83838;
		price=115000;
		name="Ajay";
		companyname="Sunbeam";
		location="Hinjawadi";
	}
	product(int productid, int price, String name,String companyname,String location)
	{
		this.productid=productid;
		this.price=price;
		this.name=name;
		this.companyname=companyname;
		this.location=location;
	}
	public String toString()
	{
		return " Product id " + this.productid + " price " + this.price + " Name is " + this.name + " Company Name is " + this.companyname + " Location is " + this.location; 
	}
	void accepctdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the productid : ");
		productid=sc.nextInt();
		System.out.println("Enter the Price : ");
		price=sc.nextInt();
		System.out.println("Enter the Name : ");
		name=sc.next();
		System.out.println("Enter the Company Name : ");
		companyname=sc.next();
		System.out.println("Enter the Location : ");
		location=sc.next();
		
	}
	int calPrice(int quantity)
	{
		int value= this.price*quantity;
		
		return value;		
	}
	void display()
	{
		System.out.println(" Product id " + this.productid + " price " + this.price + " Name is " + this.name + " Company Name is " + this.companyname + " Location is " + this.location); 
		
	}
}
