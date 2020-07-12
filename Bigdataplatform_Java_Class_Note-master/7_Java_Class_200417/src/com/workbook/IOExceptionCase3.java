package com.workbook;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

/*
 * 상속 및 호출관계가 복잡한 상황에서의 try-catch 구문 실습 
 * main -> md1 -> md2 로 실행이 된다.
 * 이후 오류 발생시에는 
 * md2 -> md1 -> main 순으로 throw하며 처리한다. 
 */

public class IOExceptionCase3 {

	public static void main(String[] args) {
		// try - catch 선언 및 정
		try {
			md1();
		} catch(IOException e) {
			e.printStackTrace();
		}
		}
		// md1() 선언 
		public static void md1() throws IOException { // IOException 예외 넘긴다고 명시한다.
			md2();
		}
		public static void md2() throws IOException{ // IOException 예외 넘긴다고 명시한다.
			Path file = Paths.get("/Users/seongmin/Desktop/BigData_Edu/Java_Eclipse/7_Class_200417/Simple.txt");
			BufferedWriter writer = null;
			writer = Files.newBufferedWriter(file); // IOException 발생 가능 
			writer.write('A'); // IOException 발생 가능 
			writer.write('Z'); // IOException 발생 가능 
			
			if(writer != null)
				writer.close(); // IOException 발생 가능 
		}
	}
