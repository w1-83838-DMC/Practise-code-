/*final reference  final reference must be initialize it only once with one object we can not initialize the final reference once again*/
class Demo
{
	int num1;
	int num2;
	Demo()  // parameterless constructor 
	{
		this.num1=52;
		this.num2=13;
		
	}
	Demo(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public String toString()
	{
		return "num1 = :"+ num1 + " num =: "+ num2;
	}
	void display()
	{
		System.out.println("num1 = "+ num1 + " num2 = " + num2);
	}
}


//public class Day4_10 {
//	public static void main(String[] args) {
//	
//		Demo d1= new Demo();
//		//System.out.println(d1);  // it will call toString method from object class
//		d1.display();
//		d1=new Demo(90,70);
////		d1.display();
//		System.out.println(d1);
//		
//		
//		
//	}
//
//}

//public class Day4_10
//{
//	public static void main(String[] args) {
//		final Demo dobj= new Demo();  // dobj is a final reference 
////		System.out.println(dobj);
//		dobj.display();
//		dobj=new Demo(23,56);  // javac error
//		dobj.display();  
//		
//	}
//}


//public class Day4_10
//{
//	public static void main(String[] args) {
//		final Demo dobj;
//		dobj= new Demo(12,56);
//		dobj.display();
//		dobj= new Demo(87,98);  // javac error object is final
//	}
//}


