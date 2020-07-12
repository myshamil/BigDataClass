package com.workbook.practice_api;

import java.util.Arrays;

public class CopyOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	배열 선언 
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		// 배열 전체 복사 
		double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		
		// 배열 요소 3개만 복사(앞에서부터) 
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
		for(double d : arCpy1)
			System.out.print(d + "\t");
		System.out.println();
		
		for(double d : arCpy2)
			System.out.print(d + "\t");
		System.out.println();
	}

}
