

/*Final variables final variables can be initialized at the same line Final varaible can be assigned with some value at the later stage final variable can be taken some input from user*/
//public class Day4_8 {
//	public static void main(String[] args) {
//		final int num=25; // once variable is final we can't modify it 
//		num++;  
//		System.out.println(" Num " +num);
//	}
//
//}



//public class Day4_8
//{
//	public static void main(String[] args) {
//		final int num;  // decleration of final local variable 
//		num=65;  // defining;
//		System.out.println("Num= "+num);
//		num++;  // num varaible is final we can't change it 
//		
//	}
//}

//import java.util.*;
//public class Day4_8
//{
//	public static void main(String[] args) {
//		final int num; // decleration of final  num varable 
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Number : ");
//		num=sc.nextInt();
//		System.out.println("num = "+num);
//		num++;  // javac error 
//	}
//}


// final filed (data member )

// must be initialized at the time of declaration only 
//
//class test
//{
//	final float PI = 3.14f;  // final filed
//	
//	// final float PI // javac error
//	
//	void display()
//	{
//		System.out.println(" PI =  "+this.PI);
//		
//	}
//	
//}
//
//class Day4_8
//{
//	public static void main(String[] args) {
//		test t1= new test();
//		t1.display();
//	
//		
//	}
//}


/* Final filed must be initialized at the time of declaration only */

class Test
{
	final float PI = 3.14f;
	// final float PI; // javac error
	
	void display()
	{
		System.out.println("PI " + this.PI);
	}
	
}
class Day4_8
{
	public static void main(String[] args) {
		
	
	Test t1= new Test();
	t1.display();
	}
}






