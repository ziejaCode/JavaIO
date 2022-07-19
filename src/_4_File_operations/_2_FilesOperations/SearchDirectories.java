package _2_FilesOperations;

import java.io.File;

public class SearchDirectories {

	String[]pliki = {};
	File[] foldery;
	String searchedFolder = "Trening.xlsx";
	
	
	public static void main(String[] args) {

		System.out.println("start\n" );
		
		SearchDirectories sf = new SearchDirectories();
		
		
		
		String newPath = "G:" + File.separator;
		sf.searchFor(newPath, sf.searchedFolder);	
		
		System.out.println("stop\n" );
	}
	
	public void searchFor(String path, String name){
		
		File f = new File(path);
		
		if(f.exists()){
			pliki = f.list(); // this method returns list of given file in some directory			
			foldery = f.listFiles(); // method returns an array of file in some directory
		}
		if(!(foldery == null)){
		for(String p : pliki){
//			System.out.println(p + ", " );
			if(p == name || !p.equals("$RECYCLE.BIN")){
				System.out.println("Plik found " + p);

			}else{
				for(File d : foldery){
					if(d.isDirectory() == true) // this condition checks weather file is a folder(directory)
//					System.out.println(d + ", " );
					 
					searchFor(d +"", searchedFolder);
				}
			}
			}
		}
//		System.out.println("\n\n\n\n" );
		
//		for(File p : foldery){
//			if(p.isDirectory() == true) // this condition checks weather file is a folder(directory)
//			System.out.println(p + ", " );
//		}
	}

}
