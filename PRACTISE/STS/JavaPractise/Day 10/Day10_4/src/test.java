class Outer  // create Outer.class file
{
	Outer()
	{
		System.out.println("Outer class Constructor ");
		
	}
	class Inner
	{
		Inner()
		{
			System.out.println("Inner class Constructor ");
		}
		
	}
	
}
public class test {
	public static void main(String[] args) {
		Outer ot= new Outer();  //Outer class Object is created
		Outer.Inner in = ot.new Inner(); // Inner class Object is created 
		Outer.Inner i = new Outer().new Inner();
		
	}
	

}
