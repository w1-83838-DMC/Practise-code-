import java.util.Scanner;

public class Day2_9 
{
	public static void main(String[] args) 
	
	{
	
		int Number;
		System.out.println("Enter the Number ");
		Scanner sc= new Scanner(System.in);
		Number=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			int result=Number*i;
			System.out.println(Number+"*"+i+"="+result);
			
		}
	
	}

}
