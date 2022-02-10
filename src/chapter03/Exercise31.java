package chapter03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {	
	Scanner scanner =new Scanner(System.in);
	System.out.print("첫 번째 숫자를 입력하세요:");
	int firstNum = scanner.nextInt();
	
	System.out.print("두 번째 숫자를 입력하세요:");
	int SecondNum = scanner.nextInt();
	
	int bigNum = ((firstNum +SecondNum)+Math.abs(firstNum -SecondNum))/2;
	int smallNum= ((firstNum +SecondNum)-Math.abs(firstNum -SecondNum))/2;
	

	System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다.\n", bigNum/smallNum, bigNum%smallNum);
	}

	

}
