//display arraylist contents

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;



public class Day12_2 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,18,65,98,34,76,92,90};
		ArrayList<Integer>a1= new ArrayList<Integer>();
//		for(int i=0; i<a.length; i++)  // using for loop
//		{
//			a1.add(a[i]);
//		}
//		System.out.println(a1);
		for(Integer i:a)
		{
			a1.add(i);
		}
		System.out.println("A1: "+ a1);
		System.out.println("A1 : "+ a1.toString());
		
		// for each Integer inside "i" is a 
		// Integer to int // Autounboxing
		// int to integer // primitive to Non - primitive //boxing
		// when we are using add() adds all the value
		
		
		System.out.println("Printing all elements using simple for loop");
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.print(a1.get(i) + "\t");
		}
		
		System.out.print("Printing all elements using for each loop: ");
		for(Integer i : a1)
		{
			System.out.print(i+"\t");
			
		}
		System.out.print("Iterator is helping us to print AL elements in Forward Direction ");
		System.out.println("\n Printing Al elements using Iterator ");
		
		Iterator<Integer> itr= a1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
		System.out.println("Display data in ForwardDirection using ListIterator : ");
		
		ListIterator<Integer> ltr= a1.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next() + "\t");
			
		}
		System.out.println();
		System.out.println("Display data in ReverseDirecton using ListIterator :");
		while(ltr.hasPrevious())
		{
			System.out.print(ltr.previous()+ "\t ");
		}
		
	}
	

}
