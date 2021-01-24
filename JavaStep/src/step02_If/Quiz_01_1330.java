package step02_If;

import java.util.Scanner;

public class Quiz_01_1330 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		String ab;
		String[] tmp;
		int a, b;
		
		// 콘솔 입력
		ab = s.nextLine();
		
		// 입력 받은 값 정수로 변환해서 저장
		tmp = ab.split(" ");
		a = Integer.parseInt(tmp[0]);
		b = Integer.parseInt(tmp[1]);
		
		// 조건에 따라 출력
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
	}
	
}