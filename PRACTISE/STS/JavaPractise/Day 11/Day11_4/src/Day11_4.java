import java.util.Scanner;

class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("User Defined AgeException ");
	}
	
}
class InvalidException extends Exception
{
	InvalidException()
	{
		System.out.println("User Defined InvalidException ");
	}
}

public class Day11_4 {
//	public static void main(String[] args) {
//		try {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the Name : ");
//			String name= sc.nextLine();
//			System.out.println("Enter the age : ");
//			int age = sc.nextInt();
//			System.out.println("Name "+ name + " Age "+ age );
//			
//			if(age<18)
//				throw new AgeException();
//			else
//				System.out.println("Age is in Range : ");
//			int len= name.length();
//			if(len<8)
//				throw new InvalidException();
//			else
//				System.out.println("Name is in Proper format : ");
//				
//		}
//		catch(AgeException e)
//		{
//			System.out.println(" Invalid age ");
//		}
//		catch(InvalidException e)
//		{
//			System.out.println(" Invalid Name ");
//		}
//		
//	}
	
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Name : ");
			String name= sc.next();
		
			System.out.println("Enter Age : ");
			int age= sc.nextInt();
		
			System.out.println("Name "+ name + " Age "+ age);
		
			if(age<18)
			{
				throw new AgeException();
			}
			else
			{
				System.out.println("Age is in range ");
			
			int length=name.length();
			if(length<8)
			{
				throw new InvalidException();
				
			}else
			{
				System.out.println("Name is in proper format ");
				
			}
			
		}
		}catch(AgeException e)
		{
			System.out.println("Invalid age ");
		
		}catch(InvalidException e)
		{
			System.out.println("Invalid input ");
		}
		
	}

}
