package com.test;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new LinkedList<String>();
		List<String> l3 = new Vector<String>();
		List<String> l4 = new Stack<String>();
		
		l1.add("One");
		l1.add("Two");
		l1.add("Three");
		l1.add("Four");
		
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		for(int inx = 0; inx < l1.size(); inx++) {
			System.out.println(l1.get(inx));
		}
		System.out.println();
		
		for(String s : l1) {
			System.out.println(s);
		}
		
		System.out.println(" - Sorted - ");
		Collections.sort(l1);
		for(String s : l1) {
			System.out.println(s);
		}
	}

}
