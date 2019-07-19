package training.day4;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f = new File("Hello world");
		
		if(f.exists())
		{
			System.out.println("hey file already present");
			
		}else {
			f.createNewFile();		
		System.out.println("file has been created");
		}
		System.out.println("Last modified: "+ new Date(f.lastModified()));
		System.out.println("can read: "+f.canRead());
		System.out.println("Absolute path: "+f.getAbsolutePath());
		System.out.println("File name: "+f.getName());
		System.out.println("Parent name: "+f.getName());
		System.out.println("Just path: "+f.getPath());
		
	
	
	}
	
	
}
