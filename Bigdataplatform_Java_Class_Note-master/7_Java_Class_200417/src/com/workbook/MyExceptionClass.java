package com.workbook;

import java.util.Scanner;

// Custom Exception 정

class ReadAgeException extends Exception{
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

public class MyExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("나이 입력 : ");
		
		try {
			int age = readAge();
			System.out.printf("입력된 나이 : %d \n", age);
		}
		catch(ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 나이를 입력받는 메소드 작성 
	public static int readAge() throws ReadAgeException{
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		
		if(age < 0)
			throw new ReadAgeException();
		
		return age;
	}

}
