package io.assignments;

import java.io.File;
import java.io.IOException;


public class TestFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file;
		file = new File("E:/Badminton");
		file.mkdir();
		
		file = new File("E:/Badminton/singles.txt");
		file.createNewFile();
		
		file = new File("E:/Badminton/doubles.txt");
		file.createNewFile();
		
		file = new File("E:/Badminton/courts");
		file.mkdir();
		
		file = new File("E:/Badminton/courts/smashed.dat");
		file.createNewFile();
		
		file = new File("E:/Badminton/doubles.txt");
		File file2 = new File("E:/Badminton/dubbles.txt");
		boolean val = file.renameTo(file2);
		
		File file3 = new File("E:/Badminton/dbbles.txt");
		File file4 = new File("E:/Badminton/dubbles.txt");
		file3.delete();
		file4.delete();
		
	}

}
