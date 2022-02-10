package chapter03;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님:0)");
		int capital = scanner.nextInt();
		
		System.out.print("총 인구는? (단위 : 만 ");
		int people1 = scanner.nextInt();
		
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int people2 = scanner.nextInt();
		
		if ((capital==1&&(people1>100))||(people2>=50)) {
			System.out.println("이 도시는 메트로폴리스입니다.");
		}else {
			System.out.println("이 도시는 메트로 폴리스가 아닙니다.");
		}
	}

}
