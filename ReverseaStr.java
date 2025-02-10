
public class ReverseaStr {

	public static void main(String[] args) {
		
		String str = "Bala";
		
		char[] c = str.toCharArray();
		int right = c.length-1;
		int left = 0;
		
		while(left<right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;
			
					}
		System.out.println(c);
		String Rstr = c.toString();
		
		if(str == Rstr) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

			}

}
