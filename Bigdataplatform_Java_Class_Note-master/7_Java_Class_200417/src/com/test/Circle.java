package com.test;

public class Circle extends Shape{
	@Override
	public void draw(int x, int y) {
		System.out.println("Circle draw " + x + ", " + y);
	}

}
