/* static filed is initialized at the time of decleration (followd)  it is shared among all the object of the class it maintain its state (PERSISITANCE PROPERTY) whoever is update the value last that value is maintained(retain*/
class test
{
	int num1;  // filed // instance filed
	int num2;
	static int num3 =1234;
	
	test() // parameterless Constructor
	{
		this.num1=1;
		this.num2=2;
	}
	test(int num1,int num2) // parameterized constructor
	{
		this.num1=num1;
		this.num2=num2;
	}
	// display() method is non static method inside the non static method we are able to access static as well as non static data 
	void display()
	{
		System.out.println(" Num1 = " + this.num1 +" Num2 = " + this.num2 + " Num3 = "+ test.num3);
	}
	void update()
	{
		num3=num3+100;
	}
}
public class Day5_1 {
	public static void main(String[] args) {
		test t1= new test(12,45);
		test t2= new test();
		test t3= new test(56,89);
		System.out.println("Before update ");
		t1.display();
		t2.display();
		t3.display();
		System.out.println("After update ");
		t1.update();
		t2.update();
		t3.update();
		t1.display();
		t2.display();
		t3.display();
		
	}
	
}
