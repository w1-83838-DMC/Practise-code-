package com.sunbeam;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Stack stack= new Stack(4);
		
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0.Exit\n1.Push \n2.Pop \n3.Peek");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter value to be interested ");
					int value= sc.nextInt();
					stack.push(value);
					break;
				case 2: 
					System.out.println("Popped data is "+ stack.pop());
					break;
				case 3: 
					System.out.println("Peeked data is "+ stack.peek());
					break;
			}
			
		}while(choice!=0);
		
		sc.close();

	}

}
