class test
{
	void m1()
	{
		System.out.println("Non static m1 method ");
	}
	
	void m2()
	{
		System.out.println("Non static m1 method");
	}
}
public class Day4_15 extends test{
	void m1()
	{
		System.out.println("Non static m1 method which is present inside Day4_15");
	}
	void m2()
	{
		System.out.println("Non static m2 method whic is present inside Day4_15");
	}
}

