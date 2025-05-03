class Sample{
	int x = 90;

}
class Demo extends Sample{
	void cool(){
	System.out.print("Its cool dude...");
	}
}
class Tester extends Sample{
	void Wild_fire(){
		System.out.println("Hi I am Virat Kohli,i called by king...");
	}

}
class Main3{
	public static void main(String[] args){
	   System.out.println("Demo Class Members...");
		Demo d1 = new Demo();
		System.out.println(d1.x);
		d1.cool();
		System.out.println("Tester Class Members...");
		Tester t1 = new Tester();
		System.out.println(t1.x);
		t1.Wild_fire();
	}
}
