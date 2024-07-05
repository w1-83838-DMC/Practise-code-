/*
class Test<T>
{
	void display(T value)
	{
		System.out.println("Value ="+value);
	}
}
public class Day11_10 {
	public static void main(String[] args) {
		Test<Integer> t1= new Test<Integer>();
		
		Test<Float> t2=new Test<Float>();
		
		Test<Double> t3= new Test<Double>();
		
		Test<String> t4= new Test<String>();

		t1.display(10);
		t2.display(12.8f);
		t3.display(13.00);
		t4.display("Ajay");
	
	}

}
*/

class Test<T,S extends Number>
{
	
	void disp(T value)  // disp() method one argument of type parameter
 	{
		System.out.println(" Value "+ value);
		
	}
	void display(T value ,S value2)
	{
		System.out.println(" value : "+ value + " value 2 : "+ value2);
	}
	
}
public class Day11_10
{
	public static void main(String[] args) {
		
		//Test<Integer> t1= new Test<Integer>();
		Test<Integer,Float> t2= new Test<Integer,Float>();
		t2.display(12,4.5f);
		
	
	}
}
