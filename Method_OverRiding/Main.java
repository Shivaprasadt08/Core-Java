class Insta{
	void song(){
	System.out.println("*******Existing Feature********");
	System.out.println("Only text note is able to write in the Note section");
	}
}
class Insta1 extends Insta
{
	void song(){
		System.out.println("*******New Feature with Existing Feature********");
		System.out.println("Song with text note is able to write in the Note section after updating\n");
		super.song();
	}
}

class Main{
	public static void main(String[] args){
	Insta1 i1 = new Insta1();
	i1.song();
	}
}