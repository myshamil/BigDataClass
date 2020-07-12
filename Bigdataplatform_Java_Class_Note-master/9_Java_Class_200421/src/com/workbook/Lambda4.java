package com.workbook;

/*
 * Lambda의 학습 예제.. 완벽한 람다형이고 19번줄과 같이 인수를 전달하여 람다를 사용할 수 있다. 메소드( (인수) -> {;}, ""); 형태로 이용한다. 
 */

interface Printable3{
	void print(String s);
}

public class Lambda4 {

	public static void ShowString(Printable3 p, String s) {
		p.print(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowString((s) -> {System.out.println(s);}, "What is Lambda?");
		
	// 	ShowString( __[(s) -> {System.out.println(s);} ]__ , __"What is Lambda?"__);
		//__[인자]__ , __[인자]__ 이다. 
	}	
}
