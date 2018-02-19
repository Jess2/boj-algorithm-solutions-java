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

public class level9_4_2108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); //테스트케이스 개수 입력받아 저장 
		int[] arr = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(avg(arr)); //산술평균
		System.out.println(center(arr)); //중앙값
		System.out.println(mode(arr)); //최빈값
		System.out.println(range(arr)); //범위

	}
	
	//산술평균 메소드 
	private static int avg(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return Math.round(sum/array.length);
	}
	
	//중앙값 메소드
	private static int center(int[] array) {
		return array[array.length / 2];
	}
	
	//최빈값 메소드
	private static int mode(int[] array) {
		int[][] arr2 = new int[array.length][2];
		int j = 1;
		
		for(int i=0; i<array.length; i++) {
			if(i==0) {
				arr2[i][0] = array[i];
			}
			if(i>0 && (array[i-1] != array[i])) {
				arr2[j++][0] = array[i];
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array.length; k++) {
				if(arr2[i][0] == array[k]) { //array[k]가 이미 있을 경우
					arr2[i][1] += 1;
				}
			}
		}
		
		int max = 1;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i][1] >= max) {
				max = arr2[i][1];
			}
		}
		
		List<Integer> list = new ArrayList<>();  //동적 배열 생성
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i][1] == max) {
				list.add(arr2[i][0]);
			}
		}
		
		Collections.sort(list);
		
		if(list.size() > 1) {
			return list.get(1);
		} else {
			return list.get(0);
		}
		
        
	}
	
	//범위 메소드 
	private static int range(int[] array) {
		return array[array.length - 1] - array[0];
	}

}
