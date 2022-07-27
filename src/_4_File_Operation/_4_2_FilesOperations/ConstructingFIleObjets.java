package _4_File_Operation._4_2_FilesOperations;

import java.io.File;
import java.io.IOException;

public class ConstructingFIleObjets {

	public static void main(String[] args) {
		
		// this is one way to create path
		String path = "C:"    		+ File.separator 
					+ "Users" 		+ File.separator 
					+ "M"			+ File.separator 
					+ "Desktop"		+ File.separator 
					+ "newFile.txt";

		System.out.println("this is my path " + path);
		
		String absolutePath = new File("").getAbsolutePath();
		
		System.out.println("this is absolute path " + absolutePath);
		
		try {
			String canonicalPath = new File("").getCanonicalPath();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("this is canonical path " + absolutePath);
		
		String relativePath = "" + File.separator + "test" + File.separator;
		
		System.out.println("this is relative path " + relativePath);
		
		String fullPath = absolutePath + relativePath;
		
		System.out.println("this is full path " + fullPath);
		
		try {
			File file = new File(fullPath);
			
			if(!file.exists()){
				
				file.createNewFile();

				
					System.out.print("The file has been created");
			}else{
				System.out.print("Its already there");
			}
		} catch (IOException e) {
			
			System.err.print("The path is not correct");
//			e.printStackTrace();
		}
		
	}

}
