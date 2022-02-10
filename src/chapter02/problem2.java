package chapter02;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		//데이터입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		//next() vs nextLine() => 공백문자 또는 엔터 vs 엔터 까지 구분함. 10 20 30 > 10, 20, 30 next
		//														10 20 30 > 10 20 30 nextLine
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수 :");
		String strNum2 = scanner.nextLine();
		//데이터처리
		int num1 = Integer.parseInt(strNum1); //strNum 1,2는 string타입이므로 int로 바꿔야함 by Integer.parseInt();
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		//데이터출력
		System.out.println("덧셈결과:" + result );
	}
}
