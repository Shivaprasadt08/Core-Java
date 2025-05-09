class Stock{

	void disp(){
		System.out.println("Stock byed....");
	}
}
	class Angel_One{
		static void broker(Stock a1){
		a1.disp();
		}

	}
	class Customer1{
	public static void main(String[] args){
		Stock a1 = new Stock();
		Angel_One.broker(a1);

	}
}
	