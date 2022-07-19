package ReadingFilesWithScanner;

/**
 * This code shows simple way to read text file using Scanner
 *  created by Marcin *  
 */

import java.io.File;
import java.util.Scanner;

public class ReadTextWithScanner {
        public static void main(String args[]){

             try{
                Scanner file  = new Scanner(new File("Hela.txt"));            
                String name = "";
                double sum = 0.0;  
                while(file.hasNext()){
                    name += file.next() + " ";                  
                } 
                System.out.print(name + " ");
                
             }catch(Exception e){
            	System.out.print("File not found\n");
             } 
    }
}

