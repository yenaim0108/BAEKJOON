package step04_While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_03_1110 {
	
	public static void main(String[] args) {
		// 변수 선언
		String str, newNumber;
		String[] tmp;
		int n, sum, cycle = 0;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			// 콘솔 입력
			str = br.readLine();
			
			// 정수로 변환
			n = Integer.parseInt(str);
			
			// n이 10미만일 경우 0 붙이기
			if (n < 10) {
				str = "0" + str;
			}
		
			// 각 자리 분리
			tmp = str.split("");
			
			while (true) {
				// 일의 자리 저장
				newNumber = tmp[1];
				
				// 분리한 각 자리 숫자 더하기
				sum = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]);

				// sum이 10미만일 경우 0 붙이기
				if (sum < 10) {
					str = "0" + String.valueOf(sum);
				} else { // n이 10이상이면 그냥 문자형으로 변환
					str = String.valueOf(sum);
				}
				
				// sum의 각 자리수 분리
				tmp = str.split("");

				// 기존 수의 일의 자리 숫자와 sum의 일의 자리 숫자를 결합해 새로운 수 만들기
				newNumber += tmp[1];
				
				// newNumber의 각 자리수 분리
				tmp = newNumber.split("");

				// 사이클 증가
				cycle++;
				
				if (n == Integer.parseInt(newNumber)) { // 새로운 수와 n이 같으면 사이클을 출력하고 종료
					bw.write(String.valueOf(cycle));
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}