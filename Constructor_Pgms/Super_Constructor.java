package Constructor_Pgms;
// In this Copy Constructer super() method is used to call the constructor of the another class. 
class Animal{
	Animal(){
		System.out.println("this is animal");
	}
}

class Bird extends Animal{
	Bird(){
		super();
		System.out.println("this is Bird");


	}
}

public class Super_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		
	}

}
