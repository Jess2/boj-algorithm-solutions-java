//백준저지 알고리즘 5_2_1065

package level5;

import java.util.Scanner;

public class level5_2_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		
		//두 자리 수 이하일 경우
		if(num > 0 && num < 100) {
			for(int i=0; i<num; i++) {
				result++;
			}
		}
		
		//세 자리 수일 경우
		if(num >= 100 && num <= 1000) {
			result += 99;

			for(int i=100; i<=num; i++) {
				String numStr = String.valueOf(i);
				if((Integer.parseInt(numStr.substring(1, 2)))*2 == (Integer.parseInt(numStr.substring(0, 1)))+(Integer.parseInt(numStr.substring(2, 3)))) {
					result += 1;
				}
			}
		}
		
		System.out.println(result);

	}

}
