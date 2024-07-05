public class Day7_1
{
	enum operations
	{
		EXIT,ADD,SUB,MUL,DIV;
	}
	public static void main(String[] args) {
		operations op= operations.SUB;
		
		switch(op)
		{
			case ADD:
				System.out.println("Addition of Two Number is "+(12+15));
				break;
			case SUB:
				System.out.println("Substraction of Two Number is "+(56-13));
				break;
			case MUL:
				System.out.println("Multiplication of Two Number is "+(13*4));
		
		}
			
	}
}