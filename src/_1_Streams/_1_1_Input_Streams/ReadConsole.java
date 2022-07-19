package _1_Streams._1_1_Input_Streams;

import java.io.*;

/*
 * this class reads the input from keyboard and reads byte entered until 100 and stops executions
 */

public class ReadConsole {
   public static void main(String args[]) throws IOException{
      
	   InputStreamReader cin = null;

   System.out.println("write something");
	   
      try {
    	  byte[] b = new byte[100];
    	  
    	  int offset = 0;
    	  while (offset < b.length) {
    		  
	    	    int bytesRead = System.in.read(b, offset, b.length - offset);
	    	    
	    	    System.out.println(bytesRead);
	    	    
	    	    if (bytesRead == -1) 
	    	    	break; // end of stream
    	    offset += bytesRead;
    	  }
    	}
    	catch (IOException ex) {
    	  System.err.println("Couldn't read from System.in!");
    	}


   
   
   
   
   
   }
}
