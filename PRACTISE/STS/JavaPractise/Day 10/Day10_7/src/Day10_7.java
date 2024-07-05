
// try with multiple catch block
// catch(Exception e) must be the last block in case of Multiple catch block 

import java.util.Scanner;

public class Day10_7 {
	public static void main(String[] args) {
		int n1;
		int n2;
		int res;
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the First Value : ");
			n1= sc.nextInt();
			System.out.println("Enter the Second value : ");
			n2= sc.nextInt();
			res= n1/n2;
			System.out.println("Result "+ res);
		
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception second Number can not be 0 ");
		}// generic block
		catch(Exception e)
		{
			System.out.println("Supply valid input InputMismatchException ");
		}
	}
}
		
		



