package step03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_11_10871 {
	
	public static void main(String[] args) {
		// 변수 선언
		String[] tmp;
		int x;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			// 콘솔 입력
			tmp = br.readLine().split(" ");
			
			// 기준이 되는 수 저장
			x = Integer.parseInt(tmp[1]);
			
			// 콘솔 입력 : 수역에 들어가는 수
			tmp = br.readLine().split(" ");
			
			// 기준이 되는 수와 비교
			for(int i = 0; i < tmp.length; i++) {
				if(Integer.parseInt(tmp[i]) < x) {
					bw.write(tmp[i] + " ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}