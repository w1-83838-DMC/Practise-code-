
public class Day7_3 {

//	public static void main(String[] args) 
//	{
//		String s1="sunbeam";
//		String s2="Sunbeam";
//		String str="sunbeam";
//		System.out.println("s1 = "+s1 + "s2 = "+ s2 + "str = "+ str);
//	
//
//	}
	
	/* String is a immutable in nature we can't modify it */
//	public static void main(String[] args) {
//		String str="Sunbeam";
//		System.out.println("str = "+ str);
//		System.out.println("Str = "+ str + " DMC COURSE");
//		str = str+" PGDMC ";
//		System.out.println(str);
//	}
	
//	public static void main(String[] args) {
//		String str="Sunbeam";
//		System.out.println(str.charAt(0));
//		
//	}
	
//// compareTo(String anotherString)
//	public static void main(String[] args) {
//		
//		String s1= "Ajay";
//		String s2= "ajay";
//		int value=s1.compareTo(s2);
//		System.out.println("Value are + " + value);
//		
//		System.out.println("s1 compare to ignore case s2 "+s1.compareToIgnoreCase(s2));
//		
//		String s3= "ajay";
//		String s4= "Ajay";
//		value=s3.compareTo(s4);
//		System.out.println("value are " + value );
//		
//		String s5= "abc";
//		String s6= "abe";
//		System.out.println(" s5 and s6 " +s5.compareTo(s6));
		
		// concat(String str)
//	public static void main(String[] args) {
//		String s1="Dr.Akshita";
//		String s2=" Chanchalani";
//		System.out.println(s1.concat(s2));
//	}
//		indexof(int ch)
	
//	public static void main(String[] args) {
//		String str= "Sunbeam infotech";
//		System.out.println(str.indexOf('S'));
//		System.out.println(str.indexOf('i'));
//	}
	// length
//	public static void main(String[] args) {
//		String str="Sunbeam";
//		System.out.println(str.length());
//	}
	
	// Replace 
//	public static void main(String[] args) {
//		String str = "Soon";
//		System.out.println(" Str = " + str);
//		System.out.println(str.replace('S','P'));
//	}
//	public static void main(String[] args) {
//		
//		String str= "sunbeam";
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		
//		String s1="Dr.Akshita";
//		System.out.println("s1 length " + s1.length());
//		String s2= "PGDMC";
//		System.out.println("s2 length " + s2.length());
//	}
	
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Sunbeam");
		System.out.println("sb " +sb);
		System.out.println(sb+ " Infotech ");
		sb.append("infotech");
		System.out.println(" Sb = " + sb);
		sb.deleteCharAt(1);
		System.out.println("Sb = "+ sb);
		
		System.out.println(" Sb = "+ sb);
		sb.insert(1,'P');
		System.out.println(" sb = "+ sb);
		System.out.println("Substring "+ sb.substring(4));
		
		System.out.println(sb.reverse());
		
	}
	
}

