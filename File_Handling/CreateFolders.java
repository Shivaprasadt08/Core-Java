package File_Handling;
import java.io.File;
public class CreateFolders {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\SHIVAPRASAD\\OneDrive\\Desktop\\TechSeminar\\smartDust");
		f.mkdirs();
		System.out.println("Folders created...");
		
		
	}

}
