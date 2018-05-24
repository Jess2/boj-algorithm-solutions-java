//https://www.acmicpc.net/problem/1010

package step0;

import java.util.Scanner;

public class step0_1010 {
	
	public static int factorial(int _m, int _n) {
		int result = 1;
		for(int i=1;i<=_n;i++){
			result = result * (_m-i+1) / i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println(factorial(m, n));
		}
	}

}
