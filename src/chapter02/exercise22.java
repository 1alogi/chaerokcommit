package chapter02;

public class exercise22 {
	public static void main(String[] args) {
		/* 거리 =  40 * 10^12km  속도 = 300,000km/s 
		  지구에서 프록시마까지 걸리는 시간을 구하자 */
		double distance = 40e12;
		double velocity = 300000;//초 단위기 때문에 연 단위로 바꾸자 => 60*60*24*365 초 분 시 일 
		double speedLight = velocity*(3600*24*365);
		double time = distance / speedLight ;
		System.out.println("빛의 속도로 프록시마 센타우리까지 가는데 걸리는 시간은 "+time+"광년이다.");
	}
}
