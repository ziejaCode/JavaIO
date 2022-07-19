package FileWritter;

import java.io.File;
import java.io.FileWriter;

public class Append_or_add_some_contents_to_the_file {

	public static void main(String[] args) throws Exception{
	    File file = new File("Hela.txt");

	    FileWriter writer = new FileWriter(file, true);
	    writer.write("username=java;password=secret" + System.getProperty("line.separator"));
	    writer.flush();
	    writer.close();
	  }
	
}
