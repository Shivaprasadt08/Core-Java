interface Demo
{
	void disp();
	void test();
}
class Test implements Demo
{
	public void disp(){
		System.out.println("Hello Java");
	}
	public void test(){
		System.out.println("Hello JS");
	}
}
class Main{
	
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.disp();
		t1.test();
		System.out.println("Hello World!");
	}
}



