
interface square
{
	public int getArea(int val);
}
interface Rectangle
{
	public int cal(int l, int n);
}
public class Test {
	public static void main(String[] args)
	{
		square sq=(side)->{return side*side;};
		// sp is a reference varaible of functional interface type
		System.out.println("Area = "+ sq.getArea(4));
		
		Rectangle ro=(length,breath)->{return length*breath;};
		System.out.println("Rectangle = "+ ro.cal(2, 3));
	}
}
