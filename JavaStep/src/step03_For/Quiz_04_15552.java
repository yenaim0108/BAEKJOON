package step03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_04_15552 {
	
	public static void main(String[] args) {
		// 변수 선언
		int t;
		String[] tmp;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			// 콘솔 입력 : 테스트 케이스 개수
			t = Integer.parseInt(br.readLine());
			
			// t만큼 반복 : 두 정수 더하기
			for (int i = 0; i < t; i++) {
				// 두 정수 입력
				tmp = br.readLine().split(" ");
				
				// 두 정수의 합 출력
				bw.write(String.valueOf(Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1])));
				// 개행
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}