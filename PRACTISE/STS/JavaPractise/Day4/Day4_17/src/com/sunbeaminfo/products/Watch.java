package com.sunbeaminfo.products;

import java.util.Scanner;

public class Watch {
	private int serialno;
	private String brand;
	private String color;
	
	public Watch() // parameterless Constructor 
	{
		this.serialno=6784;
		this.brand="MI";
		this.color="Black";
		
	}
	public Watch(int serialno, String brand, String color) //parameterized Constructor
	{
		this.serialno=serialno;
		this.brand=brand;
		this.color=color;
	}
	
	public void accepct()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Serial no : ");
		serialno=sc.nextInt();
		System.out.println("Enter the Brand : ");
		brand=sc.next();
		System.out.println("Enter the Color : ");
		color=sc.next();
		
	}
	public void display()
	{
		System.out.println("Serial no " + this.serialno + " Brand of watch is "+ this.brand + " Color is "+ this.color);
	}

}
