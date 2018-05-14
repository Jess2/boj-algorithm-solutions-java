//https://www.acmicpc.net/problem/11004

package level20;

import java.util.Arrays;
import java.util.Scanner;

public class level20_1_11004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt(); //배열의 길이
		int k = sc.nextInt(); //구하고 싶은 위치
		int[] arr = new int[length]; //배열
		
		for(int i=0; i<length; i++) {
			arr[i] = sc.nextInt(); //배열의 원소를 입력받음
		}
		
		Arrays.sort(arr); //배열 정렬
		
		System.out.println(arr[k-1]);

	}

}
