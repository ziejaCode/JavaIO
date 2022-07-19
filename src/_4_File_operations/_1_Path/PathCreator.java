package _1_Path;
import java.io.File;
import java.io.IOException;

/** 
 * @author Marcin
 *
 * If you are using text data, then the Reader and Writer classes are right. *
 */

public class PathCreator {
	public static void basicFileReader(){
		
		// separator represents single char between strings in path.
			
		// the separator is a static field of File class in java API and represents '\'
		String fil1 =  File.separator; 
		// the pathSeparator is a static field of File class in java API and represents ';'
		String fil4 =  File.pathSeparator ; 
		
		String fil5 =  File.pathSeparatorChar + ""; 
		
		String fil2 = "C:"+ File.separator + "temp"+ File.separator + "file";
		
		String fil3 =  "c" + ":" + File.separator + "temp"  + File.separator + "doc.txt"; // this is the best way to define path		
 
		// this is how to declare object file for further proccesing
		File dir1 = new File (fil1); 
		File dir2 = new File (fil2); 
		File dir3 = new File (fil3); 
		File dir4 = new File (fil4); 
		File dir5 = new File (fil5);
		
		// method getPath specify files path
		System.out.println(dir1.getPath());
		System.out.println(dir4.getPath());
		System.out.println(dir5.getPath());
		
		
		// this method checks if file exists under specify path
		System.out.println(dir4.exists());
		
		// this block checks if method exists and creates it if it's not
		try {
			dir4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// this method checks weather method can be read
		System.out.println(dir1.canRead());
		
		// this method simply deletes file
		//dir4.delete();
		
		
		// this methods create file in given directory
		dir3.mkdir();		
		dir2.mkdirs();
		
		System.out.println(dir4.length());
		System.out.println(dir1.length());
	}
	
		
	public static void main(String[] args) {
		
		basicFileReader();
	}

}
