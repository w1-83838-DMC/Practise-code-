import java.util.Scanner;

interface calculate
{
	void disp(int a, int b);
}
public class test {
	public static void main(String[] args) {
		int val1, val2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Value : ");
		val1= sc.nextInt();
		System.out.println("Enter the Second Value : ");
		val2=sc.nextInt();
		
		calculate cadd= (a,b)->System.out.println("Addition = "+ (a+b));
		cadd.disp(val1, val2);
		System.out.println("Enter the First Value : ");
		val1= sc.nextInt();
		System.out.println("Enter the Second Value : ");
		val2=sc.nextInt();
		
		calculate cmul= (a,b) ->System.out.println("Multiplicatioon = "+ (a*b));
		cmul.disp(val1, val2);
		
		System.out.println("Enter the First value : ");
		val1=sc.nextInt();
		System.out.println("Enter the Second value : ");
		val2=sc.nextInt();
		calculate cdiv=(a,b)->System.out.println("Division = "+ (a/b));
		cdiv.disp(val1, val2);
	}

}
