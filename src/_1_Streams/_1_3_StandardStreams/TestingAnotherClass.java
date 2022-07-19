package _1_Streams._1_3_StandardStreams;

import java.io.Console;
	
	public class TestingAnotherClass {
		
		public static void main(String[] args) {
			
		Console c = System.console(); // #1: get a Console
			
			char[] pw = {'3','g','j','k'};
			String name = "heall";
			pw = c.readPassword("%s", pw); // #2: return a char[]
			
				for(char ch: pw)
					c.format("%c ", ch); // #3: format output
					c.format("\n");
					MyUtility mu = new MyUtility();
				
					while(true) {
				name = c.readLine("%s", "input?: "); // #4: return a String
				c.format("output: %s \n", mu.doStuff(name));
			}
		}
	}
	
	class MyUtility { // #5: class to test
		
		String doStuff(String arg1) {
	
			// stub code
			return "result is " + arg1;
	}
	}