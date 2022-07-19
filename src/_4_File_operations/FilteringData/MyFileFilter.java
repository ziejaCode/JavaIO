package FilteringData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import _2_FilesOperations.ListMethods;

/**
 * @author Marcin
 *
 *	this class create custom filter for files
 */

public class MyFileFilter {

	static boolean fileAccepted = false;
	static File directory;
	static ArrayList<String> acceptedfFiles = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		
		 directory = new File("C:" + File.separator + "Users" + File.separator + "Marcin" 
								   + File.separator + "Desktop" + File.separator + "JAVACODE" + File.separator 
								   + "Covering the Basics - WORKSPACES\\2 IO\\Character transfer");
		
		 if(directory.exists()){
			 
			 String[] namesOfFiles = directory.list();
			 
			 
			
			 for(String f : namesOfFiles){
				 if(accept(f))
					acceptedfFiles.add(f); 
			 }
			 
			 for(String fa : acceptedfFiles)		 
				 System.out.println(fa);
			
		 }else{
			 System.out.println("No file found");
		 }
		 
		 
	}
	
	// this method will test
	public static boolean accept(String name){
	
		if (name.charAt(0) == 'h' || (name.charAt(0) == 'H'))
				fileAccepted =  true;
		
		return fileAccepted;
		
	}
	

}
