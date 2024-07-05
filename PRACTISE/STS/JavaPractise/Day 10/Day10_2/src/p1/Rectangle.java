package p1;

public class Rectangle extends shape{
	int length,breadth;
	
	public Rectangle(int length, int breadth, int x, int y)
	{
		super(x,y);
		this.length=length;
		this.breadth=breadth;
	}
	

	void area()
	{
		System.out.println("Area of Rectangle = "+(this.length*this.breadth));
	}
	
	public String toString() {
		return " Rectangle [l=" + length + ", b=" + breadth + "] "+super.toString();
	}
}
