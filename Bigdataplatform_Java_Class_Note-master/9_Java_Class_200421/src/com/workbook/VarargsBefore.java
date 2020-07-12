package com.workbook;

/*
 * 가변 String에 대한 학습 예제 
 */

public class VarargsBefore {

	public static void showAll(String[] vargs) {
		System.out.println("LEN : " + vargs.length);
		
		for(String s : vargs) {
			System.out.println(s + '\t');
		}
		
		System.out.println('\n');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showAll(new String[] {"Box"});
		showAll(new String[] {"Box", "Toy"});
		showAll(new String[] {"Box", "Toy", "Apple"});
	}

}
