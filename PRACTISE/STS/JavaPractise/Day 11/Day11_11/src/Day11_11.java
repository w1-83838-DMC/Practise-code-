//class Test<T,U>
//{
//	T n1;
//	U n2;
//	
//	Test() // parameterless Constructor
//	{
//		
//	}
//	Test(T n1, U n2)
//	{
//		this.n1=n1;
//		this.n2=n2;
//		
//	}
//	void display()
//	{
//		System.out.println("First Value : "+ this.n1 + " Second Value : " + this.n2);
//	}
//	
//}
//
//
//public class Day11_11 {
//	public static void main(String[] args) {
//		Test<Integer,String> t1= new Test<Integer,String>(12,"Ajay");
//		Test<Float,String> t2= new Test<Float,String>(4.3f,"Jay");
//		Test<Double,String>t3= new Test<Double,String>(12.2,"Yash");
//		t1.display();
//		t2.display();
//		t3.display();
//		
//	}
//
//}

class Test<T,U>  // Test is a class who is Excepting Two generic type parameter T
{
	private T n1;
	private U n2;
	
	Test() // parameterless Constructor
	{
		
	}
	Test(T n1) // parameterized constructor
	{
		this.n1= n1;
		
	}
	public void setvalue(T n1) // method setvalue() is taking one argument of generic Type parameter T
	{
		this.n1=n1;
		
	}
	public T getValue()
	{
		return n1;
	}
	public void setValueofn1andn2(T n1,U n2) // method setValueofn1andn2 is taking two paramater of generic type parameter 
	{
		this.n1= n1;
		this.n2= n2;
	}
	public T getValueofn1andn2()
	{
		return (T) ("First value of return generic  "+ this.n1 + " Second value of return generic " + this.n2);
	}
	public void display()
	{
		System.out.println("First value : " +this.n1 + " Second value :"+ this.n2);
	}
	
}
public class Day11_11
{
	public static void main(String[] args) {
		Test<Integer,String> t1= new Test<Integer,String>(12);
		t1.display();
		t1.setvalue(14);
		int n2=t1.getValue();
		System.out.println("n1:  "+n2);
		t1.setValueofn1andn2(13,"Ajay");
		t1.display();
		
		Test<Integer,Integer> t2=new Test<Integer,Integer>();
		t2.setValueofn1andn2(12,56);
		System.out.println(t2.getValueofn1andn2());		
	
	}
}
