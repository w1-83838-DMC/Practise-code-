// lamda expression

import java.util.Arrays;
import java.util.List;
/*
public class Day15_1
{
	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(11,22,33,44);
		System.out.println(l1);
		System.out.println();
		for(Integer i: l1)
		{
			System.out.println(i);
		}
		System.out.println("Using for each loop");
		l1.forEach(x->System.out.println(x+"\t")); // single line lamda expression 
		
		List<String> l2= Arrays.asList("java","dmc");
		l2.forEach(x->System.out.print(x+ "\t"));
	}
}
*/

// take each element from list l1 and multiply each elements by 5 and display
/*
public class Day15_1
{
	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(10,20,30,40,50);
		l1.forEach(x->System.out.print(x*5 + "\t"));
	}
}
*/

// Multiline lamda expression
// take each element from the list l1
// declare one local varaivle inside lamda
// and local varaible to each element from list

/*
public class Day15_1
{
	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(10,20,30,40,50,60);
		
		ls.forEach(x->{
			 int var=25;  // var is local variable created within lamda expresiion
			 System.out.println(x+var);		
		});
	}
}
*/
// capturing the local varaible inside the lamda
/*
public class Day15_1{
	public static void main(String[] args) {
		int num=30;
		List<Integer>ls= Arrays.asList(10,20,30,40,50,60);
		ls.forEach(x->System.out.print(x+num + "\t"));
	}
}
*/