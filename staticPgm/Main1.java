class Demo1{
	static double area(int r){
	double pi = 3.142;
	double res = pi * r * r;
	return res;

	}
}

class Main1{
	public static void main(String[] args){
		double res1 = Demo1.area(5);
		System.out.println(res1);
	}
}
