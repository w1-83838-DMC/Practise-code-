// Method reference to an instance method of an arbitaray object

import java.util.Arrays;
import java.util.List;
/*
public class Day15_8 {
	public static void main(String[] args) 
	{
		String starr[]= {"java","C","C++","Python","ml"};
		System.out.println("Contents are " + Arrays.toString(starr));
		//Arrays.sort(starr);
		Arrays.sort(starr,String::compareTo);
		System.out.println("Sorted contents are "+ Arrays.toString(starr));
		
	}
}
*/
public class Day15_8
{
	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(10,20,30,60,20,40,62,56);
		ls.forEach(x-> System.out.print(x + "\t"));
		System.out.println("\n---------------\n");
		ls.forEach(System.out::print);
	}
}
