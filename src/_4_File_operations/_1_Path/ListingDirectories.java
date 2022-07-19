package _1_Path;
/*
 * The following code snippet prints the root directories for the default file system
 */
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ListingDirectories {

	public static void main(String[] args) {

		File f ;
		
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name: dirs) {
			f = new File(name.toString());
			System.err.println(f);
			
				for (Path n: name) {
					f = new File(n.toString());
					System.err.println("         " + f);
				}
		}
		
	}

}
