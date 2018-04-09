//https://www.acmicpc.net/problem/5430
//시간초과

package level13;

import java.util.Arrays;
import java.util.Scanner;

public class level13_3_5430 {
	
	//뒤집기 메소드
	public static int[] reverse(int[] arr) {
		int temp;
		
		for(int i=0; i<Math.round(arr.length/2); i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return arr;
	}
	
	public static int[] delete(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); //테스트 케이스 개수
		
		Loop : for(int i=0; i<testCase; i++) {
			//1. 함수 입력
			String func = sc.next();
			
			//2. 배열 길이 입력
			int size = sc.nextInt();
			
			//3. 배열 입력
			String str = sc.next(); //배열을 문자열로 입력받음			
			String[] str_arr = str.substring(1, str.length()-1).split(","); //쉼표를 기준으로 쪼개서 String형 배열에 저장
			int[] int_arr = new int[size]; //입력받은 문자열을 저장할 실제 int형 배열 생성
			
			for(int j=0; j<size; j++) {
				int_arr[j] = str_arr[j].charAt(0) - '0'; //String형 배열에 저장한 문자들을 int형으로 변환하여 int형 배열에 저장
			}
			
			//결과를 출력하기 위한 함수 분석
			for(int j=0; j<func.length(); j++) {
				//R - 뒤집기
				if(func.charAt(j) == 'R') {
					int_arr = reverse(int_arr); //뒤집기 메소드 호출
				}
				
				//D - 삭제
				else if(func.charAt(j) == 'D') {
					if(size <= 0) {
						System.out.println("error");
						continue Loop;
					} else {
						size--;
						int_arr = delete(int_arr); //삭제 메소드 호출
					}
				}
			}
				
			System.out.print("[");
			for(int j=0; j<size; j++) {
				System.out.print(int_arr[j]);
				if(j != size-1) {
					System.out.print(",");
				}
			}
			System.out.println("]");

		}
		sc.close();
		
	}

}