package step03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_06_2742 {
	
	public static void main(String[] args) {
		// 변수 선언
		int n;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			// 정수 입력
			n = Integer.parseInt(br.readLine());
			
			// n ~ 1 출력
			for (int i = n; i > 0; i--) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}