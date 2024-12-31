import java.lang.String;
import java.util.*;

public class Plaindrome {

	public static void main(String[] args) {
	
		String str = "LEVEL";
		boolean str1 = new StringBuilder(str).reverse().toString().equals(str);
		System.out.println(str1);
	}
}
