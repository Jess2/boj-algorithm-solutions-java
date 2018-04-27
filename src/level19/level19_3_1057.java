//https://www.acmicpc.net/problem/1057

package level19;

import java.util.Scanner;

public class level19_3_1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int cnt = 1;
		
		while(true) {
			if((num2 % 2 == 0 && num2 - num1 == 1) || (num1 % 2 == 0 && num1 - num2 == 1)) {
				break;
			}
			num1 = (num1 / 2) + (num1 % 2);
			num2 = (num2 / 2) + (num2 % 2);
			cnt++;
		}
		
		System.out.println(cnt);

	}

}
