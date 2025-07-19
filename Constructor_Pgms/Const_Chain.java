package Constructor_Pgms;
//Constructor chaining means calling one constructor from another constructor within the class or superclass
//this() ref_variable helps to call another constructor in the same class.
public class Const_Chain {
	int width;
	int height;
	Const_Chain(){
		this(20,30);
		System.out.println("Dimentions of the Square");
	}
	Const_Chain(int w, int l){
		width = w;
		height = l;	
		System.out.println("Dimention of the square is :"+l+ "x" + w);

	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const_Chain c1 = new Const_Chain();
	}

}
