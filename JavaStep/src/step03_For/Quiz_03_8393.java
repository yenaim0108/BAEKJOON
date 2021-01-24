package step03_For;

import java.util.Scanner;

public class Quiz_03_8393 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		
		// 콘솔 입력 : 정수
		n = s.nextInt();
		
		// 1부터 n까지 합
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		// sum 출력
		System.out.println(sum);
	}
	
}