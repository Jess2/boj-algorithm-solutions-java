//https://www.acmicpc.net/problem/2775

package level8;

import java.util.Scanner;

public class level8_7_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int k = sc.nextInt(); //층
			int n = sc.nextInt(); //호
			int[][] aptArr = new int[k+1][n];
			
			for(int l=0; l<=k; l++) {
				for(int m=1; m<=n; m++) {
					if(l == 0) {
						aptArr[l][m-1] = m;
					} else if(m == 1) {
						aptArr[l][m-1] = 1;
					} else {
						aptArr[l][m-1] = aptArr[l][m-2] + aptArr[l-1][m-1];
					}
				}
			}
			
			System.out.println(aptArr[k][n-1]);
		}

	}

}
