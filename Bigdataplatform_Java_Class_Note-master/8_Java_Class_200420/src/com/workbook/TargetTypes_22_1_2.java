package com.workbook;

class Box8<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}

class EmptyBoxFactory{
	public static <T> Box8<T> makeBox(){ // 제네릭 메소드 
		Box8<T> box = new Box8<T>(); // 상자 생성 
		return box; // 생성한 상자 변환 
	}
}

public class TargetTypes_22_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box8<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		iBox.set(25);
		System.out.println(iBox.get());
	}
}
