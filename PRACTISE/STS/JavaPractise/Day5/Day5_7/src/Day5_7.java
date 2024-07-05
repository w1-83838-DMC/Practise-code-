/* Valid and invalid decleration of an array*/
//import java.util.*;
//public class Day5_7
//{
//	public static void main(String[] args) {
//		int a[]= new int[5];
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the elements the array :");
//		for(int i=0; i<a.length; i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		System.out.println("Array Elements are : ");
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println("a[i]= "+ a[i]);
//		}
//		
//	}
//}

/*Array and functions whenever we pass array name as an argument to the fumction reference is passed (call by reference) Reference copy */
import java.util.*;
public class Day5_7
{
	static void accepct(int arr[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	static void display(int arr[])
	{
		System.out.println("Array elements are : ");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= new int[5];
		accepct(arr);
		display(arr);
		
		
		
	}
}




