package chapter02;

import java.util.Scanner;

public class Exercise21 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로의길이는?(단위:m):");
		double wide =scanner.nextDouble();
		System.out.print("세로의길이는?(단위:m):");
		double high = scanner.nextDouble();

		double area = (wide*high);
		System.out.print("직사각형의 넓이:"+ area);
		
		double round =(wide+high)*2;
		System.out.print("직사각형의 둘레:"+ round);	
		
		}
	}

