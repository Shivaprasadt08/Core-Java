
class Demo1{
	static int sq( ){
	int a = 7;
	int res = a * a;
	return res;
	}
}

class Demo2{
	static int rect( ){
	int a = 12, b =6 ;
	int res = a * b;
	return res;
	}
}

class Demo3{
	static double tri(){
	int b= 4,  h = 8; 
	double res = 0.5 * b * h;
	return res;
	}
}
class Demo4{
	static double ellipse(){
	int b= 4,  h = 8; 
	double res = 3.142 * b * h;
	return res;
	}
}

class Demo5{
	static double sector( ){
	int h1 = 12, h2 =6, b =4 ;
	 double res = 0.5 * (b+h1)* h2;
	return res;
	}
}
class Demo6{
	static double trap( ){
	int r = 12; 
	double t =60.6;
	 double res = 3.142*r *t;
	return res;
	}
}
class Demo7{
	static double circ(){
	int a = 4;
	double res = 3.142*a * a;

	return res;
	}
}
class Demo8{
	static int para(){
	int a = 4 ,b =5;
	int res = a * b;

	return res;
	}
}

class MainR{
	public static void main(String[] args){
	
	int res1 = Demo1.sq();
	System.out.println(res1);
	int res2 = Demo2.rect();
	System.out.println(res2);
	double res3 = Demo3.tri();
	System.out.println(res3);
	double res4 = Demo4.ellipse();
	System.out.println(res4);
	double res5 = Demo5.sector();
	System.out.println(res5);
	double res6 = Demo6.trap();
	System.out.println(res6);
	double res7 = Demo7.circ();
	System.out.println(res7);
	int res8 = Demo8.para();
	System.out.println(res8);
	}
}