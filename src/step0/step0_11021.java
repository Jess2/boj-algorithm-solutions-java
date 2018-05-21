//https://www.acmicpc.net/problem/11021

package step0;

import java.util.Scanner;

public class step0_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + (num1 + num2));
		}

	}

}
