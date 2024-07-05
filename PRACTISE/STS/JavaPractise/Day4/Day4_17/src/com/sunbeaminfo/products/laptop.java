package com.sunbeaminfo.products;

import java.util.Scanner;

public class laptop {
	private int serialno;
	private String brand;
	private String color;
	private String battery;
	
	
	public laptop()
	{
		this.serialno=43678;
		this.brand="Hp-pavilion";
		this.color="Silver platinum";
		this.battery="15000mph";
		
	}
	public laptop(int serialno,String brand, String color, String battery) // parameterized constructor
	{
		this.serialno=serialno;
		this.brand=brand;
		this.color=color;
		this.battery=battery;
		
	}
	public void accepct()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the serialno : ");
		serialno=sc.nextInt();
		System.out.println("Enter the Brand : ");
		brand=sc.next();
		System.out.println("Enter the color : ");
		color=sc.next();
		System.out.println("Enter the Battery ");
		battery=sc.next();
		
		
	}
	public void display()
	{
		System.out.println("Serial No is "+ this.serialno + "Brand is "+ this.brand + "Color is " + this.color + "Battery is " + this.battery);
	}

}
