package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("2개의 피연산자 값을 입력하세요");

    	while(true) {
        	System.out.print(">>");
        	String input = sc.nextLine();

        	//공백 기준 배열에 담음
        	String[] sArray = input.split(" ");  
        	
           	//문자 --> 숫자 변경
        	int left = Integer.parseInt(sArray[0]);
        	int right = Integer.parseInt(sArray[2]);
        	
        	//연산자
        	String middle = sArray[1];
        	
        	//객체 인스턴스화
        	Add add = new Add();
        	Sub sub = new Sub();
        	Mul mul = new Mul();
        	Div div = new Div();
    		
    		if(sArray[1].equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}else if(sArray[1].equals("+")) {
				add.setValue(left, right);
				System.out.println(add.calculate());
			}else if(sArray[1].equals("-")) {
				sub.setValue(left, right);
				System.out.println(sub.calculate());
			}else if(sArray[1].equals("*")) {
				mul.setValue(left, right);
				System.out.println(mul.calculate());
			}else if(sArray[1].equals("/")){
				div.setValue(left, right);
				System.out.println(div.calculate());
			}else if(sArray[1].equals("+")){
				System.out.println("알 수 없는 연산입니다.");
			}
    		
    	}

    	sc.close();
    
    }
}

