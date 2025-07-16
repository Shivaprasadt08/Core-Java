package ExceptionHandling;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				System.out.println("...Mains starts...");
				int[] arr = {1,2,5,6,4,6};
				try {
				
					System.out.println(arr[6]);
				}
				catch(IndexOutOfBoundsException e) {
					System.out.println("Index out of bound");
				}
				finally {
					System.out.println("i am final Block");
				}
				
				System.out.println("...Main ends...");
			}

		

	}


