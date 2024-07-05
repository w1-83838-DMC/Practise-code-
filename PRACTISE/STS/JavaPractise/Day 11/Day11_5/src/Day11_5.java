import java.util.Scanner;

class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);  //	Throwable(String message)
		System.out.println(super.getMessage());
	}
}


public class Day11_5 {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	try {
	int age = sc.nextInt();
		
	System.out.println("Age "+age);
		
	if(age<18) //(10<18) condition become true it will 
	{
		throw new AgeException("Invalid age");
	}
	else
	{
		System.out.println("Age is in Range and Age is :  " + age);
	}
	}catch(AgeException e)
	{
		System.out.println("Age Exception ");
		
	}
	}

}
