package FileStreams;

import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		
	    FileOutputStream fos = new FileOutputStream("Hela.txt");

	    String n = "dadasdfas";
	    byte b = 01;
	    
	    for(int i = 0; i < n.length(); i++ ){
	    	 char m = n.charAt(i);
	    	 fos.write(m);
	    	 System.out.print(m);
	    }
	    
	   
	    fos.close();
	  }
	
}
