//https://www.acmicpc.net/problem/2562

package step0;

import java.util.Scanner;

public class step0_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);

	}

}
