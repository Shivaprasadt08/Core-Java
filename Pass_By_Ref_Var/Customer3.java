class Family{

	void father(){
		System.out.println("Got Pocket money....");
	}
}
	class Mother{
		static void son(Family a1){
		a1.father();
		}

	}
	class Customer3{
	public static void main(String[] args){
		Family a1 = new Family();
		Mother.son(a1);

	}
}
	