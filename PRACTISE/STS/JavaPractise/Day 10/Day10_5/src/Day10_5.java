//import java.util.Scanner;
//
//public class Day10_5 
//{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int n1;
//		int n2;
//		int res;
//		System.out.println("Enter first Element ");
//		n1=sc.nextInt();
//		System.out.println("Enter Second Element ");
//		n2=sc.nextInt();
//		
//		res= n1/n2;
//		System.out.println("Result "+ res);
//		
//	}
//
//}

//import java.util.Scanner;
//
//public class Day10_5
//{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int n1;
//		int n2;
//		int res;
//		System.out.println("Enter First Element : ");
//		n1=sc.nextInt();
//		System.out.println("Enter Second Element: ");
//		n2=sc.nextInt();
//		try
//		{
//			res= n1/n2;
//			System.out.println("Result = "+ res);
//		}catch(ArithmeticException e)
//		{
//			System.out.println("Arithmethic Exception Occured ");
//			
//		}
//		
//	}
//}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10_5
{
	public static void main(String[] args) 
	{
		int a,b,res;
		
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Value : ");
		a=sc.nextInt();
		System.out.println("Enter the Second value : ");
		b=sc.nextInt();
		res= a/b;
		System.out.println("result "+ res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmethic Excepction / 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalide input is mismatched");
			
		}
						
	}
	
	}
