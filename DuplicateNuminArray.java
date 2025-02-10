import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNuminArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 5, 8, 9};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int[] element = new int[set.size()];
		int index = 0;
		for(int num : set) {
			element[index++]= num;
		}
		
		System.out.println(Arrays.toString(element));
	}

}
