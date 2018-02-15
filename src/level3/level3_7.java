//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.

package level3;

import java.util.Scanner;

public class level3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=(num-i); k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}	
		

	}

}
