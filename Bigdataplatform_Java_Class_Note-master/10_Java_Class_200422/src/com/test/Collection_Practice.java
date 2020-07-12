package com.test;

import java.util.*;

/*
 * Iterator기반의 다양한 콜렉션 학습 예제 
 * 
 * ArrayList에 대한 다양한 학습. 
 * ArrayList의 선언과 구현, 출력의 다양한 방법(for, new for, Iterator) 실습
 * 
 * HashSet에 대한 학습
 * HashSet도 ArrayList마냥 사용가능하며 제네릭 또한 가능하다. 
 * Hash는 정렬해서 저장하며 중복을 허용하지 않는다. 
 * 
 * Map에 대한 학습
 * 
 * 
 * Set에 대한 학습 
 * 
 */

public class Collection_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList al = new ArrayList();
		//Generic ArrayList
		ArrayList<String> al1 = new ArrayList();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
	
	System.out.println("----- ArrayList Practice -----");
	for(int inx = 0; inx < al1.size(); inx++){
		System.out.println(al1.get(inx));
	} System.out.println();
	
	for(String s :al1) {
		System.out.println(s);
	} System.out.println();
	
	Iterator itr = al1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}System.out.println();
	System.out.println("------------------------------\n\n");
	
	System.out.println("----- HashSet Practice -----");
	HashSet hs = new HashSet();
	hs.add("B");
	hs.add("A");
	hs.add("A");
	System.out.println(hs); // HashSet을 출력하면 [ , ] 형태로 출력 된다. 
	System.out.println();
	
	// Generic HashSet 
	HashSet<String> hs2 = new HashSet<>(); 
	hs2.add("C");
	hs2.add("B");
	hs2.add("E");
	Iterator<String> hsits = hs2.iterator();
	while(hsits.hasNext()) {
		System.out.println(hsits.next());
	}System.out.println();
	System.out.println("------------------------------\n\n");
	
	
	
	System.out.println("----- Map Practice -----");
	Map map = new HashMap();
	map.put(1, "One");
	map.put(3, "three");
	map.put(2, "two");
	
	Set set = map.entrySet();
	Iterator itr2 = set.iterator();
	while(itr2.hasNext()) {
		Object o = itr2.next();
		Map.Entry e = (Map.Entry) o;
		System.out.println(e.getKey() + ", " + e.getValue());
	}
	
	// Generic Map
	Map<Integer, String> map2 = new HashMap<>();
	map2.put(1, "Test1");
	map2.put(2, "Test2");
	for(Map.Entry m : map2.entrySet()) 
		System.out.println(m.getKey() + ", " + m.getValue());
	
	
	System.out.println("------------------------------");
}
}
