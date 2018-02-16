//백준저지 알고리즘 10871
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

package level4;

import java.util.Scanner;

public class level4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //수열을 이루는 정수의 개수
		int standard = scanner.nextInt(); //기준 정수
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(arr[i] < standard) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
