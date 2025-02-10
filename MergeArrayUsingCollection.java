
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeArrayUsingCollection {


	public static void main(String[] args) {
	
		int[] arr1 = {1,4,7,9,0};
		int[] arr2 = {6,5,9,1,4};
		
		
		List<Integer> arrayList1 = IntStream.of(arr1).boxed().collect(Collectors.toList());
	    
		List<Integer> arrayList2 = IntStream.of(arr2).boxed().collect(Collectors.toList());
		
//		Arrays.sort(arr1);
//		List<int[]> asList = Arrays.asList(arr1);
//		List<Integer> samplelist=new ArrayList<Integer>();
//		
//		for(int q:arr1)
//		{
//			samplelist.add(q);
//			
//		}
//		Collections.sort(samplelist);
//		Collections.rotate(samplelist, 1);
		
		
	    arrayList1.addAll(arrayList2);
	    
	    List<Integer> uniqueNumbers = arrayList1.stream().distinct().collect(Collectors.toList());
		
		//Collections.sort(uniqueNumbers);
		System.out.println(uniqueNumbers);
//		Collections.rotate(uniqueNumbers, 3);
//		System.out.println(uniqueNumbers);
	}

}
