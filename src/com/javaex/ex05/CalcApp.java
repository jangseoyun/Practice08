package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("2개의 피연산자 값을 입력하세요");
    	System.out.print(">>");
    
    	String input = sc.nextLine();
    	
    	//공백 기준 배열에 담음
    	String[] sArray = input.split(" ");  
    	
    	//문자 --> 숫자 변경
    	for(int i = 0; i<sArray.length; i++) { 
    		Integer.parseInt(sArray[i]);
    	}

    	//객체 인스턴스화
    	Add add = new Add();
    	Sub sub = new Sub();
    	Mul mul = new Mul();
    	Div div = new Div();

		if(sArray[1].equals("+")) {
			add.calculate();
		}else if(sArray[1].equals("-")) {
			sub.calculate();
		}else if(sArray[1].equals("*")) {
			mul.calculate();
		}else {
			div.calculate();
		}
    		
    	

    	sc.close();
    
    }
}

