import java.util.Arrays;

public class LargestThreeNumInArray {

	public static void main(String[] args) {
		int[] arr = {4,  6, 3, 5,9, 7, 8, 30};
		
		Arrays.sort(arr);
		
		int l = arr.length-3;
		
		for(int i =l; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

}
