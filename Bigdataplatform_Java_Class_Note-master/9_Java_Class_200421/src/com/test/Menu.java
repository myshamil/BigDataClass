package com.test;

/*
 * ENUM에 대해서 학습한다. 상수 패키지 같은 느낌이다. 
 * enum안에 변수, 생성자를 생성할 수 있다. 이를 통해 같은 패키지 내에서 불러다 쓸 수 있다. 
 */
public enum Menu{
	Pizza(12000), Spageti(9000), nuddle(8000);
	int value;
	private Menu(int value) {
		this.value = value;
	}
			
}
