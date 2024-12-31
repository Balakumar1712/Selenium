import java.util.*;
import java.io.*; 

public class Add {

	public static void main(String[] args) {
			
		HashMap<Integer, Character> map = new HashMap<>();
		map.put(1,'a');
		System.out.println(map);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		Collection<String> str = new LinkedList<String>();
		str.add("bala");
		str.add("Kumar");
		System.out.println(str);
		
		
		if(str.contains("bala")) {
			System.out.println("String Present");
		}
		else
		{System.out.println("String Not Present");}
	}
	
	
  
		
}
