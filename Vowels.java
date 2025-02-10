
public class Vowels {

	public static void main(String[] args) {
		
		String str = "Balao";
		String vowels = "aieouAEIOU";
		int count = 0;
		
		for(char c : str.toCharArray()) {
			if(vowels.indexOf(c) != -1 ) {
				System.out.println(c + "");
				count++;
			}
			
		}
		System.out.println("Total Number of vowels in String =" +count);
		
	}

}
