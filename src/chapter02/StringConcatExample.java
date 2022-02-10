package chapter02;

public class StringConcatExample {
	public static void main(String[] args) {
//byte short int long float double 
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 +"2"+ 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" +2+ 8;
		System.out.println("str3: " + str3);
		
		String str4 = "10" +(2+ 8);
		System.out.println("str4: " + str4);
		
		//07
		int x=5;
		int y=2;
		double result1 =(double) x/y ;//2.5 
		double result2= x/y *1.0 ; //2.0 
		
		//08
		double var1 =3.5;
		double var2 = 2.7;
		int result3=(int)(var1+var2);

		//09
		long var3=2L;
		float var4=1.8f;
		double var5= 2.5;
		String var6 = "3.9"; //string을 double로 변환할려면 double.parsedouble써야함 
		int result4 = (int)var3+ (int)(var4+var5)+ (int)Double.parseDouble(var6);
		//3.9는 double이므로 double로 먼저 변환 => 그 다음 int 캐스팅
		System.out.println(result4);
		
		//10
		String str5= 2 + 3 +"";
		String str6= 2 + "" +3;
		String str7 = "" + 2 + 3;
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		//11
			}
}




