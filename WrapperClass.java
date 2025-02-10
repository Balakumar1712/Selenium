
public class WrapperClass {

	public static void main(String[] args) {
		int i; //Primitive DataType
		float j;
		
		Integer i1 = Integer.valueOf(14); //Boxing or wrapping 
		
		int j1 = i1.intValue(); //UnBoxing or Unwrapping
		
		Integer k = 33; //AutoBoxing
		
		int l = i1; //AutoUnBoxing
		
		String str = "123";
		
		int y = Integer.parseInt(str);
		
//		System.out.println(y);
//		
//		System.out.println(i1);

		System.out.println(l);
		
	}

}
