//methos with same name but variation in the length of the arguments is called as Method overloading.
class Amazon{
	
		void order(int cost,String item){
		System.out.println(item +" cost is " + cost);
		}
		
		void order(int cost){
		System.out.println("item cost is "+ cost);
		}

		void order(String item,String ordertype){
		System.out.println(item +" ordered by "+ ordertype );
		}

		public static void main(String[] args){
			Amazon a1 = new Amazon();
			a1.order(100,"Biriyani");
			a1.order(200);
			a1.order("Momos","Online Payment");
		}

}