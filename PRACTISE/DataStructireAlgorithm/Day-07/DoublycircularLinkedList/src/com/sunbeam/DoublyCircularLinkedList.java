package com.sunbeam;

import java.util.Scanner;

public class DoublyCircularLinkedList {
	public static void main(String[] args) {
		List list= new List();
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Add 2. Display");
		int choice=0;
		do {
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					list.addNode(23);
					break;
				case 2: 
					list.display();
					break;
			}
			
		}while(choice!=0);
		
	}

}
