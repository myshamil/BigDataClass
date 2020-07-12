package com.test;
/*
 * - static 멤버
 *   -> static 멤버의 개념
 *     - 객체를 생성하지 않고 사용할 수 있는 멤버
 *     - 클래스의 모든 객체에 공통으로 사용되는 변수
 *     - 클래스의 어떤 멤버도 static 멤버에 접근할 수 있음
 *     - C/C++의 전역 변수와유사함
 *   -> static 멤버의 선언 방법
 *     - 멤버(필드 혹은 메소드) 앞에 static을 붙인 후 사용
 *       ex) static int number;
 *   -> static 멤버의 사용 방법
 *     - 객체.static멤버
 *       ex) Sample s = new Sample(); s.number = 10;
 *     - 클래스이름.static멤버
 *       ex) Sample.number = 10;
 *   -> static 멤버를 사용하는 이유
 *     - 전역 변수나 전역 함수를 만들 때 사용
 *       -> 모든 클래스에서 공유하는 혹은 언제든 호출할 수 있는 전역 변수를 만들어 사용할 때
 *       -> 객체를 생성하지 않고 바로 사용할 때
 *     - 공유 멤버를 만들고자 할 때 사용
 *       -> static으로 선언된 멤버는 모두 공통 멤버가 되어 객체들 사이에서 공유됨
 *   -> static 메소드의 제약 조건
 *     - 오직 static 멤버만 접근이 가능
 *     - this 키워드 사용이 불가능
 *       -> 객체가 생성되지 않은 상황에서도 사용이 가능하므로 
 */

class MyClass{
	int count;
	static int count2;
	public MyClass() {
		count++; // Without Static의 경우 전역변수의 개념이 아닌 객체별 변수가 되어 증가하지 않는다.
		count2++; // Static Variable의 경우 생성 후 공유하기 때문에 증가한다.
		System.out.println("none static count : " + count);
		System.out.println("with static count2 : " + count2 + '\n');
	}
}

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass = new MyClass();
		MyClass myclass2 = new MyClass();
		MyClass myclass3 = new MyClass();
	}

}
