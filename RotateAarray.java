
public class RotateAarray {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7};
		int k = 3;
		
		rotate(num, k);
		
		for(int arr : num) {
			System.out.print(arr+" ");
		}
		
	}
	
	
	public static void rotate(int[] num, int k)
	{
		int n = num.length;
		k = k % n;
		reverse(num, 0, n-1);
		reverse(num, 0, k-1);
		reverse(num, k, n-1);
	}
	public static void reverse(int[] num, int start, int end) {
		int temp = num[start];
		num[start] = num[end];
		num[end] = temp;
		end--;
		start++;
	}
}
