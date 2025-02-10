import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MirrorArray {

	public static void main(String[] args) {
		
		int[] arr = {1,6,3,9};
		
		List<Integer> arrlist1 = IntStream.of(arr).boxed().collect(Collectors.toList());
			
		List<Integer> mirror = arrlist1.reversed();
		
		arrlist1.addAll(mirror);
		
		System.out.println(arrlist1);
		


	}

}
