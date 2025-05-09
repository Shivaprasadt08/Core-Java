class Amazon{

	void disp(){
		System.out.println("Shoes....");
	}
}
	class Ecart{
		static void broker(Amazon a1){
		a1.disp();
		}

	}
	class Customer{
	public static void main(String[] args){
		Amazon a1 = new Amazon();
		Ecart.broker(a1);

	}
}
	