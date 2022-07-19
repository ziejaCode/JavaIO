package _2_FilesOperations;

import java.io.File;

public class GetParentFile {

	public static void main(String[] a) {
	    
		File myFile = new File("C:" + File.separator + "jdk1.5.0" + File.separator, "File.java");
	    
		File parentFile = new File(myFile.getParent());
		
		System.out.println(myFile.getParent());
	    System.out.println(myFile);
	    System.out.println(parentFile.getParent());
	}
	
}
