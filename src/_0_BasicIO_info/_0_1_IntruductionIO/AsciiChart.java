package _0_BasicIO_info._0_1_IntruductionIO;

import java.io.*;

public class AsciiChart {
	
  public static void main(String[] args) {
    
	 for (int i = 32; i < 127; i++) {
      
		 System.out.write(i);
		 
      // break line after every eight characters.
      if (i % 8 == 7) 
    	  
    	  System.out.write('\n');
      
      else System.out.write('\t');
    }
    System.out.write('\n');
   }
}


