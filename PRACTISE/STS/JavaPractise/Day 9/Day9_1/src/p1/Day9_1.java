package p1;

public class Day9_1 {

	public static void main(String[] args) {
		NetworkPrinter np = new NetworkPrinter();
		np.print("XYZ");
		np.m1();
		NetworkPrinter.f2();
		System.out.println(" --------------");
		
		FilePrinter fp= new FilePrinter();
		fp.print("ABC");
		System.out.println("---------------");
		
		ConsolePrinter cp = new ConsolePrinter();
		cp.print("XYZZZZ");
		
		

	}

}
