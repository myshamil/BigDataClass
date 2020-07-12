package com.test;

import java.util.function.BiFunction;

interface AddOp{
	int add(int a, int b);
}


public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddOp o = new AddOp() {
			public int add(int a, int b) {return a+b;}
		};
		
		int r2 = o.add(2, 3);
		System.out.println(r2);
		
		BiFunction<Integer, Integer, Integer> d =
				(a, b) -> {return a+b;};
				int r = d.apply(2, 3);
				System.out.println(r);
	}

}
