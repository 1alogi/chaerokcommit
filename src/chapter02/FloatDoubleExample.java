package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//float var1=3.14;
		float var2=3.14f; //float f붙이셈 
		double var3=3.14;
		
		float var4=0.1234567890123456789f;
		double var5 =0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e사용하기
		double var6= 3e6;
		float var7 =3e6F;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}

}
//실수 리터럴 타입 : float, double 소수점 이하 자리가 각각 7자리 15자리 
//float타입으로 저장하고 싶다면 리터럴 뒤에 f 붙여 float타입임을 각인
