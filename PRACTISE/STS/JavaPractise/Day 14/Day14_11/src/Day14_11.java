// can we define a method in the interface
// Yes but we shall make that method compulsory as static 
// we can call that defined method by using Interafacename.methodname()
interface test
{
	public void cal();  // Only Decleration
	
	static void m1()
	{
		System.out.println("Core java Programming ");
	}
}
class Demo implements test
{
	public void cal()
	{
		int a=12;
		int b=13;
		System.out.println("a and b addition is "+(a+b));
	}
	
}
public class Day14_11
{
	public static void main(String[] args) {
		Demo dobj= new Demo();
		dobj.cal();
		test.m1();
		
	}
}
