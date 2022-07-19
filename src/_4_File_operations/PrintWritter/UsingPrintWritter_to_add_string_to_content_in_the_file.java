package PrintWritter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/*
 *  using PrintWriter like this is an easy way to add string file without erasing original contents
 */


public class UsingPrintWritter_to_add_string_to_content_in_the_file {

	public static void main (String args[]){
			
		try {
			
			String excercise = "To jest test";
			
			if (!excercise.equals("")){		
				
				// print writer creates new file it self
				PrintWriter addExce = new PrintWriter(new BufferedWriter(new FileWriter(new File("Hela.txt"),true)));
				
				// now it will add string to next line
				addExce.println(excercise);
				
				// now it will add string to others
//				addExce.write(excercise);
				
				addExce.close();
				
				System.out.println("Written Hela");
			}else{
				JOptionPane.showMessageDialog(null, "Please provide valid input");
			}
		}
		 catch (IOException e1) {
			e1.printStackTrace();
		}	
			
			
		}
	
	
	
	
	
	
	
	
	
}
