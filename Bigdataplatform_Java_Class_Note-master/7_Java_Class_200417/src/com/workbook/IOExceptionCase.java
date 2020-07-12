package com.workbook;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

/*
 * File - IO에서 throw-catch가 있을 때 동작하는 모습을 확인한다.
 */

public class IOExceptionCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		맥북의 어려움.. 경로가 다르다..
//		String rootPath = System.getProperty("user.dir");;
//		System.out.println("현재 프로젝트의 경로 : "+rootPath );

//		Path file = Paths.get("Users/Desktop/BigData_Edu/Java_Eclipse/7_Class_200417/Simple.txt");
		Path file = Paths.get("/Users/seongmin/Desktop/BigData_Edu/Java_Eclipse/7_Class_200417/Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');
			
			if(writer != null) {
				writer.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
