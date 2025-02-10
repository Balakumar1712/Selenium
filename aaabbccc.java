
public class aaabbccc {

	public static void main(String[] args) {
		String str = "aaabbccc";
		
		char a = 'a';
		char b = 'b';
		char c = 'c';
		
		int count = 0;
		
		for(char ch1 : str.toCharArray()) {
		if (ch1 == a){count ++;}
		}
		System.out.print(a+""+count);
		
		count = 0;
		for(char ch2 : str.toCharArray()) {
		if (ch2 == b){count ++;}}
		System.out.print(b+""+count);
		
		count = 0;
		for(char ch3 : str.toCharArray()) {
		if (ch3 == c){count ++;}
		}
		System.out.print(c+""+count);

	}

}
