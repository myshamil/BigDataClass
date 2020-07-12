package com.test;

import java.util.ArrayList;

/* 클래스와 객체(인스턴스)의 차이점
 * 클래스(코드), 객체(메모리 클래스가 적재된 것) 
 * 
 * 객체 지향 프로그래밍의 3가지 특징
 * 캡슐화 - 속성(상태 or 데이터), 메소드(동작 or 행위) 하나 묶는 것. 코드에서는 클래스를 통해서 구성하는 방법.
 * 		  data hide -> 멤버변수들을 private 접근자로 변경한다.
 * 상속성 - 이미 정의된 상위 클래스(부모 클래스)의 모든 속성과 메소드를 하위 클래스(자식 클래스)가 사용할 수 있도록 하는 기능.
 * 다형성 - Pollymorphism. 객체가 연산을 수행하게 될때 동일한 메소드에 대해서 각각의 객체가 가지고 있는 특성을 나타내는 방법.
 * 		  상속 관계가 되어야 함. override를 통해서 구분됨.
 * 
 * 클래스, 인터페이스, 오버라이딩, 배열, 제네릭, 람다
 *  
*/


interface Calculate{
	void multiply(); // multiply 메소드 선언 
}


class Gugudan implements Calculate{
	private int[] arr;
	public void multiply() {
		for(Integer i : arr) { // New for문으로 곱셈 실행 / 여기서는 O x 0 에서 앞부분 O을 생성하는 for문이다. 
			if(i != 9) { // 10단이 만들어지는 것을 방지 
			System.out.println(i+1 + " Dan Start");
			System.out.println("-------------------------");
			
			for(Integer k :arr) { // New for문으로 곱셈 실행 / 여기서는 O x 0 에서 뒷부분 0을 생성하는 for문이다.
				System.out.println(i+1 + " x " + k + " = " + (i+1)*k); // 출력 
			}
			System.out.println(i+1 + " Dan End \n\n");
		}
		}
	}
	
	// Array Setter
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	// Array Getter
	public int[] getArr() {
		return arr;
	}
}

// 구구단 작성 해보세요. 
public class Ready_for_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gugudan gg = new Gugudan(); // 객체 선언 
		int[] iTempArr = {1,2,3,4,5,6,7,8,9}; // 배열 선언 
		
		
		gg.setArr(iTempArr);  // Arr 값을 넘겨준다. 
		gg.multiply(); // 곱셈 실행 
		
	}

}
