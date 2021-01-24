package step01_IOnCalculations;

import java.util.Scanner;

public class Quiz_08_1008 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		String ab = null;
		String[] tmp = null;
		double div = 0;
		
		// 콘솔 입력
		ab = s.nextLine();
		
		// 입력 받은 값 정수로 변환해서 저장
		tmp = ab.split(" ");
		div = Double.parseDouble(tmp[0]);
		div /= Double.parseDouble(tmp[1]);
		
		// div 출력
		System.out.println(div);
	}
	
}