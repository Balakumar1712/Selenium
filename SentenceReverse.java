import java.util.Collections;

public class SentenceReverse {

	public static void main(String[] args) {
		
		String str = "Selenium Automation Testing";
		
		String Word[] = str.split("\\s");
		
		String revword = "";
		
		for(String w : Word) {
			StringBuilder s = new StringBuilder(w);
			s.reverse();
			
			revword = revword+ s.toString()+" ";
			
		}
			System.out.println(revword.trim());
	}

}
