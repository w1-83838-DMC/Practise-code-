package circularQueue;

import java.util.Scanner;

public class circularmain {
	
	public static void main(String[] args) {
		CircularQueue cq= new CircularQueue(4);
		
		Scanner sc= new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("\n0.Exit \n1. Push \n2. Pop ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(cq.isFull())
						System.out.println("Queue is full");
					else {
						System.out.println("Enter value to Queue");
						int value =sc.nextInt();
						cq.push(value);
					}
					break;
				case 2: 
					if(cq.isEmpty())
						System.out.println("Queue is Empty");
					else {
						System.out.println("popped value is "+ cq.pop());
						
					}
					break;
				case 3: 
					if(cq.isEmpty())
						System.out.println("Queue is Empty ");
					else {
						System.out.println("Peeeked value is "+ cq.peek());
					}
					break;
					
			}

		}while(choice!=0);
	}
}
