//백준저지 알고리즘 1_2_1000

package level1;

import java.util.*;

public class level1_2_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("0보다 크고 10보다 작은 두 개의 수 입력 : ");
		
		String input1 = scanner.next();
		int num1 = Integer.parseInt(input1);
		
		String input2 = scanner.next();
		int num2 = Integer.parseInt(input2);
		
		System.out.println(num1+num2);
	}

}
