//백준저지 알고리즘 - 8393
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

package level3;

import java.util.*;

public class level3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1이상 10,000이하의 자연수 입력 : ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println("1부터 입력하신 숫자까지의 합 : " + sum);
	}

}
