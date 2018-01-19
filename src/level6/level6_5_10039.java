//백준저지 알고리즘 6_5_10039

package level6;

import java.util.*;

public class level6_5_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;

		System.out.println("점수 입력 : ");
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 5 != 0) {
				System.out.println("점수는 5의 배수여야 합니다. 프로그램 종료.");
				return;
			}
			if(arr[i] < 40) {
				arr[i] = 40;
			}
		}
		
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		
		System.out.println("평균: " + sum/5);
		
		
	}

}
