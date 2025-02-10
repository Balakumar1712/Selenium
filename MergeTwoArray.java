import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] arr1 = {2, 5, 7, 8};
		int[] arr2 = {6, 8, 9, 2};		
		
		int[] merged = new int[arr1.length + arr2.length];
		
		for(int i=0 ; i<arr1.length; i++ ) {
			merged[i] = arr1[i];
		}
	
		for(int j=0; j<arr2.length; j++) {
			merged[arr1.length+j] = arr2[j];
		}
		Arrays.sort(merged);
		System.out.println("Merge" + Arrays.toString(merged));
		
		
		
	}

}
