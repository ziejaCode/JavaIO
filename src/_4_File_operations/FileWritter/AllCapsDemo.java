package FileWritter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AllCapsDemo {
  
	public static void main(String[] arguments) {
	    
		String sourceName = "Hela.txt";
	    
	    try {
	    	
	      File source = new File(sourceName);
	      File temp = new File("cap" + sourceName + ".tmp");
	
	      FileReader fr = new FileReader(source);
	      BufferedReader in = new BufferedReader(fr);
	
	      FileWriter fw = new FileWriter(temp);
	      BufferedWriter out = new BufferedWriter(fw);
	
	      boolean eof = false;
	      int inChar = 0;
	      do {
	        inChar = in.read();
	        if (inChar != -1) {
	          char outChar = Character.toUpperCase((char) inChar);
	          out.write(outChar);
	        } else
	          eof = true;
	      } while (!eof);
	      in.close();
	      out.close();
	
	      boolean deleted = source.delete();
	      if (deleted)
	        temp.renameTo(source);
	    } catch (Exception se) {
	      System.out.println("Error - " + se.toString());
	    }
  }
}