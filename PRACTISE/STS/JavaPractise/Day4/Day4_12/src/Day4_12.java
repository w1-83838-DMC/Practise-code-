/*class */


class MathDemo
{	
	
	static void addition()
	{
		int n1=10, n2=98;
		System.out.println("Addition of num1 and num2 is "+(n1 + n2));
	}
//	public String toString()  // overidden in MathDemo class
//	{
//		return "Num1 = " +this.num1 + " Num2 = " +this.num2;
//	}
	static void substraction()
	{
		int n1=23, n2=76;
		System.out.println("Substraction of num1 and num2 is "+(n1-n2));
	}
	static void Multiplication()
	{
		int n1=12, n2=5;
		System.out.println("Multipliaction of num1 and num2 is "+(n1*n2));
		
	}
	static void Division()
	{
		int n1=23, n2=9;
		System.out.println("Division of num1 and num2 is "+(n1/n2));
	}
	
	
}
public class Day4_12 
{
	public static void main(String[] args) 
	{
//		MathDemo md= new MathDemo();
//		System.out.println(md);
		MathDemo.addition();
		MathDemo.substraction();
		MathDemo.Multiplication();
		MathDemo.Division();
		
		
		
		
	}
	

}
