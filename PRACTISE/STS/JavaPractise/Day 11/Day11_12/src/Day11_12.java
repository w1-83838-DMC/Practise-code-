import java.util.ArrayList;
import java.util.Arrays;

public class Day11_12 {
	
/*
	public static void main(String[] args)
	{
		ArrayList a= new ArrayList(); // Raw type
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add("abcd");
		System.out.println("Array List contain elements are "+a);
	
	}
}
/*
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();  // generic type parameter
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//al.add("Ajay"); // its contains only Integer value 
		//al.addAll("Ajay");
		System.out.println("The ArrayList elements are " + al);
		al.add(50);
		System.out.println("The ArrayList elements are "+ al);
		System.out.println("The ArrayList elements is empty condition "+al.isEmpty());
		al.clear();
		System.out.println("The ArrayList elements clear items are "+ al); // it willl delete all the items
		System.out.println("The ArrayList elements is empty "+ al.isEmpty());
	}
}
*/
	
/*
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println("Array list elements are "+al);
		System.out.println("get the element at the location 3 is "+ al.get(2));
		System.out.println("get the element at the location 4 is "+ al.get(3));
		System.out.println("get the element at the location 5 is "+ al.get(4));
	//	System.out.println("get the element at the location 9 is "+ al.get(9));// ArrayIndexoutBoundexception
		System.out.println("Array List elements contains "+al);
		System.out.println("al size "+ al.size());

	}
}
*/
	
	
	public static void main(String[] args) {
		ArrayList<Integer>a1= new ArrayList();
		int arr[]= {1,2,3,4,5,6,7,8};
		// converting array to ArrayList
		for(Integer I : arr)
		{
			a1.add(I);
		}
		System.out.println("The arrays contains "+ Arrays.toString(arr));
		System.out.println("The ArrayList Elements of a1 reference is  "+a1);
		
		ArrayList<Integer> a2 = new ArrayList();
		a2=a1;  // Reference copy 
		ArrayList<Integer> a3= new ArrayList();
		System.out.println("The arrayList Elements of a2 reference is "+ a2);
		
		a2.addAll(a1);
		a3=a2;
		System.out.println("The arrayList Elements of a3 is same as a2 "+ a3);
		System.out.println("The arrayList Elements of a2 is :"+ a2);
		
	}
}

