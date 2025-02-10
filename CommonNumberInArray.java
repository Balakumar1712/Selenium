
public class CommonNumberInArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 7, 8, 0};
		int[] arr2 = {5, 7, 0, 3};
		
		for(int i=0 ; i<arr1.length; i++) {
			for(int j=0 ; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]+"");
				}
			}
			
		}
	}

}
