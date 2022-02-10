package chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in); //=을 기준으로 오른쪽이 항상 먼저 실행, Scanner란 애는 정보가 필요(jre안에 있긴함)=> 컨트롤+스페이스 눌러서 2번째 선택
	  //타입     	변수
		System.out.print("문자를입력하세요:"); //print는 줄바꿈 안함 println은 줄바꿈함 printf는 format형식
		String str = scanner.next(); //사용자가 입력한 데이터를 문자열로 가져옴. String next = scanner.next(
		int integer = scanner.nextInt(); //사용자가 입력한 데이터를 정수로 가져옴. int nextInt = scanner.nextInt()
		double db = scanner.nextDouble(); //사용자가 입력한 데이터를 실수로 가져옴  double nextDouble = scanner.nextDouble()
		System.out.println(str);
		System.out.println(integer);
		System.out.println(db);
		scanner.close();
	}

}
