package com.sunbeam;

import java.util.Scanner;

public class SinglyCircularLikedList {
	public static void main(String[] args) {
		List1 list= new List1();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println(" 1.Addnewnode 2.Display");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					list.addFirst('A');
					list.addFirst('B');
					list.addFirst('C');
					break;
				case 2: 
					list.display();
					break;
				case 3: 
					list.addLast('D');
					break;
				case 4: 
					list.addposition('E',4);
					break;
				case 5: 
					list.deleteFirst();
					break;
				case 6:
					list.deleteLast();
					break;
				case 7: 
					list.deletePosition(2);
					break;
			}
			
		}while(choice!=0);
		
	}
}
