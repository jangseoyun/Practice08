package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");
		Friend friend = new Friend();

		for (int i = 1; i <= 3; i++) {
			System.out.print(">>");
			String people = sc.nextLine();

			String[] sArray = people.split(" ");

			friend.setName(sArray[0]);
			friend.setPh(sArray[1]);
			friend.setSchool(sArray[2]);
		}


		sc.close();
	}

}
