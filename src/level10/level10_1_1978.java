//BOJ level10_1_1978
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

package level10;

import java.util.Scanner;

public class level10_1_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = num;
		
		for(int i=0; i<num; i++) {
			if(arr[i] == 1) {
				result--;
			}
			for(int j=2; j<arr[i]; j++) {
				if(arr[i] % j == 0) {
					result--;
					break;
				}
			}
		}
		
		System.out.println(result);

	}

}
