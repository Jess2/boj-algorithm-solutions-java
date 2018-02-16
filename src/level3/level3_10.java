//백준저지 알고리즘 - 11720
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

package level3;

import java.util.Scanner;

public class level3_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt(); //합할 숫자의 개수
		String str = scanner.next(); //합할 숫자들
		
		for(int i=0; i<num; i++) {
			sum += (str.charAt(i) - '0'); //string형을 char형으로 문자 하나하나씩 받고 그걸 숫자형으로 변환하여 sum에 더함.
		}
		
		System.out.println(sum);
	}

}
