package step03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_08_11022 {
	
	public static void main(String[] args) {
		// 변수 선언
		int t;
		String[] tmp;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			// 테스트 케이스 개수 입력
			t = Integer.parseInt(br.readLine());
			
			// a + b
			for (int i = 0; i < t; i++) {
				// 두 정수 입력
				tmp = br.readLine().split(" ");
				
				bw.write("Case #" + String.valueOf(i + 1) + ": " + String.valueOf(Integer.parseInt(tmp[0])) + " + " + String.valueOf(Integer.parseInt(tmp[1])) + " = " + String.valueOf(Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1])));
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}