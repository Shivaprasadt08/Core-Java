class Demo6{
	static void ellipse(int a,int b){
	double res = 3.142 * a * b;
	System.out.println(res);
	}

}

class Main6{
	public static void main(String [] args){
	System.out.println("The area of the ellipse is \n");
	Demo6.ellipse(8,4);
	}
}