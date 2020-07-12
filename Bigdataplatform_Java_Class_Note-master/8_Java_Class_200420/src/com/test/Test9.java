package com.test;

import java.util.ArrayList;
import java.util.List;

class A{}
class B extends A{}
class C extends A{}

public class Test9 {
	// 인수에 와일드카드 제네릭을 사용함으로써 코드를 줄였다. 아래와 같은 동작을 한다. 
	static void testMethod(List<? extends A> els) {
		for(A o : els) {
			
		}
	}
	
	// 와일드카드 제네릭을 사용하지 않고 메소드 앞부분에 제네릭을 명시해주고 이어서 인수에 제네릭을 또 사용했다. 
	static <T extends A> void testMethod2(List<T> els) {
		for(A o : els) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<A> aList = new ArrayList<A>();
		List<B> bList = new ArrayList<B>(); 
		
		testMethod(aList);
		testMethod(bList);
		
		testMethod2(aList);
		testMethod2(bList);
		
//		aList = bList; // 이렇게는 안된다.. 
//		bList = aList;
//		List<B> bList2 = aList;
		
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		
//		testMethod(list1);
//		testMethod2(list1);
		
		testMethod(list2);
		testMethod2(list2);
		
//		testMethod(list3);
//		testMethod2(list3);
	}

}
