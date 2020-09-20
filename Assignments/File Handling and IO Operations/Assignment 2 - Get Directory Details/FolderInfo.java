package io.assignments;

import java.io.File;

public class FolderInfo {

	public static void printDirectory(String path) {
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("No Folder Exists with the Given Name");
		}
		else {
			File []list = file.listFiles();
			for(File f:list) {
				if(f.isFile()) {
				System.out.println("File: "+f.getName());
				System.out.println("Absolute File Path: "+f.getAbsolutePath());
				System.out.println("Folder Path: "+f.getPath());
				}
				else {
					System.out.println("Directory: "+f.getName());
					System.out.println("Path: "+f.getPath());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDirectory("E:/Badminton");
	}

}
