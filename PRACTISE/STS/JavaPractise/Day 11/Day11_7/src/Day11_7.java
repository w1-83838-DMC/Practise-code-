class Demo<T,U>
{
	T n1;
	U n2;
	
	Demo()
	{
		
	}
	Demo(T n1,U n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	void display()
	{
		System.out.println(" First Value "+ this.n1 + " Second Value "+ this.n2);
	}
}

public class Day11_7 {
	public static void main(String[] args) {
		Demo<Integer,Integer> d1= new Demo<Integer,Integer>(); // generic type parameter is Integer,Integer
		
		Demo<Integer,Integer> d2= new Demo<Integer,Integer>(12,45);
		
		Demo<String,String> d3= new Demo <String,String>("Ajay","Surse");
		
		d1.display();
		d2.display();
		d3.display();
	
	}

}
