/*
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;

public class Day12_7 {
	public static void main(String[] args) {
		Vector<Integer> v1= new Vector<Integer>();
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		
		System.out.println(v1.toString()); // using toString()
		
		System.out.println("print the elements using foreach loop ");
		for(Integer i: v1) // Using for each loop
		{
			System.out.print(i+ "\t");
		}
		System.out.println();
		System.out.println("Print the element using forloop : ");
		for(int i=0; i<v1.size(); i++)
		{
			System.out.print(v1.get(i)+"\t");
		}
		System.out.println();
		System.out.println("Print the element using Iterator ");
		Iterator itr= v1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println("Print the element using ListIterator In forward direction ");
		ListIterator lstr= v1.listIterator();
		while(lstr.hasNext())
		{
			System.out.print(lstr.next() + "\t");
		}
		System.out.println();
		System.out.println("Print the element using ListIterator in Reverse direction ");
		while(lstr.hasPrevious())
		{
			System.out.print(lstr.previous() + "\t");
		}
		System.out.println();
		System.out.println("Print the element using Enumeration: ");
		Enumeration<Integer>em= v1.elements();
		while(em.hasMoreElements())
		{
			System.out.print(em.nextElement()+ "\t");
		}
			
	}
}
*/
/*
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
public class Day12_7
{
	public static void main(String[] args) {
		Vector<Integer> v1= new Vector<Integer>();
		Integer element=null;
		v1.addElement(24);
		v1.addElement(45);
		v1.addElement(56);
		v1.addElement(87);
		
		Iterator<Integer> itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ "\t");
		}
		System.out.println();
		System.out.println("Enumeration ");
		Enumeration<Integer> em=v1.elements();
		while(em.hasMoreElements())
		{
			System.out.print(em.nextElement() + "\t");
		}
		
	}
}
*/
/*
import java.util.Vector;
import java.util.Enumeration;
public class Day12_7
{
	public static void main(String[] args) {
		Vector<Integer> vec= new Vector<Integer>();
		int element=0;
		vec.addElement(12);
		vec.addElement(33);
		vec.addElement(78);
		vec.addElement(87);
		vec.addElement(97);
		System.out.println("capacity" + vec.capacity());
		
		System.out.println("Vector element "+ vec);
		Enumeration em= vec.elements();
		while(em.hasMoreElements())
		{
				element = (int) em.nextElement();
				System.out.println("Elements "+ element);
				if(element==33)
				{
					vec.add(78);
				}
			}
	}
}
*/
/*
import java.util.Queue;
import java.util.ArrayDeque;
public class Day12_7
{
	public static void main(String[] args) {
		// Queue is an ineterface
		Queue<Integer>q1= new ArrayDeque<Integer>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(40);
		q1.offer(50);
		System.out.println("q1"+ q1);
		System.out.println("Fetching the first Elements "+ q1.element());
		q1.remove();
		q1.remove();
		q1.remove();
		q1.remove();
		q1.remove();  // Nosuch elements
		System.out.println("q1"+ q1);
		
	}
}
*/
import java.util.ArrayDeque;
import java.util.Queue;
public class Day12_7
{
	public static void main(String[] args) 
	{
		Queue<Integer>Que= new ArrayDeque<Integer>();
		Que.offer(10);
		Que.offer(20);
		Que.offer(30);
		Que.offer(40);
		System.out.println("Contains "+ Que);
		System.out.println("Fetching the first element "+ Que.peek());
		Que.poll();
		Que.poll();
		Que.poll();
		Que.poll();
		Que.poll();
		System.out.println("Elements in Queue "+ Que);
		System.out.println("Elements in Queue "+ Que.poll()); // null
		System.out.println("Fetching the first elements "+ Que.peek());
		
	}
	
}
