/* if class MathDemo is not having Static method so to call non static Method then we use  instance/object name  */


class MathDemo
{
	int num1;
	int num2;
	
	MathDemo() // parameterless Constructor  // when MathDemo object is created Then filed of Mathdemo is intialize it with the Given varaible
	{
		this.num1=1200;
		this.num2=897;
	}MathDemo(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	void addition()
	{
		System.out.println("Addition of  num1 and num2 is " + (this.num1 +this.num2) );	
	}
	void substraction()
	{
		System.out.println("Substraction of num1 and num2 is " + (this.num1 - this.num2));
	}
	void Multiplication()
	{
		System.out.println("Multiplication of num1 and num2 is " + (this.num1 * this.num2));
	}
	void Division()
	{
		System.out.println("Division of num1 and num2 is " + (this.num1 / this.num2));
	}
	
	
}

public class Day4_11 {
	public static void main(String[] args) {
		MathDemo md= new MathDemo();
		System.out.println(md);
		md.addition();// using object we are accessing the non static method 
		md.substraction(); // using the object we are accessing thr non static method
		md.Multiplication();
		md.Division();
		
	}

}
