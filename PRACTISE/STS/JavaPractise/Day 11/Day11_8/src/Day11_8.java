
class Demo<T,U,Y>
{
	T n1;
	U n2;
	Y n3;
	
	Demo()
	{
		
	}
//	Demo(T n1, U n2)  
//	{
//		this.n1=n1;
//		this.n2=n2;
//	}
	Demo(T n1, U n2, Y n3)
	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		
	}
	void display()
	{
		System.out.println("First value "+this.n1 + " Middle Value "+this.n2 + " Last Value "+ this.n3);
	}

}
public class Day11_8 {
	public static void main(String[] args) {
		
		
		//Demo<Integer,String> d1= new Demo<Integer,String>(123,"Ajay");
		//Demo<Integer,String> d2= new Demo<Integer,String>(345,"Jay");
		Demo<Integer,Integer,Integer> d3= new Demo<Integer,Integer,Integer>(1,2,3);
		Demo<Integer,Float,String> d4= new Demo<Integer,Float,String>(1,2.4f,"Ajay");
		d3.display();
		d4.display();
		//d1.display();
		//d2.display();
		
	
	}
	

}
