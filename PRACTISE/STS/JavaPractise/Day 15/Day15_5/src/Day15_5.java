/*
@FunctionalInterface
interface test
{
	public String getname(); // it is taking 0 Arguments 
	
}
public class Day15_5 
{
	public static void main(String[] args)
	{
		test tref=()->{return "Ajay Surse";};
		System.out.println("Name is "+ tref.getname());
	}
}
*/
@FunctionalInterface
interface test
{
	public String getcompanyname();
	
}
public class Day15_5
{
	public static void main(String[] args) {
		test tcom= ()->{return "MICROSOFT";};
		System.out.println("Company Name is " + tcom.getcompanyname());
		
		
	}
}
