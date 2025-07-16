package File_Handling;
import java.io.File;
public class ExistOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =  new File("C:\\Users\\SHIVAPRASAD\\OneDrive\\Desktop\\TechSeminar\\smartDust\\doc.docx");
		if(f.exists())
			System.out.println(true);
//		System.out.println("checking");
	}

}
