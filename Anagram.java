import java.util.*;
public class Anagram {

	public static void main (String[] args) {
		
		String a = "listen";
		String b = "slient";
		
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));
		
	}
}
