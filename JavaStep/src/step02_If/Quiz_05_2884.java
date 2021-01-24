package step02_If;

import java.util.Scanner;

public class Quiz_05_2884 {

	public static void main(String[] args) {
		// 변수 선언
		Scanner s = new Scanner(System.in);
		String time; // 알람 시간
		String[] tmp;
		int h, m; // 시, 분
		
		// 콘솔 입력
		time = s.nextLine();
		
		// 입력 받은 값 정수로 변환
		tmp = time.split(" ");
		h = Integer.parseInt(tmp[0]);
		m = Integer.parseInt(tmp[1]);
		
		// 45분전으로 시간 변경
		if (m < 45) { // 00 ~ 44분일 때
			h -= 1;
			m = 60 - (45 - m);
		} else { // 45 ~ 59분일 때
			m -= 45;
		}
		
		// h가 -1이면 23으로 변경
		if (h == -1) {
			h = 23;
		}
		
		// 바뀐 시간 출력
		System.out.println(h + " " + m);
	}
	
}