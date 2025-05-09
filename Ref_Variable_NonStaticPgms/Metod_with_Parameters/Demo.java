class Demo{
	double circArea(int r ){
	
	final double pi = 3.142;
	double res = pi * r * r;
	System.out.println(res);
	return res;
	}
	public static void main(String[] args){
	Demo d1 = new Demo();
	d1.circArea(6);
	}
}