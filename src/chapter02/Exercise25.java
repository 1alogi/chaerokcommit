package chapter02;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원짜리 동전의 개수:");
		int num500 = scanner.nextInt();
		System.out.print("100원짜리 동전의 개수:");
		int num100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 개수:");
		int num50 = scanner.nextInt();
		System.out.print("100원짜리 동전의 개수:");
		int num10 = scanner.nextInt();
		
		int total=(num500 *500)+(num100 *100)+(num50*50)+(num10*10);
	
		System.out.printf("저금통 안의 동전의 총 액수:%d원",total); //printf, println 사용법 구분하기 
	
	}

}
