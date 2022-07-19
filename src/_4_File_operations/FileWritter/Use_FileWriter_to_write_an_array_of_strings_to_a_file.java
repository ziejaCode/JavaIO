package FileWritter;
import java.io.FileWriter;

/*
 * how to put an array to file
 */

public class Use_FileWriter_to_write_an_array_of_strings_to_a_file {

	public static void main(String[] argv) throws Exception {
	    
		String path = "Hela.txt";
		
		FileWriter fw = new FileWriter(path, true);
				
	    String strs[] = { "com", "exe", "doc" };

	    for (int i = 0; i < strs.length; i++) {
	      fw.write(strs[i] + "\n");
	    }
	    fw.close();
	 }
	
}
