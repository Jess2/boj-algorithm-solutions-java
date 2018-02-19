//https://www.acmicpc.net/problem/2108
//BOJ level9_4_2108
//N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
//check

package level9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class level9_4_2108_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); //테스트케이스 개수 입력받아 저장 
		int[] arr = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		//산술평균
		int sum = 0;
		for(int i=0; i<testCase; i++) {
			sum += arr[i];
		}
		System.out.println(Math.round((double)sum/testCase));
		
		//중앙값
		System.out.println(arr[testCase/2]);
		
		//최빈값
		int[][] arr2 = new int[testCase][2];
		int j = 1;
		arr2[0][0] = arr[0];
		
		for(int i=1; i<testCase; i++) {
			if(arr[i-1] != arr[i]) {
				arr2[j++][0] = arr[i];
			}
		}
		for(int i=0; i<testCase; i++) {
			for(int k=0; k<testCase; k++) {
				if(arr2[i][0] == arr[k]) { //arr[k]가 이미 있을 경우
					arr2[i][1] += 1;
				}
			}
		}
		
		int max = 1;
		for(int i=0; i<testCase; i++) {
			if(arr2[i][1] >= max) {
				max = arr2[i][1]; //가장 많이 나온 수가 몇 번 나온 것인지 계산
			}
		}
		
		List<Integer> list = new ArrayList<>();  //동적 배열 생성
		
		for(int i=0; i<testCase; i++) {
			if(arr2[i][1] == max) {
				list.add(arr2[i][0]);
			}
		}
		
		Collections.sort(list);
		
		if(list.size() > 1) {
			System.out.println(list.get(1));
		} else {
			System.out.println(list.get(0));
		}
	
		//범위
		System.out.println(arr[testCase - 1] - arr[0]);
	}

}
