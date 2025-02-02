// instance operator
// operator 
// used for checking whether object belongs to the class
/*
class Demo
{
	
}
class Test
{
	
}

public class Day13_3 {
	public static void main(String[] args) 
	{
		Demo dobj= new Demo();
		Test tobj= new Test();
		
		boolean b = dobj instanceof Demo;
		boolean b1= tobj instanceof Test;
		System.out.println("b "+ b);	
		System.out.println("b1 "+ b1);
	}

}
*/

// HashMap
// LinkedHashMap
// TreeMap

// HashMap
// unordered and unsorted
// Keys are unique
// if we supply a new value to existing key it will be replaced 
// keys can be unique
// value can be repeated;
/*
import java.util.HashMap;
public class Day13_3
{
	public static void main(String[] args) {
		HashMap<Integer,String> h1= new HashMap<Integer,String>();
		h1.put(10, "PG-DMC");
		h1.put(20, "PG-DAC");
		h1.put(30, "PG-DESD");
		h1.put(40, "PG-DITISS");
		h1.put(50, "PG-DAC");
		
		System.out.println("Hash map "+ h1);
	}
}
*/
// LinkedHashMap
// ordered and unsorted
// keys are unique
// if we supply new value to existing key it will be replaced
// values can be repeated
// one null key and one null values are allowed 
// key can be null
// value can be null also 

/*
import java.util.LinkedHashMap;
public class Day13_3
{
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lh= new LinkedHashMap<Integer,String>();
		lh.put(10,"PG-DMC");
		lh.put(20,"PG-DESD");
		lh.put(30,"PG-DAC");
		lh.put(40,"PG-DITISS");
		lh.put(40,"PG-DAC");
		lh.put(null, null);
		
		
		System.out.println(" "+ lh);
		lh.put(50,"PG-karad");
		System.out.println(" "+ lh);
		lh.put(60,null);
		System.out.println(" "+ lh);
		lh.put(null,"PG-ABC");
		System.out.println(" "+ lh);
		
		
	
	}
	
}
*/
// Treemap
// Unordered and sorted 
// Keys are unique
// if we supply a new value to existing key it will be Replaced;
// Keys can be unique
// Values can be repeated as well as values can be null

import java.util.TreeMap;
public class Day13_3
{
	/*
	public static void main(String[] args) {
		TreeMap<Integer,String> tmp = new TreeMap<Integer,String>();
		tmp.put(10,"PG_DAC");  
		tmp.put(10,"PG-DMC");
		tmp.put(30,"PG-DITISS");
		tmp.put(40,"PG-ABC");
		tmp.put(50,"PG-KDAC");
		tmp.put(50,"Pg-RTU");
		tmp.put(null,null);   // Null Pointer exception
		System.out.println("tmp"+ tmp);
	
	}
	*/
	
	
}


