package _3_Transfer_types._3_5_buffering;

import java.io.*;
import java.util.Scanner;

/*
 * this class presents how to read file with scanner object 
 */

public class ScanXan {
    
	public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("list.txt")));

            s.useDelimiter(",");
            while (s.hasNextLine()) {
            	System.out.print(s.next());
            	while (s.hasNext()) {                
            		System.out.print(" --- " + s.next());
            	}
            	System.out.println();	
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}