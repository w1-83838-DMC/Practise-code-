// static object 
/*
import java.util.*;
public class Day5_5 
{
	static String name;  // static filed
	static String module; // static filed
	static int empid;     // static filed
	static String dept;   // static filed
	
	static Scanner sc= new Scanner(System.in);
	
	static void m1()
	{
		System.out.println("Please enter your Name ");
		name=sc.next();
		System.out.println("Please Enter empid : ");
		empid=sc.nextInt();
	}
	static void m2()
	{
		System.out.println("Please Enter your Department : ");
		dept= sc.next();
		System.out.println("Please Enter Module ");
		module = sc.next();
	}
	static void displaydata()
	{
		System.out.println(" Name = "+ name + " module = "+module);
		System.out.println(" empid = " + empid + " department =  "+ dept);
	}
	public static void main(String[] args) {
		m1();
		m2();
		displaydata();
	}
	
}
*/

import java.util.Scanner;

public class Day5_5
{
	static String name;
	static String module;
	static int empid;
	static String department;
	
	static Scanner sc;
	

	static 
	{
		 sc= new Scanner(System.in);
		
	}
	static void m1()
	{
		System.out.println("Please Enter the Name : ");
		name=sc.next();
		System.out.println("Please Enter the Empid : ");
		empid=sc.nextInt();
	}
	static void m2()
	{
		System.out.println("Please Enter Your Department : ");
		department= sc.next();
		System.out.println("Please Enter your module ");
		module = sc.next();
	}
	static void display()
	{
		System.out.println("name = "+ name + " empid "+empid);
		System.out.println("Department = "+ department + " module " + module);
	}
	public static void main(String[] args) {
		m1();
		m2();
		display();
	}
	
}
