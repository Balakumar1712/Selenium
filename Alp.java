
public class Alp {

	public static void main(String args[]) {
		
		String str = "AnfFetII";
		
		char[] c = str.toCharArray();
		
		for(int i= 0; i<c.length; i++) {
			if(i%2 == 0) {
				
				System.out.print(Character.toUpperCase(c[i]));
				
			}
			else {
				
				System.out.print(Character.toLowerCase(c[i]));
			}
			
		}
		
	
	}
}
