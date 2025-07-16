package ExceptionHandling;

public class Pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("...Main starts...");
		String n = "shivaprasad";
		try{
			System.out.println(n.charAt(2));
			try {
				int a = 1/0;
			}catch(ArithmeticException e){
				System.out.println("0 can't divide 1.");
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		System.out.println("...Main Ends...");

	}

}
