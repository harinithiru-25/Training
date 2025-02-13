package com.celcom.day8;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriting1 {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("D://FileReadingExample1.txt");
		FileWriter fw=new FileWriter("D://FileReadingExample2.txt");
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");


	}

}
