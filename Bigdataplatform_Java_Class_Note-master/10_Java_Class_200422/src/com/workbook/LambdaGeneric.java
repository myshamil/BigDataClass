package com.workbook;

@FunctionalInterface
interface Calculate <T>{
	T cal(T a, T b);
}

public class LambdaGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(4, 3));
		
		Calculate<Double> cd = (a, b) -> a + b;
		System.out.println(cd.cal(4.32, 3.45));
	}

}
