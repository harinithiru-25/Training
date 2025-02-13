package com.celcom.day8;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading1 {

	public static void main(String[] args)throws IOException {
		FileReader fr=new FileReader("D://FileReadingExample1.txt");
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();

	}

}
