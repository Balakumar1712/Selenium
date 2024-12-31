import java.util.ArrayList;
import java.util.*;

public class BubbleSort {

	
	public static void Bubble(int[] arr) {
		int n = arr.length;
		int t;
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-1; j++) {
				if(arr[j-1]>arr[j]) {
					t = arr[j-1];
					arr[j-1] = arr[i];
					arr[i] = t;
				}
			}
		}
		
	
	}
	public static void main(String[] args) {
		int[] arr = {2,7,31,84,23,9};
		
		Bubble(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);		}

		
	}
	

}
