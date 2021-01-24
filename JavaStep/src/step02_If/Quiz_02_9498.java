package step02_If;

import java.util.Scanner;

public class Quiz_02_9498 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		int score;
		
		// 콘솔 입력
		score = s.nextInt();
		
		// 조건에 따라 성적 출력
		if ((score >= 90)) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
}