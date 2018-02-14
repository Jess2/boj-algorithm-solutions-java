//백준저지 알고리즘 10430

package level2;

import java.util.Scanner;

public class level2_6_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		// (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
		System.out.println((num1+num2)%num3);
		System.out.println((num1%num3 + num2%num3)%num3);
		System.out.println((num1*num2)%num3);
		System.out.println((num1%num3 * num2%num3)%num3);

	}

}
