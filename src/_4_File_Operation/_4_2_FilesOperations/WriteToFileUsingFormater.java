package _2_FilesOperations;
import java.io.*;
import java.util.*;

/** created by Marcin
 *  This program is about creating file and writing some data to it formated as 
 *  String.
 **/  
public class WriteToFileUsingFormater {
	public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);
        
        System.out.format("The square root of %d is %f.%n", i, r);
    }

}

