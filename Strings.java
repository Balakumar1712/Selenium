import java.lang.String; 
/*Squence of characters enclose within the double quotes
  it is available in java.lang Pack
  Array of characters work same as string
  strings object are immutable(un-change)
  string objects are stored in a special memory area known as string constant pool
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed
 */
public class Strings {

	public static void main(String[] args) {
		String a = "BALA";// creating Java string by literal
		String b = new String("KUMAR");// creating Java string by new keyword

		System.out.println("Length of a string=" + a.length());
		System.out.println("Find a character of b string=" + b.charAt(3));
		System.out.println("Convert to lowecase=" + a.toLowerCase());
		System.out.println("Convert to Uppercase=" + a.toUpperCase());
		
		String c = "Maveric Systems";
		System.out.println("Location of a string=" + c.indexOf("Systems"));
		
		System.out.println("concatenate  of a string=" + a+ "" +b);
		
		System.out.println("Contains=" +c.contains("Systems"));
		
		char[] ab = a.toCharArray();
		for(int i=0; i<ab.length; i++) {
			System.out.print(ab[i]);
		}
		
		int j=0;
		while(j<ab.length) {
			System.out.println(ab[j]);
			j++;
		}
	}

}
