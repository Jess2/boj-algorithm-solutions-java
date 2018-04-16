//https://www.acmicpc.net/problem/11051

package level15;

import java.util.Scanner;

public class level15_2_11051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int bcArr[][] = new int[N+1][K+1];
		for (int i = 0; i <= N; i++) {
			bcArr[i][0] = 1;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				bcArr[i][j] = (bcArr[i-1][j-1] + bcArr[i-1][j]) % 10007;
			}
		}
		System.out.println(bcArr[N][K]);
	}

}
