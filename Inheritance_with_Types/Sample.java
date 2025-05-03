class Sample{
	int y = 10;
	} 
	class Tester extends Sample{
		void cool(){
		System.out.println("Its so Cool...");
		}
	}
	class Main{
	public static void main(String[] args){
	Tester s1 = new Tester();
	System.out.println(s1.y);
	s1.cool();
	}
}
