package com.testcases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\tm\\Desktop\\ReadWritedataFolder","abc.txt");
	
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		
		while(!(str==null))
		{
			System.out.println(str);
			str = br.readLine();
		}
	}

}
