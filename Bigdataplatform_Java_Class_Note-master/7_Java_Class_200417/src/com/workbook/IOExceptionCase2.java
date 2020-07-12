package com.workbook;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

/*
 * File IO에서는 throw-catch가 없으면 아래와 같이 오류를 뱉어낸다. 
 * 테스트시에는 주석을 지우고 보도록 하자.
 */

public class IOExceptionCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file = Paths.get("/Users/seongmin/Desktop/BigData_Edu/Java_Eclipse/7_Class_200417/Simple.txt");
//		BufferedWriter writer = null;
//		writer = Files.newBufferedWriter(file);
//		writer.write('A');
//		writer.write('Z');
//		
//		if(writer != null) {
//			writer.close();
//		}
	}

}
