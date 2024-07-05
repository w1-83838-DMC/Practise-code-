package p1;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
//		product p1= new product();
//		p1.accepctdata();
//		System.out.println("Enter the Quantity : ");
//		Scanner sc= new Scanner(System.in);
//		int quantity=sc.nextInt();
//		int value = p1.calPrice(quantity);
//		System.out.println("The Total price is  "+value);
		
		// solution for Null pointer exception is to allocate memory for null reference
		product p1=null;
		p1=new product();
		p1.display();
		
	}

}
