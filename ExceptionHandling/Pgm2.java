package ExceptionHandling;

public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("...Mains starts...");
		Pgm2 p = null;
		try {
		
			System.out.println(p.hashCode());
		}
//		finally {
//			System.out.println("This is final block");
//		}
//		
//		try{
//			int res = 10/0;
//			System.out.println(res);
//		}
		catch(NullPointerException e) {
			System.out.println("I can't generate the hashcode for the null.");
		}
		catch(ArithmeticException e) {
			System.out.println("0 can't divide the 10");
		}
		
		System.out.println("...Main ends...");
	}

}
