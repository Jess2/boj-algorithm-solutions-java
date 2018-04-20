//BOJ level8_5_10250

package level8;

import java.util.Scanner;

public class level8_5_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); //테스트케이스 개수 입력받음
		
		int[] H = new int[testCase]; //호텔의 층 수
		int[] W = new int[testCase]; //각 층의 방 수
		int[] N = new int[testCase]; //몇 번째 손님인지
		
		String[] result = new String[testCase];
		
		for(int i=0; i<testCase; i++) {
			H[i] = sc.nextInt();
			W[i] = sc.nextInt();
			N[i] = sc.nextInt();
		}
		
		for(int i=0; i<testCase; i++) {
			int x = 0; //층수
			int y = 0; //호수
			if(H[i] == 1) { //건물의 높이가 1인 경우, 층수(x)는 항상 1이다.
				x = 1;
				y = N[i];
			} else if(N[i] % H[i] == 0) { //맨 꼭대기 층일 경우
				x = H[i];
				y = (N[i] / H[i]);
			}else { //일반적인 경우
				x = N[i] % H[i];
				y = (N[i] / H[i]) + 1;
			}
			
			if(y<10) {
				result[i] = x + "0" + y;
			} else {
				result[i] = x + "" + y; 
			}
		}
		
		for(int i=0; i<testCase; i++) {
			System.out.println(result[i]);
		}

	}

}
