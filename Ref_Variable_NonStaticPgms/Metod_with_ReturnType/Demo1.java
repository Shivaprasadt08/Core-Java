class Demo1{
	double sqcArea( ){
	int r = 8;
	double res =  r * r;
	
	return res;
	}
	public static void main(String[] args){
	Demo1 d1 = new Demo1();
	double x = d1.sqcArea();
	System.out.println(x);
	}
}