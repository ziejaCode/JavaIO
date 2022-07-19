package _2_data_source._1_0_file_Streams;

import java.io.*;
import java.util.Scanner;

public class FileDumper {
	
  public static final int ASC = 0;
  public static final int DEC = 1;
  public static final int HEX = 2;
  public static void main(String[] args) {
	 
	String[]files = {"", "IDpayroll.txt"};  
	
	Scanner key = new Scanner(System.in);
	System.out.println("please enter format: a d or h ");
	
	String choice = key.next();
	
	switch(choice){
	
	case "a":
		files[0] = "-" + choice;
		break;
  	case "d":
		files[0] = "-" + choice;
		break;
	case "h":
		files[0] = "-" + choice;
		break;
	}
  
	
    if (files.length < 1) {
      System.err.println("Usage: java FileDumper [-ahd] file1 file2...");
      return;
    }
    
    int firstArg = 0;
    int mode = ASC;
    
    if (files[0].startsWith("-")) {
      firstArg = 1;
      
      if (files[0].equals("-h")) mode = HEX;
      else if (files[0].equals("-d")) mode = DEC;
    }
    
    for (int i = firstArg; i < files.length; i++) {
    	
      try {
        if (mode == ASC) dumpAscii(files[i]);
        else if (mode == HEX) dumpHex(files[i]);
        else if (mode == DEC) dumpDecimal(files[i]);
      }
      
      catch (IOException ex) {
        System.err.println("Error reading from " + files[i] + ": "
         + ex.getMessage( ));
      }
      if (i < files.length-1) {  // more files to dump
        System.out.println("\r\n--------------------------------------\r\n");
      }
    }
  }
  
  public static void dumpAscii(String filename) throws IOException {
    FileInputStream fin = null;
    try {
      fin = new FileInputStream(filename);
      StreamCopier.copy(fin, System.out);
    }
    finally {
      if (fin != null) fin.close( );
    }
  }
  
  public static void dumpDecimal(String filename) throws IOException {
	  
    FileInputStream fin = null;
    
    byte[] buffer = new byte[16];
    boolean end = false;
    try {
      fin = new FileInputStream(filename);
      while (!end) {
        int bytesRead = 0;
        while (bytesRead < buffer.length) {
          int r = fin.read(buffer, bytesRead, buffer.length - bytesRead);
          if (r == -1) {
            end = true;
            break;
          }
          bytesRead += r;
        }
        for (int i = 0; i < bytesRead; i++) {
          int dec = buffer[i];
          if (dec < 0) dec = 256 + dec;
          if (dec < 10) System.out.print("00" + dec + " ");
          else if (dec < 100) System.out.print("0" + dec + " ");
          else System.out.print(dec + " ");
        }
        System.out.println( );
      }
    }
    finally {
      if (fin != null) fin.close( );
    }
  }
  
  public static void dumpHex(String filename) throws IOException {
	  
    FileInputStream fin = null;
    byte[] buffer = new byte[24];
    boolean end = false;
    try {
      fin = new FileInputStream(filename);
      while (!end) {
        int bytesRead = 0;
        while (bytesRead < buffer.length) {
          int r = fin.read(buffer, bytesRead, buffer.length - bytesRead);
          if (r == -1) {
            end = true;
            break;
          }
          bytesRead += r;
        }
        for (int i = 0; i < bytesRead; i++) {
          int hex = buffer[i];
          if (hex < 0) hex = 256 + hex;
          if (hex >= 16) System.out.print(Integer.toHexString(hex) + " ");
          else System.out.print("0" + Integer.toHexString(hex) + " ");
        }
        System.out.println( );
      }
    }
    finally {
      if (fin != null) fin.close( );
    }
  }
}

