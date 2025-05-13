class Sample5{ 
	static String emp_name = "DJ alias Dheeraj";
	int sal = 50000;
	public static void main(String[] args){
		System.out.println("name of the Employee is :"+emp_name);
		Sample4 s4 = new Sample4();
		System.out.println("salary of the emp is :"+s4.cost);
		s4.cost = 200;
		System.out.println("salary of the emp is :"+s4.cost);
		
	}
}