import java.util.*;
public class Day2_11 {
	public static void main(String[] args) 
	{
		int OS,C,CPP,JAVA,SQL,Sum;
		int percentage;
		int total=500;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The OS Marks");
		OS=sc.nextInt();
		System.out.println("Enter The C Marks");
		C=sc.nextInt();
		System.out.println("Enter The CPP Marks");
		CPP=sc.nextInt();
		System.out.println("Enter The JAVA Marks ");
		JAVA=sc.nextInt();
		System.out.println("Enter The SQL Marks");
		SQL=sc.nextInt();
		Sum=(OS+C+CPP+JAVA+SQL);
		//System.out.println(Sum);
		percentage=(Sum*100/total);
		//System.out.println(percentage);
		if(percentage>=80)
		{
			System.out.println(" You got the Grade A");
		}else if(percentage>50 && percentage<=80)
		{
			System.out.println("You got the Grade B");
			
		}else if(percentage<40)
		{
			System.out.println("You got the Grade C");
		}
		
	}

}
