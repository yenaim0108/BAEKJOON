package step02_If;

import java.util.Scanner;

public class Quiz_03_2753 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		int year;
		
		// 콘솔 입력
		year = s.nextInt();
		
		// 윤년 여부 출력
		if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
}