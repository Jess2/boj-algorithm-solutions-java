//https://www.acmicpc.net/problem/9095

package step0;

import java.util.Scanner;

public class step0_9095 {
	
	public static int arrFunction(int[] arr, int n) {
		if(n > 2) {
			arr[n] = arrFunction(arr, n-1) + arrFunction(arr, n-2) + arrFunction(arr, n-3);	
		} else if(n == 2) {
			arr[n] = n + 2;
		} else {
			arr[n] = n + 1;
		}
		return arr[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int num = sc.nextInt();
			int[] arr = new int[num];
			System.out.println(arrFunction(arr, num-1));
		}

	}

}
