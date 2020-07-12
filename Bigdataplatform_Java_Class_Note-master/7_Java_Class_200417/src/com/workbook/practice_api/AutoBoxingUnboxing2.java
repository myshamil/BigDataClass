package com.workbook.practice_api;

public class AutoBoxingUnboxing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = 10;
		num++;
		System.out.println(num);
		
		num += 3;
		System.out.println(num);
		
		int r = num + 5;
		Integer rObj = num - 5;
		System.out.println(r);
		System.out.println(rObj);
	}

}
