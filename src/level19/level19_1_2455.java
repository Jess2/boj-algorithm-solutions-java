//https://www.acmicpc.net/problem/2455

package level19;

import java.util.Scanner;

public class level19_1_2455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[1];
		int temp = 0;
		int i = 2;
		
		while(i < arr.length) {
			temp = max - arr[i] + arr[i+1];
			if(max < temp) {
				max = temp;
			}
			i += 2;
		}
		
		System.out.println(max);

	}

}
