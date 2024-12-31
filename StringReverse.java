import java.lang.String;
import java.util.*;
public class StringReverse {
	
	public static void StringReverseArray(String a) 
	{
		char [] arr = a.toCharArray();
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left ++;
			right --;
		}
		System.out.println(arr);
	} 

	public static void main(String[] args) {
		String s = "Maveric";
		String str = new StringBuilder(s).reverse().toString();	
		System.out.println(str);
		
		StringReverseArray("Bala");
	}


}
