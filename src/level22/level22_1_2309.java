//https://www.acmicpc.net/problem/2309

package level22;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class level22_1_2309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		sum -= 100;
		
		Arrays.sort(arr);
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			int find = sum - arr[i];
			if(find != arr[i] && IntStream.of(arr).anyMatch(x -> x == find)) {
				num1 = arr[i];
				num2 = find;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != num1 && arr[i] != num2) {
				System.out.println(arr[i]);
			}
		}

	}

}
