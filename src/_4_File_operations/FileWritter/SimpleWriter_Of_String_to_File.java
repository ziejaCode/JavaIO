package FileWritter;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  this class presets simplest way to write 
 *  String to text file
 */

public class SimpleWriter_Of_String_to_File {
	
	public static void main(String[] a) {
	    FileWriter writer;
	    try {
	      writer = new FileWriter("Hela.txt");
	      String c = "fsdf";
	      writer.write(c);
	      writer.close();
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

	  }
	}