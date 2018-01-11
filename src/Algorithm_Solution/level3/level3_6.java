//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

package Algorithm_Solution.level3;

import java.util.*;

public class level3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("100이하의 자연수 입력 : ");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			
			if(num>0 && num<=100) {
				for(int i=num; num>0; num--) {
					for(int j=0; j<num; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("100이하의 자연수를 입력하지 않았습니다.");
				continue;
			}
		}
		

	}

}
