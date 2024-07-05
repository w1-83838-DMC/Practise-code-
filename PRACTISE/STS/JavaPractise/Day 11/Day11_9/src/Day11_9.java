// Test is a class who is taking two generic type parameter

class Test<T,U>
{
	T n1;
	U n2;
	
	Test()
	{
		
	}
	Test(T n1, U n2)
	{
		this.n1= n1;
		this.n2= n2;
	}
	void disp()
	{
		System.out.println("First Value "+this.n1 + " Second Value "+ this.n2);
	}
}
public class Day11_9 {
	public static void main(String[] args) {
		Test<Integer,Integer> t1= new Test<Integer,Integer>(14,98);
		Test<String,Integer> t2= new Test<String,Integer>("Ajay",76);
		t1.disp();
		t2.disp();
	}
	

}
