package com.sunbeam;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		Stack st= new Stack(4);
		
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0.Exit \n 1.Push \n 2.Pop \n 3.Peek ");
			System.out.println("Enter choice ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					System.out.println("Enter value to be inserted ");
					int value= sc.nextInt();
					st.push(value);
					break;
				
				case 2: 
					System.out.println("Poped data : "+ st.pop());
					break;
				case 3: 
					System.out.println("peeked data "+ st.peek());
					
					
			}
			
			
		}while(choice!=0);
	}

}
