package ExceptionHandling;
public class Pgm1 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		try {
			int res = 10/0;
			System.out.println(res);
		}
		catch(ArithmeticException e){
			System.out.println("We cannot divide 10 with 0.");
		}
	}

}
