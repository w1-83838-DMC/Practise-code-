// Set //In set Duplicare elements are not allowed
// Hashset 
// Unorderd and unsorted
/*
import java.util.HashSet;
public class Day13_1 {
	public static void main(String[] args) {
		HashSet<Integer>hs= new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(40);
		System.out.println("h2"+ hs);
		hs.add(null);
		hs.add(null);
		System.out.println("Hash set contents are "+ hs);
	}

}
*/
// LinkedHashset
// ordered and unsorted
// Only one null value is allowed
/*
import java.util.LinkedHashSet;
public class Day13_1
{
	public static void main(String[] args) {
		LinkedHashSet<Integer>lh= new LinkedHashSet<Integer>();
		lh.add(12);
		lh.add(14);
		lh.add(null);
		lh.add(null);
		lh.add(45);
		lh.add(76);
		lh.add(87);
		System.out.println("Linked Hash set contents are "+ lh+"\t");		
	}
}
*/

// Treset
// sorted and unordered
// Duplicates are not allowed 
// null is not allowed else we will get Null pointer exception 
/*
import java.util.TreeSet;
public class Day13_1
{
	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Core java");
		ts.add("C++");
		//ts.add(null);
		ts.add("C");
		ts.add("Operating System");
		ts.add("Python");
		ts.add("C++");
		ts.add("C");
		System.out.print("Ts"+ ts);	
	}
}
*/


