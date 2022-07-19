package _2_FilesOperations;

import java.io.File;
import java.io.IOException;

public class MethodsOf_FILE_CLASS {
	
	public static void main (String args[]) throws IOException{
		
		
		// this string contains the directory path of some folder containing text file doc
	
		String fil3 =  "c" + ":" + File.separator + "temp"  + File.separator + "fol"  + File.separator + "doc.bmp";
		String fil4 =  "c" + ":" + File.separator + "temp"  + File.separator + "doc.txt";
		
		// constructor of the file class will be used to conduct various operation on path file	
		File p0 = new File(fil3);
		
		String fil5 =  "c" + ":" + File.separator + "temp"  + File.separator + "fol"  + File.separator + "tola.bmp";
		
		File p1 = new File(fil5);
		
		new File("c" + ":" + File.separator + "temp"  + File.separator + "fol"  + File.separator + "mariola.bmp");
		
		System.out.println(p0.exists() + " this file those bot exist");                // here checks if file exists
	    System.out.println(p0.getName());
	    System.out.println(p1.getName());
		System.out.println(p0.delete() + " this file has been delited");               // now delete it only if it exists
		System.out.println(p0.createNewFile()  + " this file has been created back" ); // and this one create back this file
		System.out.println(p0.getTotalSpace());																			   // but only if it those not exists	
		System.out.println(p0.length());
		System.out.println(p1.renameTo(new File("c" + ":" + File.separator + "temp"  + File.separator + "fol"  + File.separator + "mariola.bmp")));
		System.out.println(p0.getName());
		System.out.println(p1.getName());
		System.out.println(p0.mkdir() + " this file those bot exist");
	}

}
