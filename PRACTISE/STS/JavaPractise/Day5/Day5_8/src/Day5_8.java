//Array and functions 
// Whenever we pass array name as a argument to the function
// Reference is passed (call by reference)
// basically its Reference copy

import java.util.Scanner;

class test
{
	static void accepct(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			Scanner sc= new Scanner(System.in);
			arr[i]=sc.nextInt();
		}
		
	}
	static void display(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	static void addition(int arr3[], int arr1[], int arr2[])
	{
		for(int i=0; i<5; i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
	}

}


public class Day5_8 {
	public static void main(String[] args) {
	int arr1[]= new int [5];
	int arr2[]= new int [5];
	int arr3[]= new int [5];
	
	test.accepct(arr1);
	test.accepct(arr2);
	test.addition(arr3, arr1, arr2);
	test.display(arr3);
	
	
	}

}
