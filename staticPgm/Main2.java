class Demo2{
	static void sector(int r, double t){
		double res  = 0.5 * r * r * t;
		System.out.println(res);
	}
}

class Main2{
	public static void main(String[] args){
		 Demo2.sector(2,25.05);
		
	}
}