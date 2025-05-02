class Sample {
	int r_no;
	String name;
	String Address;
	Sample(int r,String n,String A){
	r_no = r;
	name = n;
	Address = A;
	}
	public static void main(String[] args){
	Sample s1 = new Sample(21,"Shivaprsad","Belagavi");
	System.out.println("Rol number of the Student is "+s1.r_no);
	System.out.println("Name of the student is :" +s1.name);
	System.out.println("Address of the student is :"+s1.Address);
	}
}
