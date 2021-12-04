package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
	
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //false
		System.out.println(p2 == p3); //false
		System.out.println(p3 == p4); //false
		System.out.println(p4 == p1); //true		
		System.out.println(p1.equals(p2)); //false
		System.out.println(p4.equals(p1)); //true
		//모든 클래스는 Object를 상속 관계에 있음. Object안에 있는 것을 가져다가 쓰는 것
	}

}


