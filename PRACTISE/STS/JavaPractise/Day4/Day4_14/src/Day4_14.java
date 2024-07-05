public class Day4_14 {
	static void m1()
	{
		System.out.println("static m1 method ");
	}
	static void m2()
	{
		System.out.println("static m2 method");
	}
	void m3()
	{
		System.out.println("non static m3 method ");
	}
	public static void main(String[] args) {
//		Day4_14 dobj=new Day4_14();
//		dobj.m1();
//		dobj.m2();
		Day4_14.m1();
		Day4_14.m2();
		Day4_14 dobj= new Day4_14();
		dobj.m3();
		
	}
}
