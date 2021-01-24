package step01_IOnCalculations;

import java.util.Scanner;

public class Quiz_10_10430 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		String ab = null;
		String[] tmp = null;
		int a, b, c;
		
		// 콘솔 입력
		ab = s.nextLine();
		
		// 입력 받은 값 정수로 변환해서 저장
		tmp = ab.split(" ");
		a = Integer.parseInt(tmp[0]);
		b = Integer.parseInt(tmp[1]);
		c = Integer.parseInt(tmp[2]);
		
		// 출력
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}
	
}