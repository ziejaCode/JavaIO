package _2_FilesOperations;
import java.io.*;

public class ListFoldersMethods {

	public static String newPath;
	static boolean fileExists = false;	
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
			foldery = f.listFiles(); // method returns an array of file in some directory
		}
		
		
		for(File p : foldery){
			if(p.isDirectory() == true) // this condition checks weather file is a folder(directory)
			System.out.println(p + ", " );
		}
		
	}

}
