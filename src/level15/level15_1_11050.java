//https://www.acmicpc.net/problem/11050

package level15;

import java.util.Scanner;

public class level15_1_11050 {
	
	public static int factorial(int num) {
		int result = 1;
		
		for(int i=num; i>0; i--) {
			result *= i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(factorial(N)/(factorial(K)*factorial(N-K)));
		
	}

}
