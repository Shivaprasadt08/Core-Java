class Hotel{

	void Cook(){
		System.out.println("Oreder Delivered....");
	}
}
	class Waiter{
		static void broker(Hotel a1){
		a1.Cook();
		}

	}
	class Customer2{
	public static void main(String[] args){
		Hotel a1 = new Hotel();
		Waiter.broker(a1);

	}
}
	