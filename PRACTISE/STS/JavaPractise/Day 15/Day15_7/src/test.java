// method reference to the static method of the class
// BiFunction is a predefined Functional Interface
// it is used to perform mathematical  calculations

import java.util.function.BiFunction;

class Multiplications
{
	public static int multiply(int a, int b)
	{
		return a*b;
	}
}

public class test {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>bref= Multiplications::multiply;
		System.out.println(bref.apply(2,7));
	}
}
