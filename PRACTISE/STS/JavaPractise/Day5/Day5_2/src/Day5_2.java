/*
class test
{
	static int n1;
	static int n2;
	
	void display()
	{
		System.out.println(" N1 = "+ n1 + " N2 = " + n2 );
	}
}


public class Day5_2 {
	public static void main(String[] args) {
		test t1= new test();
//		System.out.println(t1);  /// get.class().getName() + @ + hexcode 
		t1.display();  // 0  0 
		}
	
}
*/
class test
{
	static int n1;
	static int n2;
	static int n3; // we can not access n3 inside static void display() method
	
	void display()
	{
		System.out.println("N1 = "+ n1 + " N2 = "+ n2 + " N3 = "+ n3);
	}
	
	
}

public class Day5_2
{
	public static void main(String[] args) {
		test t1= new test();
		t1.display();
		//test.display();
		
		
		
	}
}

