package com.test;

/*
 * 클래스 정의 후 오버라이딩이 되는지 알아보는 과정 
 */

public class Test2 {
	public static void main(String[] args) {
		String str = new String("TEST");
		String str1 = "TEST";
		String str2 = "TEST";
		if(str == str1) {
			System.out.println("OK");
		}
		if(str1 == str2) {
			System.out.println("OK2");
		}
	}
}
