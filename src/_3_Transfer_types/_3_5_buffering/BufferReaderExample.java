package _3_Transfer_types._3_5_buffering;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null; //alternatywna wersja
//        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt")); //alternatywna wersja
//            outputStream = new BufferedWriter(new FileWriter("characteroutput.txt"));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
                
            	System.out.println(l);
            	outputStream.println(l); //alternatywna wersja
            	
//            	outputStream.write(l);  
                
                
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}