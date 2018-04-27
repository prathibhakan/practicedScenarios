package com.testcases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritePgm {

	public static void main(String[] args) throws IOException {
		/*File f = new File("C:\\Users\\tm\\Desktop\\ReadWritedataFolder","abc.txt");
		
		FileWriter fw = new FileWriter(f);	
		fw.write("Hello");
		
		PrintWriter pw = new PrintWriter(f);
		//BufferedWriter bw = new BufferedWriter(f);
		
		pw.write("Hello123");
		pw.flush();
		pw.close();*/
		
		File f = new File("C:\\Users\\tm\\Desktop\\ReadWritedataFolder","sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		pw.write("first1");
		pw.write("Second1");
		
		pw.flush();
	}

}
