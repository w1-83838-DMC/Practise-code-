package com.sunbeaminfo.products;

import java.util.Scanner;

public class Mobile {
	// filed of the class 
	private int serialno;
	private String name;
	private String color;
	private String charger;
	
	public Mobile() // parameterless constructor
	{
		serialno=12345;
		name="Redmi";
		color="Blue";
		charger="C-type";
	}
	public Mobile(int serialno, String name, String color, String charger)
	{
		this.serialno=serialno;
		this.name=name;
		this.color=color;
		this.charger=charger;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void accepct()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Serial no: ");
		serialno=sc.nextInt();
		System.out.println("Enter the name : ");
		name=sc.next();
		System.out.println("Enter the Color : ");
		color= sc.next();
		System.out.println("Enter the Charger: ");
		charger=sc.next();
		
	}
	public void display()
	{
		System.out.println("Serial No " + this.serialno + " Name "+ this.name + " color "+ this.color + " Charger "+this.charger );
	}

	

}
