package com.workbook.practice_api;

import java.util.Arrays;

/*
 * 배열 탐색 연습 예제 
 */

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {33, 55, 11, 44, 22};
		Arrays.parallelSort(ar); // 탐색 이전에 정렬이 선행 
		for(int n : ar)
			System.out.println(n + "\t");
		System.out.println();
		
		int idx = Arrays.binarySearch(ar, 33); // 배열에서 33을 찾아라. 
		System.out.println("Index of 33 : " + idx);
	}

}
