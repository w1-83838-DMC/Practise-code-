package com.sunbeam;

import java.util.Scanner;

public class DoublyLinearLinkedMain {
	public static void main(String[] args) {
		List2 list= new List2();
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Addnewnode 2.Display ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					list.addfirst(34);
					list.addfirst(56);
					list.addfirst(78);
					list.addfirst(98);
					list.addfirst(23);
					break;
				case 2: 
					list.Fdisplay();
					break;
				case 3: 
					list.addLast(100);
					break;
				case 4:
					list.deletefirst();
					break;
				case 5: 
					list.deleteLast();
					break;
				case 6: 
					list.Rdisplay();
					break;
			}
			
			
		}while(choice!=0);
	}

	

}
