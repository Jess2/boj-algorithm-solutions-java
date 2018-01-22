//백준저지 알고리즘 7_1_11654
//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

package level7;

import java.util.Scanner;

public class level7_1_11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 소문자, 대문자 숫자 0-9 중 하나 입력 : ");
		
		String str = sc.nextLine();
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println((int)(charArr[i]));
		}

	}

}
