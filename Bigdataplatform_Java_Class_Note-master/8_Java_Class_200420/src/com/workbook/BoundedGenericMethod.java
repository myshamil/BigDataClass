package com.workbook;


// 박스 클래스 정의 <T> 타입 
/* Boxing과 Unboxing을 비교하며 풀어낸 코드 
 * 메소드별 제네릭을 정의해준 부분이 포인트이다. 
 * 이게 제일 어렵다 ..
 */

class Box7<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class BoxFactory2{
	// Number 하위클래스로 제한하는 제네릭 선언. 
	public static <T extends Number> Box7<T> makeBox(T o){ // Number로 확장하는 T타입 매개변수를 먼저 알림. 그 후 Box7<T> 반환형 선언. 이후 makeBox 메소드 정의 
		Box7<T> box = new Box7<T>();
		box.set(o);
		
		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box7<T> box) {
		System.out.println("Unboxed data : " + box.get().intValue());
		return box.get();
	}
}

public class BoundedGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box7<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
		int n = Unboxer.openBox(sBox);
		System.out.println("Returned data : " + n);
	}

}
