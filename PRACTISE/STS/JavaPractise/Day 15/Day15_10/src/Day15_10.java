import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
public class Test {
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		Stream<Integer> st1= Stream.of(arr); // source stream
		System.out.println(st1);
		st1.forEach(x ->System.out.print(x + "\t"));
		System.out.println("\n--------------");
		st1.forEach(System.out::println);
	}

}
*/
/*
public class Day15_10
{
	public static void main(String[] args) {
		
	Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
	Stream<Integer>st1= Stream.of(arr); // source Stream
	st1.forEach(System.out::println);
	//st1.forEach(System.out::println);
	}
	
}
*/

/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		Stream<Integer>st1=Stream.of(arr); // source Stream
		Stream<Integer>st2 = st1.filter(i-> i%2==0); // intermediate operation
		st2.forEach(x->System.out.print(x + "\t"));  // terminal operation 
		
	}
}
*/

/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		Stream<Integer> st1= Stream.of(arr); // source stream
		
		Stream<Integer> st2=st1.filter(i->i%2==0); // Intermediate operation
		// 2 4 6 8 10
		Stream<String> st3=st2.map(i->"Even" + i); // Intermediate Operation
		// Even 2 Even 4 Even 6 Even 8 Even 10
		st3.forEach(x ->System.out.print(x + "\t")); // Terminal Operation 
		
	}
}
*/

/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9,0,10};
		Stream<Integer>arr1=Stream.of(arr); // conversion of array onto Stream // Source stream
		
		Stream<Integer> arr2= arr1.filter(i->i%2==0); // Intermediate Operation
		
		Stream<String> arr3= arr2.map(i->"Even"+i); // Intermediate Operation 
		
		Stream<String> arr4 = arr3.map(i -> i.toLowerCase()); // Intermediate Operation
		
		Stream<String> arr5= arr4.map(i-> i.toUpperCase()); // Intermediate Operation 
		
		arr5.forEach(x->System.out.print(x + "\t")); // Terminal operation
		
	}
}
*/

/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		// Strandar practise
		Stream.of(arr)  // source Stream
		.filter(i->i%2==0) // intermediate operation 
		.map(i->"Even"+i) // Terminal Operation 
		.map(i ->i.toLowerCase())
		.map(i ->i.toUpperCase())
		.forEach(x->System.out.print(x + "\t"));
		
	}
}
*/

/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8};
		Stream.of(arr) // Soure Stream
		.filter(i->i%2==0)
		.map(i->i*i)
		.forEach(x->System.out.print(x + "\t"));
		
	}
}
*/
/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Stream.of(arr)
		.filter(i->i%2==0)
		.map(i->i*i)
		.count());
			
	}
}
*/

/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6};
		System.out.println(Stream.of(arr)
		.filter(i->i%2==0)
		.map(i -> i*i)
		.mapToInt(i->i*1)
		.max());
		
	}
}

*/

/*
public class Day15_10
{
	public static void main(String[] args) {
		Integer arr[]= {11,12,34,56,76,78,90};
		System.out.println(Stream.of(arr)
		.mapToInt(i -> i*1)
		.min());
		
	}
}
*/

public class Day15_10
{
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4);
		System.out.println(list.stream().map(x -> x*x).reduce((x,y)->x+y).get());
	//System.out.println(list.stream().mapToInt(i->i*1).sum());
	
	}
}