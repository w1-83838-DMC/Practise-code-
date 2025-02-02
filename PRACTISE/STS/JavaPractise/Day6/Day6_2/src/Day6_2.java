/* Reference copy (Deep Copy) We are only copying the value */
/*
import java.util.Arrays;

public class Day6_2 {

	public static void main(String[] args) 
	{
		int arr[]= new int[5];
		arr[0]=12;
		arr[1]=34;
		arr[2]=98;
		arr[3]=98;
		arr[4]=23;
		
		for(int i:arr)
		{
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));  // it will print data in Horizontally 
		
		int arr1[]=arr;  // reference copy
		for(int row: arr1)
		{
			System.out.print(row +"\t");
		}
		System.out.println();
		
		arr1[3]=100;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		arr1[0]=90;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		arr[4]=89;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
			
	}

}
*/

import java.util.Arrays;

public class Day6_2
{
	public static void main(String[] args) {
		int a1[]= new int[5];
		a1[0]=12;
		a1[1]=13;
		a1[2]=98;
		a1[3]=65;
		a1[4]=87;
		
		for(int row: a1)
		{
			System.out.print(row + "\t");
		}
		System.out.println();
		
		System.out.println(" a1 = "+Arrays.toString(a1));
		
		int a2[]=Arrays.copyOf(a1,5);// isntance copy / deep copy / element by element
		
		System.out.println(Arrays.toString(a2));
		
		a2[2]=999;
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a1));
		
		int a3[]= Arrays.copyOf(a1,4);
		System.out.println("A1 = " + Arrays.toString(a1) + "A1 toString= "+a1.toString());  // called implicit ToString
		System.out.println("A2 = " + Arrays.toString(a2) + "A2 toString= "+a2.toString());
		
		int a4[]= Arrays.copyOfRange(a3,3,7);
		System.out.println("A3 = " + Arrays.toString(a3) + "A3 toString = "+a3.toString());
		System.out.println("A4 = "+ Arrays.toString(a4) + "A4 toString = "+a4.toString());
		
		
		
	}
}
