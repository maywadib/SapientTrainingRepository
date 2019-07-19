package training.day4;

import java.io.File;

public class FileOperation02 {
	public static void main(String[] args) {
		File f = new File("sample");
		
		System.out.println(f.isDirectory());
		
		File[] listfiles = f.listFiles();
		
		for(File temp:listfiles)
		{
			if(temp.isDirectory()&&temp.canWrite()) {
				System.out.println(temp.getName());
			}
		}
	}
}
