package com.workbook.practice_api;

import java.util.StringTokenizer;

public class TokenizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");
		
		while(st1.hasMoreTokens()) {
			System.out.print(st1.nextToken() + ' ');
		}
		System.out.println();
		
		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 3 = 44", "+-/=");
		
		while(st2.hasMoreTokens())
			System.out.print(st2.nextToken()+ ' ');
		System.out.println();
		
		//
	}

}
