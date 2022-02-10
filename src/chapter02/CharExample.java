package chapter02;

public class CharExample {
	public static void main(String[] args) {
	char c1='A'; //65와같음 
	char c2=65; //아스키코드(미국정보교환표준부호)
	char c3='\u0041'; 
	
	char c4='가';
	char c5=44032;
	char c6='\uac00';
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	
	}

}

//같은 실수라도 타입이 다르면 다른 값인 나옴 double, float
// 0.1f랑 0.1이랑 다름 0.1은 double 0.1f는 float
//char타입 유니코드를 저장할 수 있도록 하는 2byte 크기 , 문자 리터럴은 유니코드로 변환 , 문자리터럴 : 하나의 문자를 작은따옴표로 감싼것