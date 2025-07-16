package ExceptionHandling;
import java.util.Scanner;
class RecahrgeValidityException extends Exception{
	
}
public class customException {
	public static void checkVAlidity(int day) throws RecahrgeValidityException{
		int validity = 365;
		if(day < validity) {
			System.out.println("Current Recharge is exist.");
		}
		else {
			throw new RecahrgeValidityException();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int day = sc .nextInt();
		try {
			checkVAlidity( day);
		}catch(RecahrgeValidityException e) {
			System.out.println("Please recharge to your number.");

		}

}
}
