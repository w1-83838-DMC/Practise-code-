// get() is used to get the elemenets from ArrayList in Random way
// get() is used for searching element at specific index
import java.util.ArrayList;
import java.util.Collections;
public class Day12_3 {
/*
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		// Array to ArrayList
		ArrayList<Integer>a1= new ArrayList();
		for(Integer i: a)
		{
			a1.add(i);
		}
		System.out.println(a1.get(2));
		System.out.println("a1"+ a1);
		System.out.println("a1.toString: "+ a1.toString());
	}
}
*/
/*
	public static void main(String[] args) {
		int a[]= {55,11,22,33,44,66,77,88,99};
		ArrayList<Integer> a1= new ArrayList<Integer>();
		for(Integer i: a)
		{
			a1.add(i);
		}
		System.out.println(a1+"\t");
		ArrayList<Integer> a2=a1;  // Reference copy
		System.out.println("a2 value ");
		for(Integer i:a2)
		{
			System.out.print(i+ "\t");
			
		}
		a1.add(1234);
		System.out.println();
		System.out.print(a1+"\t");
		System.out.println();
		System.out.print(a2+"\t");
		System.out.println();
		System.out.println("-----------------------------------------------");
		a2.add(890);
		System.out.println();
		System.out.println(a1+"\t");
		System.out.println(a2+"\t");
		System.out.println(a1+"\t");
		
		ArrayList<Integer> a3=(ArrayList<Integer>)a1.clone();// Annonyms Object 
		System.out.println("a3 "+ a3);
		System.out.println("-------------------------");
		a1.add(999);
		System.out.println("a1"+ a1);
		System.out.println("a2"+ a2); // reference copy 
		System.out.println("a3"+ a3);
		
		a3.add(1234);
		a3.add(5678);
		a3.add(8765);
		System.out.println("a1"+ a1);
		System.out.println("a2"+ a2);
		System.out.println("a3"+ a3);
		
		
		
	}
}
*/
/*
	public static void main(String[] args) {
		
		int a[]= {55,11,22,33,44,66,77,88,99};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(Integer i: a)
		{
			al.add(i);
		}
		System.out.println("Al"+ al);
		Collections.sort(al);
		//Al[11, 22, 33, 44, 55, 66, 77, 88, 99]
		System.out.println("Al"+ al);
		System.out.println("The index is in Range : "+ Collections.binarySearch(al,88));
		System.out.println(Collections.binarySearch(al,80));
	}
}
*/
