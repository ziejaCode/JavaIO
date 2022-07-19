package _2_data_source._1_0_file_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleFileReader {

	public static void main(String[] args) {

		String path ="IDpayroll.txt";
		
		
		try {
			  
			
			  FileInputStream fis = new FileInputStream(path);
			  
			  FileOutputStream out = new FileOutputStream("new.txt", true); // this constructor lets the file keep 
			  																// previous contents and write new and the end
					  
			  for (int n = fis.read(); n != -1; n = fis.read( )) {
				  out.write(n);
				  System.out.write(n);
			  }
			}
			catch (IOException ex) {
			  System.err.println(ex);
			}
			System.out.println( );


	}

}