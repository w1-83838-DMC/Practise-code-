import java.util.Arrays;
public class Day6_3 {

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5};
		int a2[]= {11,22,33,44,55};
		int a3[]= {1,2,3,4,5};
		
		System.out.println(" a1==a2 "+(a1==a2));
		System.out.println(" a1==a3 "+(a1==a3));
		
		System.out.println("a1 equals(a2)" + a1.equals(a2));
		
		System.out.println("a2 equals(a3)" + a2.equals(a3));
		
		System.out.println("A1 equals A2 = "+ Arrays.equals(a1,a2));
		
		System.out.println("A1 equals A3 = "+ Arrays.equals(a1,a3)); // it will return true Contents are same 
		
		System.out.println("A2 equals A3 = "+ Arrays.equals(a2, a3));
		
		
		

	}

}
