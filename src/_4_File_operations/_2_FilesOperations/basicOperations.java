package _2_FilesOperations;
import java.io.File;

/** @author Marcin
 *  This application is about 
 **/
public class basicOperations {
    
	public static void main(String []args){
    // pseudocode
        File f = new File("world.txt");
        File d = new File("mania.txt");
        File c = new File("fred.txt");
        
        getRidOf(f);
        
        // file must be placed in the same folder where code is otherwise it is not visible
        
        // these are called Querying file attributes
        String result = "" + d.exists() +"\n"          // find whether the file exists
                           + d.getAbsolutePath()+"\n"  // The full path where this file is located
                           + d.canRead()+"\n"
                           + d.isDirectory()+"\n"       // Whether this file represents a directory/folder on the system
                           + d.getName()+"\n"           // The name of this file as a String, without any path attached
                           + d.isFile() +"\n"            // Whether this file represents a file (nonfolder) on the system
                           + d.length()+"\n"
              			   + f.exists() +"\n"          // find whether the file exists
                           + f.getAbsolutePath()+"\n"  // find the path of that file
                           + f.canRead()+"\n"			//Whether or not this file exists and can be read
                           + f.length()+"\n"; 			// create directories
                          
              			   	
        System.out.print(result);
  
    
     // these are called Modify class
        
        
                  result += "" + d.delete()            //Deletes the given file
                		       + d.renameTo(c)        // Changes this file’s name to the given file’s name
                  			   + d.mkdir();
    }
                 
    public static void getRidOf(File d){
        d.delete();}            //Deletes the given file
    
    
    
    
    
    
    
    
    
    
}
