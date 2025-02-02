/*
import java.util.ArrayList;


public class Day11_13 {
	
	public static void AccepctIntData(ArrayList<Integer>al)
	{
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
	}
	public static void displayIntData(ArrayList<Integer>al)
	{
		System.out.println("The ArrayList contains "+ al);
	}
	public static void AccepctFloatData(ArrayList<Float>al)
	{
		al.add(12.45f);
		al.add(34.55f);
		al.add(76.86f);
		al.add(43.65f);
	}
	public static void displayFloatData(ArrayList<Float>al)
	{
		System.out.println("The ArrayList contains "+ al);
	}
	
	public static void AccepctStringData(ArrayList<String>al)
	{
		al.add("Ajay");
		al.add("Ramakant");
		al.add("Surse");
	}
	public static void DisplayStringData(ArrayList<String>al)
	{
		System.out.println("The Arrraylist COntains of string "+al);
	}
	
	public static void AccepctDoubleData(ArrayList<Double>al)
	{
		al.add(2.3);
		al.add(6.7);
		al.add(4.2);
		al.add(3.4);
	}
	public static void displayDoubleData(ArrayList<Double>al)
	{
		System.out.println("The Display Elements are "+ al);
	}
	public static void main(String[] args) {
		
		int arr[]= {1,23,4,5};
		ArrayList<Integer>a1= new ArrayList<Integer>();
		ArrayList<Float>a2= new ArrayList<Float>();
		ArrayList<Double>a3= new ArrayList<Double>();
		ArrayList<String>a4= new ArrayList<String>();
		
		AccepctIntData(a1);
		displayIntData(a1);
		
		AccepctFloatData(a2);
		displayFloatData(a2);
		
		AccepctStringData(a4);
		DisplayStringData(a4);
		
		AccepctDoubleData(a3);
		displayDoubleData(a3);
	}

*/

/*
import java.util.ArrayList;
import java.util.Arrays;

public class Day11_13
{
	public static void main(String[] args) {
		ArrayList<Integer>al= new ArrayList<Integer>();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(Integer i:arr)
		{
			al.add(i);
		}
		System.out.println("The elements are"+ al);
		System.out.println("The elements of an array is "+ Arrays.toString(arr));
	}
}
*/
// ?  ==> Wild card => Integer, Float, Double, String And NonPrimitive type
// ? extends Number => UpperBound Wild card => Integer, FLoat, Double
// ? Super Number => Lower Bound wild card => Integer



import java.util.ArrayList;

public class Day11_13
{
	public static void AccepctIntDate(ArrayList<Integer>al)
	{
		al.add(12);
		al.add(76);
		al.add(34);
		al.add(65);
	}
	public static void AccepctDoubleDate(ArrayList<Double>al)
	{
		al.add(3.5);
		al.add(3.6);
		al.add(9.2);
		al.add(4.6);
		
	}
	public static void AccepctStringDate(ArrayList<String>al)
	{
		al.add("Ajay");
		al.add("Ramakant");
		al.add("Surse");
	}
	public static void displayDoubleDate(ArrayList<Double>al)
	{
		System.out.println("Display Date in Double "+ al);
		
	}
	public static void displayIntDate(ArrayList<Integer>al)
	{
		System.out.println("Display Date in Integer  "+ al);
	}
	public static void displayStringDate(ArrayList<String>al)
	{
		System.out.println("Display Date in String "+ al);
	}
	
	public static void dispData(ArrayList<?>al)
	{
		System.out.println("Array List Contents are "+ al);
	}
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<Integer>();
		ArrayList<Float> a2= new ArrayList<Float>();
		ArrayList<Double> a3= new ArrayList<Double>();
		ArrayList<String> a4= new ArrayList<String>();
		
		AccepctIntDate(a1);
		AccepctDoubleDate(a3);
		AccepctStringDate(a4);
		
		displayIntDate(a1);
		displayDoubleDate(a3);
		displayStringDate(a4);
	}
}

