//method reference to a constructor

interface Test
{
	Demo disp(String str);
}
class Demo
{
	public Demo(String s)
	{
		System.out.println("String data "+ s);
		
	}
}
public class Day15_9 {
	public static void main(String[] args) 
	{
		Test tref= Demo::new;
		tref.disp(" Sunbeam ");
		
	}

}
