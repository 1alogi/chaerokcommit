package chapter03;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 :");		
		double num1 = Double.parseDouble(scanner.next());
		
		
		System.out.print("두 번째 수 :");		
		double num2 = Double.parseDouble(scanner.next());
		
		
		
		System.out.println("----------------");
		if (num2!=0.0) {
			System.out.println("결과 : " + (num1/num2));}
			else  {
			System.out.println("결과 : 무한대");
		}
	}}
			//double fn= scanner.nextDouble();	
			// double sn=scanner.nextDouble();	
			//String result =(second==0 || second ==0.0? "무한대" : String.valueOf(fn/sn);
			
