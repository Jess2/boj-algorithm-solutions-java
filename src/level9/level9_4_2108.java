//https://www.acmicpc.net/problem/2108
//BOJ level9_4_2108
//N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
//check

package level9;

import java.util.Arrays;
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
		
		System.out.println(avg(arr));
		System.out.println(center(arr));
		System.out.println(mode(arr));
		System.out.println(range(arr));

	}
	
	//산술평균 메소드 
	private static int avg(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return (sum/array.length);
	}
	
	//중앙값 메소드
	private static int center(int[] array) {
		Arrays.sort(array);
		if(array.length % 2 != 0) {
			return (array[(array.length + 1) / 2] - 1);
		} else {
			return array[(array.length / 2 - 1) + ((array.length + 2) / 2 - 1) / 2];
		}
	}
	
	//최빈값 메소드
	private static int mode(int[] array) {
        int mode = 0; 
        int[] index = new int[500000];
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }
        
        for (int i = 0; i < index.length; i++)
        {
            if (index[i] > max)
            {
                max = index[i]; 
                mode = i;
            }
        }
        return mode;
	}
	
	//범위 메소드 
	private static int range(int[] array) {
		Arrays.sort(array);
		return array[array.length - 1] - array[0];
	}

}
