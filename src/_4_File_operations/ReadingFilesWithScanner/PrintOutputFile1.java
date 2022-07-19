package ReadingFilesWithScanner;
/** created by Marcin 
 *  this is very quick and efficient way to create file and print some data into
 **/  
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintOutputFile1 {
        public static void main(String args[]) throws FileNotFoundException{
            
            Scanner console = new Scanner(System.in);            
            
            PrintStream output = new PrintStream(new File("C:\\Users\\M\\Desktop\\test file.txt"));
           
            
            
            String choice ;
            
            System.out.print("Do you want to add something? Y N ");            
            
            choice = console.next();            
            
            System.out.println();
            
            while(choice.equalsIgnoreCase("y")){               
                
            	output.print(console.next());               
                
            	System.out.println("Do you want to add something? Y N ");
                
            	choice = console.next();            
            }
        }
}

