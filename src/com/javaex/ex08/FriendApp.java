package com.javaex.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		System.out.println("=====리스트 사용================");
		Scanner sc = new Scanner(System.in);
		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {
			String f = sc.nextLine();
			String[] fobj = f.split(" ");

			Friend friend = new Friend(fobj[0], fobj[1], fobj[2]);
			fList.add(friend);
		}

		for (Friend f : fList) {
			f.draw();
		}

		System.out.println("===배열 사용==================");

		Friend[] friendArray = new Friend[3];
		
		Scanner sc02 = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {
			String f = sc.nextLine();
			String[] fobj = f.split(" ");

			// 한번 정의해서 계속 사용할 수 있도록
			String name = fobj[0];
			String ph = fobj[1];
			String school = fobj[2];

			Friend friend = new Friend(name, ph, school);
			friendArray[i] = friend;
		}

		for (int i = 0; i<friendArray.length; i++) {
			friendArray[i].draw();
		}

		sc.close();

	}

}
