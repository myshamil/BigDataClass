package com.workbook.practice_api;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		if(str1 == str2){
			System.out.println("str1, str2 is Same");
		}
		else
			System.out.println("str1, str2 is not  Same");
		
		if(str1.equals(str2))
			System.out.println("str1, str2 is Same");
		else
			System.out.println("str1, str2 is not  Same");
	}

}
