package Constructor_Pgms;
//Copy constructor is a constructor which will create a new object by copying all values from an existing constructor.
public class Copy_Constructor {
	String name;
	int age;
	Copy_Constructor(String n, int a){
		name = n;
		age  = a;
		
	}
	Copy_Constructor(Copy_Constructor c3){
		this.name = c3.name;
		this.age = c3.age;
	}
	
	void display() {
		System.out.println("Student name is :"+ name + " age :"+ age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_Constructor c = new Copy_Constructor("Shivaprasad", 22);
		Copy_Constructor c1 = new Copy_Constructor(c);
		c1.display();
	}

}
