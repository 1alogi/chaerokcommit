package chapter02;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍\\길동"; // \\:\ 출럭 
		String job = "프로 그래머";
		String discription = "홍길동전은 \"소설\"입니다."; // \역슬러쉬 앞에쓰면 큰따옴표 출력가능 
		System.out.println(name);
		System.out.println(job);
		System.out.println(discription);
		
		
		long value =500000000L;
		byte b = 120;
		float pi = 3.14f;
		boolean flag = false;
		double v2 =1e2;
		float v3 =1e2f;
		
		System.out.println(value);
		System.out.println(b);
		System.out.println(flag);
		System.out.println(v2);
		System.out.println(v3);
	
		
		System.out.println("자바는");
		System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다.");
	}
}

// \n 줄바꿈 
//작은따옴표로 감싼 문자는 char 타입변수에 저장되어 유니코드로 저장되지만 큰따옴표로 감싼 문자는 유니코드로 변환 되지 않음 
//큰따옴표로 감싼 문자 : 문자열 =>string 타입을 이용 