// 문제 출처 : https://www.acmicpc.net/problem/2908
// BOJ level7_7_2908
// 상근이는 세 자리 숫자 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
// 상수는 수를 다른사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
// 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
// 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

package level7;

import java.util.Scanner;

public class level7_7_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0이 포함되어 있지 않은 세 자리 수 두 개 입력 : ");
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int num1 = Integer.parseInt(reverseString(str1));
		int num2 = Integer.parseInt(reverseString(str2));
		
		if(num1 > num2) {
			System.out.println(num1);
		} else if(num1 < num2) {
			System.out.println(num2);
		} else {
			System.out.println("비교할 수 없습니다.");
		}
	}
	
	public static String reverseString(String s) {
	    return ( new StringBuffer(s) ).reverse().toString();
	 }

}
