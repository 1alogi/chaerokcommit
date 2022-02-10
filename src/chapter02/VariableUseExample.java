package chapter02;

public class VariableUseExample {
 public static void main(String[] args) {
	 int hour=3; //int 정수 변수 int value =1000 변수선언  
	 int minute=5;
	 
	 System.out.println(hour + "시간" + minute + "분");
	 
	 int totalMinute=(hour*60) + minute;

	 System.out.println("총" + totalMinute + "분");
 }
}
