package com.workbook;

class Box6<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class BoxFactory{
	public static <T> Box6<T> makeBox(T o ){ // 제네릭 메소드 정의 // 앞의 <T>는 매개변수 T임을 알리고..Box6<T> 반환형을 명시한다. 
		Box6<T> box = new Box6<T>(); // 상자를 생성하고, 
		box.set(o); // 전달된 인스턴스를 상자에 담아서, 
		return box; // 이 상자를 반환한다. 
	}
}

public class GenericMethodBoxMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box6<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box6<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}

}
