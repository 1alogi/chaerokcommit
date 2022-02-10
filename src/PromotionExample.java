
public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue =byteValue; //자동타입변환됨 
		System.out.println("intValue:" + intValue);
		
		char charValue = '가'; //작은따옴표 char타입 
		 intValue =charValue;
		System.out.println("가의 유니코드:" + intValue);
		
		intValue=50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue =longValue;
		System.out.println("longValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue =floatValue;
		System.out.println("doubleValue:" + doubleValue);
	}

}

/* 타입변환 : 큰 허용 범위 타입 >= 작은 허용 범위타입
 * byte < short < int< long < float < double 
 * */
