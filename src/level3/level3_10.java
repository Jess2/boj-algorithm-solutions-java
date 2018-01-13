//백준저지 알고리즘 - 11720
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

package level3;

import java.util.Scanner;

public class level3_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 개의 숫자를 합하시겠습니까?(1이상 100이하의 자연수) : ");
		String input = scanner.nextLine();
		int count = Integer.parseInt(input);
		
		System.out.print("숫자들을 공백없이 입력하세요 : ");
		String input2 = scanner.nextLine();
		
		for(int i=0; i<count; i++) {
			sum += (input2.charAt(i) - '0');
		}
		
		System.out.println(sum);
	}

}
