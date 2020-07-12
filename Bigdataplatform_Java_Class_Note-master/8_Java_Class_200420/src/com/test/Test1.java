package com.test;
import java.util.ArrayList;

/*
 * Array에 대한 간단 예제
 * Generic을 학습 하기 위한 전단계
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		
		for(int inx = 0; inx < arr.length; inx++) {
			System.out.println(arr[inx]);
		}
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("TEST");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		
		for(Object o : al) {
			System.out.println(o.toString());
		}
	}

}
