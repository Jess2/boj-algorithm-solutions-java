//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

package level3;

import java.util.Scanner; //Scaner를 사용하기 위한 import

public class level3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
