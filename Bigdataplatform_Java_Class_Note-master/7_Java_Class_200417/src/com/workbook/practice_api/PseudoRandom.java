package com.workbook.practice_api;

import java.util.Random;

public class PseudoRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(12);
		
		// Rand는 내재된 패턴에 의해 생성하기 때문에 반복 생성시 같은 수가 나오게 된다. 
		for(int i = 0; i < 3; i++) {
			System.out.println(rand.nextInt(1000)); // 1000까지 제한 
		}
		
		// 위의 경우를 방지하기 위해 시스템 시간을 기준으로 난수를 생성하는 방법을 사용한다. 
		Random rand2 = new Random(System.currentTimeMillis());
		for(int i = 0; i<3; i++) {
			System.out.println(rand.nextInt(1000));
		}
	}

}
