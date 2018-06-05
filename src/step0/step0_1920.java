//https://www.acmicpc.net/problem/1920

package step0;

import java.util.Scanner;

public class step0_1920 {
	
	public static int isExistInArray(int[] arr, int val) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == val) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrN = new int[n]; 
		
		for(int i=0; i<n; i++) {
			arrN[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arrM = new int[m];
		
		for(int i=0; i<m; i++) {
			arrM[i] = sc.nextInt();
		}
		
		for(int i=0; i<m; i++) {
			System.out.println(isExistInArray(arrN, arrM[i]));
		}
		
	}

}
