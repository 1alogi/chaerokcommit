package chapter03;

public class compareOperatorExample2 {
	public static void main(String[] args) {
		float v4= 0.124f;
		double v5 = 0.1234; 
		System.out.println(v4==(float)v5); //같다. 
		System.out.println(v4!=v5); //같지않다
		
		String a="홍";
		String b="김";
		System.out.println(!a.equals(b));
	}

}
