package File_Handling;

import java.io.File;

public class LengthOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =  new File("C:\\Users\\SHIVAPRASAD\\OneDrive\\Desktop\\TechSeminar\\smartDust\\doc.docx");
		long n = f.length();
		System.out.println("length of new file : "+n);
	}

}
