interface calculate
{
	void disp(int a, int b);
}
public class test {
	public static void main(String[] args) 
	{
		calculate cref=(n1,n2)->System.out.println("Addition = "+ (n1+n2));
		cref.disp(12, 10);
		calculate cmul=(a,b)->System.out.println("multiplication = "+ (a*b));
		cmul.disp(12, 8);
		calculate cdiv=(p,q)->System.out.println("Division = "+ (p/q));
		cdiv.disp(12, 4);
		
		
		
	}

}
