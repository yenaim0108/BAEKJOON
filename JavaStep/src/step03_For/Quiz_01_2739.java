package step03_For;

import java.util.Scanner;

public class Quiz_01_2739 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		int n;
		
		// 콘솔 입력
		n = s.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
	
}