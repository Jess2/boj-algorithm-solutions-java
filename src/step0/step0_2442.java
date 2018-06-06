//https://www.acmicpc.net/problem/2442

package step0;

import java.util.Scanner;

public class step0_2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}