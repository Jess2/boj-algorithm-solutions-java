//백준저지 알고리즘 10817
//세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

package level4;

import java.util.*;

public class level4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		int[] temp = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 정수를 공백으로 구분하여 입력하세요(1~100) : ");
		
		for(int i=0; i<arr.length; i++) {
			String input = scanner.next();
			arr[i] = Integer.parseInt(input);
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
	}

}
