
class Demo1{
	static void sq( ){
	int a = 7;
	int res = a * a;
	System.out.println(res);
	}
}

class Demo2{
	static void rect( ){
	int a = 12, b =6 ;
	int res = a * b;
	System.out.println(res);
	}
}

class Demo3{
	static void tri(){
	int b= 4,  h = 8; 
	double res = 0.5 * b * h;
	System.out.println(res);
	}
}
class Demo4{
	static void ellipse(){
	int b= 4,  h = 8; 
	double res = 3.142 * b * h;
	System.out.println(res);
	}
}

class Demo5{
	static void sector( ){
	int h1 = 12, h2 =6, b =4 ;
	 double res = 0.5 * (b+h1)* h2;
	System.out.println(res);
	}
}
class Demo6{
	static void trap( ){
	int r = 12; 
	double t =60.6;
	 double res = 3.142*r *t;
	System.out.println(res);
	}
}
class Demo7{
	static void circ(){
	int a = 4;
	double res = 3.142*a * a;

	System.out.println(res);
	}
}
class Demo8{
	static void para(){
	int a = 4 ,b =5;
	int res = a * b;

	System.out.println(res);
	}
}

class Main{
	public static void main(String[] args){
	
	Demo1.sq();
	Demo2.rect();
	Demo3.tri();
	Demo4.ellipse();
	Demo5.sector();
	Demo6.trap();
	Demo7.circ();
	Demo8.para();

	}
}