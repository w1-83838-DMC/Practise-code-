/*
public class Day5_9 {
	public static void main(String[] args) {
		int arr[]= new int[5];
		// arr is holding int type value --> int --> primitive type
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
	}

}
*/
/*
public class Day5_9
{
	public static void main(String[] args) 
	{
		Integer arr[]= new Integer[5];  // Non primitive 
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print( arr[i] + "\t");
		}
	System.out.println();
		
	}
}
*/
//class Day5_9
//{
//	public static void main(String[] args) 
//	{
//		Integer n1= new Integer(50);
//		System.out.println(n1);
//		
//	}
//}

//class Day5_9
//{
//	public static void main(String[] args) {
//		Float arr[]= new Float[4];
//		arr[0]=4.5f;
//		arr[1]=3.4f;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//	}
//}

//public class Day5_9
//{
//	public static void main(String[] args) {
//		
//		Float arr[]= new Float[4];
//		arr[0]=3.4f;
//		arr[1]=5.6f;
//		arr[2]=9.0f;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);  // ArrayIndexOutOfBoundexception
//		System.out.println(arr[5]);
//	}
//}

//public class Day5_9
//{
//	public static void main(String[] args) {
//		Integer a1[]= new Integer[4];
//		Float f1[]= new Float[4];
//		Double d1[]= new Double[4];
//		Character c1[]= new Character[4];
//		boolean b1[]= new boolean[4];
//		System.out.println("a1 = "+ a1.getClass());
//		System.out.println("f1 = "+ f1.getClass());
//		System.err.println("d1 = "+ d1.getClass());
//		System.out.println("c1 = "+ c1.getClass());
//		System.out.println("b1 = "+ b1.getClass());
//		
//	}
//}


public class Day5_9
{
	public static void main(String[] args) {
		int a1[]= new int [4];
		float f1[]= new float[4];
		char c1[]= new char[4];
		boolean b1[]= new boolean[4];
		
		System.out.println(a1.getClass());  //class [I
		System.out.println(f1.getClass());  //class [F
		System.out.println(c1.getClass());  //class [C
		System.out.println(b1.getClass());  //class [Z
	}
}





