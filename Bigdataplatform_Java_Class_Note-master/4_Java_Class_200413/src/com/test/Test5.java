package com.test;

/*
 * This에 대한 실습
 * This는 호출시의 변수와 이미 정의되어있는 변수의 이름이 같을 경우 이미 정의되어있는 변수에 적어주어 서로 다름을 명시해준다.
 */

class Student2{
	String name;
	int age;
	public void setName(String name){
		this.name = name;
		}
	public void setAge(int age) {
		this.age = age;
	}
}


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu = new Student2();
		stu.setName("K");
		stu.setAge(28);
	}

}
