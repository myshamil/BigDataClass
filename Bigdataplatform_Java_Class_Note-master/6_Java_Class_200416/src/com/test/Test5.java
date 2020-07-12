package com.test;

/*
 * Exception(예외처리)에 대한 학습 
 */

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			// 첫번째 예외처리 e로 진입 / 0으로 나누기 
//			int a = 3;
//			int b = 0;
//			int c = a/b;
			
			// 두번째 예외처리 e로 진입 / 인덱스 초과 
			int a[] = new int[5];
			a[5] = 0;
			
		} catch(ArrayIndexOutOfBoundsException e) { // 인덱스 초과에 대한 예외처리 
			System.out.println("인덱스 초과 ");
			System.out.println(e.getMessage());
					
		} catch(ArithmeticException e) { // 0으로 나누는 것에 대한 예외처리 
			System.out.println("0으로 나누심 ㅎ ");
			System.out.println(e.getMessage());
			
		} catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
