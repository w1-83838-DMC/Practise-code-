//// java block with resources / try block handler
//// as soon as the scanner object sc job is done 
//// it should be close automatically
//
//import java.util.Scanner;
//
//public class Day10_9 
//{
//	public static void main(String[] args) {
//		
//		int n1;
//		int n2;
//		int res;
//		try(Scanner sc= new Scanner(System.in);)
//		{
//			System.out.println("Enter First Number : ");
//			n1= sc.nextInt();
//			System.out.println("Enter Second Number : ");
//			n2= sc.nextInt();
//			
//			res=n1/n2;
//			System.out.println("Result "+ res);
//			
//		}catch(ArithmeticException e)
//		{
//			System.out.println("Second Number can not be / 0");
//		}finally
//		{
//			System.out.println("Finally block Exected ");
//		}
//	}
//	
//	
//
//}
//
//import java.util.Scanner;
//
//public class Day10_9
//{
//	public static void main(String[] args) {
//		
//	
//	int n1;
//	int n2;
//	int res;
//	Scanner sc= new Scanner(System.in);
//	try
//	{
//		System.out.println("Enter the First Number :");
//		n1= sc.nextInt();
//		System.out.println("Enter the Second Number : ");
//		n2= sc.nextInt();
//		
//		res= n1/n2;
//		System.out.println("Result "+ res);
//	
//	}catch(Exception e)
//	{
//		System.out.println("e = "+e.toString());//e = java.lang.ArithmeticException: / by zero
//		System.out.println("get cause : "+ e.getCause());  // null
//		System.out.println("get class: "+e.getClass());//class java.lang.ArithmeticException  ArithmethicException is a class which is present in the lang package 
//		System.out.println("get Message : "+ e.getMessage()); /// by zero
//		System.out.println("get Localized message : "+ e.getLocalizedMessage()); /// by zero
//		e.printStackTrace();  // jvm called printStacktrace implicitly 
//	}
//	
//	
//}
//	
//	
//	
//}

public class Day10_9
{
	public static void main(String[] args) 
	{
		System.out.println("Core java Exception Handling");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Sunbeam pg- DMC");
		
	}
}

