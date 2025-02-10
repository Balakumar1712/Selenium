
public class LeapYear {

	public static void main(String[] args) {

	        int year = 2018;
	        
	        // Check if the year is divisible by 4 but not 100, or it is divisible by 400
	        if (year % 4 == 0) {
	            if (year % 100 != 0 || year % 400 == 0) {
	            	 System.out.println(year + " is a leap year.");
	            }
	        }

	      else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	}