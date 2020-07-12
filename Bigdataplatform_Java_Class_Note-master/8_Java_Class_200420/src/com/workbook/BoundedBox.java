package com.workbook;

class Box4 <T extends Number>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class BoundedBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box4<Integer> iBox = new Box4<>();
		iBox.set(24);
		
		Box4<Double> dBox = new Box4<>();
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
	}

}
