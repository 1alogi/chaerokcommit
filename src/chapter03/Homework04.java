package chapter03;

public class Homework04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필개수 
		int pecillsPerStudent = 534/30 ;
		System.out.println(pecillsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft= 534%30;
		System.out.println(pencilsLeft);
		
	}
}
