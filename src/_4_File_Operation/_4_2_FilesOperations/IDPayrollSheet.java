package _4_File_Operation._4_2_FilesOperations;
import java.io.*;
import java.util.*;
/** 
 * this class will read text file 
 * and make simple calculation on given data
 * @author dlouth20
 *
 */
public class IDPayrollSheet {
        public static void main(String args[]) throws FileNotFoundException {
            
        	
        	// Application uses scanner to read through the data
            Scanner file = new Scanner(new File("IDpayroll.txt"));
               
            String text = "", sume = "";
            
            // first loop iterate through each line of text file
            while(file.hasNextLine()){
                    text = file.nextLine();                    
                    System.out.print(text);
                    ReadMe(text);
                }  
                file.close();
//                System.out.println(sume);  
        }
            // this method takes string as a parameter which represent single line of text file
            // and break it down to different types
            public static void ReadMe(String t){                
                   
            	Scanner f = new Scanner(t);
                   int ID =  f.nextInt();
                   String name = f.next();
                   	double sum = 0.0; 
                   	
                   	    // this loop summarize all double primitives found in the line
	                    while(f.hasNextDouble()){
	                    	sum += f.nextDouble();
	                    }
                    f.close();
                   System.out.print(" - " + name+"'s " + "total is ");  
                   System.out.print(ID + " ");
                   System.out.print(name + " "); 
                   System.out.println(sum + " ");   
            }        
}

