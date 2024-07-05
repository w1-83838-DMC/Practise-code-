import java.util.Scanner;

public class Day7_2 {
	enum operations
	{
		EXIT,ADD,SUB,MUL,DIV; 
	}

	public static void main(String[] args) 
	{
		int choice=0;
		Scanner sc=new Scanner(System.in);
//		System.out.println(op[0]);
//		System.out.println(op[1]);
//		System.out.println(op[2]);
//		System.out.println(op[3]);
//		System.out.println(op[4]);
//		for(operations i:op)
//		{
//			System.out.println(i+ "\t");
//			
//		}
		do {
		System.out.println("Enter the Choice :1.ADD, 2.SUB 3.MUL 4.DIV : ");
		choice = sc.nextInt();
		Day7_2.operations op= operations.values()[choice];
		switch(op)
		{
			case ADD:
				System.out.println("Addition of Two Number "+(12+14));
				break;
			case SUB:
				System.out.println("Substraction of Two Number "+(12-76));
				break;
			case MUL:
				System.out.println("Multiplication of Two Number "+(12*8));
				break;
			case DIV:
				System.out.println("Division of Two Number "+(14/3));
				break;
		}
		}while(choice!=0);
	}

}
