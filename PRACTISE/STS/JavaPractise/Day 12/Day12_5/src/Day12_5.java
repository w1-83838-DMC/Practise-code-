// LinkedList
/*
import java.util.LinkedList;

public class Day12_5 {
	public static void main(String[] args) 
	{
		LinkedList <Integer>l1= new LinkedList<Integer>();
		l1.addFirst(10);
		l1.addLast(40);
		l1.addFirst(30);
		System.out.println("Linked list"+l1);
		l1.add(1,20);
		System.out.println("Linked list"+l1);
		l1.addFirst(78);
		System.out.println("Linked list"+l1);
		System.out.println("get last element :"+ l1.getLast());
		System.out.println("get First element :"+ l1.getFirst());
		System.out.println("Elemennt getting at 4 th index: "+ l1.get(3));
		l1.remove();
		l1.remove();
		l1.remove();
		l1.remove();
		l1.remove();
		System.out.println("Linked list"+ l1);
	}

}
*/
/*
import java.util.LinkedList;

public class Day12_5
{
	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>();
		l1.offerFirst("Core java");
		l1.offerFirst("C");
		l1.offerFirst("C++");
		l1.offerFirst("Operation System");
		l1.offerFirst("Ml");
		System.out.println(" Linked List contain element "+ l1);
		LinkedList<String>l2=l1; // Reference Copy 
		System.out.println(" Linked List contain element "+ l2);
		l1.add("Deep Learning");
		System.out.println("Updated " + l1);
		System.out.println("Updated " + l2);
		
		LinkedList<String >l3=(LinkedList<String>)l1.clone();
		System.out.println("l3 : "+ l3);
		l3.add("Html");
		System.out.println("Linked list l1 "+ l1);
		System.out.println("l3 = "+ l3);  // html added
		System.out.println("l1 == l2 "+(l1==l2)); // true
		System.out.println("l2 == l3 "+(l3==l2)); // false
		System.out.println("l1 == l3 "+ (l1==l3));// false
		
		System.out.println("l1 equals l2"+ l1.equals(l2)); // refernce Equality
		System.out.println("l1 equals l3"+ l1.equals(l3)); // false
		
	}
}
*/
/*
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Day12_5
{
	public static void main(String[] args) {
		
		LinkedList<String> l= new LinkedList<String>();
		l.add("Core java");
		l.add("Python");
		l.add("Ml");
		l.add("C++");
		l.add("C");
		System.out.println("Linked list elements are "+ l);
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
		ListIterator<String> lstr= l.listIterator();
		System.out.println();
		System.out.println("Forward direction  :  ");
		while(lstr.hasNext())
		{
			System.out.print(lstr.next()+"\t");
		}
		System.out.println();
		System.out.println("Reverse Direction :  ");
		while(lstr.hasPrevious())
		{
			System.out.print(lstr.previous()+ "\t");
		}
		System.out.println();
		System.out.println("Contains "+ l.contains("C++"));	
	}
}
*/
/*
import java.util.LinkedList;

class Employee
{
	String name;
	int empid;
	
	Employee()
	{
		
	}
	Employee(String name, int empid)
	{
		this.name=name;
		this.empid=empid;
	}
	public String toString()
	{
		return "Employee Name "+ this.name+ "Employee id "+ this.empid; 
	}
	
}

public class Day12_5
{
	public static void main(String[] args) {
		
	
	LinkedList<Employee>l1= new LinkedList<Employee>();
	Employee e1= new Employee("Emp1",123);
	l1.addLast(e1);
	l1.add(new Employee("emp1",123));
	
	System.out.println("Linked list "+ l1);
	
	}
}
*/
/*
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Day12_5
{
	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>();
		l1.addFirst("C++");
		l1.addFirst("Java");
		l1.addFirst("OS");
		l1.addFirst("X");
		System.out.println("Linked List "+l1);
		
		Iterator<String> itr = l1.iterator();
		System.out.println("Using Iterator ");
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
		ListIterator<String>lstr= l1.listIterator();
		System.out.println("Using ListIterator ");
		while(lstr.hasNext())
		{
			System.out.print(lstr.next() + "\t");
			
		}
		System.out.println("Using ListIterator in Reverse Direction: ");
		while(lstr.hasPrevious())
		{
			System.out.print(lstr.previous()+"\t");
		}
			
	}
}
*/
/*
import java.util.Stack;

public class Day12_5
{
	public static void main(String[] args) {
		Stack<Integer> s1= new Stack<Integer>();
		s1.push(12);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println("S1"+ s1);
		System.out.println(" Peek "+ s1.peek());
		System.out.println("Element that is Taken out from stack "+s1.pop());
		System.out.println(s1);
		s1.pop();
		s1.pop();
		s1.pop();
		//s1.pop();
		//s1.pop();
		//System.out.println("s1"+s1);  // EmptyStackException 
		System.out.println("s1"+ s1.isEmpty());
	
	}
}
*/
/*
import java.util.Stack;
public class Day12_5
{
	public static void main(String[] args) {
		// follows 1 based posotion 
		Stack<Integer> s1= new Stack<Integer>(); // Stack follows LASTINFIRSTOUT
		s1.push(10);//5  
		s1.push(20);//4
		s1.push(30);//3
		s1.push(40);//2
		s1.push(50);//1 
		System.out.println(s1 + "\t");
		System.out.println("Search "+ s1.search(10));
		System.out.println("Search "+ s1.search(20));
		System.out.println("Search "+ s1.search(50));
	}
}
*/
// toArray()
// Returns an array containing all of the elements in this list
// in proper sequence (From first to last element)
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Arrays;
public class Day12_5
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>l1= new ArrayList<Integer>();
		LinkedList<String>l2= new LinkedList<String>();
		Stack<Float>s1= new Stack<Float>();
		
		l2.add("Core java");
		l2.add("C++");
		l2.add("Sunbeam");
		
		
		s1.add(23.4f);
		s1.add(54.32f);
		s1.add(43.67f);
		
		
		l1.add(17);
		l1.add(45);
		l1.add(76);
		l1.add(98);
		l1.add(75);
		
		//System.out.println("s1"+ s1);
		//System.out.println("l2"+ l2);
		
		// convert ArrayList to array
		
		Object arr1[]=l2.toArray();  // return type is Object array1[]
		
		System.out.println(Arrays.toString(arr1));
		
		Object arr2[]=s1.toArray();
		
		System.out.println(Arrays.toString(arr2));
		
		Object arr3[]=l1.toArray();
		
		System.out.println(arr3);  // ToString called from Object class
		
		System.out.println(Arrays.toString(arr3));
		
		
		
		
		
	}
}
