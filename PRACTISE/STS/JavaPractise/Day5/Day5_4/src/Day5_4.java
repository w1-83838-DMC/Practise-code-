public class Day5_4 {
	static int num1;// static filed
	static int num2; // static filed 
	// static intializer block
	static
	{
		num1=190;
		num2=100;
	}
	static void add()
	{
		System.out.println("Addition of num1 and num2 " + (num1 + num2 ));
	}
	static void sub()
	{
		System.out.println("Substraction of num1 and num2 " + (num1 - num2));
	}
	static void mul()
	{
		System.out.println("Multiplication of num1 and num2 " + (num1 * num2));
	}
	static void div()
	{
		System.out.println("Division of num1 and num2 " + (num1 / num2));
	}
	void m1()
	{
		System.out.println("Inside m1 method ");
	}
	
	public static void main(String[] args) {
		
//		Day5_4 dobj= new Day5_4();  // for non static method to static method if the method is non static then we have to create object of class then we can access it 
//		dobj.add();
//		dobj.sub();
//		dobj.mul();
//		dobj.div();
		
		Day5_4.add();
		Day5_4.sub();
		Day5_4.mul();
		div();
		Day5_4 dobj= new Day5_4();
		dobj.m1();
		
		
	
	}
	
	
}
