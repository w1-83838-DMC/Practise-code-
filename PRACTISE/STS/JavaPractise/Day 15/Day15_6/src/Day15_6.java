// Method reference 
// 1. Method reference to an instance method of an object
@FunctionalInterface
interface test
{
	void disp();
	
}
class Demo
{
	int num1;
	int num2;
	Demo() // parameterless Constructor
	{
		this.num1=55;
		this.num2=45;
	}
	
	void m1()
	{
		System.out.println("Num1 is " + num1 + " Num2 is "+ num2);
	}
	void m2()
	{
		System.out.println("inside method m2");
	}
	void m3()
	{
		System.out.println("Sunbeam DMC");
		System.out.println("Sunbeam DAC");
	}
}
public class Day15_6 {
	public static void main(String[] args) 
	{
		Demo dobj = new Demo();
		test tref= dobj::m1;
		tref.disp();
		
		test tref1= dobj::m2;
		tref1.disp();
		
		test tref2= dobj::m3;
		tref2.disp();
	
		
	}

}
