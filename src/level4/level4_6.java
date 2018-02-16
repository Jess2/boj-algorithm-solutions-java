//백준저지 알고리즘 1110

package level4;

import java.util.Scanner;

public class level4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cycle = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		final int origin = num;
		
		do {
			sum = (num/10) + (num%10);
			num = ((num%10)*10) + (sum%10);
			cycle++;
		} while(num!=origin);
		
		System.out.println(cycle);

	}

}

