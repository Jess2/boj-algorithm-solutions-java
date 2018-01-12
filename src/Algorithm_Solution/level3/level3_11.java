//백준저지 알고리즘 - 11721
//알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다. 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
//미완성

package Algorithm_Solution.level3;

import java.util.*;

public class level3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("길이가 100을 넘지 않는 영어단어입력 : ");
		String input = scanner.nextLine();
		
		if(input.length() >=1 && input.length() <=100) {
			for(int i=0; i<input.length(); i++) {
				arr[i] = input.substring(0,9);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
