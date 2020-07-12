package com.test;

/*
 * ENUM에 대해서 학습한다. 상수 패키지 같은 느낌이다. 
 */

public class Test2 {
	enum Season {
		WINTER, SPRING, SUMMER, FALL
	}
	enum Light{
		ON, OFF
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( Season s : Season.values())
			System.out.println(s);
		
		Season s = Season.WINTER;
		Season s2 = Season.SPRING;
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(Season.valueOf("WINTER"));
		System.out.println(Season.valueOf("WINTER").ordinal());
		System.out.println(Season.valueOf("SUMMER").ordinal());
		
		for(Menu m : Menu.values()) {
			System.out.println(m.value);
		}
		
		int value = Menu.valueOf("Pizza").value;
		System.out.println(value);
	}

}
