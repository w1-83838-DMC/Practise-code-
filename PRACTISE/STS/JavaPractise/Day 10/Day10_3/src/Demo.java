import java.util.Objects;

public class Demo {
	int n1;
	Demo()
	{
	}
	Demo(int n1)
	{
		this.n1=n1;	
	}
	// ToString
	public String toString()
	{
		return "Demo[n1= "+ n1 +"]";
	}
	// hashcodd
	public int hashCode() {
		return Objects.hash(n1);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		return n1 == other.n1;
	}
	public static void main(String[] args) {
		Demo d1= new Demo(12);
		Demo d2= new Demo(14);
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}
	
		
}
