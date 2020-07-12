package com.Test1;

/*
 * String 타입의 동일 비교 
 */

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test";
		String str1 = "test";
		if(str == str1) {
			System.out.println("O. K");
		}
		String str2 = new String("test");
		String str3 = new String("test");
		if(str2 == str3) {
			System.out.println("O. K 2");
		}
		if(str2.equals(str3)) {
			System.out.println("O. K 3");
		}
	}

}
