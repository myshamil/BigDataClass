package com.workbook;

class Box12<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer4{
	public static void peekBox2(Box12<? extends Number> box) {
		System.out.println(box);
	}
}

public class UpperBoundedWildcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box12<Integer> iBox = new Box12<>();
		iBox.set(1234);
		
		Box12<Double> dBox = new Box12<>();
		dBox.set(10.009);
		
		Unboxer4.peekBox2(iBox);
		Unboxer4.peekBox2(dBox);
		
	}

}
