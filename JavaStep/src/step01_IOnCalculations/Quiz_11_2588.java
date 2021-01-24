package step01_IOnCalculations;

import java.util.Scanner;

public class Quiz_11_2588 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String[] tmp = null;
		int a, b, c;
		
		// 콘솔 입력
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		// 입력 받은 값 저장
		tmp = Integer.toString(num2).split("");
		a = Integer.parseInt(tmp[0]);
		b = Integer.parseInt(tmp[1]);
		c = Integer.parseInt(tmp[2]);
		
		// 곱셈 과정 출력
		System.out.println(num1 * c);
		System.out.println(num1 * b);
		System.out.println(num1 * a);
		System.out.println(num1 * num2);
	}
	
}