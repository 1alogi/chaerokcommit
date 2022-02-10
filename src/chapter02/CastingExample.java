package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; //int타입은 char타입보다 더 큰 허용의 범위를 가진다. =>강제변환=> 작은 범위 = (char)큰 허용범위 
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; //강제변환 작은허용범위 = (작은범위) 큰허용범위 
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue=(int) doubleValue;
		System.out.println(intValue);
	}
}

/* 강제 타입변환 : 큰 허용의 타입은 작은 허용의 타입으로 자동변환 될수 없다. 
 * 			 큰허용의 타입을 작은 허용의 타입으로 강제로 나눠서 저장 
 c
 */
  