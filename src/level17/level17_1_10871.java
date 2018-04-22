//https://www.acmicpc.net/problem/10871

package level17;

import java.util.Scanner;

public class level17_1_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int num = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			if(arr[i] < num) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
