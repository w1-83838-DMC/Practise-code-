package com.sunbeaminfo.tester;

import java.util.Scanner;

import com.sunbeaminfo.products.*;
public class product {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the choice : 1. Mobile 2. Laptop 3. Watch");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				Mobile m1= new Mobile();
				m1.accepct();
				m1.display();
				System.out.println("Enter the Name : ");
				String newname=sc.next();
				m1.setName(newname);
				System.out.println(m1.getName());
				break;
			case 2:
				laptop lp= new laptop();
				lp.accepct();
				lp.accepct();
				lp.display();
				break;
			case 3:
				Watch w1= new Watch();
				w1.accepct();
				w1.display();
				break;
		}
	

		
	}

}
