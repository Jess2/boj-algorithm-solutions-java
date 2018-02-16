//백준저지 알고리즘 - 8393
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

package level3;

import java.util.Scanner;

public class level3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
