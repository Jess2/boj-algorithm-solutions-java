//백준저지 알고리즘 1110

package Algorithm_Solution.level4;

import java.util.*;

public class level4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cycle = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0~99의 정수 입력 : ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		final int origin = num;
		
		do {
			sum = (num/10) + (num%10);
			num = ((num%10)*10) + (sum%10);
			cycle++;
		} while(num!=origin);
		
		System.out.println(cycle);

	}

}

