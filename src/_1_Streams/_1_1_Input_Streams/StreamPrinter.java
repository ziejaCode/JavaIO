package _1_Streams._1_1_Input_Streams;

import java.io.*;

public class StreamPrinter {
	
  public static void main(String[] args) {
	  
    try {
    	
      while (true) {
        int datum = System.in.read( );
        if (datum  == -1) 
        	break;
        System.out.print(datum + " ");
      }
    }
    catch (IOException ex) {
      System.err.println("Couldn't read from System.in!");
    }
  }
}

