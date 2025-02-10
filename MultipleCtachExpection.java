
public class MultipleCtachExpection {
	
	public static void main (String[] args)
	{
		
		
		try {
			int[] arr = new int[5];
			arr[5] =30/0;
			
		}
		catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
	}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex OutOfBounds Exception: " + e.getMessage());
	}
	  catch (Exception e) {
         System.out.println("General Exception: " + e.getMessage());
     }
}
}