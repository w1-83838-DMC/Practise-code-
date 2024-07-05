class Test
{
	static void m1()
	{
		System.out.println("Static m1 method");
	}
	static void m2()
	{
		System.out.println("void m1 method ");
	}
	void m3()  // non static 
	{
		System.out.println("void m3 method ");
	}
	static void m4()
	{
		System.out.println("Static void m4 method ");
	}
		
}


public class Day4_13 {
	public static void main(String[] args) 
	{
		Test t1= new Test();
		t1.m3();  // non static m3 method can access using object name 
		Test.m1(); // static method can access using class name
		Test.m2();
		Test.m4();
		
		
	}

}
