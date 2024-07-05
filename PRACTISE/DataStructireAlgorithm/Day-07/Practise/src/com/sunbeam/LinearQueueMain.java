package com.sunbeam;

import java.util.Scanner;

public class LinearQueueMain {
	public static void main(String[] args) {
		Queue q= new Queue(4);
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0.Exit \n1.Push \n2.Pop \n3.peek");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: 
					if(q.isFull())
					{
						System.out.println("Queue is fulll");
					}else 
					{
						System.out.println("Enter value to be inserted ");
						int value= sc.nextInt();
						q.push(value);
					}
					break;
				case 2: 
					if(q.isEmpty())
					{
						System.out.println("Queue is empty ");
						
					}else 
					{
						System.out.println("Poped value "+ q.pop());
					}
					break;
				case 3: 
					if(q.isEmpty())
					{
						System.out.println("Queue is Empry ");
					}else 
					{
						System.out.println("Peeked value "+ q.peek());
					}
					break;
			}
			
		}while(choice!=0);
	}

}
