package p1;

// abstract class can not be instantiated
// we can not create the object of abstract class
// but we can create Reference of abstract class



public class Day10_2 {
	public static void main(String[] args) {
		//shape sp = new Circle(5,10,20);
		//sp.area(); // shape sp is reference of abstract class type
		// area method will called from circle class
		
//		sp = new Rectangle(6,9,3,7);
//		sp.area();
		
		
		shape sp[]={new Circle(12,1,2),new Rectangle(1,2,3,4)};
		sp[0].area();  // area() will called from circle class
		sp[1].area();  // area() will called from Rectangle class
		
		}
		
	
	}

