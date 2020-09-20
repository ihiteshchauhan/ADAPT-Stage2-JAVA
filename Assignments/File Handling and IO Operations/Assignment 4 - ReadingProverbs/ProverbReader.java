package io.assignments;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ProverbReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/TopProVerbs.txt"));
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		int result = bis.read();
		while(result!=-1) {
			buf.write((byte) result);
			result = bis.read();
		}
		System.out.println(buf.toString());
	}

}
