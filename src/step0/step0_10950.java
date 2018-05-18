//https://www.acmicpc.net/problem/10950

package step0;

import java.util.Scanner;

public class step0_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int num1, num2;
		
		for(int i=0; i<testCase; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}

	}

}
