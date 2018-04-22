//https://www.acmicpc.net/problem/2577

package level17;

import java.util.Scanner;

public class level17_3_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = A*B*C;
		String str = String.valueOf(result);
		int[] arr = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			int temp = str.charAt(i) - '0';
			arr[temp] += 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
