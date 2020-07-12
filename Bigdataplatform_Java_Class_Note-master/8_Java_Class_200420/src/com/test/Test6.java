package com.test;

/*
 * Generic E의 사용 예제 
 * E를 선언할 경우 어떤 변수형이든 가능하다.
 * 단 변수형의 클래스 형태로 선언해주도록 한다. 
 */

public class Test6 {
	static <E> void printArr(E[] arr) {
		for(E e : arr) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4};
		Character[] arr2 = {'A', 'B', 'C'};
		printArr(arr2);
	}

}
