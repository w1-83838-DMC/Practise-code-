package p1;

public abstract class  shape {
	int x;
	int y;
	
	public shape(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	abstract void area();
	
	public String toString()
	{
		return "Boundriesshape= x " + this.x + " Y " + this.y;
	}
	
	
	
	
	

}
