//https://www.acmicpc.net/problem/2750
//BOJ level9_1_2750

package level9;

import java.util.Arrays;
import java.util.Scanner;

public class level9_1_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt(); //테스트 케이스 개수 입력받음 
		
		int[] intArr = new int[caseNum]; //테스트케이스 개수 크기의 int형 배열 생성 
		
		for(int i=0; i<caseNum; i++) {
			intArr[i] = sc.nextInt(); //숫자들을 입력받아 배열에 저장 
		}
		
		Arrays.sort(intArr); //오름차순으로 정렬 
		
		for(int i=0; i<caseNum; i++) {
			System.out.println(intArr[i]); //배열 요소 출력  
		}

	}

}
