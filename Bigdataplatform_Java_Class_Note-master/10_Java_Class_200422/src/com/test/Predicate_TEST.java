package com.test;

import java.util.function.Predicate;

interface CheckValue{
	boolean test2(Integer a);
}

public class Predicate_TEST {

	static void check(Predicate<Integer> s, int a) {
		System.out.println(s.test(a));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 인터페이스를 받아서 구현하는 메소드이다. 
		// 기본적인 람다형으로 구현한 Predicate 함수이다. 이는 아래와 같이 바꿀 수 있다. 
		CheckValue c = (a) -> {
			return(a > 18);
		};
		System.out.println(c.test2(20));
		
		// 위의 check 메소드를 받아 구현해서 구동하는 코드이다. 
		// 미리 정의되어있는 Predicate 함수로 바꿀 수 있다. 
		Predicate<Integer> p = (a) -> (a > 18);
		System.out.println(p.test(20));
		
		// 이와 같이 람다식으로 하면 한줄로 바꿀 수 있다. 
		check((a) -> (a > 18), 20);
	}

}
