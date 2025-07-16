package File_Handling;
import java.io.File;
import java.io.IOException;
public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f =  new File("C:\\Users\\SHIVAPRASAD\\OneDrive\\Desktop\\TechSeminar\\smartDust\\doc.docx");
		f.createNewFile();
		System.out.println("new file created");
	}

}
