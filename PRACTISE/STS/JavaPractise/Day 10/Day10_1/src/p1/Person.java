package p1;

public class Person {
	private String name;
	private int age;
	
	Person()
	{
		
	}
	Person(String name, int age)
	{
		this.name= name;
		this.age= age;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setage(int age)
	{
		this.age=age;
		
	}
	public int getage()
	{
		return age;
	}
	
	public String toString()
	{
		return " Name - "+ name + " age "+ age;
	}
	public void test()
	{
		System.out.println("Inside Person class test method ");
	}
	

}
