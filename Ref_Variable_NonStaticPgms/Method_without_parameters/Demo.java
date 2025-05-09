class Demo{
	void circArea(){
	int r = 5;
	final double pi = 3.142;
	double res = pi * r * r;
	System.out.println(res);
	}
	public static void main(String[] args){
	Demo d1 = new Demo();
	d1.circArea();
	}
}