package com.sunbeam;

import java.util.Scanner;

public class DoublyCircularLinkedMain {
	public static void main(String[] args) {
		List3 list= new List3();
		Scanner sc= new Scanner(System.in);
		System.out.println("0. Exit 1. Add 2. Display 3. Delete ");
		int choice=0;
		do {
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: list.addFirst(13); 
				list.addFirst(56);
				list.addFirst(78);
				break;
				
				case 2: 
					list.display();
					break;
				case 3: 
					list.addLast(100);
					break;
				case 4: 
					list.addposition(890, 3);
					break;
				case 5: 
					list.deletefirst();
					break;
			}
			
			
		}while(choice!=0);
		
	}

}
