import java.util.HashMap; 
import java.util.Set;
import java.util.Collection;
public class Day13_4 {
	// set can accpct only unique values
	public static void main(String[] args) 
	{
		HashMap<Integer,String>hm= new HashMap<Integer,String>();
		hm.put(10,"PG-DMC");
		hm.put(20,"PG-DAC");
		hm.put(30,"PG-DBDA");
		hm.put(40,"PG-DITIS");
		
		System.out.println("Hash Map "+ hm);
		Set<Integer> st= hm.keySet(); // fetces the key from HashMap
		System.out.println(st);
		
		Collection<String>col=hm.values(); // fetches the value from HashMap
		System.out.println(col);
		
		
		
	}

}
