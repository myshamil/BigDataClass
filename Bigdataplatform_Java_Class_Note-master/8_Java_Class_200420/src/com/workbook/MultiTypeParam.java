package com.workbook;
/*
 * 제네릭에 대한 교재 예제.. 
 * 클래스 옆에 <>형태로 표기를 하며 Object로 명시해도 되지만 아닐경우 <T>를 일반적으로 쓰며,
 * 더 세부적으로 제한하고자 할경우 데이터 타입(Integer, String)등을 명시해준다. 
 * 
 * 제네릭 < _ > 안에 명시해주는 종류는 아래와 같다.
 * E : Element
 * K : Key
 * N : Number
 * T : Type
 * V : Value
 * 
 * 이 외에 직접 커스터마이징을 통해 바꿔줄 수가 있다. 그 예는 이번 예제와 같다. 
 */

class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

public class MultiTypeParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);
	}

}
