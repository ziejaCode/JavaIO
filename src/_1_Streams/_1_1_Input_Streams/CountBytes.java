package _1_Streams._1_1_Input_Streams;

import java.io.*;

public class CountBytes {
   
	public static void main(String args[]) throws IOException{
      

	   try {
		   
		   
		   byte[] b = new byte[System.in.available( )];
		   int offset = 0;
		   while (offset < b.length) {
		     int a = System.in.available( );
		     
		     int bytesRead = System.in.read(b, offset, a);
		     
		     
		     if (bytesRead == -1) break; // end of stream
		     offset += bytesRead;
		   }
		   
		  
		   
		 }
		 catch (IOException ex) {
		   System.err.println("Couldn't read from System.in!");
		 }



   
   
   
   
   
   }
}
