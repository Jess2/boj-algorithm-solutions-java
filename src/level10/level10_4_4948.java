//https://www.acmicpc.net/problem/4948

package level10;

import java.util.Scanner;

public class level10_4_4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int input = -1;
		
		while(input != 0) {
			input = sc.nextInt();
			if(input == 0) {
				System.exit(0);
			}
			boolean b; //소수인지 아닌지의 값을 넣는 변수
			int count = 0; //소수의 개수
			int half = (int)Math.sqrt(input*2)+1; //제곱근
			
			for(int i=input+1; i<=(input*2); i++) {
				b = true;
				for(int j=2; j<half; j++) {
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
