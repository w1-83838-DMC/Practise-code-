// take one input from user using command line argument 
// if number < 0 throw one exception "NegativeNumberException"

class NegativeNumberException extends Exception
{
	NegativeNumberException()  // parameterless Constructor
	{
		System.out.println("user defined Exception class ");
	}
	
}
class Day11_3
{
	public static void main(String[] args) 
	{
		try {
		int n1= Integer.parseInt(args[0]);
		if(n1<0)
		{
			throw new NegativeNumberException();
		}
		else
		{
			System.out.println("Number " + n1);
		}
		}catch(NegativeNumberException e)
		{
			System.out.println("You have Supplied Negative input for user ");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please supply command line Argument ");
		}
		
	}
}
