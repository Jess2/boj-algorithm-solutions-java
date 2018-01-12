//백준저지 알고리즘 10871
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

package Algorithm_Solution.level4;

import java.util.*;

public class level4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수열의 개수와 정수를 입력하세요(1~10,000) : ");
		
		String input1 = scanner.next();
		int num1 = Integer.parseInt(input1); //수열의 개수
		
		String input2 = scanner.next();
		int num2 = Integer.parseInt(input2); //정수
		
		int[] arr = new int[num1];
				
		System.out.print("수열을 이루는 정수 " + num1 + "개를 입력하세요(1~10,000) : ");
		
		for(int i=0; i<num1; i++) {
			String input3 = scanner.next();
			arr[i] = Integer.parseInt(input3);
		}
		
		for(int i=0; i<num1; i++) {
			if(arr[i] < num2) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
