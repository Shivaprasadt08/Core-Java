class Pencil{
	void struct(){
		System.out.println("*******Existing Feature********");
		System.out.println("Pencil with the wooden body");
	}
}
class Pencil1 extends Pencil {
	void struct(){
		System.out.println("*******Existing Feature********");
		System.out.println("led Pencil with the plastic body");
		super.struct();
	}
}

class Main1{
	public static void main(String[] args){
		Pencil1 p1 = new Pencil1();
		p1.struct();
	}
}