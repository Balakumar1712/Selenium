/*For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5. 
It starts with the keyword for like a normal for-loop.
Instead of declaring and initializing a loop counter variable,
you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name.
In the loop body, you can use the loop variable you created rather than using an indexed array element.  */
public class Foreach {

	public static void main (String[] args) {
	int arr[] = {1,2,3,4,5,7};
	int sum = 0;
	
	for(int i = 0; i<arr.length;i++) {System.out.print(arr[i]);}
	
	for(int x : arr) {
		sum += x;
	}
	System.out.println("sum="+ sum);
	}
}
