package _2_data_source._1_0_file_Streams;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Marcin
 *
 *	This class presents how to use File steams to write into file and read content from it later
 */

class FileStreamExample{
	
	// here buffer reader is created for taking data from whatever 
	static BufferedReader system_in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String argv[]){
	
	// Create it
		{
			try{
				FileOutputStream fos = new FileOutputStream("C:\\Users\\M\\Desktop\\java ping application - Copy.txt");
				
				// Read in three hotels
				for (int i = 0; i < 3; i++){
					
					Hotel a_hotel = new Hotel();
					
					a_hotel.input(system_in);
					a_hotel.write_to_fos(fos);
				}
				
				fos.close();
			}
			catch(IOException e){
			System.out.println(e);
			}
			
		}	
	// Now display it
		{
			byte [] buffer = null;
			
			File a_file = new File("C:\\Users\\M\\Desktop\\java ping application - Copy.txt");
			
			System.out.println("Length is " + a_file.length());
			
			System.out.println("Can read " + a_file.canRead());
			
			try{
				
			
				FileInputStream fis = new FileInputStream(a_file);
				
				int length = (int) a_file.length();
				
				buffer = new byte[length];
				
				fis.read(buffer);
				
				fis.close();
			}
			catch(IOException e){
				System.out.println(e);
			}
			
			String s = new String(buffer);
			System.out.println("Buffer is " + s);
		}
	}
}		
		

class Hotel{	

	private String name;
	private int rooms;
	private String location;
	
	boolean input(BufferedReader in){
		try{
			System.out.println("Name: ");
			name = in.readLine();
			
			System.out.println("Rooms: ");
			String temp = in.readLine();
			rooms = to_int(temp);
			
			System.out.println("Location: ");
			location = in.readLine();
		}
		catch(IOException e){
			System.err.println(e);
		return false;
		}
	return true;
	}
	
	boolean write_to_fos(FileOutputStream fos){
		try{
			fos.write(name.getBytes());
			
			Integer i = new Integer(rooms);
			fos.write(i.toString().getBytes());
			
			fos.write(location.getBytes());
			fos.write(' ');
		}
		catch (IOException e){
			System.err.println(e);
		return false;
		}
	return true;
	}
	
	
	void debug_print(){
		System.out.println("Name :" + name + ": Rooms : " + rooms + ": at :" + location+ ":");
	}
	
	
	static int to_int(String value){
		int i = 0;
		try{
			i = Integer.parseInt(value);
		}
		catch(NumberFormatException e){}
	return i;
	}

}








