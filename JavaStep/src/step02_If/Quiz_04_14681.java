package step02_If;

import java.util.Scanner;

public class Quiz_04_14681 {
	
	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		int x, y;
		
		// 콘솔 입력
		x = s.nextInt();
		y = s.nextInt();
		
		// 조건에 따라 사분면 출력
		if (x > 0) { // x가 양수일 때
			if (y > 0) { // x가 양수, y가 양수일 때
				System.out.println("1");
			} else { // x가 양수, y가 음수일 때
				System.out.println("4");
			}
		}
		else { // x가 음수일 때
			if (y > 0) { // x가 음수, y가 양수일 때
				System.out.println("2");
			} else { // x가 음수, y가 음수일 때
				System.out.println("3");
			}
		}
	}
	
}