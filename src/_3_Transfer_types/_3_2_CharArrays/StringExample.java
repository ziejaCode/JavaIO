package _3_Transfer_types._3_2_CharArrays;
import java.io.*;
import java.util.*;


class StringExample{

	static BufferedReader system_in = new BufferedReader(new InputStreamReader (System.in));
	
	public static void main(String argv[]){
		
	
		StringWriter sw = new StringWriter();
		// Create it
		{
			// Read in three hotels
			for (int i = 0; i < 3; i++){
			
			Hotel a_hotel = new Hotel();
			a_hotel.input(system_in);
			a_hotel.write_to_string(sw);
			}
		
		}
		
		// Print it
		{
			String output = sw.toString();
			System.out.println("String is ");
			System.out.println(output);
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
			
		}catch(IOException e){
			
			System.err.println(e);			
			return false;
		}		
		return true;
	}
	
	boolean write_to_string(StringWriter sw){
		
		sw.write(name);
		
		Integer i = new Integer(rooms);
		sw.write(i.toString());
		sw.write(location);
		sw.write("backslash n");
		
		// red font indicates that an actual backslash n (carriage return character)
		// should be inserted in the code.
		
	return true;
	}
	
	static int to_int(String value){
		
		int i = 0;		
		try{			
			i = Integer.parseInt(value);			
		}catch(NumberFormatException e){}		
	return i;
	}

}




