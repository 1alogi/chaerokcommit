package chapter03;

import java.util.Scanner;

public class Homework11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디:");
		String name = scanner.nextLine();
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if ("java".equals(name)) { // naem.equals("java"): 좋지않은 표현방법 
			if(password == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
		scanner.close();
	}}