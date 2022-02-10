package chapter03;

import java.util.Scanner;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력하세요:");
		int charCod = scanner.next().charAt(0); //A charAt(0) = str이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환한다
		System.out.println(charCod >=65 && charCod <=90);
		
		System.out.println("숫자를 입력하세요:");
		int value = scanner.nextInt();
		System.out.println(value%2==0 || value%3==0);// || OR 논리합, 이것만 씀 
		System.out.println(value%2 ==0| value%3 ==0);
		
	}

}
