interface Demo
{
	void disp();
	void test();
	void cool();
	void testing();
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
class Test1 implements Test
{
	public void cool(){
		System.out.println("Hello Java1");
	
	public void testing(){
		System.out.println("Hello JS1");
	}
}

class Main1{
	
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		t1.disp();
		t1.test();
		t1.cool();
		t1.testing();
		System.out.println("Hello World!");
	}
}



