//class Demo<T>
//{
//	T n1; // filed of a class
//	T n2; // filed of a class
//	Demo() // parameterless Constructor
//	{
//		
//	}
//	Demo(T n1) // parameterized Constructor is taking one argument of type T which is generic type 
//	{
//		this.n1=n1;
//	}
//	Demo(T n1,T n2)
//	{
//		this.n1=n1;
//		this.n2=n2;
//	}
//	void display()
//	{
//		System.out.println(" Value1:  "+ this.n1 + " Value2:  "+ this.n2);
//		
//	}
//}
//public class Day11_6 {
//
//	public static void main(String[] args) {
//		Demo d1= new Demo(12); // raw type
//		Demo d2= new Demo(12,67); // raw type 
//		Demo d3= new Demo(13f,43f);  // raw type 
//		d1.display();
//		d2.display();
//		d3.display();
//		
//	}
//}

class Demo<T>
{
	T n1;
	T n2;
	
	Demo()
	{
		
	}
	
	Demo(T n1)
	{
		this.n1=n1;
		
	}
//	Demo(T n1, T n2)
//	{
//		this.n1=n1;
//		this.n2=n2;
//	
//	}
	void display()
	{
		System.out.println(" n1:" + this.n1);
	}
	
	public static void main(String[] args) {
		
		Demo<Integer> d2= new Demo<Integer>(); // Type parameter is a Integer 
		Demo<Integer> d3= new Demo<Integer>(12);// Type parameter is a Integer
		Demo<Float>d4 = new Demo<Float>(3.4f); // Type parameter is a Float its an non-Primitive its wrapper class
		Demo<String>d5= new Demo<String>("Sunbeam");
		Demo<String>d6= new Demo<String>("PG-DMC");// type parameter is a String 
		Demo<Integer>d7= new Demo<Integer>(12,45); // javac error 
		
		d2.display();
		d3.display();
		d4.display();
		d5.display();
		d6.display();
		
	}
	
}
