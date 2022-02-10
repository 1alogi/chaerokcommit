package chapter02;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//데이터 입력 
		System.out.print("[필수정보입력]\n");
		System.out.print("1. 이름:");
		String name = scanner.next();
		System.out.print("2. 주민번호 앞 6자리:");
		int age = scanner.nextInt();
		System.out.print("3. 전화번호:");
		int phone = scanner.nextInt();
		
		//데이터 처리
		//데이터 출력 
		System.out.println("[입력한내용]");
		System.out.println("1.이름:" +name);
		System.out.println("2. 주민번호 앞 6자리:" +age);
		System.out.println("3. 전화번호:"+phone);
		scanner.close();
	}

}