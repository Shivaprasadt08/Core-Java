class battery{
	void attachment(){
		System.out.println("*******Existing feature******");
		System.out.println("Not - Fixed Battery to the Body");
	}
}

class battery1 extends battery{
	void attachment(){
		System.out.println("*******Existing feature******");
		System.out.println("Fixed Battery to the Body");
		super.attachment();
	}
}

class Main2{
	public static void main(String[] args){
		battery1 b1 = new battery1();
		b1.attachment();
	}
}
