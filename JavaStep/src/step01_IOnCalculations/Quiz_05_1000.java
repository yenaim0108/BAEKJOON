package step01_IOnCalculations;

import java.util.Scanner;

public class Quiz_05_1000 {
	
	public static void main(String[] args) {
		// 변수선언
		Scanner s = new Scanner(System.in);
		String ab = null;
		String[] tmp = null;
		int sum = 0;
		
		// 콘솔 입력
		ab = s.nextLine();
		
		// 입력 받은 값 정수로 변환해서 저장
		tmp = ab.split(" ");
		sum = Integer.parseInt(tmp[0]);
		sum += Integer.parseInt(tmp[1]);
		
		// sum 출력
		System.out.println(sum);
	}
	
}
