//BOJ level10_4_4948

package level10;

import java.util.Scanner;

public class level10_4_4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int testCase = sc.nextInt(); //테스트케이스를 입력받음
			if(testCase == 0) {
				break; //입력받은 테스트케이스가 0이면 while문 탈출, 프로그램 종료
			}
			
			boolean b; //소수인지 아닌지의 값을 넣는 변수
			int count = 0; //소수의 개수
			
			for(int i=testCase+1; i<=(testCase*2); i++) {
				b = true;
				for(int j=2; j<i; j++) {
					if(i % j == 0) { //소수가 아닐 경우
						b = false;
						break;
					}
				}
				if(b == true) { //소수일 경우
					count++;
				}
			}
			
			System.out.println(count);
		} 

	}

}
