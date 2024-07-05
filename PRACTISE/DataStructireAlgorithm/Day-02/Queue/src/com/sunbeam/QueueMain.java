package com.sunbeam;

import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) {
		Queue q= new Queue(4);
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("0. Exit\n1.Push \n2.Pop \n3.Peek ");
			System.out.println("Enter the Choice ");
			choice=sc.nextInt();
			
			switch(choice)
			{ 
					// push check first isfull 
				case 1: 
					if(q.isFull())
						System.out.println("Queue is full");
					else { 
						System.out.println("Enter value to ");
						int value= sc.nextInt();
						q.push(value);						
					}
					break;
				case 2: 
					if(q.isEmpty())
						System.out.println("Queue is empty ");
					else {
						System.out.println("Popped value is "+ q.pop());
					}
					break;
				case 3: 
					if(q.isEmpty())
						System.out.println("Queue is Empty");
					else {
						System.out.println("Peeked value is "+ q.peek());
					}
					break;
			}
		}while(choice!=0);
		sc.close();
	}

}
