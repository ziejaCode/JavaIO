package _4_File_Operation._4_2_FilesOperations;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

/**
 * 
 * 	The list() method returns the names of all entries in a directory that are not rejected by an
	optional FilenameFilter. The list() method returns null if the File is a normal file, or
	returns the names in the directory. The list() method can take a FilenameFilter filter
	and return names in a directory satisfying the filter
 *
 */


public class ListingDirectories {

	static File[] foldery;
	static String relativePath = "\\test;";
	static String rootPath = System.getProperty("user.dir");
	
	public static void main(String args[]) throws NullPointerException{
		
		
		File[] roots = File.listRoots();
		File[] root = {};
	    System.out.println("List  of  root directories:");
	    for (File f : roots) {
	      System.out.println(f.getPath());
	      
	      	root = f.listFiles ();
	      	for (File v : root){
	      		System.out.println(v.getPath());
	      	}
	    }
		
		
//		String realPath = "G:\\JAVA\\Ultimate Java Code Repository\\2_Essential Classes\\2 IO\\4 Files\\test\\;";
//		
//		System.out.println("this is my root path  "  + rootPath);
//		
//		File f = new File(rootPath);
//		
//		System.out.println(f.exists());
//		
//		String path = System.getProperty("user.dir");
//		
//		System.out.println("this is my sytem path  "  + path);
		
	}
	
}
