//// try catch and finally block
//
//import java.util.Scanner;
//
//public class Day10_8 {
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int n1;
//		int n2;
//		int res;
//		
//		try
//		{
//			System.out.println("Enter the First value : ");
//			n1= sc.nextInt();
//			System.out.println("Enter the Second value : ");
//			n2= sc.nextInt();
//			res= n1/n2;
//			System.out.println("result "+ res);
//			
//		}catch(ArithmeticException e)
//		{
//			System.out.println("Second Number can not be  zero please enter the valid choice ");
//		}
//		finally  // finally block executed all time 
//		{
//			System.out.println("finally block executed");
//		}
//		
//	}
//	
//
//}


// can we try without catch ?? no 
// if we do not want catch block after try block then it is compulsory to write finally block 
// else we get compile time error

import java.util.Scanner;

class Day10_8
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n1;
		int n2;
		int res;
		try
		{
			System.out.println("Enter the First Value : ");
			n1=sc.nextInt();
			System.out.println("Enter the Second Value : ");
			n2= sc.nextInt();
			
			res= n1/n2;
			System.out.println("Result"+ res);
		}
		finally
		{
			System.out.println("inside finally block ");
		}
		
	}
}

