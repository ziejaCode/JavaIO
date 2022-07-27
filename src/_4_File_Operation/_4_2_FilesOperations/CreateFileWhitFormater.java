package _4_File_Operation._4_2_FilesOperations;
import java.io.File;
import java.util.Formatter;

/** created by Marcin
 *  This program will create file according to your instruction 
 *  it will be the part of data base filling application
 **/ 
public class CreateFileWhitFormater {
    
		// this method takes directory path and name of file we want to create
		// use formater class of java util api
        public static String CreateFile(String direction, String name){    
            String result = "";
                try{   
                   Formatter x = new Formatter(direction + name + ".txt");
                   result = "You created a file";
                }catch(Exception e){
                   result = "There is an error";
                }
            return result;
        }
        
        public static void main(String args[]){
            
        	
        	String filePath = "C:"+ File.separator + "temp"+ File.separator;
        	String fileName = "document";
        	
        	
            System.out.println(CreateFile(filePath , fileName));
        }

}

