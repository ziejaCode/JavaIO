package _1_Streams._1_2_Output_Streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ClosingOutputStreams {

	public static void main (String args[]){
		
		// Initialize this to null to keep the compiler from complaining
		// about uninitialized variables
		OutputStream out = null;
		try {
		  out = new FileOutputStream("numbers.dat");
		  // Write to the stream...
		}
		catch (IOException ex) {
		  System.err.println(ex);
		}
		
		// this is a common closing block
		finally {
		  if (out != null) {
		    try {
		      out.close( );
		      
		      out.flush();
		    }
		    catch (IOException ex) {
		      System.err.println(ex);
		    }
		  }
		}


		
	}
	
}
