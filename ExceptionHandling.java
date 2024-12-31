import java.io.*;


public class ExceptionHandling {

	public static void main(String[] args) {
	
		int a =10;
		int b =0;
		int c;
		
		try {
			c = a/b;// Error throws
			}
		
		catch(Exception e) {System.err.println("Error");}// if error throw's in try block execute catch block
		
		finally {System.out.println("End of program");}// Execute when the error occurs are not
		
		//Custom Exception
		double Amount = 10, withdraw = 20;
		
		try{
		if(Amount<withdraw) 
			throw new InsufficientException(withdraw-Amount);}
		catch(InsufficientException e) {System.out.println("No enough Money");}
		
		//checked exception
		File file = new File("Test.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
