
public class ZerostoEnd {

	public static void main(String[] args) {
		
		int [] arr = {1,0,6,0,8};
		Movezero(arr);
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }
	
public static void Movezero(int[] arr) {
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
				if(arr[i] != 0) {
					arr[index++]= arr[i];
				}
			}
		while(index < arr.length) {
			arr[index++] = 0;
		}
}
	
	}
	

