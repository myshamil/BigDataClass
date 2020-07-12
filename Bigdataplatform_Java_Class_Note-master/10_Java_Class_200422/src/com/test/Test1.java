package com.test;

/*
 * Enum에 대한 학습 예제 
 */

enum Menu{
	Pizza, Nuddle
}

enum Menu2{
	Pizza(100), Nuddle(200);
	int aa;
	private Menu2(int aa) {
		this.aa = aa;
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m = Menu.Pizza;
		System.out.println(m);
		System.out.println(Menu.valueOf("Pizza"));
		System.out.println(Menu.valueOf("Pizza").ordinal());
		System.out.println(Menu2.valueOf("Pizza"));
		System.out.println(Menu2.valueOf("Pizza").ordinal());
	}

}
