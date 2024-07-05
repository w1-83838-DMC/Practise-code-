package p1;

public class Circle extends shape{
	int radius;
	
	Circle(int radius, int x, int y)
	{
		super(x,y);
		this.radius=radius;
	}

	public void area()
	{
		 System.out.println("Area of Circle "+Math.PI*this.radius*this.radius);
	}
	public String toString()
	{
		return "Circle [rad= + ";
	}
	
	
	
	
	
	

}
