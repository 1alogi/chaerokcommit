package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue =10;
		int intValue = byteValue; // byte가 int 에 포함되므로 byteValue가 IntValue로 자동변환 된다. 
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;//유니코드 값이 int타입에 저장됨  
		System.out.println("가의 유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue; //int가 long으로 자동변환 
		//byte< short < int < long < float< double
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue = longValue; //long이 float로 자동변환 
		System.out.println("floatValue:" + floatValue);
		
		floatValue= 100.5F;
		double doubleVale = floatValue;
		System.out.println("doubleValue:" + doubleVale);
	}
}
