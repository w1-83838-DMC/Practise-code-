package p1;

public interface Printer {
	int data = 12345;
	// implicitly done public static final int data =12345;
	// java implicitly done 
	void print(String msg);  // declare only here in Interface 
	// iplicitly done public asbstract void print(String msg)
	// inside interface its implicity converted By compiler as public abstract
}
