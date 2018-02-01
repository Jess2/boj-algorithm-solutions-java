//https://www.acmicpc.net/problem/2750
//BOJ level9_1_2750
//삽입 정렬, 거품 정렬 등의 간단한 정렬 알고리즘을 구현해 봅니다

package level9;

import java.util.Scanner;

public class level9_1_2750_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		int caseNum = sc.nextInt(); //테스트 케이스 개수 입력받음 
		
		int[] intArr = new int[caseNum]; //테스트케이스 개수 크기의 int형 배열 생성 
		
		for(int i=0; i<caseNum; i++) {
			intArr[i] = sc.nextInt(); //숫자들을 입력받아 배열에 저장 
		}
		
		insertionSort(intArr);
		
		for(int i=0; i<caseNum; i++) {
			System.out.println(intArr[i]); //배열 요소 출력  
		}

	}
	
	//삽입 정렬 
	public static int[] insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int standard = arr[i];
			int aux = i-1;
			
			while(aux>=0 && arr[aux] > standard) {
				arr[aux+1] = arr[aux];
				aux--;
			}
			arr[aux+1] = standard;
		}
		
		return arr;
	}

}
