//https://www.acmicpc.net/problem/1929

package level10;

import java.util.Scanner;

public class level10_3_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		boolean b;
		
		for(int i=M; i<=N; i++) {
			b = true;
			for(int j=2; j<i; j++) {
				if(i % j == 0) { //소수가 아닐 경우
					b = false;
					break;
				}
			}
			if(b == true) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}