interface i1
{
	default public void disp()
	{
		System.out.println("Sunbeam infotech ");
		
	}
	
}
interface i2
{
	default public void disp()
	{
		System.out.println("CDAC PG COURSES ");
		
	}
	
}
class Demo implements i1,i2
{
	public void disp()
	{
		i1.super.disp();
		i2.super.disp();
		System.out.println("PG- DMC Core java ");
		
		
	}
	
}

public class Day14_13 
{
	public static void main(String[] args) {
		Demo dobj= new Demo();
		dobj.disp();
	}
}
