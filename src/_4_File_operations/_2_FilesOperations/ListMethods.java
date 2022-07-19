package _2_FilesOperations;
import java.io.*;

public class ListMethods {

	public static String newPath;
	static boolean fileExists = false;
	static String[]pliki;
	static File[] foldery;
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		newPath = "G:" + File.separator;
		
		File f = new File(newPath);
		
		if(!f.exists())
			f.createNewFile();
		else{
			//System.out.println("File exists");
			fileExists = true;
		}
	
		if(fileExists){
			pliki = f.list(); // this method returns list of given file in some directory
			
			foldery = f.listFiles(); // method returns an array of file in some directory
		}
		for(String p : pliki){
			System.out.println(p + ", " );
		}
		
		System.out.println("\n\n\n\n" );
		
		for(File p : foldery){
			if(p.isDirectory() == true) // this condition checks weather file is a folder(directory)
			System.out.println(p + ", " );
		}
		
	}

}
