
public class Methods {
	//Methods - carried out a specific task, reusable
	// method return one value only
	//methods input - parameter/arguments
	
	public static int Add(int a, int b){// method definition
		int add = a + b;
		return add;
	}
	public static void box(){// method definition
		System.out.println("--------------");
		return ;
	}
	
	public static void main (String[] args) {
		System.out.println("Hello"); ///method call
		
		 //passing parameter
		box();
		System.out.println(Add(2,3));
		System.out.println(Add(20,3));
		box();
	}

}
