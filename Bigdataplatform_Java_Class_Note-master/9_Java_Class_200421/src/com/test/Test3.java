package com.test;

public class Test3 {
	
	static void test1(String[] str) { // String[] str = a;
		for(int inx = 0; inx < str.length; inx++) {
			System.out.println(str[inx]);
		}
	}
	
	static void test2(String...str2) { // String[] str2 = {"1", "2", "3", "4"}
		for(int inx = 0; inx < str2.length; inx++) {
			System.out.println(str2[inx]);
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"1", "2", "3", "4"};
		//test1("1", "2", "3", "4"); // 이렇게 대입하는 것이 아니라..
		test1(a); 					// 이렇게 대입하는 것이다. 배열형태로.. 
		test2("1", "2", "3", "4");

	}

}
