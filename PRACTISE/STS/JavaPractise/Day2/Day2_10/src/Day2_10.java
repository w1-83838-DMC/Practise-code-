import java.util.Scanner;
public class Day2_10 {
	public static void main(String[] args) 
	{
		int OS,C,JAVA,CPP,SQL;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the OS Marks ");
		OS=sc.nextInt();
		System.out.println("Enter the C Marks");
		C=sc.nextInt();
		System.out.println("Enter the JAVA Marks");
		JAVA=sc.nextInt();
		System.out.println("Enter the CPP Marks");
		CPP=sc.nextInt();
		System.out.println("Enter the SQL Marks");
		SQL=sc.nextInt();
		int Average=(OS+C+JAVA+CPP+SQL)/5;
		System.out.println("The Average marks of 5 Subject is "+Average);
		sc.close();
		
	
		
	}

}
