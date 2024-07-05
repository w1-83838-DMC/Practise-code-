package com.sunbeam;

import java.util.Scanner;

public class BStreeMain {
	public static void main(String[] args) {
		BStree bstree= new BStree();
		Scanner sc= new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("0.add 2.Display");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					bstree.addNode(10);
					bstree.addNode(20);
					break;
				case 2: 
					bstree.preorder();
					break;
				case 3: 
					bstree.inorder();
					break;
				case 4: 
					bstree.binarysearch(2);
					break;
			}
			
			
		}while(choice!=0);
	}

}
	

