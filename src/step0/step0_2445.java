//https://www.acmicpc.net/problem/2445

package step0;

import java.util.Scanner;

public class step0_2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2; j<(num-i)*2; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<(num-1)-i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=(i+1)*2; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(num-1)-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
