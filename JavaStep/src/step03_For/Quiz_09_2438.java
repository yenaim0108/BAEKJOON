package step03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_09_2438 {
	
	public static void main(String[] args) {
		// 변수 선언
		int t;
		String[] tmp;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			// 테스트 케이스 개수 입력
			t = Integer.parseInt(br.readLine());
			
			// 별 출력
			for (int i = 0; i < t; i++) {
				for (int j = 0; j <= i; j++) {
					bw.write("*");
				}
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}