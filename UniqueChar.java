
public class UniqueChar {

	 public static void main(String[] args) {
	        int[] array = {1,3,8,6,7,4};
	        
	        findConsecutiveNumbers(array);
	    }

	    public static void findConsecutiveNumbers(int[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i + 1] - array[i] == 1) {
	                System.out.println( array[i]+""+ array[i + 1]);
	            }
	          
	        }
	        
	   }
	}