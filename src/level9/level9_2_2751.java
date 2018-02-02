//https://www.acmicpc.net/problem/2751
//BOJ level9_2_2751
//병합정렬을 이용한 오름차순 정렬 

package level9;

import java.util.Arrays;
import java.util.Scanner;

public class level9_2_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); //테스트케이스 개수를 입력받 testCase 변수에 저장 
		int[] arr = new int[testCase]; //테스트케이스 개수만큼의 크기를 가진 int형 배열 arr 생성 
		
		for(int i=0; i<testCase; i++) {
			arr[i] = sc.nextInt(); //입력받은 값으로 배열을 초기화 
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
