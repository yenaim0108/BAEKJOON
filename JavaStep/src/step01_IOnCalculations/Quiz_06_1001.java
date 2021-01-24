package step01_IOnCalculations;

import java.util.Scanner;

public class Quiz_06_1001 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		String ab = null;
		String[] tmp = null;
		int sub = 0;
		
		// 콘솔 입력
		ab = s.nextLine();
		
		// 입력 받은 값 정수로 변환해서 저장
		tmp = ab.split(" ");
		sub = Integer.parseInt(tmp[0]);
		sub -= Integer.parseInt(tmp[1]);
		
		// sub 출력
		System.out.println(sub);
	}
	
}
