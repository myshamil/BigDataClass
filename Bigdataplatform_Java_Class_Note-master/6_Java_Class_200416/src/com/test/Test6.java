package com.test;

/*
 *  Throw, try-catch 의 예제 실습
 *  Throw 는 처리를 넘길 때, try-catch는 처리를 할 
 */

import java.io.IOException;

class MyClass{
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Test6 {
	public static void main(String[] args) {
//		int a = 1;
//		int b= 0;
//		int c= a/b;
		throw new ArithmeticException();
	}
}
