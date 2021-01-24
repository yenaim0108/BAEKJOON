package step04_While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_02_10951 {
	
	public static void main(String[] args) {
		// 변수 선언
		String str;
		String[] tmp;
		int a, b;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			while ((str = br.readLine()) != null) {
				// 분리
				tmp = str.split(" ");
				
				// 엔터만 들어왔을 경우도 break
				if (tmp[0].equals("")) {
					break;
				}
				
				// 정수로 변환해서 저장
				a = Integer.parseInt(tmp[0]);
				b = Integer.parseInt(tmp[1]);
				
				// a + b 출력
				bw.write(String.valueOf(a + b));
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}