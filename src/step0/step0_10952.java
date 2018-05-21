//https://www.acmicpc.net/problem/10952

package step0;

import java.util.Scanner;

public class step0_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 ==0) {
				break;
			}
			
			System.out.println(num1 + num2);
		}

	}

}
