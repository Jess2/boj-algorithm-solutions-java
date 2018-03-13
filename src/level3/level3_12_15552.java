//https://www.acmicpc.net/problem/15552

package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class level3_12_15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			int sum = 0;
			//스트링 토크나이저를 이용해 readLine()을 통해 한 줄을 한번에 입력받은것을 띄어쓰기(" ")를 기준으로 쪼갬
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			//쪼갠 값이 존재할때까지 반복
			while(st.hasMoreTokens()){
				//nextToken()을 통해 띄어쓰기(" ")를 제거하고 남은 숫자를 스트링 형태에서 int로 형변환하여 sum에 더함.
				sum += Integer.parseInt(st.nextToken());
			}
			
			bw.write(sum+"\n");
			bw.flush();
		}
		
	}

}
