package _4_File_Operation._4_1_Path;

import java.io.File;
import java.nio.file.Path;

public class SimpleExample {
	
//	public static void main (String args[]){
//		
//		String filePath = new File("").getAbsolutePath();
//		filePath += File.separator + "Trening.xlsx";
//	    File file = new File(filePath);
//	    System.out.println(file.getPath());
//	    System.out.println(file.getAbsolutePath());
//	    System.out.println(file.exists() );
//	}
	String filePath;
	
	
	
	public String getPath(String name){
		
		filePath = new File("").getAbsolutePath();
		filePath += File.separator + name;//"Trening.xlsx";
		File file = new File(filePath);
//	    System.out.println(file.getPath());
//	    System.out.println(file.getAbsolutePath());
	    System.out.println(file.exists() );
		
		return filePath;
		
	}
	
}
