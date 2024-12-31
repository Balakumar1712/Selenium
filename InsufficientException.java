
public class InsufficientException extends Exception {

	double amount;
	InsufficientException(double amt){
		amount = amt;
	}

}
