package com.celcom.day8;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {

	public static void main(String[] args)throws IOException {
		FileInputStream fr=new FileInputStream("D://image1.jpg");
		FileOutputStream fw=new FileOutputStream("D://image2.jpg");
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image Copied");


	}

}
