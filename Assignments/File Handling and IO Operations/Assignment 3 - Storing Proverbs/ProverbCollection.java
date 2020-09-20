package io.assignments;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ProverbCollection {
	
	public static void storeProverb(String verb) throws Exception {
		PrintStream p = new PrintStream(new BufferedOutputStream(new FileOutputStream("E:/TopProVerbs.txt", true)));
		p.println(verb);
		p.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		String word = sc.next();
		if(!word.equals("STOP")) {
			storeProverb(word);
		}
		else
			break;
		
		}

	}

}
