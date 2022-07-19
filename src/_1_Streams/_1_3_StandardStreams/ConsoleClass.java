package _1_Streams._1_3_StandardStreams;
import java.io.*;

public class ConsoleClass {
	
	public static void main (String args[]) throws IOException{
		
		Console cons = System.console();
		
		try {
			cons.getClass();
			System.out.println("Jest klasa ");
		} catch (Exception e) {
			System.out.println("Nie ma klasy");

		}
	}

}
