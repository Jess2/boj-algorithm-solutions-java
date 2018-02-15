//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

package level3;

import java.util.Scanner;

public class level3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
			
		for(int i=0; i<num; i++) {
			for(int j=(num-i); j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}