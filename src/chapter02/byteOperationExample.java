package chapter02;

public class byteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y =20;
		int result2 = x+y; //x,y는 byte지만 x+y는 int로 출력해야함 
		System.out.println(result2);
	}
}
//두 피연산자 중 허용 범위가 큰 타입으로 변환되어 연산수행 
