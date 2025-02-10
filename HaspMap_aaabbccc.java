import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HaspMap_aaabbccc {

	public static void main(String[] args) {
		String str = "aaabbccc";
		
		Map<String, Integer> c = new HashMap<>();
		
		String[] l= str.split("");
	for(String lttr : l) {
		if(c.containsKey(lttr)) {
			c.put(lttr, c.get(lttr)+1);
		}
		else
		{
			c.put(lttr, 1);
		}
		
	}
	
	for(Entry c1 : c.entrySet())
	{
		System.out.print(c1.getKey()+""+c1.getValue());
		
	}
	
//	for(Integer c1 : c.values())
//	{
//		System.out.print(c1);
//		
//	}
	
	}

}
