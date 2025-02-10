
public class CommonNumInaArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 5, 8, 9};
		int com = arr[0];
		
		for(int i =0 ; i<arr.length ; i++) {
			if (arr[i] == com) {
				com = arr[i];
			}
			
		}
		System.out.print(com);
	}

}
