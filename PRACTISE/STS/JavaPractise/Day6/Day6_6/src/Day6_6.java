//import java.util.Scanner;
//
//public class Day6_6 {
//
//	public static void main(String[] args) 
//	{
//		int a1[][]= new int[4][3];
//		Scanner sc= new Scanner(System.in);
//		for(int i=0; i<4; i++)
//		{
//			for(int j=0; j<3; j++)
//			{
//				System.out.println("Enter the Array : ");
//				a1[i][j]=sc.nextInt();
//			}
//		}
//		for(int row[]: a1)
//		{
//			for(int col: row)
//			{
//				System.out.print(col + "\t");
//			}
//		System.out.println();
//		}
//		
//	}
//
//}
/* Column size of each row is diffrent*/
/*
class Day6_6
{
	public static void main(String[] args) {
		int arr[][]= new int[3][];
		arr[0]=new int [2];
		arr[1]=new int [3];
		arr[2]=new int [4];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
*/
// intialization of ragged array
/*
class Day6_6
{
	public static void main(String[] args) {
		int arr[][]= new int[4][];// ragged array
		arr[0]= new int []{10,20};
		arr[1]= new int []{99,95,23};
		arr[2]= new int []{11,22,44,55};
		arr[3]= new int []{56,87,54,22,56};
		
		for(int row[]: arr)
		{
			for(int col : row)
			{
				System.out.print(col + "\t");
			}
		System.out.println();
		}
		
	}
}
*/
/* Call By refernce */
/*
class Day6_6
{
	
	static void swap(int arr[])
	{
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]= temp;
		
	}
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int arr[]= {num1,num2};
		System.out.println("num1 and num2 "+ arr[0] + "\t" + arr[1]);
		swap(arr);
		System.out.println("num1 and num2 "+ arr[0] + "\t" + arr[1]);
		
	}
}
*/

/*Variable argument methods and variable Arity Method*/
/*
class Day6_6
{
	static void display(int num)
	{
		System.out.println("Num1 " + num);
	}
	static void display(int n1, int n2, int n3)
	{
		System.out.println(" Num1 "+ n1 + " Num2 "+ n2 + " Num3 "+ n3);
	}
	
	public static void main(String[] args) {
		display(10);
		display(10,20,30);
		
		
	}
	
}
*/

// three dots indicates method may except variable number of arguments
// in the background it atually created 1D array

/*
class Day6_6
{
	static void display(int ...args)
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.print(args[i] + "\t");
		}
	System.out.println();
		
	}
	public static void main(String[] args) 
	{
		display(10);
		display(10,20);
		display(10,20,30);
		
		
	}
}
*/

/*
class Day6_6
{
	//public static void main(String[] args) 
	//public static void main(String...args)
	public static void main(String args[])
	{
		System.out.print(args[0] + "\t");
		System.out.print(args[1]);

		
	}
}
*/
/*
enum color
{
	RED,GREEN,BLUE;
}
class Day6_6
{
	public static void main(String[] args) 
	{
		//color clr= new color(); in Enum we are not using new keyword
		color clr = color.RED;
		System.out.println(color.RED + "Name = " + clr.name() + "\t "+ clr.ordinal());
		color clr1 = color.GREEN;
		System.out.println(color.GREEN +"Name = " + clr1.name() + "\t "+ clr1.ordinal());
		color clr3= color.BLUE;
		System.out.println(color.BLUE +"Name = " + clr3.name() + "\t "+ clr3.ordinal());
		
		
		
	}
}
*/

enum color
{
	RED,GREEN,BLUE;
}
class Day6_6
{
	public static void main(String[] args) {
		color clr[]= color.values();
		for(color c:clr)
		{
			System.out.print(" Name = " + c.name() + " ordinals "+ c.ordinal());
		}
	System.out.println();
		
	}
	
}



