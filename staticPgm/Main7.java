class Demo7{
	static void triangle(int b,int h){
	double res = 0.5 * b * h;
	System.out.println(res);
	}

}

class Main7{
	public static void main(String [] args){
	System.out.println("The area of the triangle is \n");
	Demo7.triangle(8,4);
	}
}