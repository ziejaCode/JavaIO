package _2_data_source._1_0_file_Streams;

import java.io.*;
public class StreamCopier {
	
  public static void main(String[] args) {
	  
    try {
      copy(System.in, System.out);
    }
    catch (IOException ex) {
      System.err.println(ex);
    }
  }
  // this is good method to copy and redirect stream
  public static void copy(InputStream in, OutputStream out)   throws IOException {
	  
    byte[] buffer = new byte[1024];
    
    while (true) {
    	
      int bytesRead = in.read(buffer);
      if (bytesRead == -1) 
    	  break;
      out.write(buffer, 0, bytesRead);
    }
  }
}
