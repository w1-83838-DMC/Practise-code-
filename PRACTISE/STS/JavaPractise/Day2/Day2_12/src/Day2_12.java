
public class Day2_12 
{
	public static void main(String[] args) 
	{
		int n1,n2,max,min,addition,substraction, multiplication, Division;
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		
		max=Integer.max(n1, n2);
		
		System.out.println("Maximum of Two Number is "+max);
		
		min=Integer.min(n1,n2);
		
		System.out.println("Minimum of Two Number is "+min);
		
		addition=Integer.sum(n1,n2);
		
		System.out.println("Addition of Two Number is "+addition);
		
		substraction=n1-n2;
		
		System.out.println("Substraction of Two Number is "+substraction);
		
		multiplication=n1*n2;
		
		System.out.println("Multiplication of two Number is "+multiplication);
		
		Division= n1/n2;
		
		System.out.println("Divison of two Number is "+Division);
		
		
	}
	

}
