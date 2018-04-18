//백준저지 알고리즘 7_1_11654
//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

package level7;

import java.util.Scanner;

public class level7_1_11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine(); //스트링 입력받음
		char[] charArr = str.toCharArray(); //char형 배열로 변환
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println((int)(charArr[i])); //char를 int로 변환
		}

	}

}
