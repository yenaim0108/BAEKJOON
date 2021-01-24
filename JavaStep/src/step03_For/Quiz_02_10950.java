package step03_For;

import java.util.Scanner;

public class Quiz_02_10950 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		int t, a, b;
		String num;
		String[] tmp;
		
		// 콘솔 입력 : 테스트 케이스 개수
		t = s.nextInt();
		
		// 버퍼 비우기
		s.nextLine();
		
		// a + b
		for (int i = 0; i < t; i++) {
			// 콘솔 입력 : 두 정수
			num = s.nextLine();
			
			// 입력 받은 값 정수로 변환해서 저장
			tmp = num.split(" ");
			a = Integer.parseInt(tmp[0]);
			b = Integer.parseInt(tmp[1]);
			
			System.out.println(a + b);
		}
	}
	
}