// Default method are those methods who are preceded with keyword "default"
// we can define default methods once inside the interface 
// the class or the interface who implements it can use it dirextly
interface test
{
	default public void disp()
	{
		System.out.println("Sunbeam infotech ");
	}
}
class Demo implements test 
{
	public void disp()
	{
		test.super.disp();
		System.out.println("PG-DMC Core Java ");
	}
	
}
public class Day14_12 {
	public static void main(String[] args) {
		Demo dobj= new Demo();
		dobj.disp();
	}

}
