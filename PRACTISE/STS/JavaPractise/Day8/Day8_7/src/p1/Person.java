package p1;

public class Person {
	private String name;
	private int age;
	
	Person()
	{
		super();
		
	}
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(" Name "+ name + " age is  "+ age);
	}
	public String ToString()
	{
		System.out.println(super.toString());
		return "Name "+ name + "Age " + age; 
	}

}
