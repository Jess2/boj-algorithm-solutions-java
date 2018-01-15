//백준저지 알고리즘 - 11721
//알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다. 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
//미완성 -> 해결

package level3;

import java.util.*;

public class level3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] arr = new String[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("길이가 100을 넘지 않는 영어단어입력 : ");
		String input = scanner.nextLine();
		
		char[] arr = input.toCharArray(); //string을 char배열로 변환
		
		for(int i=0; i<arr.length; i++) {
			if(i%10==0) {
				System.out.println();
			}
			System.out.print(arr[i]);
		}

	}

}
