//백준저지 알고리즘 6_5_10039

package level6;

import java.util.Scanner;

public class level6_5_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;

		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 40) {
				arr[i] = 40;
			}
		}
		
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum/5);
		
		
	}

}
