package _1_Streams._1_0_CharacterStreams;

import java.io.*;

public class ReadingFileUsingFileInputStreamWithBuffer {

	public static void main(String[] args) throws IOException {
	    if (args.length != 1) {
	      System.err.println("Usage: java FileTyper filename");
	      return;
	    }
	    typeFile(args[0]);
	  }

	  public static void typeFile(String filename) throws IOException {
	    FileInputStream fin = new FileInputStream(filename);
	    try {
	      copy(fin, System.out);
	    } finally {
	      fin.close();
	    }
	  }

	  public static void copy(InputStream in, OutputStream out) throws IOException {

	    byte[] buffer = new byte[1024];
	    while (true) {
	      int bytesRead = in.read(buffer);
	      if (bytesRead == -1)
	        break;
	      out.write(buffer, 0, bytesRead);
	    }
	  }
	
	
}
