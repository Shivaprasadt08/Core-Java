class Swiggy{

	void food(){
		System.out.println("Biriyani....");
	}
}
	class zomat{
		static void del(Swiggy a1){
		a1.food();
		}

	}
	class Customer4{
	public static void main(String[] args){
		Swiggy a1 = new Swiggy();
		zomat.del(a1);

	}
}
	