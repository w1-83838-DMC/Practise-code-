package com.sunbeam;

import java.util.Scanner;

public class SinglyLinearLinkedListMain {
	public static void main(String[] args) 
	{
		List l1= new List();
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0.Exit \n 1.AddLinkedList 2.Display 3. Add Last 4. DeleteFirst 5.DeleteLast 6.addposition 7.deleteposition 8.Delete ");
			System.out.println("Enter choice ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					l1.addFirst(40);
					l1.addFirst(30);
					l1.addFirst(20);
					l1.addFirst(10);
					break;
				case 2: 
					l1.display();	
					break;
				// add last 
				case 3: 
					l1.addLast(70);
					break;
				case 4: 
					l1.deleteFirst();
					break;
				case 5: 
					l1.deleteLast();
					break;
				case 6:
					l1.addposition(100, 3);
					break;
				case 7: 
					l1.deleteposition(3);
					break;
				case 8: 
					l1.deletAll();
					break;
					
			}
			
		}while(choice!=0);
		
	}

}
