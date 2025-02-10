import java.util.*;
public class StringReverseUsingCollection {

	public static void main(String[] args) {
		
		
		List<String> str = new ArrayList<String>();
		
		str.add("Bala");
		str.add("kumar");
		
		System.out.println("Before Reverse :" +str);
		
		Collections.reverse(str);
		
		System.out.println("After Reverse :" +str);
		
		
	}

}
