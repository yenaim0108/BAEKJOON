package step04_While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_01_10952 {
	
	public static void main(String[] args) {
		// 변수 선언
		String[] tmp;
		int a, b;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			while (true) {
				// 콘솔 입력
				tmp = br.readLine().split(" ");
				
				// 입력받은 값 정수로 변환해서 저장
				a = Integer.parseInt(tmp[0]);
				b = Integer.parseInt(tmp[1]);
				
				// a, b 둘 다 0일 경우 while문 종료
				if ((a == 0) && (b == 0)) {
					break;
				} else {
					// a + b 출력
					bw.write(String.valueOf(a + b));
					bw.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}