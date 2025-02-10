
public class SeparatelowAndUp {

	public static void main(String[] args) {
		
		String str = "AaBbCcDd";
		
		StringBuilder low = new StringBuilder();
		StringBuilder up = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(c>='a' && c<='z') 
				{low.append(c);}
			
			if(c>='A' && c<='Z') 
			{up.append(c);}
			
		}
		System.out.println(low);
		System.out.println(up);
	}

}
