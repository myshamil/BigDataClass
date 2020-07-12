package com.workbook;

/*
 * 매개 변수화 타입을 타입 인자로 전달하기에 대한 교재 예제. 
 */

class Box3<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class BoxInBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3<String> sBox = new Box3<>();
		sBox.set("I am so happy");
		
		Box3<Box3<String>> wBox = new Box3<>(); // 컴파일러는 이와 같이 제네릭 자료형의 이름을 추론할 수도 있다.
		wBox.set(sBox);
		
		Box3<Box3<Box3<String>>> zBox = new Box3<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}

}
